import java.util.Scanner;

public class MaxGeneric {

    //comparable is an interface and determines the largest of 3 comparable objects
    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x;                      //initially assume x as largest

        if (y.compareTo(max) > 0)       //y is largest here
            max = y;

        if (z.compareTo(max) > 0)       //z is largest here
            max = z;
        return max;                     //returning largest objects
    }                                   //ending of maximum method

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);        //accept values from user
        System.out.println("Enter 3 Integer number to find Maximum:");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        System.out.println("Enter 3 Floating numbers to find Maximum:");
        float f1 = sc.nextFloat();
        float f2 = sc.nextFloat();
        float f3 = sc.nextFloat();

        System.out.println("Enter 3 Strings to find Maximum:");
        String s1 = sc.next();
        String s2 = sc.next();
        String s3 = sc.next();

        System.out.printf("Maximum of %d, %d and %d is %d\n\n", x, y, z, maximum(x, y, z));
        System.out.printf("Maximum of %.1f, %.1f and %.1f is %.1f\n\n", f1, f2, f3, maximum(f1, f2, f3));
        System.out.printf("Maximum of %s, %s and %s is %s\n", s1, s2, s3, maximum(s1, s2, s3));
    }
}


