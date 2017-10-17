import java.util.HashSet;

class IsogramChecker{

    public boolean isIsogram(String text) {

        HashSet<Integer> set = new HashSet<Integer>();

        for (int c : text.toLowerCase().codePoints().toArray()) {
            if (c != (int)' ' && c != (int)'-' && !set.add(c))
                return false;
        }

        return true;
    }
}
