package AxurChallenge;

import java.net.URL;
import java.io.BufferedReader;

public class AxurChallenge {
    public static void main(String[] args){
        try {
            URL url = new URL("http://www.mocky.io/v2/5e18df272f00007e0097e1b4");
            System.out.println(args[0]);

            BufferedReader bufferedPage = Page.getPage(url);

            if  (KeywordChecker.check(bufferedPage)){
                System.out.println("safe\n");
                return;
            }

            System.out.println("suspicious\n");
            
        }catch (Exception error){
            error.printStackTrace(); 
        }
    };
}
// http://www.mocky.io/v2/5e18df272f00007e0097e1b4