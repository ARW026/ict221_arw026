/**
 * Simple math game for grades 3-5
 *
 * @Alan Wood
 */

package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MathGame {

    public static void main(String[] args) {
        ArrayList<Integer> arrayQ = new ArrayList();


        // creates object and assigns to a variable
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        // randVal1, randVal2 generates random numbers
        int randVal1 = 0;
        int randVal2 = 0;
        // calculates correct answers to compare with user input
        int correct = 0;
        // "count" variable to count correct answers
        int count = 0;
        // "response" variable to store the user input
        double response = 0;

        // this for loop creates the random numbers for the questions and adds it into the array which is repeated x10
        for (int i = 0; i < 10; i++) {
            randVal1 = rand.nextInt(12) + 1;
            randVal2 = rand.nextInt(12) + 1;
            arrayQ.add (randVal1);
            arrayQ.add (randVal2);
        }

        while (!arrayQ.isEmpty()) {

            // Gets the integers from the array and displays it to the user
            System.out.println();
            randVal1 = arrayQ.get(0);
            randVal2 = arrayQ.get(1);

            // Generates a random number to decide what math operation it uses, utilizing the < and > operators
            if(randVal1 <= 3) {
                System.out.println(randVal1 + " + " + randVal2);
                correct = randVal1 + randVal2;

                System.out.print("Enter answer: ");
                response = sc.nextInt();

                // if the user answers correctly, then the 2 numbers displayed get removed
                if (correct == response) {
                    count++;
                    System.out.println("That's correct");
                    arrayQ.remove(0);
                    arrayQ.remove(0);
                } else {
                    // if the user answers incorrectly, then the 2 numbers displayed get added to the end of the array
                    // as well as removing the numbers
                    System.out.println("That's incorrect," + " the answer was " + correct + "\n");
                    arrayQ.add(randVal1);
                    arrayQ.add(randVal2);
                    // index 0 gets removed first which allows index 1 to move up to index 0 which then removes the second number
                    // that's why both arrayQ.remove have an index of 0, otherwise it would skip numbers
                    arrayQ.remove(0);
                    arrayQ.remove(0);
                }
            } else if(randVal1 > 3 && randVal1 <= 6) {
                System.out.println(randVal1 + " - " + randVal2);
                correct = randVal1 - randVal2;

                System.out.print("Enter answer: ");
                response = sc.nextInt();


                if (correct == response) {
                    count++;
                    System.out.println("That's correct");
                    arrayQ.remove(0);
                    arrayQ.remove(0);

                } else {
                    System.out.println("That's incorrect," + " the answer was " + correct + "\n");
                    arrayQ.add(randVal1);
                    arrayQ.add(randVal2);
                    arrayQ.remove(0);
                    arrayQ.remove(0);
                }
            } else if(randVal1 > 6 && randVal1 <= 9) {
                System.out.println(randVal1 + " x " + randVal2);
                correct = randVal1 * randVal2;

                System.out.print("Enter answer: ");
                response = sc.nextInt();

                // if response is the same as the correct answer it counts it
                if (correct == response) {
                    count++;
                    System.out.println("That's correct");
                    arrayQ.remove(0);
                    arrayQ.remove(0);

                } else {
                    System.out.println("That's incorrect," + " the answer was " + correct + "\n");
                    arrayQ.add(randVal1);
                    arrayQ.add(randVal2);
                    arrayQ.remove(0);
                    arrayQ.remove(0);
                }
            } else if(randVal1 > 9 && randVal1 <= 12) {
                System.out.println(randVal1 + " / " + randVal2);
                correct = randVal1 / randVal2;

                System.out.print("Enter answer: ");
                response = sc.nextDouble();


                if (correct == response) {
                    count++;
                    System.out.println("That's correct");
                    arrayQ.remove(0);
                    arrayQ.remove(0);

                } else {
                    System.out.println("That's incorrect," + " the answer was " + correct + "\n");
                    arrayQ.add(randVal1);
                    arrayQ.add(randVal2);
                    arrayQ.remove(0);
                    arrayQ.remove(0);
                }


            }
            // Getting 8 correct answers will display this message
            if(count == 8) {
                System.out.println("8 correct answers! Congratulations");
            }

        }
        System.out.println("Correct answers: " + count);
    }
}
