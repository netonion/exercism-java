import java.util.ArrayList;

class DiamondPrinter {

    public ArrayList<String> printToList(char target) {
        ArrayList<String> diamond = new ArrayList<String>();
        for (char row = 'A'; row <= target; row++)
            diamond.add(buildRow(row, target));
        for (int i = target - 1 - 'A'; i >= 0; i--)
            diamond.add(diamond.get(i));
        return diamond;
    }

    private String buildRow(char row, char target) {
        StringBuilder sb = new StringBuilder();
        for (char col = target; col >= 'A'; col--)
            sb.append(row == col ? row : " ");
        for (char col = 'B'; col <= target; col++)
            sb.append(row == col ? row : " ");
        return sb.toString();
    }
}
