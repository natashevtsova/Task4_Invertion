import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Nataliia_Shevtsova on 9/7/2016.
 */
public class ReInvert {
    private  InvertArr inv;

    int arr1 [] =  {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int arr2 [] =  {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

    @Before
    public void runInvert() {

        inv = new InvertArr();
    }
    @Test
    public void checkIvnvert () {
        inv.invert(arr1);
        Assert.assertArrayEquals(arr1, arr2);
    }

    @Test
    public void arrNotNull () {
        inv.invert(arr1);
        Assert.assertNotNull("Ok ", inv);
    }

}