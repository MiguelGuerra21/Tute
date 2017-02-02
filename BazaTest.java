

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class BazaTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class BazaTest
{
    private Baza baza1;
    private Carta carta1;
    private Carta carta2;
    private Carta carta3;
    private Carta carta4;

    /**
     * Default constructor for test class BazaTest
     */
    public BazaTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        baza1 = new Baza(4, 0);
        carta1 = new Carta(6, 2);
        carta2 = new Carta(7, 1);
        carta3 = new Carta(7, 0);
        carta4 = new Carta(10, 0);
        baza1.addCarta(carta1, "miguel");
        baza1.addCarta(carta2, "piki");
        baza1.addCarta(carta3, "manolo");
        baza1.addCarta(carta4, "pepe");
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
}
