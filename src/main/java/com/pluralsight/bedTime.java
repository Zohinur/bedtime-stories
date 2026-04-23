package com.pluralsight;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class bedTime {
    public static void main(String[] args) {
        //created an array of String to story in the files
        String[] files = {"src/main/resources/goldilocks.txt",
                "src/main/resources/hansel_and_gretel.txt",
                "src/main/resources/mary_had_a_little_lamb.txt"};
        //created an array to compare this with the files to I can print out the files
       int[] bedTimeStories = {1, 2, 3};

        Scanner myScanner = new Scanner(System.in);
        System.out.println("please enter a bedtime story you would like to read: " +
                "\nEnter 1 if you would like to read goldilocks" +
                "\nEnter 2 if you would like to read Hansel and Gretel" +
                "\nEnter 3 if you would like ot read mary had a little lamb" +
                "\nEnter your input here: ");
        int userSelection = myScanner.nextInt();
        myScanner.nextLine();
        int index = -1;
        //iterating through the bedtimestories so 0,1,2
        //once it finds the number that the user input it will stop which is there is a break
        for (int i = 0; i < bedTimeStories.length; i++) {
            if (userSelection == bedTimeStories[i]) {
                index = i;
                break;
            }
        }
        //once found, if the index does not equal to not found then it will load the files
        if (index != -1) {
            //over here I am using file reader and bufferer reader to load the file and reading it
            try (FileReader reader = new FileReader(files[index]);
                 BufferedReader buffRead = new BufferedReader(reader);
            ) {
                //created a varible to print out the next lines from the buffer reader from the files
                String nextLine;
                while ((nextLine = buffRead.readLine()) != null) {
                    System.out.println(nextLine);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
//        try {
//
//
//            System.out.println("Enter the name of the book: ");
//
//            FileReader reader = new FileReader(bedTimeStories[index++]);
//            BufferedReader buffer = new BufferedReader(reader);
//
//            if (userSelection.equalsIgnoreCase("goldilocks")) {
//                String input;
//                while((input = buffer.readLine()) != null) {
//                    System.out.println(input);
//                }
//            }else if (userSelection.equalsIgnoreCase())
//        } catch (FileNotFoundException e) {
//            System.err.println("Cannot find file");
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
    }
}

