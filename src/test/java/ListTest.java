import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    @Test
    public void test001() {
        List<Integer> list = new ArrayList<Integer>();

        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);


        boolean size = list.size() == 0;
        Assert.assertFalse(size);
    }
}
