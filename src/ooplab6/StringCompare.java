package ooplab6;

public class StringCompare {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Helloooo";
//        compare String
//        type 1 (==)
        if (str1 == str2)
            System.out.println("true");
        else System.out.println("false");
//        type 2 (equals() method
        if (str1.equals(str2))
            System.out.println("true");
        else System.out.println("false");
//        type 3 (compareTo() method
//        0 = String is equal.
//        - = Left String is less than Right String
//        - = Left String is more than Right String
        if (str1.compareTo(str2)==0)
            System.out.println("true");
        else if (str1.compareTo(str2)>=1)
            System.out.println("str1 is more than str2");
        else
            System.out.println("str1 is less than str2");



    }//main
}//class