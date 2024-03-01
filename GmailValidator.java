package javaAssignment6;

import java.util.Scanner;

public class GmailValidator {
    public static void main(String[] args) {
        System.out.println("Enter the Gmail to validate : ");
        Scanner sc = new Scanner(System.in);
        String gmail = sc.nextLine();
        System.out.println(gmailChecker(gmail));//abc@gmail.com
    }
    static String gmailChecker(String gmail){
        if(gmail.length() < 10)
            return "Invalid EmailAddress : inValid EmailProvider  ";
        if(gmail.charAt(gmail.length()-11) == '.')
            return "Invalid EmailAddress : last letter of name should be number or letter" ;
        if(!(gmail.substring(gmail.length()-10).equals("@gmail.com")))
            return "Invalid Email Address : invalid EmailProvider ";
        for(int i = 0;i<gmail.length()-10;i++){
            char c = gmail.charAt(i);
            if(!(Character.isAlphabetic(c) || c == '.'|| Character.isDigit(c))) {
                return "Invalid Email address : Invalid name ";
            }
        }
        return "Valid Email address ";
    }
}
