import java.util.List;
import java.util.ArrayList;
import static java.util.Collections.reverse;

class HandshakeCalculator {

    List<Signal> calculateHandshake(int number) {

        List<Signal> list = new ArrayList<Signal>();

        for (Signal s : Signal.values()) {
            if ((number & 1) == 1) list.add(s);
            number >>= 1;
        }
        if ((number & 1) == 1) reverse(list);

        return list;
    }

}
