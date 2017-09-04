public class Hamming {

    String s1, s2;

    Hamming(String leftStrand, String rightStrand) {
        if (leftStrand.length() != rightStrand.length())
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        s1 = leftStrand;
        s2 = rightStrand;
    }

    int getHammingDistance() {
        int count = 0;
        for (int i = 0; i < s1.length(); i++)
            if (s1.charAt(i) != s2.charAt(i)) count++;
        return count;
    }

}
