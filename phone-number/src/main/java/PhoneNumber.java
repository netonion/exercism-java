class PhoneNumber{

    private final String number;

    public PhoneNumber(String number) {
        number = number.replaceAll("\\s|\\(|\\)|\\.|-", "");
        if (number.matches(".*\\D.*"))
            throw new IllegalArgumentException("Illegal character in phone number. Only digits, spaces, parentheses, hyphens or dots accepted.");
        if (number.length() == 11 && number.startsWith("1"))
            number = number.substring(1);
        if (number.length() == 11)
            throw new IllegalArgumentException("Can only have 11 digits if number starts with '1'");
        if (number.length() != 10)
            throw new IllegalArgumentException("Number must be 10 or 11 digits");
        this.number = number;
    }

    public String getNumber() {
        return number;
    }
}
