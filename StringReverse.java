package javaAssignment6;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        System.out.println("Enter the string to reverse : ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(reverse(s));
    }
    static String reverse(String s){
        String ans = "";
        for(int i = s.length()-1;i>=0;i--){
            ans += s.charAt(i);
        }
        return ans;
    }

}
