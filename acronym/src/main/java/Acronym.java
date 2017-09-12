class Acronym {

    private final String phrase;

    Acronym(String phrase) {
        this.phrase = phrase;
    }

    String get() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < phrase.length(); i++) {
            if (i == 0 || !Character.isLetter(phrase.charAt(i - 1)) && Character.isLetter(phrase.charAt(i)))
                sb.append(phrase.charAt(i));
        }
        return sb.toString().toUpperCase();
    }

}
