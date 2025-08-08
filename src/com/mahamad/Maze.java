package com.mahamad;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
        System.out.println(count(3, 3));
        ReturnPath("", 3, 3);

        System.out.println(ReturnListPath("", 3, 3));

        System.out.println(ReturnDiagonalPath("", 3, 3));
    }

    static int count(int r, int c) {
        if (r == 1 || c == 1) {
            return 1;
        }
        int down = count(r - 1, c);
        int right = count(r, c - 1);
        return down + right;
    }

    static void ReturnPath(String p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(p);
            return;
        }
        if (r > 1) {
            ReturnPath(p + 'D', r - 1, c);
        }

        if (c > 1) {
            ReturnPath(p + 'R', r, c - 1);
        }
    }

    static ArrayList<String> ReturnListPath(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();
        if (r > 1) {
            ans.addAll(ReturnListPath(p + 'D', r - 1, c));
        }

        if (c > 1) {
            ans.addAll(ReturnListPath(p + 'R', r, c - 1));
        }

        return ans;
    }

    //go for let - right and diagonal
    static ArrayList<String> ReturnDiagonalPath(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();

        if (r > 1 && c > 1) {
            ans.addAll(ReturnDiagonalPath(p + 'D', r - 1, c - 1));
        }

        if (r > 1) {
            ans.addAll(ReturnDiagonalPath(p + 'V', r - 1, c));
        }

        if (c > 1) {
            ans.addAll(ReturnDiagonalPath(p + 'H', r, c - 1));
        }

        return ans;
    }
}
