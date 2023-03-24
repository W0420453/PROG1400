/*
Filename: SmallestInt.java
Author: Nathan L'Abbé
Date: 20th of March 2023
Purpose: To Find the smallest n such that n2 > 12,000
 */
public class SmallestInt
{

    public static void main(String[] args)
    {
        int n = 1; //Starting with 1 because starting with 0 is pointless
        while (Math.pow(n,2) < 12000) {
            System.out.println("N is equal to: "+ n);
            System.out.println("N^2 is equal to: "+ Math.pow(n,2) );
            n++; //Note the loop increments n after it prints the values, so the loop is checked before the next prints.
        }

        System.out.println("The smallest n that makes the statement n^2 is greaten then 12 000 is: "+n);
    }
}
