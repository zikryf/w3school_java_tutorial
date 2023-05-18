// Note: Java is case-sensitive: "MyClass" and "myclass" has different meaning.
// The name of the java file must match the class name.

// every line of code that runs in Java must be inside a class
// a class name always start with an uppercase letter
// the class in this example is: Main

public class Main {
    public static void main(String[] args) {
        //////////////////////////////////////////////////

        System.out.println("Hello World");
        System.out.println("Me learning Java right now.");
        System.out.println();

        //////////////////////////////////////////////////

        System.out.print("Now, what can I do with Java? <-No new line-> ");
        System.out.println("Whoa what is it like this lol.");
        System.out.println();

        //////////////////////////////////////////////////

        System.out.println("Numbers & Arithmetics");

        System.out.println(3);
        System.out.println(726);
        System.out.println(23843);

        System.out.println(3 + 3);
        System.out.println(2 * 5);
        System.out.println();

        //////////////////////////////////////////////////

        System.out.println("Types of Variables:");
        System.out.println("String, int, float, char, boolean");

        String Hello = "world";
        System.out.println(Hello);

        // declare var type with value
        int OTT = 123;
        System.out.println(OTT);
        
        // declaring var type before assigning value
        int FFS;
        FFS = 456;
        System.out.println(FFS);

        float floatNum = 5.99f;
        System.out.println(floatNum);

        char letter = 'D';
        System.out.println(letter);

        boolean tf = true;
        System.out.println(tf);

        String A = "Hello";
        String B = "world";
        System.out.println(A + " " + B);
        System.out.println("Hello " + B);
        System.out.println(A + " world");

        int num1 = 3;
        int num2 = 17;
        System.out.println(num1 * num2);
        System.out.println();

        //////////////////////////////////////////////////
        
        // e exponent in Java 
        float f1 = 35e3f; // => 35 * 10^(3) = 35 000
        double d2 = 12e5d; // => 12 * 10^(5) = 1 200 000
        System.out.println(f1);
        System.out.println(d2);

        // for 'char' data type, the character is to be surrounded in single quotes ''
        // for 'string' data type, the sequence of characters are to be surrounded in double quotes ""
        System.out.println();

        //////////////////////////////////////////////////
        
        // Math.random() returns random between 0.0 (inclusive) and 1.0 (exclusive)
        System.out.println(Math.random()); // double data type

        // to get a random number between 0 to 100
        int randomNum_0to100 = (int)(Math.random() * 101);
        System.out.println(randomNum_0to100);
        System.out.println();

        //////////////////////////////////////////////////

        int time = 20;
        // LONG FORM OF IF ELSE STATEMENT
        // if (time < 18) {
        //     System.out.println("Time is below 18 seconds");
        // }
        // else {
        //     System.out.println("Time is more than 18 seconds");
        // }
        
        // SHORT FORM OF IF ELSE STATEMENT
        String result = (time < 18) ? "Time is below 18 seconds" : "Time is more than 18 seconds";
        System.out.println(result);
        System.out.println();

        //////////////////////////////////////////////////

        int i = 20;

        if (i < 15)
            System.out.println("Will only print if i is < 15");
            System.out.println("Will always print");

        System.out.println("This code is outside the 'if' block");
        System.out.println();

        //////////////////////////////////////////////////

        i = 0;
        System.out.println("while loop:");
        while (i < 5) {
            System.out.println(i);
            i++;
        }
        System.out.println();

        i = 0;
        System.out.println("do/while loop:");
        do {
            System.out.println(i);
            i++;
        }
        while (i < 5);
        System.out.println();

        //////////////////////////////////////////////////

        // for (a; b; c)
        // a => executed ONE TIME BEFORE the execution of the code block
        // b => defines the condition for executing the code block
        // c => executed EVERYTIME AFTER the execution of the code block
        for (int x = 0; x < 5; x += 2) {
            // THIS AREA IS THE CODE BLOCK
            System.out.println(x);
        }
        System.out.println();

        //////////////////////////////////////////////////

        // differences between break and continue
        System.out.println("Break:");
        for (int y = 0; y < 10; y++) {
            if (y == 4) {
                break; // will stop the loop without meeting the base condition
            }
            System.out.println(y);
        }
        System.out.println("Loop broken out of");
        System.out.println();

        System.out.println("Continue:");
        for (int z = 0; z < 10; z++) {
            if (z == 4) {
                continue; // will continue 
            }
            System.out.println(z);
        }
        System.out.println("Loop continued until condition is met");
        System.out.println();

        //////////////////////////////////////////////////

        // Arrays
        String[] fruits = {"banana", "kiwi", "white dragonfruit", "papaya"};

        // printing each element in array using for loop WITH counter
        System.out.println("Fruits before: ");
        for (int ind = 0; ind < fruits.length; ind++) {
            System.out.println(ind+1 + ": " + fruits[ind]);
        }

        System.out.println("3rd fruit: " + fruits[2]);
        System.out.println("4th fruit: " + fruits[3]);
        System.out.println();

        fruits[3] = "apple";
        System.out.println("4th fruit changed to 'apple'");
        System.out.println();

        // printing each element in array using for-each loop WITHOUT counter
        System.out.println("Fruits after: ");
        int count = 0;
        for (String fruit : fruits) {
            count++;
            System.out.println(count + ": " + fruit);
        }

        System.out.println("4th fruit: " + fruits[3]);
        System.out.println();

        //////////////////////////////////////////////////
    }
}

