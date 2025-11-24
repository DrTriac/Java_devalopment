package oxo;

import java.util.Objects;
import java.util.Scanner;
public class Field {

    char[][] moves = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
    };
    public void drawField() {

        System.out.println("   0   1   2");

        for(int j =0; j< moves.length; j++)
        {
            System.out.println(" +---+---+---+");
            System.out.printf("%d",j);
            for(int k = 0; k< moves.length; k++)
            {
                System.out.printf("| %c ",moves[j][k]);
            }
            System.out.printf("|");
            System.out.println();
        }
        System.out.println(" +---+---+---+");
    }

    public char[][] getMoves() {
        return moves;
    }

    public void drawIntro() {
        System.out.println("+---+---+---++---+---+---++---+---+---++---+---+---++---+---+---++---+---+---+");
        System.out.println("|                                                                            |");
        System.out.println("|                             WELKOM BIJ OXO                                 |");
        System.out.println("|                                                                            |");
        System.out.println("+---+---+---++---+---+---++---+---+---++---+---+---++---+---+---++---+---+---+");

    }

    public void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public int changeField(int movex, int movey, char symbol) {
        Scanner input = new Scanner(System.in);
        while (moves[movex][movey] != ' ')
        {
            System.out.print("HIER IS AL GESPEELD! GEEF EEN ANDER COORDINAAT IN! \n");
            System.out.println("Geef een nieuw X coordinaat in");
            movex = input.nextInt();
            System.out.println("Geef een nieuw Y coordinaat in");
            movey = input.nextInt();
        }
        while (movex > 2 || movey > 2 )
        {
            System.out.printf("getal in ongeldig. geef een getal in tussen 0 en 2 \n");
            System.out.println("Geef een nieuw X coordinaat in");
            movex = input.nextInt();
            System.out.println("Geef een nieuw Y coordinaat in");
            movey = input.nextInt();
        }

        moves[movex][movey] = symbol;
        return 0;
    }

    public char checkWinner() {
        // Define all 8 winning combinations as sets of coordinates
        int[][][] winningCombos = {
                { {0,0}, {0,1}, {0,2} },
                { {1,0}, {1,1}, {1,2} },
                { {2,0}, {2,1}, {2,2} },
                { {0,0}, {1,0}, {2,0} },
                { {0,1}, {1,1}, {2,1} },
                { {0,2}, {1,2}, {2,2} },
                { {0,0}, {1,1}, {2,2} },
                { {0,2}, {1,1}, {2,0} }
        };

        for (int[][] combo : winningCombos) {
            char first = moves[combo[0][0]][combo[0][1]];
            if (first != ' ' &&
                    first == moves[combo[1][0]][combo[1][1]] &&
                    first == moves[combo[2][0]][combo[2][1]]) {
                return first; // 'X' or 'O'
            }
        }

        return ' '; // No winner yet
    }


}
