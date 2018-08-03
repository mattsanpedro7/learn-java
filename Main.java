// Java is an object oriented language (OOP)
// Objects are called "classes"

// every line of code that can run needs to be inside a class
// public: any class can access it
public class Main {
    // entry point of Java program
    // static: run this method without creating an instance of Main
    // void: this method doesn't return any value
    // main: the name of the method
    public static void main(String[] args) {
        // System: pre-defined class that Java provides, 
        // holds useful methods and variables
        // out: static variable within System represents
        // the output of your program (stdout)
        // println: method of out can be used to print line
        System.out.println("Hello, World!!!");
        System.out.println(System.out.getClass());
    }
}