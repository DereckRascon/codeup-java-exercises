public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        int myFavoriteNumber = 7;
        System.out.println(myFavoriteNumber);

        String myString = "This is my new String";
        System.out.println(myString);

        float myNumber = 3.14f;
        System.out.println(myNumber);

        int x = 5;
        System.out.println(++x);
        System.out.println(x);

        String theNumberThree = "three";
        Object o = theNumberThree;
        System.out.println(o);

        int y = 4;
        y += 5;
        System.out.println(y);

        int a = 3;
        int b = 4;
        a += b;
        System.out.println(a);

        int c = 10;
        int d = 2;
        c /= d;
        d -= c;
        System.out.println(c);
        System.out.println(d);

        byte thisByte = 127;
        thisByte++;
        System.out.println(thisByte);

        int maxInt = Integer.MAX_VALUE;
        System.out.println("Maximum int: " + maxInt);

    }
}
