import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        float num = input.nextFloat();
//        System.out.println(num);

        int value = (int)(67.85f); // Type casting of float to int
        System.out.println(value);

        // Automatic type promotion in expressions
        int value1 = 257;
        byte value2 = (byte)(value1); // Max byte can stored is 256. Result will 1 -> 257 % 256 is 1.
        System.out.println(value2);

        byte a = 40;
        byte b = 50;
        byte c = 100;
        int d = (a * b) / c;
        System.out.println(d);


        int value3 = 'A'; // Java code follows unicode values. So it print give Ascii value.
        System.out.println(value3);

        byte value4 = 42;
        char value5 = 'a';
        short value6 = 1024;
        int value7 = 50000;
        float value8 = 5.65f;
        double value9 = 0.1464;
        double result = (value8 * value4) + (value7 / value5) - (value9 * value6);
        System.out.println((value8 * value4) + " " + (value7 / value5) + " " + (value9 * value6));
        System.out.println(result);
    }
}
