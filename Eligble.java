package oop;

import java.util.Scanner;

public class Eligble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer Marks = sc.nextInt();
        if (Marks > 50) {
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }
    }
}
