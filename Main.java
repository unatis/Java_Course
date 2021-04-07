package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int Bonus = 0;
        Scanner scanner= new Scanner(System.in);

        System.out.print("Please enter worker name : ");

        String WorkerName = scanner.nextLine();

        System.out.print("Please enter worker ID 9 numbers : ");
        String WorkerID = scanner.nextLine();

        if(WorkerID.length() != 9){
            System.out.print("ID not allowed " + WorkerID.length() + " numbers");
            return;
        }

        System.out.print("Please enter worker age between 15 and 68 years : ");
        int WorkerAge = scanner.nextInt();

        if(WorkerAge < 15 || WorkerAge > 68){
            System.out.print("Worker age not allowed " + WorkerAge);
            return;
        }

        System.out.print("Please enter working experience years : ");
        int WorkingExp = scanner.nextInt();

        if(WorkingExp < 10){
            Bonus = 10;
        }else{
            Bonus = 50;
        }

        scanner= new Scanner(System.in);

        System.out.print("Please enter worker profession : ");
        String WorkerPro = scanner.nextLine();

        int Salary = 0;

        switch(WorkerPro){

            case "worker":
                Salary = 5000;
                break;
            case "engineer":
                Salary = 12000;
                break;
            case "manager ":
                Salary = 15000;
                break;
            case "seller ":
                Salary = 10000;
                break;
            case "technic":
                Salary = 8000;
                break;
            default:
                Salary = 0;
        }

        int PaymentSum = Salary + (Salary / 100 * Bonus);

        System.out.print("Worker payment is : " + PaymentSum + "\n");

    }
}

