package javaAssignment6;

import java.util.Scanner;

public class Capitalize {
    public static void main(String[] args) {
        System.out.println("Enter the string to capitalize : ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(capitalizeAllWords(s));
    }
    static String capitalizeAllWords(String s){
        if(s.length() < 1){
            return s;
        }
        String ans = "";
        ans = ans + (char) (s.charAt(0)-32);
        for(int i = 1;i<s.length();i++){
            if(s.charAt(i-1) == ' ')
                ans = ans + (char) (s.charAt(i)-32);
            else
                ans = ans + s.charAt(i);
        }
        return ans;
    }
}
