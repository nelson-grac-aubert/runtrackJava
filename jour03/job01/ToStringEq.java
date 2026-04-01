package jour03.job01;

import jour03.job01.rectangle.Rectangle;
import jour03.job01.rectangle.rectanglecolore.RectangleColore;

public class ToStringEq {

    public static void main(String[] args) { 

        System.out.println("Test 1 :");
        Rectangle rect = new Rectangle(12.5, 4.0);
        System.err.println(rect);

        System.out.println("Test 2 :");
        RectangleColore rect1 = new RectangleColore(12.5, 4.0, "rouge");
        System.out.println(rect1);

        System.out.println("Test 3 :");
        RectangleColore rect2 = new RectangleColore(25.0/2, 8.0/2, new String("rouge"));
        System.out.println(rect2);

        System.out.println(rect1.equals(rect2));
        System.out.println(rect2.equals(rect1));
        System.out.println(rect1.equals(null));
        System.out.println(rect.equals(rect1));
        System.out.println(rect1.equals(rect));
    }

}
