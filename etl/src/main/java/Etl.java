import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class Etl {
    public Map<String, Integer> transform(Map<Integer, List<String>> old) {
        Map<String, Integer> res = new HashMap<>();
        old.forEach((key, list) -> {
            list.forEach(letter -> {
                res.put(letter.toLowerCase(), key);
            });
        });
        return res;
    }
}
