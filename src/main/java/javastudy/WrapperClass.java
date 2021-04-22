package javastudy;

public class WrapperClass {
    public static void main(String[] args) {
        //Boxing
        Integer num1 = new Integer(10);
        Integer num2 = Integer.valueOf(10);

        //Unboxing
        int num3 = num2.intValue();
        int num4 = num2.intValue();

        int parseInt = Integer.parseInt("10");

        Integer obj1 = 300;
        Integer obj2 = 300;

        System.out.println(obj1 == obj2);
        System.out.println(obj1.intValue() == obj2.intValue());
        System.out.println(obj1.equals(obj2));
    }
}
