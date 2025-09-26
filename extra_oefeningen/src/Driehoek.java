import java.util.Scanner;

public class Driehoek {
    static Scanner scanner = new Scanner(System.in);
  public static void main(String[] args) {
      int numberoflines=0, numberofchars=0;
      System.out.println("gelieve de hoogte in te geven van de driehoek");
      int hoogte = scanner.nextInt();

      while(numberoflines < hoogte)
      {
          while (numberofchars <= numberoflines) {
              System.out.print("42");
              numberofchars++;
          }
          numberoflines++;
          numberofchars = 0;
          System.out.println("\n");
      }

  }
}
