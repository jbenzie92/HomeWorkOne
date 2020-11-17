package com.johncodes;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;


public class controlFlowProject {
    public static class AsciiChars {
        public static void printNumbers() {
            // TODO: print valid numeric input
            for (int i = 48; i <= 57; i++) {
                System.out.printf("Game Numbers : %c ", i, i);
            }
        }

        public static void printLowerCase() {
            // TODO: print valid lowercase alphabetic input
            for (int i = 97; i <= 122; i++) {
                System.out.printf("%d : %c ", i, i);
            }
        }

        public static void printUpperCase() {
            // TODO: print valid uppercase alphabetic input
            for (int i = 65; i <= 90; i++) {
                System.out.printf("%d : %c ", i, i);

            }


        }
        //public static survey (String question, String answer, Scanner scanner){
        //Scanner input = new Scanner(System.in);
        // System.out.println(question);
        // answer = input.nextLine();
        // return answer;
        // }

    }

    public static void introSequence() {
        Scanner input = new Scanner(System.in);
        System.out.println("Let's get Active!");
        System.out.print("Please Enter Your Name: ");
        String playerName = input.next();
        System.out.println("Hey there " + playerName + " would you like to continue? Yes or No");

        String playerChoice1 = input.next();
        if (playerChoice1.equals("yes")) {
            System.out.println("Great ... So now I'll need some information");
            survey();
        } else if (playerChoice1.equals("y")) {
            System.out.println("Great ... So now I'll need some information");
            survey();
        } else {
            System.out.println("Come Back some other time you nerd!");
        }
        input.close();
    }

    public static void survey() {
        Scanner input = new Scanner(System.in);
        String[] questions = {"What is your favorite pets name?", "What is your pets age?", "What is your lucky " +
                "number? 1-100: ", "Do you have a favorite athlete? Yes or No?: ", "What's their jersey number? " +
                "1-30?: ", "two-digit model year of their car? Ex. 98", "Who is your favorite actor", "Give me a " +
                "random number between 1-50: "};
        String petName = "";
        int petAge = 0;
        int luckyNumber = 0;
        String favAthlete = "";
        int jerseyNumber = 0;
        int modelYear = 0;
        String favActor = "";
        int randoNumber = 0;
        for (int i = 0; i <= questions.length; i++) {

            if (i == 0) {
                System.out.println(questions[0]);
                petName = input.next();
            }
            if (i == 1) {
                System.out.println(questions[1]);
                petAge = input.nextInt();
            }
            if (i == 2) {
                System.out.println(questions[2]);
                luckyNumber = input.nextInt();
            }
            if (i == 3) {
                System.out.println(questions[3]);
                favAthlete = input.next();
            }
            if (i == 4) {
                System.out.println(questions[4]);
                jerseyNumber = input.nextInt();
            }
            if (i == 5) {
                System.out.println(questions[5]);
                modelYear = input.nextInt();
            }
            if (i == 6) {
                System.out.println(questions[6]);
                favActor = input.next();
            }
            if (i == questions.length) {
                System.out.println(questions[7]);
                randoNumber = input.nextInt();
                nonMagicNums(petName,petAge,luckyNumber,favAthlete,jerseyNumber,modelYear, favActor,randoNumber, input);
            }
        }
    }

    public static void magicBall(int jerseyNumber) {
        int min = 1;
        int max = 5;
        int random = (int) (Math.random() * (max - min + 1) + min);
        int magicEightBall = jerseyNumber * random;
        if (magicEightBall > 75) {
            magicEightBall = magicEightBall - 75;
        }
        System.out.println("Magic Ball: " + magicEightBall);
    }
    public static void nonMagicNums(String petName, int petAge, int luckyNumber, String favAthlete, int jerseyNumber,
                                    int modelYear, String favActor, int randoNumber, Scanner input) {
        int random = ThreadLocalRandom.current().nextInt(75);
        ArrayList<Integer> randomInts = new ArrayList<Integer>();
        for (int i = 0; i <= 2; i++) {
            randomInts.add(random);
            random = ThreadLocalRandom.current().nextInt(50);
        }
        Integer lottoOne = (modelYear + luckyNumber);
        Integer lottoTwo = (petAge + modelYear);
        Integer lottoThree = (jerseyNumber + petAge + luckyNumber);
        Integer lottoFour = 42;
        Integer lottoFive = (randomInts.get(2) - randomInts.get(1));
        if (lottoFive < 0){
            lottoFive = lottoFive * -1;
        }
        ArrayList<Integer> lottoList = new ArrayList<Integer>();
        lottoList.add(lottoOne);
        lottoList.add(lottoTwo);
        lottoList.add(lottoThree);
        lottoList.add(lottoFour);
        lottoList.add(lottoFive);
        System.out.print("LOTTERY NUMBERS : " + lottoList + " ");
        magicBall(jerseyNumber);
        restartSequence(input);
    }
    public static void restartSequence(Scanner input){

        System.out.println("Nice! would you like to play again? Yes or No");
        String playerChoice2 = input.next();
        if (playerChoice2.equals("yes")) {
            System.out.println("Great ... Let's go for another round!");
            survey();
        } else if (playerChoice2.equals("y")) {
            System.out.println("Great ... Let's go for another round!");
            survey();
        } else {
            System.out.println("Come Back some other time you nerd!");
        }
        input.close();
    }



