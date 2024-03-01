package javaAssignment6;

import java.util.Scanner;

public class WordsReverse {
    public static void main(String[] args) {
        System.out.println("Enter the String words to reverse : ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(wordReverse(s));
    }
    static String wordReverse(String s){
        int start = 0;
        String ans = "";
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == ' '){
                ans = ans +  reverse(s,start,i);
                start = i+1;
            }
        }
        ans = ans + reverse(s,start,s.length());
        return ans;
    }
    static String reverse(String s,int start,int end){
        String ans = "";
        for(int i = end-1;i>=start;i--){
            ans = ans + s.charAt(i);
        }
        return ans + " ";
    }
}
