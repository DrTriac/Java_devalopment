package Boogschietclub;

import Voetbalclub.Members;

public class Main {
    public static void main(String[] args)
    {
        Member[] members = new Member[4];
        int index = 0;

        members[index] = new Member("Bart");
        members[index++] = new Member("Alikhan");
        members[index++] = new Member("Emma");
        members[index++] = new Member("Bo");
        members[index++] = new Member("Dachi");

        for (Member member : members)
        {
            System.out.println(member);
        }
        System.out.println(Member.getNextId());
    }
}
