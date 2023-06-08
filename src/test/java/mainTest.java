import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class mainTest {

    @Test
        public void TestvotePrint() {
        //given

        //when
        main.VotePrint();
        //then

    }

    @Test
        public void TestvotePlus() {
        //given
        main.PartyList.clear();
        //when
        main.VotePlus("Eclipse");
        //then
        assertTrue(main.PartyList.get(0).PartyVote==1);
    }


    @Test
        public void TestvoteReduce() {
        //given
        main.PartyList.clear();
        //when
        main.VotePlus("Intellij");
        main.VoteReduce("Intellij");
        //then
        assertTrue(main.PartyList.get(0).PartyVote==0);
    }
}