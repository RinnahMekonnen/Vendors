import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Random;

public class ExtraTests {
    Vendor v;
    //new vendor for each TEST
    @BeforeEach
    void setUp(){
        System.out.println("setUP");
         v =new Vendor(1,2);
    }
    //static Vendor v = new Vendor(1,2); //means 'v' will be same static across
    @BeforeAll
    static void init(){
        System.out.println("origin");
    }

    //test that adds a random value to balance

    @RepeatedTest(5)
    void randomBalance(){
        Random rand = new Random();
        int rand1 = rand.nextInt(100);
        v.addMoney(rand1);
        assertEquals(rand1,v.getBalance());
    }

    @Test
    void test1(){
        System.out.println("test1");
        v.addMoney(2);
        assertEquals(2.0,v.getBalance());
    }
    @Test
    void test2(){
        System.out.println("test2");
        v.addMoney(2.0);
        v.select("Gum");
        assertEquals(1.5,v.getBalance());
    }

}
