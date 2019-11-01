package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scanner.nextInt();
        for(int i = 0; i < number; i++){
            System.out.print(Fibonnaci(i) + " ");
        }

    }

    public static int Fibonnaci(int n){
        if(n == 0){
            return 0;
        }else if(n == 1){
            return 1;
        }else{
            return Fibonnaci(n-1) + Fibonnaci(n-2);
        }
    }
}
