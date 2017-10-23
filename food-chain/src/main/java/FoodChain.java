class FoodChain {

    private static final String[] ANIMALS = {
        "fly",
        "spider",
        "bird",
        "cat",
        "dog",
        "goat",
        "cow"
    };

    private static final String[] PHRASES = {
        "",
        "It wriggled and jiggled and tickled inside her.\n",
        "How absurd to swallow a bird!\n",
        "Imagine that, to swallow a cat!\n",
        "What a hog, to swallow a dog!\n",
        "Just opened her throat and swallowed a goat!\n",
        "I don't know how she swallowed a cow!\n"
    };

    public String verse(int verse) {
        if (verse-- == 8) return "I know an old lady who swallowed a horse.\nShe's dead, of course!";
        StringBuilder sb = new StringBuilder("I know an old lady who swallowed a ");
        sb.append(ANIMALS[verse]).append(".\n").append(PHRASES[verse--]);
        while (verse >= 0) {
            sb.append("She swallowed the ").append(ANIMALS[verse + 1]).append(" to catch the ").append(ANIMALS[verse]);
            if (verse-- == 1)
                sb.append(" that wriggled and jiggled and tickled inside her");
            sb.append(".\n");
        }
        sb.append("I don't know why she swallowed the fly. Perhaps she'll die.");
        return sb.toString();
    }

    public String verses(int startVerse, int endVerse) {
        StringBuilder sb = new StringBuilder(verse(startVerse));
        for (int i = startVerse + 1; i <= endVerse; i++) {
            sb.append("\n\n").append(verse(i));
        }
        return sb.toString();
    }
}
