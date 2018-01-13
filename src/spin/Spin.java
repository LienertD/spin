/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spin;

/**
 *
 * @author borjigin
 */
public class Spin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        goblin gobbo = new goblin();
        String inhoud = gobbo.raid("https://www.benl.ebay.be/sch/i.html?_from=R40&_trksid=m570.l1313&_nkw=warhammer+&_sacat=0");
        gobbo.scribble("ebaywarhammer.html", inhoud);
    }
    
}
