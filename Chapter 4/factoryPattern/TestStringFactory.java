package factoryPattern;

public class TestStringFactory {
    public static SummOfString createSummOfString(AddOneThousandType addOneThousandType) {
        SummOfString newAddType = null;
        switch (addOneThousandType) {
            case ADD_ONE_THOUSAND_STRING:
                newAddType = new AddOneThousandString();
                break;
            case ADD_ONE_THOUSAND_STRING_BUFFER:
                newAddType = new AddOneThousandStringBuffer();
                break;
            case ADD_ONE_THOUSAND_STRING_BUILDER:
                newAddType = new AddOneThousandStringBuilder();
                break;
        }
        return newAddType;
    }
}
