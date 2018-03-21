package Lesson15_Tamagochi;

import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        Tamagochi tamagochi = new Tamagochi();

        Thread tamagochiThread = new Thread(tamagochi);
        tamagochiThread.start();

        System.out.println("Commands:\n"+"1- Feed\n+"
                +"2- Clean\n+"
                +"3- Play\n+"
                +"4- Get sleep\n+");

        Scanner scanner = new Scanner(System.in);

        while (tamagochiThread.isAlive()) {
            int command = scanner.nextInt();
            doSomething(tamagochi, command);
        }
    }

    private static void doSomething(Tamagochi tamagochi, int command) {
        switch (command){
            case 1: tamagochi.feed();
            break;
            case 2: tamagochi.clear();
            break;
            case 3: tamagochi.play();
            break;
            case 4: tamagochi.getSleep();
            break;
            default:
                System.out.println("Wrong command number.");
        }
    }
}
