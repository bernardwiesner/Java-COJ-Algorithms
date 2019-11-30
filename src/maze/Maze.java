package maze;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
31 12
1111111111111111111111111111111
1S00000000000000000000000000001
1110110101011101111101101111011
1000000001000000001101100000111
10111111111111011000001011111G1
1000000000000000001110001000001
1110111111111111101111110011111
1000100000000000001111110111101
1011101111111111111111110000001
1011100000000000000111111111101
1000001111111111110000000000001
1111111111111111111111111111111
*
 */
public class Maze {

    static int columns;
    static int lines;
    static char[][] maze;
    static boolean[][] visited;
    static int leastMoves = 9999999;

    public static void main(String[] args) {
        int posStart[] = fillMaze();
        int currentLine = posStart[0];
        int currentColumn = posStart[1];
        move(currentLine, currentColumn, 0);
        System.out.println(leastMoves);

    }

    public static void move(int line, int column, int moves) {
        visited[line][column] = true;
//        printMaze(line, column);
        int lineUp = line - 1;
        int columnRight = column + 1;
        int lineDown = line + 1;
        int columnLeft = column - 1;
        
        if (validPath(lineUp, column, 'G', "up") ||
                validPath(line, columnRight, 'G', "right") ||
                validPath(lineDown, column, 'G', "down") ||
                validPath(line, columnLeft, 'G', "left")) {
            moves++;
            printMaze(line, column);
            System.out.println("GOAL! :" + moves);

            if (leastMoves > moves) {
                leastMoves = moves;
            }
            visited[line][column] = false;
            return;
        }

        if(validPath(lineUp, column, '0', "up")) {
            if(validate(lineUp, column, moves)){
                move(lineUp, column, moves + 1);
            }
        }
        if(validPath(line, columnRight, '0', "right")) {
            if(validate(line, columnRight, moves)){
                move(line, columnRight, moves + 1);            
            }
        }
        if(validPath(lineDown, column, '0', "down")) {
            if(validate(lineDown, column, moves)){
                move(lineDown, column, moves + 1);            
            }
        }
        if(validPath(line, columnLeft, '0', "left")) {
            if(validate(line, columnLeft, moves)){
                move(line, columnLeft, moves + 1);
            }
        }
        
        visited[line][column] = false;
    }

    public static boolean validPath(int line, int column, char path, String position) {

        switch(position){
            case "up" : if(line < 0) return false;
            case "right" : if(column > columns) return false;
            case "down" : if(line > lines) return false;
            case "left" : if(column < 0) return false;
        }            
        

        if (maze[line][column] != path) {
            return false;
        }

        return true;
    }


    public static boolean validate(int line, int column, int moves) {
                
        if (moves >= leastMoves) {
            return false;
        }
        if (visited[line][column]) {
            return false;
        }
        return true;
    }

    public static int[] fillMaze() {
        Scanner sc = new Scanner(System.in);

        columns = sc.nextInt();
        lines = sc.nextInt();
        sc.nextLine(); //consume \n

        maze = new char[lines][columns];
        visited = new boolean[lines][columns];
        int[] posStart = new int[2];

        for (int line = 0; line < lines; line++) {
            String inputLine = sc.nextLine();
            for (int column = 0; column < columns; column++) {
                char character = inputLine.charAt(column);
                maze[line][column] = character;

                if (character == 'S') {
                    posStart[0] = line;
                    posStart[1] = column;
                }

            }
        }
        return posStart;
    }

    public static void printMaze(int line, int column) {
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {
                if (line == i && column == j) {
                    System.out.print("X");
                } else {
                    System.out.print(maze[i][j]);
                }
            }
            System.out.print("   ");
            //visited
            for (int j = 0; j < columns; j++) {
                if (visited[i][j]) {
                    System.out.print("X");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
        System.out.println();

    }
}
