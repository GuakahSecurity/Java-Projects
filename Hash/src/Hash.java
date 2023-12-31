import java.util.Scanner;

public class Hash {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      char[][] board = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
      char player = 'X';
      int row, col;

      while(true) {
         System.out.println("  0 1 2");
         System.out.println("0 "+board[0][0]+"|"+board[0][1]+"|"+board[0][2]);
         System.out.println("  -+-+-");
         System.out.println("1 "+board[1][0]+"|"+board[1][1]+"|"+board[1][2]);
         System.out.println("  -+-+-");
         System.out.println("2 "+board[2][0]+"|"+board[2][1]+"|"+board[2][2]);

         System.out.println("Player's turn "+player+".");
         System.out.print("Insert the line: ");
         row = scanner.nextInt();
         System.out.print("Insert column: ");
         col = scanner.nextInt();

         if(row < 0 || row > 2 || col < 0 || col > 2 || board[row][col] != ' ') {
            System.out.println("Invalid game.");
            continue;
         }

         board[row][col] = player;

         if(board[0][0] == player && board[0][1] == player && board[0][2] == player ||
            board[1][0] == player && board[1][1] == player && board[1][2] == player ||
            board[2][0] == player && board[2][1] == player && board[2][2] == player ||
            board[0][0] == player && board[1][0] == player && board[2][0] == player ||
            board[0][1] == player && board[1][1] == player && board[2][1] == player ||
            board[0][2] == player && board[1][2] == player && board[2][2] == player ||
            board[0][0] == player && board[1][1] == player && board[2][2] == player ||
            board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            System.out.println("Player "+player+" won!");
            break;
         }

         if(player == 'X') {
            player = 'O';
         } else {
            player = 'X';
         }
      }

      scanner.close();
   }
}
