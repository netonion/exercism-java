class RotationalCipher {

    private final int rotation;

    public RotationalCipher(int rotation) {
        this.rotation = rotation % 26;
    }

    public String rotate(String msg) {

        StringBuilder sb = new StringBuilder();

        for (char c : msg.toCharArray()) {
            if (Character.isLetter(c)) {
                boolean isLowerCase = Character.isLowerCase(c);
                c += rotation;
                if (isLowerCase && c > 'z') c -= 26;
                if (!isLowerCase && c > 'Z') c -= 26;
            }
            sb.append(c);
        }

        return sb.toString();
    }
}
