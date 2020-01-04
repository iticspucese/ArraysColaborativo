package com.pucese.tics;


public class Ejercicio1 { 

    public static void main(String[] args) { 
        int days = Integer.parseInt(args[0]);     // number of days
        int people = 0;                           // total number of people

        //  hasBirthday[d] = true if someone born on day d; false otherwise
        //  auto-initialized to false
        boolean[] hasBirthday = new boolean[days];

        while (true) {
            people++;
            int d = (int) (days * Math.random());    // integer between 0 and days-1
            if (hasBirthday[d]) break;               // two people with the same birthday, so break out of loop
            hasBirthday[d] = true;                   // update array
        }

        System.out.println(people);
    }
}
