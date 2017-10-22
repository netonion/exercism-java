class Atbash {

    public String encode(String plaintext) {
        StringBuilder ciphertext = new StringBuilder();
        for (char c : plaintext.toLowerCase().toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                if (ciphertext.length() % 6 == 5) ciphertext.append(" ");
                ciphertext.append(translate(c));
            }
        }
        return ciphertext.toString();
    }

    public String decode(String ciphertext) {
        StringBuilder plaintext = new StringBuilder();
        for (char c : ciphertext.toCharArray()) {
            if (Character.isLetterOrDigit(c))
                plaintext.append(translate(c));
        }
        return plaintext.toString();
    }

    private char translate(char c) {
        return Character.isDigit(c) ? c : (char)('a' + 'z' - c);
    }
}
