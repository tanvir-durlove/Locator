package rifat.finalproject.locator;

public class SearchModel {
    private String zone;
    private String place;
    private String category;
    private String time;
    private String cost;
    private int flag;

    public SearchModel(String zone, String place, String category,String time,String cost,
                       int flag) {
        this.zone = zone;
        this.place = place;
        this.category = category;
        this.flag = flag;
        this.time = time;
        this.cost=cost;
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
    public String getTime() {
        return this.time;
    }
    public String getCost() {
        return this.cost;
    }

}
