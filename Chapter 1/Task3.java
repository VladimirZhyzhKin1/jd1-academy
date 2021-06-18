//Numeric butterfly (For 5; 9; 10)

public class Task3 {
    int i, j;

    public void createArray() {
        int[][] array = new int[i][j];

        System.out.println("length = " + array.length + ": ");

        for (i = 0; i < array.length / 2; i++) {
            for (j = 0; j < array[i].length; j++) {
                if ((j < i) || (j >= (array[i].length - i))) {
                    array[i][j] = 0;
                } else {
                    array[i][j] = 1;
                }
            }
        }
        for (i = array.length - 1; i >= array.length / 2; i--) {
            for (j = 0; j < array[i].length; j++) {
                if ((j < (array[i].length - 1 - i)) || (j > i))
                    array[i][j] = 0;
                else
                    array[i][j] = 1;
            }
        }
        for (i = 0; i < array.length; i++) {
            for (j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println(" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Task3 h1 = new Task3();
        h1.i = 5;
        h1.j = 5;
        h1.createArray();

        Task3 h2 = new Task3();
        h2.i = 9;
        h2.j = 9;
        h2.createArray();


        Task3 h3 = new Task3();
        h3.i = 10;
        h3.j = 10;
        h3.createArray();
    }

}