package textanalysistool;

import java.util.Scanner;

public class TextReader {
    // Ett TextStats-objekt för att hålla reda på textstatistiken
    private final textanalysistool.TextStats stats;

    public TextReader(textanalysistool.TextStats stats) {
        // Tilldelar det inkommande TextStats-objektet till det lokala stats-objektet
        this.stats = stats;
    }

    public void readInput(){
        // Skapar ett Scanner-objekt för att läsa inmatning från användaren
        Scanner scanner = new Scanner(System.in);
        String line;

        // Fortsätter att läsa linjer tills användaren skriver "stop"
        while (!(line = scanner.nextLine()).equals("stop")) {
            // Lägger till varje rad i stats-objektet
            stats.addLine(line);
        }

        // Skriver ut antalet rader och tecken som har lästs in
        System.out.println("Number of lines: " + stats.getLineCount());
        System.out.println("Number of characters: " + stats.getCharCount());
    }
}

