package labsix;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

/**
 * This program has a scanner that manipulates DNA.
 * The program will display varitations of a DNA sequence.
 *
 * <p>Bugs: This program has no known bugs, but is missing code.
 *
 */

public class ManipulateDna {
  /**
   * This is the main method that manipulates a DNA sequence.
   * This method will have a DNA sequence and then it will
   * manipulate the DNA sequence.
   */ 

  public static void main(String[] args) {
    // display the name of the programmer and the date
    System.out.println("Falena Rotzell " + new Date());
    // declare the starting file and scanner
    File dnaInputsFile = null;
    Scanner scanner = null;
    // connect the scanner to the input file
    try {
      dnaInputsFile = new File("input/dna_inputs.txt");
      scanner = new Scanner(dnaInputsFile);
    } catch (FileNotFoundException noFile) {
      System.out.println("Unable to locate file");
    }
    // Step One: Read in and display the chosen DNA string
    String phrase = scanner.nextLine();
    System.out.println("Okay, I am going to manipulate the DNA string \"" + phrase + "\"");
    System.out.println("Enter a string containing only C, G, T, and A: actg ");

    // Step Two: Compute the complement of the DNA String
    String dnaComplement1 = phrase.replace('a', 'T');
    String dnaComplement2 = dnaComplement1.replace('c', 'G');
    String dnaComplement3 = dnaComplement2.replace('t', 'A');
    String dnaComplement4 = dnaComplement3.replace('g', 'C'); 
    phrase = phrase.toUpperCase();
    System.out.println("Complement of " + phrase + " is " + (dnaComplement4));

    // Step Three: Insert a randomly chosen DNA letter into the DNA String
    Random rand = new Random();
    String actg = "ACTG";
    char part1 = phrase.charAt(rand.nextInt(4));
    int pos = rand.nextInt(phrase.length());
    String part2 = phrase.substring(0,pos);
    String part3 = phrase.substring(pos + 1);
    String ins = (part2 + part1 + part3);
    System.out.println("Inserting " + part1 + " at position " + pos + " gives " + ins);
    
    // Step Four: Delete a DNA letter from a randomly chosen position in the DNA string
    int pos2 = rand.nextInt(phrase.length());
    String part4 = phrase.substring(0,pos2);
    String part5 = phrase.substring(pos2 + 1);
    System.out.println("Deleting from position " + pos2 + " gives " + part4 + part5);

    // Step Five: Change a random position in the DNA String to a randomly chosen DNA letter
    int pos3 = rand.nextInt(phrase.length());
    String part6 = phrase.substring(0,pos3);
    String part7 = phrase.substring(pos3 + 1);
    char part8 = phrase.charAt(rand.nextInt(4));
    System.out.println("Changing position " + pos3 + " gives " + part6 + part8 + part7);
   
    // Step Six: Display a final thankyou message
    System.out.println("Thank you for using the ManipulateDna program!");
    System.out.println("Have an awesome day.");

  }

}
