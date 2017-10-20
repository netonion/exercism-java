import java.util.HashSet;

class Robot {

    private static final HashSet<String> usedNames = new HashSet<String>();

    private String name;

    Robot() {
        setName();
    }

    public String getName() {
        return name;
    }

    public void reset() {
        setName();
    }

    private void setName() {
        do {
            name = genName();
        } while (!usedNames.add(name));
    }

    private String genName() {
        String name = "";
        name += (char)('A' + (int)(Math.random() * 26));
        name += (char)('A' + (int)(Math.random() * 26));
        name += String.format("%03d", (int)(Math.random() * 1000));
        return name;
    }
}
