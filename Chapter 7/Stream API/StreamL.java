package lamda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamL {//stream сокращенное название наших
    private int AntInt = 9;

    public StreamL(int antInt) {
        AntInt = antInt;
    }

    public int getAntInt() {
        return AntInt;
    }

    public static void main(String[] args) {
        List<StreamL> streamL = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            streamL.add(new StreamL(i));
        }
        List<Integer> collect = streamL.stream()
                .map(StreamL::getAntInt)
                .filter(integer -> integer > 5)
                .collect(Collectors.toList());
        collect.forEach(System.out::println);
    }
}
