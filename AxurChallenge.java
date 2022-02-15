import AxurChallenge.Page;
import AxurChallenge.KeywordChecker;
import java.net.MalformedURLException;
import java.net.URL;
import java.io.BufferedReader;

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