package src;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReverseEachWord {

    private static final Logger logger = Logger.getLogger(ReverseEachWord.class.getName());

    public static void main(String[] args) {
        logger.log(Level.INFO, "Program started");

        String inputFile = "C:\\Users\\naushad.shaikh\\Desktop\\input.txt";
        String outputFile = "C:\\Users\\naushad.shaikh\\Desktop\\output.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            reader.lines()
                    .map(ReverseEachWord::reverse)
                    .forEachOrdered(line -> {
                        try {
                            System.out.println(line);
                            writer.write(line);
                            writer.newLine();
                        } catch (IOException e) {
                            logger.log(Level.WARNING, "Error writing to output file", e);
                        }
                    });

        } catch (IOException e) {
            logger.log(Level.WARNING, "Error reading input file", e);
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Unexpected error", e);
        }

        logger.log(Level.INFO, "Program completed");
    }

    public static String reverse(String s) {
        String[] words = s.split("\\s+");
        StringBuilder reversed = new StringBuilder();
        for (String word : words) {
            reversed.append(reverseWord(word)).append(" ");
        }
        return reversed.toString().trim();
    }

    public static String reverseWord(String s) {
        StringBuilder reversedWord = new StringBuilder();
        char punctuation = ' ';
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            if (ch == '.' || ch == ',' || ch == '!' || ch == ';') {
                punctuation = ch;
            } else {
                reversedWord.append(ch);
            }
        }
        reversedWord.append(punctuation);
        return reversedWord.toString();
    }
}
