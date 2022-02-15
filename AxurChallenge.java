import AxurChallenge.Page;
import AxurChallenge.KeywordChecker;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.io.BufferedReader;
import java.io.IOException;
import java.text.Normalizer;
import java.util.regex.Pattern;
import java.io.InputStreamReader;

public class AxurChallenge{
    public static void main(String[] args) throws Exception{
        try {
            URL url = new URL(args[0]);
            BufferedReader bufferedPage = Page.getPage(url);

            if  (KeywordChecker.check(bufferedPage)){
                System.out.println("safe\n");
                return;
            }
        System.out.println("suspicious\n");

        }catch (MalformedURLException error){
            error.printStackTrace();
        }catch (Exception error){
            error.printStackTrace(); 
        }
    };
}
// http://www.mocky.io/v2/5e18df272f00007e0097e1b4
