class Acronym {

    private final String phrase;

    Acronym(String phrase) {
        this.phrase = phrase;
    }

    String get() {
        StringBuilder sb = new StringBuilder();
        String[] words = phrase.split("\\W+");
        for (String word : words)
            sb.append(word.charAt(0));
        return sb.toString().toUpperCase();
    }

}
