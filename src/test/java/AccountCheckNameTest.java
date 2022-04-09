import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class AccountCheckNameTest {
    private final String name;
    private final boolean expected;

    public AccountCheckNameTest(String name, boolean expected) {
        this.name = name;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] createDifferentName() {
        return new Object[][] {
            { "TW", false},
            { "3 3", true},
            { "IVAN IVANOV", true},
            { "NINETEEN CHARS12345", true},
            { "TWENTY CHARS12345678", false},
            { " IVAN IVANOV", false},
            { "IVAN IVANOV ", false},
            { "IVAN  IVANOV", false},
            { "IVANIVANOV", false},
            { null, false},
        };
    }
    @Test
    public void checkNameToEmboss() {
        boolean actual = new Account(name).checkNameToEmboss();
        Assert.assertEquals("Method work wrong!", expected, actual);
    }

}
