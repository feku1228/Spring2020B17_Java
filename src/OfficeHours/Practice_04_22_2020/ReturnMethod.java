package OfficeHours.Practice_04_22_2020;

public class ReturnMethod {
    public static void main(String[] args) {
       //int a=sum(10,20);
        int num1=sum2(10, 20);
        System.out.println(num1);
        System.out.println("=============================================");

        String str="Cybertek";
        String result="";
        for (int i=str.length()-1;i>=0;i--){
            result+=str.charAt(i);
        }
        System.out.println(result);

        String name ="bank of America";
       String name2= reverse(name);
        System.out.println(name2);

        System.out.println(name.equals(name2));// palindrome


    }
    public static void sum(int a,  int b){
        System.out.println(a+b);
    }
public static int sum2(int a,int b){
        return a+b;
}
public static String reverse(String str){

    String result="";
    for (int i=str.length()-1;i>=0;i--){
        result+=str.charAt(i);
    }
    return result;

}
}
