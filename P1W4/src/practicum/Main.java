public class Main {
    public static void main(String[] args) {
        Player p1 = new Player();
        Player p2 = new Player();
        p1.setName("Jonas");
        p2.setName("Hasti");
        p1.setScore(610);
        p2.setScore(1020);
        showPlayers(p1, p2);
    }

    public static void showPlayers(Player p1, Player p2) {
        if (p1.getScore() <= p2.getScore()) {
            System.out.printf("Player %s wins with %d points%n", p1.getName(), p1.getScore());
        }else System.out.printf("Player %s wins with %d points%n", p2.getName(), p2.getScore());

    }
}
