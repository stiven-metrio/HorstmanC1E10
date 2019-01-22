/**
 * Cay S. Horstmann -- Chapter 1
 * Exercise #10
 * Write a program that produces a random string of letters and digits by 
 * generating a random long value and printing it in base 36.
 */
package java_ex10_longstringb36;

import java.util.Random;

/**
 *
 * @author jhonatan
 */
public class Java_Ex10_LongStringB36 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rand = new Random();
        Long randLong = rand.nextLong();
        System.out.println(Long.toString(randLong, 36));
    }
    
}
