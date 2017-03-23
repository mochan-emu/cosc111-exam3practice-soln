

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ShareholderTests
{
    /**
     * Default constructor for test class ShareholderTests
     */
    public ShareholderTests()
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
    
    @Test
    public void testShareHolderToString()
    {
        Shareholder s = new Shareholder("Test", 10, 100);
        String str = s.toString();
        assertEquals(str, "Test: 10 shares (10.0%)");
    }
}
