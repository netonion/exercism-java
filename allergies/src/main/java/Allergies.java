import java.util.List;
import java.util.Arrays;
import static java.util.stream.Collectors.toList;

class Allergies {

    private int code;
    private List<Allergen> allergies;

    public Allergies(int code) {
        this.code = code;
        allergies = Arrays.stream(Allergen.values()).filter(this::isAllergicTo).collect(toList());
    }

    public boolean isAllergicTo(Allergen allergen) {
        return (code & allergen.getScore()) > 0;
    }

    public List<Allergen> getList() {
        return allergies;
    }
}
