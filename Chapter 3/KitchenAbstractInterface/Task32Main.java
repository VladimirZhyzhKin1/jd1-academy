package abstractInterface;

/*Задание 32
        Создать цепочку наследования (минимум 3 звена) классов, описывающих бытовую технику.
        Создать несколько объектов описанных классов, часть из них включить в розетку. Иерархия должна иметь хотя бы три уровня.
 */
public class Task32Main {
    public static void main(String[] args) {
        Appliances coffeeMachine = new CoffeeMachine();
        iMake(coffeeMachine);
        readySignal(coffeeMachine);
        System.out.println();
        Appliances oven = new Oven();
        iMake(oven);
        readySignal(oven);
        System.out.println();
        Appliances toaster = new Toaster();
        iMake(toaster);
        readySignal(toaster);
    }

    private static void iMake(Appliances appliances) {
        appliances.iMake();
    }

    private static void readySignal(Appliances appliances) {
        appliances.readySignal();
        if (appliances instanceof PlugInable) {
            ((PlugInable) appliances).plugIn();
        } else {
            System.out.println("Appliances is OFF");
        }
    }
}
