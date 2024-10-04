package controller;

/**
 * @author Vincent Velthuizen
 * Purpose for the class
 */
public class WrapperLauncher {

    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);

        int integer1 = 3;
        Integer integer2 = Integer.valueOf(3);
        Integer integer3 = 3;
        int integer4 = integer2;

        Integer.parseInt("10");
    }
}
