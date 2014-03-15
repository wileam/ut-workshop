import org.fest.assertions.api.Assertions;
import org.junit.Test;

/**
 * Created by Joanna on 14-3-15.
 */
public class ResultTest {
    @Test
    public void test_all_match(){
        Assertions.assertThat((NumberGame(1234)).equals("4A0B"));
    }

    @Test
    public void test_all_not_match(){
        Assertions.assertThat((NumberGame(5678)).equals("0A0B"));
    }

    @Test
    public void test_number_all_match_position_not_match(){
        Assertions.assertThat((NumberGame(4321)).equals("0A4B"));
    }

    @Test
    public void test_some_number_match(){
        Assertions.assertThat((NumberGame(1256)).equals("2A0B"));
    }

    @Test
    public void test_some_number_match_position_not_match(){
        Assertions.assertThat((NumberGame(5612)).equals("0A2B"));
    }
}
