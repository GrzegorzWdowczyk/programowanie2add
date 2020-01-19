package pl.sdacademy.intermediate.basic10;

import org.junit.Assert;
import org.junit.Test;

public class RectangleTest {
    @Test
    public  void testGetOne() {
        Rectangle rectangle = new Rectangle();
        Assert.assertEquals(1,rectangle.getOne());
    }
}
