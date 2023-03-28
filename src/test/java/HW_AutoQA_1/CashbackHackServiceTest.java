package HW_AutoQA_1;

import org.junit.Assert;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @org.junit.Test
    public void remain() {
        int amount = 990;
        int expected = 10;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        Assert.assertEquals(expected, actual);
    }
}