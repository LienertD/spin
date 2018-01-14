package spin.model;

import java.util.List;

public class EbayItem {

	public List<EbayPrice> Prices;

	private String title;
    
	public void setName(String name) {
        this.title = name;
    }

    public String getName() {
        return title;
    } 
}
