import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before() {
        printer = new Printer(10, 50);
    }

    @Test
    public void hasSheetsLeft() {
        assertEquals(10, printer.getSheetsLeft());
    }

    @Test
    public void hasTonerVolume() {
        assertEquals(50, printer.getTonerVolume());
    }

    @Test public void testPrint() {
        printer.print(2, 3);
        assertEquals(4, printer.getSheetsLeft());
        assertEquals(44, printer.getTonerVolume());
    }

    @Test
    public void testNotEnoughPages() {
        printer.print(4, 4);
        assertEquals(10, printer.getSheetsLeft());
        assertEquals(50, printer.getTonerVolume());
    }

}
