package rifat.finalproject.locator;

public class SearchModel {
    private String zone;
    private String place;
    private String category;
    private int flag;

    public SearchModel(String zone, String place, String category,
                       int flag) {
        this.zone = zone;
        this.place = place;
        this.category = category;
        this.flag = flag;
    }

    public String getRank() {
        return this.zone;
    }

    public String getCountry() {
        return this.place;
    }

    public String getPopulation() {
        return this.category;
    }

    public int getFlag() {
        return this.flag;
    }
}
