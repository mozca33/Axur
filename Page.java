package AxurChallenge;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.net.URL;

public class Page {
    public static BufferedReader getPage(URL url) throws IOException { 
        BufferedReader bufferedPage = new BufferedReader(new InputStreamReader(url.openStream()));

        return bufferedPage;
    }
}


