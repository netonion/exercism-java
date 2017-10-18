import java.util.List;
import java.util.LinkedList;

class Flattener {

    public List flatten(List list) {
        List res = new LinkedList();
        for (Object obj : list) {
            if (obj instanceof List) {
                res.addAll(flatten((List)obj));
            } else if (obj != null) {
                res.add(obj);
            }
        }
        return res;
    }
}
