package Boogeschietclub;

public class Boogschietclub {
    public static void main(String[] args) {
        Members[] members = new Members[5];
        String[] names = new String[]{"Bart","Pieter","Wardje","Dirk","Hendrik"};

        for (int i = 0; i < members.length; i++) {
            members[i] = new Members(names[i]);
        }

        for (Members member : members) {
            System.out.println(member.toString());
        }


    }
}
