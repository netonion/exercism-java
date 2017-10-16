import java.util.List;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.Arrays;

class KindergartenGarden {

    private static final String[] STUDENTS = {
        "Alice", "Bob", "Charlie", "David",
        "Eve", "Fred", "Ginny", "Harriet",
        "Ileana", "Joseph", "Kincaid", "Larry"
    };

    private final HashMap<String, List<Plant>> assignment = new HashMap<String, List<Plant>>();

    public KindergartenGarden(String plants) {
        this(plants, STUDENTS);
    }

    public KindergartenGarden(String plants, String[] students) {
        Arrays.sort(students);
        String[] lines = plants.split("\n");
        for (int i = 0; i < lines[0].length(); i += 2) {
            List<Plant> list = new LinkedList<Plant>();
            list.add(Plant.getPlant(lines[0].charAt(i)));
            list.add(Plant.getPlant(lines[0].charAt(i + 1)));
            list.add(Plant.getPlant(lines[1].charAt(i)));
            list.add(Plant.getPlant(lines[1].charAt(i + 1)));
            assignment.put(students[i / 2], list);
        }
    }

    public List<Plant> getPlantsOfStudent(String student) {
        return assignment.get(student);
    }
}
