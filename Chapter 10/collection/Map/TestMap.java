import java.util.HashMap;
import java.util.Map;

public class TestMap {
    public static void main(String[] args) {
        Map<KeyMap, String> keyMapStringMap = new HashMap<>();
        keyMapStringMap.put(new KeyMap(1, 1), "1:1");
        keyMapStringMap.put(new KeyMap(1, 1), "1:1 v2");
        for (Map.Entry<KeyMap, String> entrySet : keyMapStringMap.entrySet()) {
            System.out.println("key : " + entrySet.getKey() + " value " +entrySet.getValue());
        }
    }
}
