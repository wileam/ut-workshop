import junit.framework.Assert;
import org.fest.assertions.api.Assertions;
import org.junit.Test;

/**
 * Created by Joanna on 14-3-15.
 */
public class TargetRamdomNumberTest {
    @Test
    public void test_number_is_4_bit() {
        Assert.assertTrue(NumberGenerator.generator().length() == 4);
    }

    @Test
    public void test_every_bit_is_unique(){
        char[] numberArray = NumberGenerator.generator().toCharArray();

        for(int i=0;i<numberArray.length;i++) {
            for(int j=i+1;j<numberArray.length;j++) {
                if(numberArray[i] == numberArray[j]) {
                    Assert.assertTrue(false);
                    return;
                }
            }
        }

        Assert.assertTrue(true);
    }
}
