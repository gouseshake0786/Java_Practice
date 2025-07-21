package com.mahamad;

public class StringBasics {
    public static void main(String[] args) {
        String name = "abbaa";
        if (isPalindrome(name))
            System.out.println("Is a isPalindrome");
        else
            System.out.println("No");
    }

    static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        int n = str.length();
        for (int i = 0; i <= n / 2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(n - 1 - i);
            if (start != end)
                return false;
        }
        return true;
    }
}
