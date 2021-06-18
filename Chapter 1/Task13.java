import java.math.BigInteger;
/*int n = 100;
//convert int to Integer
        Integer integer = Integer.valueOf(n);
        System.out.println(integer);

       //convert int to BigInteger
        BigInteger bigInteger = BigInteger.valueOf(n);
        System.out.println(bigInteger);
* */

public class Task13 {
    public static void main(String[] args) {
        factorial();
    }
    public static void factorial() {
        BigInteger result = BigInteger.ONE;
        int i = 1;
        do {
            result = result.multiply(BigInteger.valueOf(i));
            i++;
        }
        while (i < 25);//с 1 до 25
        System.out.println("Factorial is  "+i+" = " + result);
    }
}

