package Voetbalclub;

public class Members {
    static final int MAXVAL = 100;
    static int amount;
    static Member members[] = new Member[MAXVAL];

    Members() {

        amount = 0;
    }

    public static void addMember(Member member) {
        if (amount <= MAXVAL) {
            members[amount++] = member;
            amount++;
        } else {
            System.out.println("Maximum amount exceeded");
        }
    }

    public static Member getMember(int index) {
        if (index >= 0 && index < amount) {
            return members[index];
        }
        else  return null;
    }
}

