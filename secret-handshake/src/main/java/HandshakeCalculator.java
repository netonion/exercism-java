import java.util.List;
import java.util.ArrayList;
import static java.util.Collections.reverse;

class HandshakeCalculator {

    private static final int doReverse = 16;

    List<Signal> calculateHandshake(int number) {

        List<Signal> list = new ArrayList<Signal>();

        for (Signal s : Signal.values()) {
            if ((number & s.getCode()) != 0) list.add(s);
        }

        if ((number & doReverse) != 0) reverse(list);

        return list;
    }

}
