// Java provides a mutable class that lets to change text value.

// When we pass string literal " andGoodbye" to the concat method this created an object memory for thatl iteral " andGoodbye".
// It also created the result of concat method the object the string that has value "Hello World and Goodbye".
// These mwthod dont change the internals of existing string object.
// The string refrenced by helloWorld variable never changed instead a new String was created by method call.

// In stringBuilder after we call append method we can still have only one String builder object
// The variable helloWorldBuilder is still referencing the same object but value of that object changed.
// This is important because it means the character sequence in the StringBuilder changed

// String methods create new object in memory and return a reference to this new object.
// StringBuilder methods return a StringBuilder reference but its really a self-reference.

public class StringBuilderMain {

    public static void main(String[] args) {
        String helloWorld = "Hello" + " World";
        helloWorld.concat(" and Goodbye");

        StringBuilder helloWorldBuilder = new StringBuilder("Hello" + " World");
        helloWorldBuilder.append(" and Goodbye");

        printInformation(helloWorld);
        printInformation(helloWorldBuilder);

        StringBuilder emptyStart = new StringBuilder();
        // emptyStart.append("a".repeat(17));
        emptyStart.append("a".repeat(57));

        StringBuilder emptyStart32 = new StringBuilder(32);
        emptyStart32.append("a".repeat(17));

        printInformation(emptyStart);
        printInformation(emptyStart32);

        StringBuilder buildePlus = new StringBuilder("Hello" + " World");
        buildePlus.append(" and Goodbye");

        buildePlus.deleteCharAt(16).insert(16, 'g');
        System.out.println(buildePlus);

        buildePlus.replace(16,17, "G");
        System.out.println(buildePlus);

        buildePlus.reverse().setLength(7);
        System.out.println(buildePlus);
    }

    public static void printInformation(String string){
        System.out.println("String = " + string);
        System.out.println("Length = " + string.length());
    }

    public static void printInformation(StringBuilder builder){
        System.out.println("StringBuilder = " + builder);
        System.out.println("Length = " + builder.length());
        System.out.println("capacity = " + builder.capacity());
    }
    
}
