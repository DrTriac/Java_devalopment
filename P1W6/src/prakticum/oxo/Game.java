package oxo;
import java.util.Scanner;
public class Game {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Field speelveld = new Field();
        Player pX = new Player();
        Player pY = new Player();
        speelveld.drawIntro();
        System.out.println("|                  geef de naam in van de eerste speler                      |");
        pX.setName(input.nextLine());
        System.out.println("|                  geef de naam in van de tweede speler                      |");
        pY.setName(input.nextLine());
        speelveld.drawField();
        System.out.printf("%s Jij bent X\n ",pX.getName());
        System.out.printf("%s Jij bent 0\n",pY.getName());

        while (!pY.hasWon || pX.hasWon) {
            System.out.printf("%s Maak een zet!",pX.getName());
            pX.setMove(input.nextLine());
            speelveld.changeField(pX.movex,  pX.movey, 'X');
            speelveld.drawField();

            if (speelveld.checkWinner() == 'X') {
                System.out.printf("Gefeliciteerd %s! Jij hebt gewonnen!\n", pX.getName());
                break;
            }

            System.out.printf("%s Maak een zet!",pY.getName());
            pY.setMove(input.nextLine());
            speelveld.changeField(pY.movex,  pY.movey, 'O');
            speelveld.drawField();


            if (speelveld.checkWinner() == 'O') {
                System.out.printf("Gefeliciteerd %s! Jij hebt gewonnen!\n", pY.getName());
                break;
            }


        }









    }
}
