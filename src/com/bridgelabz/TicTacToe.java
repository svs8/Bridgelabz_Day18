package com.bridgelabz;



public class TicTacToe {

    public static void main(String[] args) {
        char[] CharArray = new char[10];
        for(int i=1;i<=9;i++){
            CharArray[i]=' ';
        }
        for(int i=1;i<=3;i++){
            System.out.print(CharArray[i]+"|");
        }
        System.out.println();
        for(int i=4;i<=6;i++){
            System.out.print(CharArray[i]+"|");
        }
        System.out.println();
        for(int i=7;i<=9;i++){
            System.out.print(CharArray[i]+"|");
        }



    }
}
