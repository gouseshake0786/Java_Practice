package com.mahamad;

import java.util.Arrays;

public class MazePath {
    public static void main(String[] args) {
        boolean[][] box = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        allPath("", box, 0, 0);

        int[][] path = new int[box.length][box[0].length];
        allPathReturn("", box, 0, 0, path, 1);
    }

    //All path having issue
    static void allPath(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        if (!maze[r][c]) {
            return;
        }

        //backTracking
        maze[r][c] = false;

        if (r < maze.length - 1) {
            allPath(p + 'D', maze, r + 1, c);
        }

        if (c < maze[0].length - 1) {
            allPath(p + 'R', maze, r, c + 1);
        }

        if (r > 0) {
            allPath(p + 'U', maze, r - 1, c);
        }

        if (c > 0) {
            allPath(p + 'D', maze, r, c - 1);
        }

        //backtracking
        maze[r][c] = true;
    }

    static void allPathReturn(String p, boolean[][] maze, int r, int c, int[][] path, int step) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            path[r][c] = step;
            for (int[] arr : path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        if (!maze[r][c]) {
            return;
        }

        //backTracking
        maze[r][c] = false;
        path[r][c] = step;
        if (r < maze.length - 1) {
            allPathReturn(p + 'D', maze, r + 1, c, path, step + 1);
        }

        if (c < maze[0].length - 1) {
            allPathReturn(p + 'R', maze, r, c + 1, path, step + 1);
        }

        if (r > 0) {
            allPathReturn(p + 'U', maze, r - 1, c, path, step + 1);
        }

        if (c > 0) {
            allPathReturn(p + 'D', maze, r, c - 1, path, step + 1);
        }

        //backtracking
        maze[r][c] = true;
    }
}
