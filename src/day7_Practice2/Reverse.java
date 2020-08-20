package day7_Practice2;

public class Reverse {
    /**
     * Write a return method that can reverse  String
     *
     * Ex: Reverse("ABCD"); ==> DCBA
     */
    public static void main(String[] args) {
        System.out.println(StrReverse1("ABCD"));
        System.out.println(Reverse2("ABCD"));
    }
    public static String StrReverse1(String str){
        String reverse="";
        for (int i=str.length()-1;i>=0;i--)
            reverse+=str.toCharArray()[i];
        return reverse;
    }
    public static String Reverse2(String str){
        return new StringBuffer(str).reverse().toString();
    }
}
