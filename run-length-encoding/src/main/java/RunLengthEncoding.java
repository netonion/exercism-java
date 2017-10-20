class RunLengthEncoding {

    public String encode(String msg) {
        if (msg.isEmpty()) return "";

        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (int i = 1; i < msg.length(); i++) {
            if (msg.charAt(i) == msg.charAt(i - 1)) {
                count++;
            } else {
                if (count > 1) sb.append(count);
                sb.append(msg.charAt(i - 1));
                count = 1;
            }
        }
        if (count > 1) sb.append(count);
        sb.append(msg.charAt(msg.length() - 1));

        return sb.toString();
    }

    public String decode(String msg) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (char c : msg.toCharArray()) {
            if (Character.isDigit(c)) {
                count = 10 * count + c - '0';
            } else if (count == 0) {
                sb.append(c);
            } else {
                for (int i = 0; i < count; i++) {
                    sb.append(c);
                }
                count = 0;
            }
        }
        return sb.toString();
    }
}
