public class Board {
    private String symbols[][] = new String[3][3]; // 3 x 3

    Board(){
         for(int row = 0; row < 3; row ++) {
             for (int col = 0; col < 3 ; col++){
                 symbols[row][col] = " ";
             }
         }
    }


    public void markSymbol(int row, int col, String symbol) {
        symbols[row][col] = symbol;
    }


   public boolean validSlot(int row, int col) {
       return symbols[row][col].equals(" ");
   }
//This code is only checking the "validslots"= empty spaces in the 9x9
    public boolean winningcondintionfortheepicwintowinthegreatgeamlol(){
        String symbol;

        for(int j = 0; j < 3; j++) {
            symbol = symbols[j][0];
            if (symbol.equals(symbols[j][1]) && symbol.equals(symbols[j][2]) && !symbol.equals(" ")) {
                return true;
            }
        }
        for(int a = 0; a < 3; a++) {
            symbol = symbols[0][a];
            if (symbol.equals(symbols[1][a]) && symbol.equals(symbols[2][a]) && !symbol.equals(" ")) {
                return true;
            }
        }

            symbol = symbols[0][0];
            if (symbol.equals(symbols[1][1]) && symbol.equals(symbols[2][2]) && !symbol.equals(" ")) {
                return true;
            }
        symbol = symbols[0][2];
        if (symbol.equals(symbols[1][1]) && symbol.equals(symbols[2][0]) && !symbol.equals(" ")) {
            return true;
        }


     return false;
    }

    public boolean areThereValidSlots(){

        for(int a = 0; a < 3; a++){
            for(int b = 0;  b < 3; b++){
                if(validSlot(a,b)){
                    return true;
                }
            }
        }
        return false;
    }


    @Override
    public String toString() {



        return  symbols[0][0] + "|" + symbols[0][1] + "|" + symbols[0][2]+ "\n" +
                "-+-+-\n" +
                symbols[1][0] + "|" + symbols[1][1] + "|" + symbols[1][2]+ "\n" +
                "-+-+-\n" +
                symbols[2][0] + "|" + symbols[2][1] + "|" + symbols[2][2];
    }
}
