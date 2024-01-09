package textanalysistool;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TextStatsTest {
    private textanalysistool.TextStats stats;

    @Before
    public void setup() {
        // Skapar ett nytt TextStats-objekt inför varje test
        stats = new textanalysistool.TextStats();
    }

    @Test
    public void testAddLine() {
        // Lägger till en rad till stats-objektet
        stats.addLine("Hello");
        // Kontrollerar att rad- och teckenräknarna har uppdaterats korrekt
        assertEquals(1, stats.getLineCount());
        assertEquals(6, stats.getCharCount()); // Uppdaterat förväntat teckenantal
    }

    @Test
    public void testMultipleLines() {
        // Lägger till två rader till stats-objektet
        stats.addLine("Hello");
        stats.addLine("World");
        // Kontrollerar att rad- och teckenräknarna har uppdaterats korrekt
        assertEquals(2, stats.getLineCount());
        assertEquals(12, stats.getCharCount()); // Uppdaterat förväntat teckenantal
    }

    @Test
    public void testEmptyLine() {
        // Lägger till en tom rad till stats-objektet
        stats.addLine("");
        // Kontrollerar att rad- och teckenräknarna har uppdaterats korrekt
        // Notera att även en tom rad räknas som en rad och ett tecken (newline-tecknet)
        assertEquals(1, stats.getLineCount());
        assertEquals(1, stats.getCharCount()); // Uppdaterat förväntat teckenantal
    }
}