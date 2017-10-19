import java.util.Map;
import java.util.HashMap;

class NucleotideCounter {

    private HashMap<Character, Integer> tally = new HashMap<Character, Integer>() {{
        put('A', 0);
        put('C', 0);
        put('G', 0);
        put('T', 0);
    }};

    public NucleotideCounter(String nucleotides) {
        for (char n : nucleotides.toCharArray())
            tally.put(n, tally.get(n) + 1);
    }

    public int count(char nucleotide) {
        if ("ACGT".indexOf(nucleotide) == -1)
            throw new IllegalArgumentException();
        return tally.get(nucleotide);
    }

    public Map<Character, Integer> nucleotideCounts() {
        return tally;
    }
}
