import java.util.Scanner;

public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
    public static final String[] COLORS = { ANSI_BLUE, ANSI_CYAN, ANSI_GREEN, ANSI_PURPLE, ANSI_RED,
            ANSI_WHITE, ANSI_YELLOW };
    public static final Scanner SCANNER = new Scanner(System.in);
    public static String message = "";

    public static void print(String delimiter, int minWaitTime, int maxWaitTime) throws Exception {
        int counter = (int) Math.random() * COLORS.length;
        String[] words = message.split(delimiter);
        for (String word : words) {
            System.out.print(COLORS[counter++ % COLORS.length] + word + delimiter);
            Thread.sleep((int) Math.random() * (maxWaitTime - minWaitTime) + minWaitTime);
        }

        System.out.println(ANSI_RESET);
    }

    public static void main(String[] args) {
        try {
            message = "Happy Birthday Nikito! Thank you for being an amazing brother!";
            print("", 100, 300);
            message = "One Two Three Go!!!";
            print(" ", 200, 300);
            message = "*... *... *... *...";
            print("...", 300, 500);
            message = "Happy Birthday Nikito\n\nHappy Birthday Song\n\nHappy birthday to you\nHappy birthday to you\n\nHappy birthday to Nikito\nHappy birthday to you\n\nFrom good friends and true\nFrom old friends and new\nMay good luck go with you\nAnd happiness too.";
            print(" ", 200, 600);
            message = "From Mito and Arlito <3";
            print("", 100, 300);
            message = "*... *... *... *...";
            print("...", 300, 500);
            message = "Happy Birthday Nikito!";
            print(" ", 50, 100);

        } catch (Exception exception) {
            exception.printStackTrace();
        } finally {
            SCANNER.nextLine();
        }
    }
}
