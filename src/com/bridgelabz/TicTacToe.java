package com.bridgelabz;

import java.util.Scanner;

public class TicTacToe {
    static char playerchoice;
    static char computerchoice;

    //UC1
    static char chararray[] = {' ',' ',' ',' ',' ',' ',' ',' ',' ',' '};

    //UC2
    void chooseXorO(char chooseLetter){
        if(chooseLetter == 'x'){
            playerchoice = 'x';
            System.out.println("player choosen the letter: "+playerchoice);
            computerchoice ='o';
            System.out.println("Computer choosen the letter: "+computerchoice);
        }else {
            playerchoice = 'o';
            System.out.println("player choosen the letter: "+playerchoice);
            computerchoice ='x';
            System.out.println("Computer choosen the letter: "+computerchoice);
        }
    }

    //UC3
    void display(char[] arr){
        System.out.println("| "+arr[1]+" | "+arr[2]+" | "+arr[3]+" |");
        System.out.println("-------------");
        System.out.println("| "+arr[4]+" | "+arr[5]+" | "+arr[6]+" |");
        System.out.println("-------------");
        System.out.println("| "+arr[7]+" | "+arr[8]+" | "+arr[9]+" |");
    }

    //UC4
    void placing(int index,char letter,char arr[]){
        TicTacToe obj = new TicTacToe();
        arr[index]=letter;
    }


    public static void main(String[] args) {
        //char chararray[] = {' ',' ',' ',' ',' ',' ',' ',' ',' ',' '};
        TicTacToe obj = new TicTacToe();
        Scanner scan = new Scanner(System.in);
        System.out.println("Player choose a letter from x or o :");
        char chooseletter = scan.next().charAt(0);
        obj.chooseXorO(chooseletter);
        obj.display(chararray);
        System.out.println("Choose the index");
        int playerIndex = scan.nextInt();
        int computerIndex = (int) (Math.random() * 10) % 9;
        System.out.println("Player value : "+playerIndex);
        System.out.println("Computer value : "+computerIndex);
        obj.placing(playerIndex,playerchoice,chararray);;
        obj.placing(computerIndex,computerchoice,chararray);
        obj.display(chararray);

    }
}