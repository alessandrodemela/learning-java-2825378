//////////////////////////////////////////////////////////////////////
//
//      Author: Alessandro Demela
//      Date: 30/10/2020
//      This program shows how to create a function in Java
//
//////////////////////////////////////////////////////////////////////

import java.util.Scanner;

public class TeaTime {

    public static void annouceDeveloperTeaTime() {
        System.out.println("Waiting for developer tea time...");
        System.out.println("Type a random word and then press Enter to announce tea time");

        Scanner input = new Scanner(System.in);
        input.next();

        System.out.println("It's developer tea time! ");

        // input.close();
    }

   public static void main(String[] args) {
       System.out.println("Welcome to your new job!");

       annouceDeveloperTeaTime();

       System.out.println("Write code!");
       System.out.println("Review code!");

       annouceDeveloperTeaTime();

       System.out.println("Get promoted!");
    }


}
