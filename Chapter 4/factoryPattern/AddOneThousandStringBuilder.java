package factoryPattern;

public class AddOneThousandStringBuilder implements SummOfString {
    @Override
    public void summOfString(String text, int iteration) {
        StringBuilder stringBuilder = new StringBuilder("");
        for (int i = 0; i <= iteration; i++) {
            stringBuilder.append(text);
        }
    }
}

