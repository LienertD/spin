package spin.model;

import java.util.List;

public class EbayItem {

	public List<EbayPrice> Prices;

	private String title;
    
	public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }    
}
