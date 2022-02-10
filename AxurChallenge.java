package AxurChallenge;

import java.net.URL;
import java.io.BufferedReader;

public class AxurChallenge {
    public static void main(String[] args){
        try {
            URL url = new URL("https://pastebin.com/m4bV1yic");

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
// https://www.kabum.com.br/?gclid=Cj0KCQiAjJOQBhCkARIsAEKMtO0WjqpCpefe73Dy-GqM2mbrJ26tk47nwVT9AkmFQ4bUWu27SYPj-vMaAhyMEALw_wcB
// http://www.mocky.io/v2/5e18df272f00007e0097e1b4