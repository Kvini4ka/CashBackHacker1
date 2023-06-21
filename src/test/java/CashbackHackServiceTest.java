
import org.testng.annotations.Test;
import ru.netology.CashbackHackService;

import static org.testng.Assert.assertEquals;


public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldShowUnder1000() {
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldShowOver1000() {
        int amount = 1700;

        int actual = service.remain(amount);
        int expected = 300;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldShowEqual1000() {
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }


}