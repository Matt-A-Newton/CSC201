package ch07lab1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Reads from and writes to text files
 * 2020-04-08
 * @author Matt N.
 * @author Jose G.
 */
public class CharCounter {
    private FileInputStream inputStream;
    private FileOutputStream outputStream;
    private int charCount;  // the total number of chars counted
    private  int lineCount; // the total number of lines counted

    /**
     * a no arg constructor, it does nothing
     */
	public CharCounter() {
		
	}

    /**
     * sets class attributes
     * @param  inputStream the text file that will be read from
     * @param  outputStream the text file that will be written to
     */
    public CharCounter(FileInputStream inputStream, FileOutputStream outputStream){
        this.inputStream = inputStream;
        this.outputStream = outputStream;
    }

    /**
     * returns the number of chars counted.
     * @return the number of counted chars
     */
    public int getCharCount() {
        return this.charCount;
    }

    /**
     * returns the number of lines counted.
     * @return the number of counted lines
     */
    public int getLineCount() {
        return this.lineCount;
    }

    /**
     * counts the number of characters in a given string and outputs the result in a file.
     */
    public void readAndWrite() {
        Scanner inputScnr = new Scanner(this.inputStream);             // used to read a file
        PrintWriter outputWriter = new PrintWriter(this.outputStream); // used to write to a file
        int i;                                                         // # of chars on the line
        String text;                                                   // holds the line being read

        while (inputScnr.hasNextLine()) {
            text = inputScnr.nextLine();
            for (i = 0; i < text.length(); ++i) {
                ++this.charCount;
            }
            outputWriter.println("" + this.lineCount + "     " + i);
            this.lineCount++;
        }
		System.out.printf
                ("The input file has %d and %d total characters", this.lineCount, this.charCount);
		
        outputWriter.flush();
        outputWriter.close();
        inputScnr.close();
    }
}
