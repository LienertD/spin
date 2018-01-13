package spider;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

//TODO
//als je een link volgt ,zorgen dat je eerst random #ms wacht vooraleer in te willigen


/**
 *
 * @author borjigin
 */
public class goblin {
    public final String USER_AGENT = "Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/41.0.2228.0 Safari/537.36";
    private Document htmlDocument;
    
    public String raid(String url){
            try
        {
            Connection connection = Jsoup.connect(url).userAgent(USER_AGENT);
            Document htmlDocument = connection.get();
            this.htmlDocument = htmlDocument;
            

            System.out.println("Received web page at " + url);
            
            Elements linksOnPage = htmlDocument.select("a[href]");
            
            System.out.println("Found (" + linksOnPage.size() + ") links");
            for(Element link : linksOnPage)
            {
                System.out.println(link.attr("href"));
            }
            
        }
        catch(IOException ioe)
        {
            // We were not successful in our HTTP request
            System.out.println("Error in out HTTP request " + ioe);
        }
        return htmlDocument.toString();
    }
    
    public void scribble(String filename,String content){
        File f = new File(filename);
        List<String> tekst = Arrays.asList(content);
        try {
            Files.write(Paths.get(filename),tekst , Charset.forName("UTF-8"));
        } catch (IOException ex) {
            Logger.getLogger(goblin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
