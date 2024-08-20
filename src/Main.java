import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String vowels = "a::b::c::d:e";

        // splitting the string at "::"
        // storing the result in an array of strings
        String[] result = vowels.split("::");

        // converting array to string and printing it
        System.out.println("result = " + Arrays.toString(result));
    }
    class CompareToExample{
        public static void main(String args[]){
            String s1="hello";
            String s2="hello";
            String s3="hemlo";
            String s4="flag";
            System.out.println(s1.compareTo(s2));

            class findString {
                public static void main(String[] args) {
                    String str1 = "Java is fun";
                    int result;

                    // getting index of character 's'
                    result = str1.indexOf('s');

                    System.out.println(result); // 6

                    // getting index of character 'J'
                    result = str1.lastIndexOf('J');
                    System.out.println(result); // 0

                    // the last occurrence of 'a' is returned
                    result = str1.lastIndexOf('a');
                    System.out.println(result); // 3

                    // character not in the string
                    result = str1.lastIndexOf('j');
                    System.out.println(result); // -1

                    // getting the last occurrence of "ava"
                    result = str1.lastIndexOf("ava");
                    System.out.println(result); // 1

                    // substring not in the string
                    result = str1.lastIndexOf("java");
                    System.out.println(result); // -1
                }
            }


        }




class lengthDemo {
        public static void main(String[] args) {
            String str1 = "Java";
            String str2 = "";

            System.out.println(str1.length());  // 4
            System.out.println(str2.length());  // 0
            System.out.println("Java".length());  // 4
            System.out.println("Java\n".length()); // 5
            System.out.println("Learn Java".length()); // 10
        }
    }


