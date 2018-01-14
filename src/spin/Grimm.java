/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spin;

import java.util.ArrayList;
import java.util.List;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import spin.model.EbayItem;

/**
 *
 * @author borjigin
 */
public class Grimm {
    List<EbayItem> list;
    
    //creeert basisitems voor eliminatie,items bevatten dus enkel naam
    public List<EbayItem> createBasicItems(Document html){
        list = new ArrayList<>();
        Elements links = html.getElementsByClass("lvpicinner full-width picW");
        for (Element link : links) {
          String linkHref = link.attr("href");
          System.out.println(link.text());
            
       }
        return null;
    }
}
