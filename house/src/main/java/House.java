import java.util.stream.IntStream;
import java.util.stream.Collectors;

class House {

    private static final String[] ITEMS = {
        "house that Jack built",
        "malt",
        "rat",
        "cat",
        "dog",
        "cow with the crumpled horn",
        "maiden all forlorn",
        "man all tattered and torn",
        "priest all shaven and shorn",
        "rooster that crowed in the morn",
        "farmer sowing his corn",
        "horse and the hound and the horn"
    };

    private static final String[] ACTIONS = {
        "lay in",
        "ate",
        "killed",
        "worried",
        "tossed",
        "milked",
        "kissed",
        "married",
        "woke",
        "kept",
        "belonged to",
    };

    public String verse(int verse) {
        verse--;
        StringBuilder sb = new StringBuilder("This is the " + ITEMS[verse--]);
        while (verse >= 0)
            sb.append("\nthat " + ACTIONS[verse] + " the " + ITEMS[verse--]);
        return sb.append('.').toString();
    }

    public String verses(int startVerse, int endVerse) {
        return IntStream.rangeClosed(startVerse, endVerse).mapToObj(this::verse).collect(Collectors.joining("\n\n"));
    }

    public String sing() {
        return verses(1, 12);
    }
}
