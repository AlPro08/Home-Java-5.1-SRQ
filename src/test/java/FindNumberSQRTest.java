import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.sqr.FindNumberSQR;

public class FindNumberSQRTest {

    @ParameterizedTest
    @CsvSource({
            "13,100,500",
            "0,0,99",
            "1,0,100",
            "1,0,101",
            "89,100,9800",
            "90,100,9801",
            "90,100,9802",
            "0,101,102"

    })

    public void test(int expected, int from, int to) {
        FindNumberSQR service = new FindNumberSQR();
        int actual = service.calculate(from, to);

        Assertions.assertEquals(expected, actual);
    }
}