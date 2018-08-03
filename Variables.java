// Java is a strong typed language (ie variables need to be defined before we use them)

public class Variables {
    public static void main(String[] args) {
        // Numbers: to declare
        int myNumber;
        myNumber = 5 * 98;
        
        System.out.println("My number is: " + myNumber);
        // int myNumber = 5;
        
        
        // Double floating point number
        double d = 4.5;
        d = 3.0 * 20;
        
        System.out.println("My double is: " + d);

        // float
        float f = (float) 4.5;
        
        // f is a shorter way to cast float
        // float f = 4.5f;

        System.out.println("My float is: " + f);
        
        // characters and strings
        char c = 'g';
        System.out.println("My character is: " + c);

        // string with a constructor
        String s1 = new String("Who let the perros out?");

        // Just using "" create a string
        String s2 = "Who let the cat out?";

        // Use + to concatenate
        String s3 = s1 + "  " + s2;

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        // concat string to primitives:
        int num = 5;
        String ss = "I have " + num + " cookies";

        System.out.println(ss);

        // boolean
        boolean b = false;
        b = true;
        boolean toBe = false;
        b = toBe || !toBe;
        
        if (b) {
            System.out.println(toBe);
        }
        
        System.out.println(b);

        // exercise
        char q = 'H';
        int x = 311;
        char r = 'w';
        int y = 0;
        int z = 1;
        float g = (float) 2.0;
        boolean myBool = true;
        byte zero = 0;
        String output = "H" + x + zero + " W" + zero + "r" + z + "d " + g + " " + myBool;

        System.out.println(output);
    }
}