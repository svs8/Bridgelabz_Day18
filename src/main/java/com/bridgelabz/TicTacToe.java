package com.bridgelabz;

import java.util.Scanner;

public class TicTacToe {
        static char userletterinput;
        static char computerletterinput;
        //UC1
        static char charArray[] = {' ',' ',' ',' ',' ',' ',' ',' ',' ',' '};

        //UC2
        void choosedLetter(char letterChoosed){
            if(letterChoosed == 'x'){
                userletterinput = 'x';
                System.out.println("player choosen the letter: "+userletterinput);
                computerletterinput ='o';
                System.out.println("Computer choosen the letter: "+computerletterinput);
            }else {
                userletterinput = 'o';
                System.out.println("player choosen the letter: "+userletterinput);
                computerletterinput ='x';
                System.out.println("Computer choosen the letter: "+computerletterinput);
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
            TicTacToe obj = new TicTacToe();
            Scanner scan = new Scanner(System.in);
            System.out.println("Please choose a letter from x or o :");
            char letterChoosed = scan.next().charAt(0);
            obj.choosedLetter(letterChoosed);
            obj.display(charArray);
            System.out.println("Choose the index where the letter need to be placed");
            int playerIndex = scan.nextInt();
            int computerIndex = (int) (Math.random() * 10) % 9;
            System.out.println("Player value : "+playerIndex);
            System.out.println("Computer value : "+computerIndex);
            obj.placing(playerIndex,userletterinput,charArray);;
            obj.placing(computerIndex,computerletterinput,charArray);
            System.out.println("");
            obj.display(charArray);

        }
    }

