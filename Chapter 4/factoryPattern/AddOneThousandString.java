package factoryPattern;

public class AddOneThousandString implements SummOfString {
    String b = "";

    @Override
    public void summOfString(String text, int iteration) {
        int i = 0;
        while (i <= iteration) {
            b = text + b;
            i++;
        }
    }
}
