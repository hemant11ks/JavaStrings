// String has over 60 methods
// Index start from 0
// Exammple the length of this String is 11, but its last index is 10
// isEmpty : Returns true if length is zero
// isBlank : Returns true if length is zero OR the string only contains whitespace characters added in JDK 11.
// contentEquals : return boolean if string value equal to value of arg passed
// equals : return boolean if the str value is equal to value of arg passed
// equalIgnoreCase : return a boolean if String value is equal(ignoring case) to the value of the arg passed.
// regionMatches : retuens a boolean if defined sub region are matched.

public class MainString {

    public static void main(String[] args) {
        
        printInformation("Hello World");
        printInformation("");
        printInformation("\t  \n");

        String helloWorld = "Hello Workd";
        System.out.printf("Index of r = %d %n", helloWorld.indexOf('r'));
        System.out.printf("Index of World = %d %n", helloWorld.indexOf("World"));

        System.out.printf("Index of l = %d %n", helloWorld.indexOf('l'));
        System.out.printf("Index of l = %d %n", helloWorld.lastIndexOf('l'));

        System.out.printf("Index of l = %d %n", helloWorld.indexOf('l', 3));
        System.out.printf("Index of l = %d %n", helloWorld.lastIndexOf('l', 8));

        String helloWorldLower = helloWorld.toLowerCase();
        if(helloWorldLower.equals(helloWorldLower)){
            System.out.println("Values match exactly");
        }
        if(helloWorldLower.equalsIgnoreCase(helloWorldLower)){
            System.out.println("Values match ignore case");
        }
        if(helloWorldLower.startsWith("Hello")){
            System.out.println("String starts with Hello");
        }
        if(helloWorldLower.endsWith("World")){
            System.out.println("String ends with World");
        }
        if(helloWorldLower.contains("World")){
            System.out.println("String contains World");
        }
        if(helloWorldLower.contentEquals("Hello World")){
            System.out.println("Values match exactly");
        }
    }
    
    public static void printInformation(String string){

        int length = string.length();
        System.out.printf("Length = %d %n", length );

        if(string.isEmpty()){
            System.out.printf("String is Empty");
            return;
        }

        
        if(string.isBlank()){
            System.out.printf("String is Blank");
            return;
        }

        System.out.printf("First char = %c %n", string.charAt(0));
        System.out.printf("Last char = %c %n", string.charAt(length - 1));
    }
}
