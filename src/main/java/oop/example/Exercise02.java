package oop.example;
import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Joshua Federman
 */
public class Exercise02 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("What is the input string?");
        String word = input.next();
        System.out.printf("%s has %d characters", word, word.length());
    }
}
