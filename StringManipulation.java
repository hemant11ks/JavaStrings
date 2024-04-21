// indent : add or remove spaces from the beginning of lines in multiline text

// strip, stripLeading, stripTrailing, trim : diff between the strip method and trim method is that strip() support large set of
// white spaces char. and the corresponding stripLeading and stripTrailing methods were added in JDK 11

// toLowerCase, toUpperCase : return a new String either in lower case or upper case.

// concat : concate two string to return a new String.
// join : allow multiple concat together in single method by specifying delimeter.
// repeat : returns the String repeated by number of times specified in arg.
// substring, subSequence : return part of String its range defined by start and end index specified.

public class StringManipulation {

    public static void main(String[] args) {
        
        String birthDate = "25/11/1982";
        int startingIndex = birthDate.indexOf("1982");
        System.out.println("Starting Index = "+ startingIndex);
        System.out.println("Birth year = "+ birthDate.substring(startingIndex));
        System.out.println("Month = " + birthDate.substring(3, 5));

        String newDate = String.join("/", "25","11","1982");
        System.out.println("newDate = " + newDate);

        newDate = "25";
        newDate = newDate.concat("/");
        newDate = newDate.concat("11");
        newDate = newDate.concat("/");
        newDate = newDate.concat("1982");
        System.out.println("newDate = " + newDate);

        newDate = "25" + "/" + "11" + "/" + "1982";
        System.out.println("newData = " + newDate);

        newDate = "25".concat("/").concat("11").concat("/").concat("1982");
        System.out.println("newDate = " + newDate);

        System.out.println(newDate.replace('/', '-'));
        System.out.println(newDate.replace("2", "00"));
        System.out.println(newDate.replaceFirst("/", "-"));
        System.out.println(newDate.replaceAll("/", "---"));
       
        System.out.println("ABC\n".repeat(3));
        System.out.println("-".repeat(20));

        System.out.println("ABC\n".repeat(3).indent(8));
        System.out.println("-".repeat(20));

        System.out.println("   ABC\n".repeat(3).indent(-2));
        System.out.println("-".repeat(20));
    }
    
}