    public static void main(String[] args) {
        //String petName = input.nextLine();
        introSequence();
        // for loop with questions - First go around without any OOP.
        /*
        while (true) {
            System.out.println("What is your favorite pets name?");
            String petName = input.nextLine();
            if (petName != null) {
                System.out.println("What is your pets age?");
                Integer petAge = input.nextInt();
                if (petAge >= 1 && petAge <= 100) {
                    System.out.println("What is your lucky number? 1-100: ");
                    Integer luckyNumber = input.nextInt();
                    if (luckyNumber >= 1 && luckyNumber <= 100) {
                        System.out.println("Do you have a favorite athlete? Yes or No?: ");
                        String favoriteAthlete = input.nextLine();
                        //input.nextLine(); //set favoriteathlete to true???
                        if (favoriteAthlete.equals(favoriteAthlete)) {
                            System.out.println("What's their jersey number? 1-100?: ");
                        } Integer jerseyNumber = input.nextInt();
                                if (jerseyNumber >= 1 && jerseyNumber <= 100) {
                                    System.out.println("two-digit model year of their car? Ex. 98");
                                    Integer modelYear = input.nextInt();
                                    if (modelYear >= 1 && modelYear <= 100) {
                                        System.out.println("Who is your favorite actor");
                                        String favoriteActor = input.nextLine();
                                        if (favoriteActor.equals("")) {
                                            System.out.println("Give me a random number between 1-50: ");
                                            Integer randoNumber = input.nextInt();
                                            if (randoNumber >= 1 && randoNumber <= 50) ;
                                            int random = ThreadLocalRandom.current().nextInt(75);
                                            int magicBall =  random * jerseyNumber;
                                            //ArrayList<Integer> randomInts = new ArrayList<Integer>();
                                            //for (int i = 0; i <= 2; i++) {
                                                randomInts.add(random - 10);
                                                random = ThreadLocalRandom.current().nextInt(50);
                                            }
                                            Integer lottoOne = (modelYear + luckyNumber);
                                            Integer lottoTwo = (petAge + modelYear);
                                            Integer lottoThree = (jerseyNumber + petAge + luckyNumber);
                                            Integer lottoFour = 42;
                                            Integer lottoFive = (randomInts.get(2) - randomInts.get(1));
                                            ArrayList<Integer> lottoList = new ArrayList<Integer>();
                                            lottoList.add(lottoOne);
                                            lottoList.add(lottoTwo);
                                            lottoList.add(lottoThree);
                                            lottoList.add(lottoFour);
                                            lottoList.add(lottoFive);
                                            System.out.print("LOTTERY NUMBERS : " + lottoList + " ");
                                            System.out.print("MAGIC BALL : " + magicBall + " ");

                                        }
                                    }
                                }
                            }
                        }

                }
            System.out.print("Would you like to generate more numbers? ");
            break;
        }

                    }

                }
*/
//System.out.println("Let's get Active!");
//AsciiChars.printNumbers();
//AsciiChars.printLowerCase();
//AsciiChars.printUpperCase();
// Scanner myScanner = new Scanner(System.in);
//System.out.print("Please Enter Your Name: ");
//String playerName = myScanner.next();
//System.out.println("Hey there " + playerName + "!");

//System.out.print("So would you like to continue? ");
//String playerChoice1 = input.nextLine();

//if (playerChoice1.equals("yes")) {
//System.out.println("Great ... So now I'll need some information");
// } else if (playerChoice1.equals("y")) {
//System.out.println("Great ... So now I'll need some information");
//} else {
//  System.out.println("Come Back some other time you nerd!");
//}
    }
}