/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Kamila Hollerbach
 */
package com.company;

public class Main {

    public static void main(String[] args) {
        var scanner = new java.util.Scanner(System.in);
        System.out.print("Hi! What is your name? ");
        var name = scanner.nextLine();
        System.out.println("Hello " + name + "! Nice to meet you!");
    }
}
