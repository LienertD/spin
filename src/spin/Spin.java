/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spin;

import org.jsoup.nodes.Document;

/**
 *
 * @author borjigin
 *
 *  TO DO : goblin moet een statische klasse worden!
 */
public class Spin {
    public static final String warh = "https://www.benl.ebay.be/sch/i.html?_odkw=warhammer+-bit&_osacat=0&_ipg=200&_from=R40&_trksid=m570.l1313&_nkw=warhammer&_sacat=0";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        goblin gobbo = new goblin();
        Grimm brother = new Grimm();
        Document d = gobbo.request(warh);
        brother.createBasicItems(d);
        /*
        gobbo.scribble("ebaywarhammer.html", d.text());
        brother.createBasicItems(d);
        */      
        
    }
    
}
