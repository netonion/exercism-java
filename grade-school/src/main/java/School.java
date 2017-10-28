import java.util.List;
import java.util.LinkedList;
import java.util.Map;
import java.util.HashMap;
import java.util.Collections;

class School {

    private int size = 0;
    private HashMap<Integer, List<String>> grades = new HashMap<>();

    public int numberOfStudents() {
        return size;
    }

    public void add(String name, int grade) {
        if (!grades.containsKey(grade)) {
            grades.put(grade, new LinkedList<String>());
        }
        // O(n) insert. Should be better than Collections.sort()
        int i = 0;
        for (String other : grades.get(grade)) {
            if (other.compareTo(name) > -1) break;
            i++;
        }
        grades.get(grade).add(i, name);
        size++;
    }

    public List<String> grade(int grade) {
        return Collections.unmodifiableList(grades.getOrDefault(grade, Collections.emptyList()));
    }

    public Map<Integer, List<String>> studentsByGradeAlphabetical() {
        return Collections.unmodifiableMap(grades);
    }
}
