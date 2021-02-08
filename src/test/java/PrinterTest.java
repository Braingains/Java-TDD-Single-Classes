import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before() { printer = new Printer(100, 1000);
    }



    
    @Test
    public void printerHasSheets() {
        assertEquals(100, printer.getRemainingSheets());
    }

    @Test
    public void printerHasToner() {
        assertEquals(1000, printer.getRemainingToner());
    }

    @Test
    public void canPrintTwoPagesFiveCopies() {
        assertEquals(true, printer.print(2,5));
    }

    @Test
    public void cannotPrintTwoPagesSixtyCopies() {
        assertEquals(false, printer.print(2, 60));
    }

    @Test
    public void cannotPrintWithoutToner() {
        Printer lowToner = new Printer (100, 2);
        assertEquals(false, lowToner.print(3, 10));
    }

    @Test
    public void paperIsUsed() {
        printer.print(2, 5);
        assertEquals(90, printer.getRemainingSheets());
    }

    @Test
    public void tonerIsUsed() {
        printer.print(2, 5);
        assertEquals(990, printer.getRemainingToner());
    }



}
