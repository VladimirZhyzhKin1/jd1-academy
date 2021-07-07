package FIFO;

/*В этой части я хочу предложить пример, который позволит нам посмотреть
        как можно организовать взаимодействие объектов для реализации достаточно распространенной структуры данных — очереди.
        Т.е. я хочу создать класс, который позволит мне «складывать» туда объекты в заранее неизвестном количестве и «вынимать»
        объекты из этой очереди. Такая функциональность часто называется FIFO — First In First Out — первый пришел, первый ушел.
        По сути наш класс должен иметь три метода:
        1. Положить объект (произвольного класса) в очередь — назовем метод push
        2. Вытащить объект (произвольного класса) из очереди — назовем метод pull
        3. Получить количество объектов в очереди — назовем его size*/

public class ObjectQueue {
    //указатель на первый элемент
    private ObjectBox head = null;
    //Указатель на последний элемент
    private ObjectBox tail = null;
    //поле для хранения размера очереди
    private int size = 0;

    public void push(Object obj) {
        //Сразу создаем вспомогательный объект и помещаем новый элемент в него
        ObjectBox ob = new ObjectBox();
        ob.setObject(obj);
        //Если очередь пустая - в ней еще нет элементов
        if (head == null) {
            //теперь наша голова указывает на наш первый элемент
            head = ob;
        } else {
            //Если это не первый элемент, то надо, чтобы последний элемент в очереди указывал на вновь прибывший
            tail.setNext(ob);
        }
        //И в любом случае нам надо наш "хвост" переместить на новый элемент
        //Если это первый элемент, то "голова" и "хвост" будут указывать на один и тот же элемент
        tail = ob;
        //увеличиваем размер нашей очереди
        size++;
    }

    public Object pull() {
        //Если у нас нет элементов, то возвращаем null
        if (size == 0) {
            return null;
        }
        //получаем наш объект из вспомогательного класса из "головы"
        Object obj = head.getObject();
        //перемещаем "голову" на следующий элемент
        head = head.getNext();
        //Если это был единственный элемент, то head станет равный null
        //и тогда tail (хвост) тоже должен указать на null
        if (head == null) {
            tail = null;
        }
        //уменьшаем размер очереди
        size--;
        //возвращаем значение
        return obj;
    }

    public Object get(int index) {
        //Если нет элементов или индекс больше размера  или индекс меньше "0"
        if (size == 0 || index >= size || index < 0) {
            return null;
        }
        //устанавливает указатель, который будем перемещать на "голову"
        ObjectBox current = head;
        //в этом случае позиция равна "0"
        int pos = 0;
        //пока позиция не достигла нужного индекса
        while (pos < index) {
            //перемещаемся на следующий элемент
            current = current.getNext();
            //и увеличиваем позицию
            pos++;
        }
        //мы дошли до нужной позиции и теперь можем вернуть элемент
        Object obj = current.getObject();
        return obj;
    }

    public int size() {
        return size;
    }

    //Наш вспомогательный класс будет скрыт от посторонних глаз
    private class ObjectBox {
        //В поле object мы будем помещать сам добавляемый объект, а поле next будет указывать на следующий элемент в цепочке.
        private Object object;//поле для хранения объекта
        private ObjectBox next;//Поле для указания на след. элемент в цепочке. Есле оно равно NULL - значит это последний элемент

        public Object getObject() {
            return object;
        }

        public void setObject(Object object) {
            this.object = object;
        }

        public ObjectBox getNext() {
            return next;
        }

        public void setNext(ObjectBox next) {
            this.next = next;
        }
    }
}