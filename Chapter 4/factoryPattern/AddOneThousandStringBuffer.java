package factoryPattern;

public class AddOneThousandStringBuffer implements SummOfString {
    @Override
    public void summOfString(String text, int iteration) {
        StringBuffer stringBuffer = new StringBuffer("");
        for (int i = 0; i <= iteration; i++) {
            stringBuffer.append(text);
        }
    }
}
