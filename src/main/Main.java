/*
 *Author Name: Rahul Chahar
 *IDE: IntelliJ IDEA Community Edition
 *Date: 20/02/2022
 */

package main;

import rollNumber.RollNumber;

public class Main {
    public static void main(String[] args) {


        RollNumber rollNumber = new RollNumber();
        RollNumber rollNumber1 = new RollNumber();
        RollNumber rollNumber2 = new RollNumber();

        System.out.println(rollNumber.getRollNo());
        System.out.println(rollNumber1.getRollNo());
        System.out.println(rollNumber2.getRollNo());
    }
}