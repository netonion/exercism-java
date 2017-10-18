class PhoneNumber{

    private final String number;

    public PhoneNumber(String number) {
        char[] digits = new char[11];
        int i = 0;

        for (char digit : number.toCharArray()) {
            if (Character.isDigit(digit)) {
                if (i < 11)
                    digits[i++] = digit;
                else
                    throw new IllegalArgumentException("Number must be 10 or 11 digits");
            }
            else if (!(digit == '.' ||
                digit == '-' ||
                digit == '(' ||
                digit == ')' ||
                digit == ' '))
                throw new IllegalArgumentException("Illegal character in phone number. Only digits, spaces, parentheses, hyphens or dots accepted.");
        }
        if (i == 11 && digits[0] != '1')
            throw new IllegalArgumentException("Can only have 11 digits if number starts with '1'");
        else if (i < 10)
            throw new IllegalArgumentException("Number must be 10 or 11 digits");

        number = new String(digits).trim();
        this.number = number.length() == 11 ? number.substring(1) : number;
    }

    public String getNumber() {
        return number;
    }
}
