package AxurChallenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.text.Normalizer;
import java.util.regex.Pattern;

public class KeywordChecker {

    static String[] keyWords = new String[] {
        "black friday", "blackfriday", "promocao", "promoa§a£o", "promoçao", "senha" 
    }; 

    public static boolean check(BufferedReader bufferedPage) throws IOException {
        String input;
        int count;

        while ((input = bufferedPage.readLine()) != null) {
            input = input.toLowerCase();
            input = removeAccent(input);

            for (count = 0; count < keyWords.length; count++){
                if  (input.contains(keyWords[count])){
                    return false;
                }
            }
        }

        return true;
    }

    private static String removeAccent(String input) {
        String normalizedInput = Normalizer.normalize(input, Normalizer.Form.NFD);
        Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");

        return pattern.matcher(normalizedInput).replaceAll("");
    }
}