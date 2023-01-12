package com.bridgelabz;

public class SnakeAndLadder {
    static int dice_Roll = 0;
    static int playersOption = 0;

    public static void main(String[] args) {
        System.out.println("Welcome to snake-ladder game");
        int player1Position = 0;
        while (player1Position != 100) {
            dice_Roll = ((int) (Math.random() * 10) % 6) + 1;
            System.out.println("Dice outcome : " + dice_Roll);
            playersOption = ((int) (Math.random() * 10) % 3);
            System.out.println("Player got the option of :" + playersOption);
            switch (playersOption) {
                case 0:
                    System.out.println("No play! player to stay at same position : " + player1Position);
                    break;
                case 1:
                    player1Position = player1Position + dice_Roll;
                    System.out.println("Player moved ahead by ladder of " + dice_Roll);
                    break;
                case 2:
                    player1Position = player1Position - dice_Roll;
                    System.out.println("player moved back by " + dice_Roll + " position");
                    break;
            }
            System.out.println("Player position is at : " + player1Position);


        }
        System.out.println("Player won");
    }
}
