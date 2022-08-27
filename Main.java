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
    public static final String[] COLORS = { ANSI_BLACK, ANSI_BLUE, ANSI_CYAN, ANSI_GREEN, ANSI_PURPLE, ANSI_RED,
            ANSI_WHITE, ANSI_YELLOW };
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void print(String text, String fontColor, String bgColor) {
        System.out.println(fontColor + text + bgColor);

        try {
            Thread.sleep(1000);
        } catch (Exception exception) {
        }
    }

    public static void main(String[] args) {
        int counter = (int) Math.random() * COLORS.length;
        String message = "Happy Birthday Nikito! Thank you for being an amazing brother!";
        for (int index = 0; index < message.length(); index++) {
            System.out.print(COLORS[counter++ % COLORS.length] + message.charAt(index));
            try {
                Thread.sleep((int) Math.random() * 200 + 100);
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        System.out.println(ANSI_RESET);

        message = "Happy Birthday Nikito\n\nHappy Birthday Song\n\nHappy birthday to you\nHappy birthday to you\n\nHappy birthday to Nikito\nHappy birthday to you\n\nFrom good friends and true\nFrom old friends and new\nMay good luck go with you\nAnd happiness too.";

        String[] words = message.split(" ");

        for (String word : words) {
            System.out.print(COLORS[counter++ % COLORS.length] + word + " ");
            try {
                Thread.sleep((int) Math.random() * 400 + 200);
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        }

        System.out.println(ANSI_RESET);

        message = "From Mito and Arlito <3";
        for (int index = 0; index < message.length(); index++) {
            System.out.print(COLORS[counter++ % COLORS.length] + message.charAt(index));
            try {
                Thread.sleep((int) Math.random() * 200 + 100);
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        System.out.println(ANSI_RESET);
        SCANNER.nextLine();
    }
}
