package url;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URL;

public class Main {
    public static void main(String[] args) {
        String longURL = "https://chatgpt.com/c/67bcf99b-9eb0-8009-9944-fce6c4911cd5";
        shortenURL(longURL);
    }

    public static void shortenURL(String longURL) {
        try {
            // Opción 1: Deprecado a partir de JAVA 20
            // URL url = new URL("https://tinyurl.com/api-create.php?url=" + longURL);

            URI uri = new URI("https://tinyurl.com/api-create.php?url=" + longURL);
            URL url = uri.toURL();
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
            String shortURL = reader.readLine();
            reader.close();

            System.out.println("URL acortada: " + shortURL);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
}
