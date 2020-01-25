package pl.sdacademy.intermediate.basic10;

import org.junit.*;

public class RectangleTest {
    public static final int DEAFULT_WIDTH = 3;
    public static final int DEAFULT_HEIGHT = 4;
    Rectangle rectangle;

    @BeforeClass
    public static void setUpClass() {
        System.out.println("Starting RectangleTest");
    }

    @Before
    public void setRectangle() {
        rectangle = new Rectangle(DEAFULT_WIDTH, DEAFULT_HEIGHT);
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
        Assert.assertEquals(DEAFULT_HEIGHT, rectangle.getHeight());
    }

    @Test
    public void testGetWidth () {
        Assert.assertEquals(DEAFULT_WIDTH, rectangle.getWidth());
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
        new Rectangle(DEAFULT_WIDTH,-3);
    }

    @Test
    public void testupdateWidthUnderZero () {
        new Rectangle(-2,5);
    }






}

