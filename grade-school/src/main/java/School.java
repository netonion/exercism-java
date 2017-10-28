import java.util.List;
import java.util.LinkedList;
import java.util.Map;
import java.util.HashMap;
import java.util.Collections;

class School {

    private int size = 0;
    private HashMap<Integer, LinkedList<String>> grades = new HashMap<>();

    public int numberOfStudents() {
        return size;
    }

    public void add(String name, int grade) {
        if (!grades.containsKey(grade)) {
            grades.put(grade, new LinkedList<String>());
        }
        grades.get(grade).add(name);
        Collections.sort(grades.get(grade));
        size++;
    }

    public List<String> grade(int grade) {
        if (grades.containsKey(grade)) {
            return (List<String>)(grades.get(grade).clone());
        } else {
            return new LinkedList<String>();
        }
    }

    public Map<Integer, List<String>> studentsByGradeAlphabetical() {
        return (Map<Integer, List<String>>)grades.clone();
    }
}
