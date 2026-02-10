package org.lukar;

import java.util.Scanner;

public class ArmStrongNumbers {

    public static void main(String[] args) {

        Scanner in= new Scanner(System.in);

        int number=in.nextInt();
        int answer=0;
        int userValue=number;
        while(number>0){
            int reminder = number%10;

            answer +=reminder*reminder*reminder;

            number/=10;

        }

        System.out.println(answer);

        if (userValue==answer)
            System.out.println("Prime");
        else
            System.out.println("Not a Prime");
    }
}
