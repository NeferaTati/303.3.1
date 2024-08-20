public class IsEmptyExample{
    public static void main(String args[]){
        String s1="";
        String s2="hello";
        System.out.println(s1.isEmpty());      // true
        System.out.println(s2.isEmpty());      // false
    }
    //examples
    class StringTrimExample{
        public static void main(String args[]){String s1="  hello   ";
            System.out.println(s1+"how are you");        // without trim()
            System.out.println(s1.trim()+"how are you"); // with trim()
        }
        class StringLowerExample{
            public static void main(String args[]){
                String s1="HELLO HOW Are You?";
                String s1lower=s1.toLowerCase();
                System.out.println(s1lower);}
        }
        class StringUpperExample{
            public static void main(String args[]){
                String s1="hello how are you";
                String s1upper=s1.toUpperCase();
                System.out.println(s1upper);
            }}}








