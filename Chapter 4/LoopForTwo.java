public class LoopForTwo {
    public static void main(String[] args) {
        cycleWhile();
        System.out.println();
        cycleFor();
        System.out.println();
        cycleDoWhile();
        kejhgjhgjwr();
    }

    private static void kejhgjhgjwr() {
        int count = 10;

        int i = 0;
        while (i++ < count) {
            System.out.print("*");
        }
        while (++i < count) ;

        System.out.println();
    }

    private static void cycleDoWhile() {
        int count = 10;
        int i = 0;
        do {
            System.out.print(" * ");
            i++;
        } while (i < count);
        System.out.println();
    }

    private static void cycleWhile() {
        int count = 10;
        int i = 0;
        while (i < count) {
            int k = 0;
            while (k < i + 1) {
                System.out.print(" * ");
                k++;
            }
            System.out.println();
            i++;
        }
    }

    private static void cycleFor() {
        int count = 10;
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }


}
