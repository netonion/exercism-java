class Transpose {

    public String transpose(String input) {
        String[] rows = input.split("\n");
        int max = 0;
        for (String row : rows)
            if (row.length() > max) max = row.length();
        StringBuilder output = new StringBuilder();
        for (int j = 0; j < max; j++) {
            for (int i = 0; i < rows.length; i++) {
                output.append(j < rows[i].length() ? rows[i].charAt(j) : ' ');
            }
            output.append('\n');
        }
        return output.toString().trim();
    }
}
