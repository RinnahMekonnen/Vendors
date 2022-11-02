import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VendorTest {

    @Test
    void addition() {
        Vendor v = new Vendor(2,5);
        v.addMoney(6);
        assertEquals(6, v.getBalance());
    }
    @Test
    void addZeroTest() {
        Vendor v = new Vendor(2,5);
        v.addMoney(0);
        assertEquals(0, v.getBalance());
    }
    @Test
    void addNegativeBalance() {
        Vendor v = new Vendor(2,5);
        v.addMoney(-10);
        assertEquals(0, v.getBalance());
    }

    @Test
    void addNegativeTestInitialBalancePositive() {
        Vendor v = new Vendor(2, 5);
        v.addMoney(10);
        v.addMoney(-5);
    }
}