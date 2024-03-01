package javaAssignment6;

public class VowelsInStrings {
    public static void main(String[] args) {
        String s = "Hello world";
        System.out.println(countVowels(s));
    }
    static int countVowels(String s){
        int count = 0;
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            switch (c){
                case 'a','e','i','o','u','A','E','I','O','U' :count++;
            }
        }
        return count;
    }
}
