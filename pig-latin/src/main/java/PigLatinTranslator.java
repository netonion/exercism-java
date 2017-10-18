import java.util.StringJoiner;

class PigLatinTranslator {
    public String translate(String phrase) {
        StringJoiner joiner = new StringJoiner(" ");
        for (String word : phrase.split(" ")) {
            int i = 0;
            while (word.charAt(i) != 'a' &&
                word.charAt(i) != 'e' &&
                word.charAt(i) != 'i' &&
                word.charAt(i) != 'o' &&
                word.charAt(i) != 'u') {
                i++;
            }
            if (i > 0 && word.charAt(i - 1) == 'q' && word.charAt(i) == 'u') i++;
            if (word.startsWith("yt") || word.startsWith("xr")) i = 0;

            joiner.add(word.substring(i) + word.substring(0, i) + "ay");
        }

        return joiner.toString();
    }
}
