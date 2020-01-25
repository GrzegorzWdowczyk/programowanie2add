package pl.sdacademy.intermediate.basic10;

import org.junit.*;

public class RectangleTest {
    Rectangle rectangle;

    @BeforeClass
    public static void setUpClass() {
        System.out.println("Starting RectangleTest");
    }

    @Before
    public void setRectangle() {
        rectangle = new Rectangle(3, 4);
    }

    @After
    public void afterRectangleTest() {
        System.out.println("After single test case");
    }
    @AfterClass
    public static void setUpAfterClass() {
        System.out.println("Finishing RectangleTest");
    }



    @Test
    public void testCalculateArea() {
        Assert.assertEquals(12, rectangle.calculateArea());
    }
    @Test
    public void testCalculatePerimeter() {
        Assert.assertEquals(14, rectangle.calculatePerimeter());
    }

    @Test
        public void testGetHeight () {
        Assert.assertEquals(4, rectangle.getHeight());
    }

    @Test
    public void testGetWidth () {
        Assert.assertEquals(3, rectangle.getWidth());
    }

    @Test
    public void testupdateWidth () {
        rectangle.setWidth(5);
        Assert.assertEquals(5,rectangle.getWidth());
    }

    @Test
    public void testupdateHeight () {
        rectangle.setHeight(5);
        Assert.assertEquals(5,rectangle.getHeight());
    }

    @Test
    public void testupdateHeightUnderZero () {
        new Rectangle(3,-3);
    }

    @Test
    public void testupdateWidthUnderZero () {
        new Rectangle(-2,5);
    }






}

