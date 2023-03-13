package questions.ticTacToe;

import questions.ticTacToe.entity.Board;
import questions.ticTacToe.entity.Game;
import questions.ticTacToe.entity.Player;
import questions.ticTacToe.entity.Symbol;
import questions.ticTacToe.service.BoardService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TicTacToeApplication {
    public static void main(String[] args) {
        Board board = new Board();
        List<Player> players = getPlayers();

        Game game = new Game(board, players);
        BoardService boardService = new BoardService(board);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            Player currentPlayer = game.getPlayerList().get(game.getCurrentPlayerIndex());
            System.out.println(currentPlayer.getPlayerId() + "'s turn");
            System.out.println("Enter row number");
            int row = scanner.nextInt();
            System.out.println("Enter column number");
            int column = scanner.nextInt();

            Symbol currentPlayerSymbol = currentPlayer.getSymbol();
            boardService.addSymbol(currentPlayerSymbol, row, column);
            boardService.printBoard();

            if (boardService.isGameOver(row, column, currentPlayerSymbol)) {
                System.out.println("Game Over, " + currentPlayer.getPlayerId() + " wins");
                break;
            }
            if (boardService.isTie()) {
                System.out.println("Game Tied");
                break;
            }

            game.setCurrentPlayerIndex((game.getCurrentPlayerIndex() + 1) % game.getPlayerList().size());
        }


    }

    private static List<Player> getPlayers() {
        List<Player> players = new ArrayList<>();
        players.add(new Player("Player 1", Symbol.X));
        players.add(new Player("Player 2", Symbol.O));
        return players;
    }
}
