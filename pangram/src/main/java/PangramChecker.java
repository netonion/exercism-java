import java.util.HashSet;

public class PangramChecker {

    public boolean isPangram(String input) {
        HashSet<Character> hs = new HashSet<Character>();
        for (char c : input.toLowerCase().toCharArray())
            if (c >= 'a' && c <= 'z') hs.add(c);
        return hs.size() == 26;
    }

}
