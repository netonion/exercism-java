class BeerSong {

    public String verse(int n) {
        switch (n) {
            case 0: return "No more bottles of beer on the wall, no more bottles of beer.\n" +
                "Go to the store and buy some more, 99 bottles of beer on the wall.\n\n";
            case 1: return "1 bottle of beer on the wall, 1 bottle of beer.\n" +
                "Take it down and pass it around, no more bottles of beer on the wall.\n\n";
            case 2: return "2 bottles of beer on the wall, 2 bottles of beer.\n" +
                "Take one down and pass it around, 1 bottle of beer on the wall.\n\n";
            default: return n + " bottles of beer on the wall, " + n +  " bottles of beer.\n" +
                "Take one down and pass it around, " + (n - 1) + " bottles of beer on the wall.\n\n";
        }
    }

    public String sing(int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i >= end; i--) {
            sb.append(verse(i));
        }
        return sb.toString();
    }

    public String singSong() {
        return sing(99, 0);
    }
}
