package textanalysistool;

public class TextStats {
    // Räknare för antalet rader och tecken
    private int lineCount = 0;
    private int charCount = 0;

    public void addLine(String line) {
        // Ökar radräknaren med ett
        lineCount++;
        // Lägger till längden av raden plus ett (för newline-tecknet) till teckenräknaren
        charCount += line.length() + 1; // Add 1 for the newline character
    }

    // Returnerar antalet rader
    public int getLineCount() {
        return lineCount;
    }

    // Returnerar antalet tecken
    public int getCharCount() {
        return charCount;
    }
}