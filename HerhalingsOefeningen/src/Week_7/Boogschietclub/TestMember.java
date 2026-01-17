package Week_7.Boogschietclub;

import java.lang.reflect.Array;

public class TestMember {
    public static void main(String[] args) {

            int i = 0;
            Member[] members = new Member[5];
            Member member = new Member("Murtadha");
            members[i] = member;
            Member member1 = new Member("Alikhan");
            members[i++] = member1;
            Member member2 = new Member("Bart");
            members[i++] = member2;
            Member member3 = new Member("Pieter");
            members[i++] = member3;
            Member member4 = new Member("Jos");
            members[i++] = member4;
            Member member5 = new Member("Louis");
            members[i++] = member5;

            for(Member m:members)
            {
                    System.out.println(m);
            }
            Member x = new Member("x");
            System.out.println("next number is: " + x.getNumber() );







    }
}
