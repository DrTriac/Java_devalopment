package Voetbalclub;

public class Members {
    private Member[] members;
    private final int MAXNUMBEROFMEMBERS = 100;
    private int numberofmembers=0;

    public Members()
    {
        this.members = new Member[MAXNUMBEROFMEMBERS];


    }

    public void addMember(Member member)
    {
        if(numberofmembers!=MAXNUMBEROFMEMBERS)
        {
            members[numberofmembers] = member;
            numberofmembers++;
        }
    }

    public Member getMember(int id)
    {
        if(id<=numberofmembers&&members[id]!=null)
        {
            return members[id];
        }
        else{return null;}
    }

    public int getNumberofmembers() {
        return numberofmembers;
    }

    public int getNumberOfActiveMembers()
    {
        int counter = 0;
        for(Member m : members)
        {
           if (m.getType() == MemberType.SUPPORTING)
           {
               counter++;
           }
        }
        return counter;
    }

    public void printActiveMembers() {
        for (Member member : members)
        { if (member == null) {
        continue; // defensive: skip uninitialized slots
        }
        if (member.getType() != MemberType.SUPPORTING)
        {
           System.out.println(member);
        }
        }
    }
}



