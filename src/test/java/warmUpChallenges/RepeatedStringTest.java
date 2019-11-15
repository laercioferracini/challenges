package warmUpChallenges;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
import static warmUpChallenges.RepeatedString.repeatedString;

public class RepeatedStringTest {

    @Test
    public void repeatedString1() {
        String s = "aba";
        long repeat = 10;
        long result = repeatedString(s, repeat);
        Assert.assertEquals(7, result);
    }
    @Test
    public void repeatedString2(){
        String s = "a";
        long repeat = 1000000;
        long result = repeatedString(s, repeat);
        Assert.assertEquals(1000000, result);
    }
}