import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int option = 0;
        final String playerSymbols[] = new String[]{"X", "O"};
        int currentPlayer = 0;
        Scanner scanner = new Scanner(System.in);
        Board myBoard = new Board();

        do {

            System.out.println(myBoard);
            if(myBoard.winningcondintionfortheepicwintowinthegreatgeamlol()){
                System.out.println("Player "+ currentPlayer + " won");
                break;
            }
            System.out.println("Give me a row betweem 1-3");
            int row = scanner.nextInt();
            System.out.println("Give me a column betweem 1-3");
            int col = scanner.nextInt();
            scanner.nextLine();



            if(!myBoard.validSlot(row-1,col-1)){
                System.out.println("This slot has already an holder, you baffun");

            } else {
                myBoard.markSymbol(row - 1, col - 1, playerSymbols[currentPlayer]);
                currentPlayer = (currentPlayer + 1) % 2;
            }
            if (myBoard.winningcondintionfortheepicwintowinthegreatgeamlol() && myBoard.validSlot(row-1 ,col-1)) {

            }
        }while (option != 9);
    }
}