import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

class mainTest {

    @org.junit.jupiter.api.Test
        void votePrint() {
        //given

        //when
        main.VotePrint();
        //then

    }

    @org.junit.jupiter.api.Test
        void testvotePlus() {
        //given

        //when
        main.VotePlus("Eclipse");
        //then
        assertTrue(main.PartyList.get(0).PartyVote==1);
    }


    @org.junit.jupiter.api.Test
        void voteReduce() {
        //given
        main.PartyList.clear();
        //when
        main.VotePlus("Intellij");
        main.VoteReduce("Intellij");
        //then
        assertTrue(main.PartyList.get(0).PartyVote==0);
    }
}