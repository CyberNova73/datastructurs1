
//DO NOT REMOVE PACKAGE LINE
//Without this line authograder will not run correctly
//You can comment it while you work on the problem
//When everything works - uncomment and submit!
package main.java.com.gradescope.HW1;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

import static java.lang.Math.*;

/*Please make sure to use good practices of coding
indent, write comment, use meaningful variable names*/
public class HW1 {
    public static void main(String[] args) {
        //System.out.println(mismatch("ATCGAT", "winton"));
        // int[] testarr = new int[]{1,4,2,0,3,12,100,3,0};
        //  String tester = "summa lumma dumma lumma you assumin i'm a human what i gotta do to prove to you";
        // System.out.println(Arrays.toString(vowelCount(tester)));
        //System.out.println(Arrays.toString(removeZeros(testarr)));
        // showTwos(1000);
        // Scanner newscan = new Scanner(System.in);
        //printStrings(newscan);
//test you code
//main will not be graded
    }

    /*Write mismatch method here. The method accepts two Strings as parameters
    and returns the number of mismatches*/
    public static int mismatch(String str1, String str2) {
        int miscount = 0;   // this will be the count of differences
        str1 = str1.toLowerCase(); // putting into lowercase makes it
        str2 = str2.toLowerCase(); // easier to compare strings

        // Below is a test to ensure the lengths are the same
        // and adds the space difference to miscount
        // if they are found to be different.
        // The longer string is then "cut" to length for comparison.
        if (str1.length() > str2.length()) {
            miscount = miscount + (str1.length() - str2.length());
            str1 = str1.substring(0, str2.length());
        }
        if (str2.length() > str1.length()) {
            miscount = miscount + (str2.length() - str1.length());
            str2 = str2.substring(0, str1.length());
        }

        // Below is the iteration through str1 and str2
        for (int i = 0; i < str1.length(); i++) {
            //the following 4 nested ifs are taking the character at
            //index i in both strings and seeing if they match their genetic
            //counterparts. When they don't, miscount is added to.
            if (str1.charAt(i) == 'a') {         //A + T
                if (str2.charAt(i) != 't') {
                    miscount++;
                }
            }
            if (str1.charAt(i) == 't') {         //T + A
                if (str2.charAt(i) != 'a') {
                    miscount++;
                }
            }
            if (str1.charAt(i) == 'g') {         //G + C
                if (str2.charAt(i) != 'c') {
                    miscount++;
                }
            }
            if (str1.charAt(i) == 'c') {         //C + G
                if (str2.charAt(i) != 'g') {
                    miscount++;
                }
            }
        }
        return miscount;   //finally miscount is returned
    }

    /*Write removeZeros method here. The method takes an array of integers
    as a parameter and returns a new array */
    public static int[] removeZeros(int[] intarr) {
        int[] newarr = new int[intarr.length]; //holding space for removed-zeros array
        int newind = 0; //counts where the index is pointing in newarr
        int zcount = 0; //counts amount of zeroes found in intarr
        for (int i = 0; i < intarr.length; i++) {
            if (intarr[i] != 0) { //checks for non-zeros to add into newarr
                newarr[newind] = intarr[i];
                newind++; //points to next available index in newarr
            } else {
                zcount++; //if a zero is found it is added to the count but not to newarr
            }
        }
        newarr = Arrays.copyOfRange(newarr, 0, newarr.length - zcount);
        //the blank spaces at the end of newarr are removed before returning
        return newarr;
    }

    /*Write vowelCount method here. The method accepts a String as a parameter
    and produces and returns an array of integers
    representing the counts of each vowel in the String. */
    public static int[] vowelCount(String word) {
        int[] vcounts = new int[]{0, 0, 0, 0, 0}; //making an array to represent the vowel counts
        //{A,E,I,O,U}
        word = word.toUpperCase(); // uppercase the input for easier searching
        for (int i = 0; i < word.length(); i++) {  //in the length of the word if it finds:
            if (word.charAt(i) == 'A') {        // 'A' it adds to index 0
                vcounts[0] = vcounts[0] + 1;
            }
            if (word.charAt(i) == 'E') {        // 'E' it adds to index 1
                vcounts[1] = vcounts[1] + 1;
            }
            if (word.charAt(i) == 'I') {        // 'I' it adds to index 2
                vcounts[2] = vcounts[2] + 1;
            }
            if (word.charAt(i) == 'O') {        // '0' it adds to index 3
                vcounts[3] = vcounts[3] + 1;
            }
            if (word.charAt(i) == 'U') {        // 'U' it adds to index 4
                vcounts[4] = vcounts[4] + 1;
            }
        }
        return vcounts; //then returns the array with respective counts.
    }

    /*Write printStrings method here.The method takes as a parameter a Scanner
    holding
    a sequence of integer/string pairs and that prints to the consol (System.out)
    one line of output for each pair with the given
    String repeated the given number of times. */
    public static void printStrings(Scanner words) {
        /*int outamt = 0;   //making space for input
        String wordout = " ";
        while(words.hasNext()){ //checks for more input
            outamt = words.nextInt(); //gets the next number
            words.nextLine(); //skips \n
            wordout = words.next(); // gets word to be printed
            for (int i = 0; i<outamt; i++){ //loops through the input number amount of times
                System.out.print(wordout); //and prints with no spaces or line changes
            }
            System.out.print("\n"); // then moves down to the next line
        }*/
    }

/*Write showTwos method here. The method takes an int as a parameter and
prints
on the console factors of 2 in a given integer in specified format.*/
        public static void showTwos ( int x){
            System.out.print(x + " = ");
            while (x % 2 == 0) {              //if the % 2 = 0 then the number can be nicely divided and can move on
                System.out.print("2 * ");   // otherwise it means it's an odd number, so we stop
                x = x / 2; //above prints out that it was divisible, and now we actually divide x
            }
            System.out.print(x); //this finishes off the equation by printing the final odd number
        }
}
