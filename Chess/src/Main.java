public class Main {
    public static void main(String[] args) {
        String [][] panel = new String[8][8];
        String letters = "ABCDEFGH";
        for (int i = 0; i < panel.length; i++) {
            for (int j = 0; j < panel[i].length; j++) {
                panel[j][i] = String.valueOf(letters.charAt(i));
                panel[j][i] = panel[j][i].concat(String.valueOf(j+1));
                if ((i+j+2) % 2 == 0) {
                    panel[j][i] = panel [j][i].concat("w");
                }
                else {
                    panel [j][i] = panel[j][i].concat("d");
                }
            }
        }
        for (int i = 0; i < panel.length; i++){
            for (int j = 0; j < panel[i].length; j++){
                System.out.print(panel[i][j] + " ");
            }
            System.out.println();
        }
    }
}