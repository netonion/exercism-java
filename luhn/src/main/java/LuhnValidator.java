class LuhnValidator {

    boolean isValid(String candidate) {
        int idx = 0;
        int sum = 0;

        for (int i = candidate.length() - 1; i >= 0; i--) {
            char c = candidate.charAt(i);
            if (c >= '0' && c <= '9') {
                int d = c - '0';
                sum += idx % 2 == 0 ? d : (d > 4 ? 2 * d - 9 : 2 * d);
                idx++;
            } else if (c == ' ') {
                continue;
            } else {
                return false;
            }
        }

        return idx > 1 && sum % 10 == 0;
    }

}
