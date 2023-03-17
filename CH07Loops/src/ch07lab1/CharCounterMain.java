package ch07lab1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * Opens file streams to text files and uses CharCounter to process the files.
 * 2020-04-08
 * @author Matt N.
 * @author Jose G.
 */
public class CharCounterMain {
    private static Scanner scnr = new Scanner(System.in);

    /**
     * description: takes in user input and makes calls to CharCounter to write to a file.
     * @param args ignored
     */
    public static void main(String[] args) throws IOException {
        System.out.print("Enter the name of the input file: ");
        // opens an input stream to read data from a file
        FileInputStream inputStream = new FileInputStream(scnr.nextLine());

        System.out.print("Enter the name of the output file: ");
        // opens an output stream to write data to a file
        FileOutputStream outputStream = new FileOutputStream(scnr.nextLine());

        // an object that is used to process text files
        CharCounter counter = new CharCounter(inputStream, outputStream);

        counter.readAndWrite();

    }
}
