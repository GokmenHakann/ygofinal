public class Party {
    public String PartyName;
    public int PartyVote;

    public Party(String partyName) {
        PartyName = partyName;
    }

    public String getPartyName() {
        return PartyName;
    }

    public void setPartyName(String partyName) {
        PartyName = partyName;
    }

    public int getPartyVote() {
        return PartyVote;
    }

    public void setPartyVote(int partyVote) {
        PartyVote = partyVote;
    }
}
