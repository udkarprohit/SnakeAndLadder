package com.bridgelabz;

public class SnakeAndLadder {
    static int player1Pos = 0;

    static int rollDie(){
        int diceNum = ((int) (Math.random() * 10 ) % 6) + 1;
        return diceNum;
    }
    public static void main(String[] args) {

        System.out.println("Welcome to snake and ladder game");
        System.out.println("Player position is : " + player1Pos);
        int dice = rollDie();
        System.out.println("Random dice no : " + dice);
    }
}
