package textanalysistool;

public class Main {
    public static void main(String[] args) {
        // Skapar ett nytt TextStats-objekt
        textanalysistool.TextStats stats = new textanalysistool.TextStats();
        // Skapar ett nytt TextReader-objekt och skickar in stats-objektet som argument
        TextReader reader = new TextReader(stats);
        // Kallar på readInput-metoden för att börja läsa inmatning från användaren
        reader.readInput();
    }
}

