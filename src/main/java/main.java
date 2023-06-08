import java.util.ArrayList;

public class main {
    public static ArrayList<Party> PartyList=new ArrayList<>();

    public static void main(String[] args){
        //parti oy atma parti oy listeleme parti oy azaltma
        VotePlus("Deneme");
        VotePrint();

    }

    public static void VotePrint(){
        for (Party party:PartyList){
            System.out.println("Party Name : "+party.PartyName+" Party Vote : "+party.PartyVote);
        }
    }

    public static void VotePlus(String partyName){
        for (Party party:PartyList){
            if(party.PartyName.equals(partyName)){
                party.PartyVote++;
            }
        }
        Party party=new Party(partyName);
        party.PartyVote++;
        PartyList.add(party);
    }

    public static void VoteReduce(String partyName){
        for (Party party:PartyList){
            if(party.PartyName.equals(partyName)){
                party.PartyVote--;
            }
        }
    }

}