package factoryPattern;

public class TestString {
    SummOfString summOfString;

    public TestString(SummOfString sumOfString) {
        this.summOfString = sumOfString;
    }

    public void timeOutput(String addText, int iteration) {
        descriptionType();
        long startTime = System.nanoTime();
        summOfString.summOfString(addText, iteration);
        long endTime = System.nanoTime();
        System.out.println("Start time is " + startTime);
        System.out.println("End time is " + endTime);
        System.out.println("Result: " + (endTime - startTime));
        System.out.println("--//--");
    }

    private void descriptionType() {
        if (summOfString instanceof AddOneThousandString) {
            System.out.println("Result time summ of String: ");
        }
        if (summOfString instanceof AddOneThousandStringBuffer) {
            System.out.println("Result time summ of StringBuffer: ");
        }
        if (summOfString instanceof AddOneThousandStringBuilder) {
            System.out.println("Result time summ of StringBuilder: ");
        }
    }
}
