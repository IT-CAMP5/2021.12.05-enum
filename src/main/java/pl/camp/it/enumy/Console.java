package pl.camp.it.enumy;

public enum Console {
    PLAY_STATION_3("Sony", "3", 2005),
    PLAY_STATION_4("Sony", "4", 2012),
    PLAY_STATION_5("Sony", "5", 2020),
    XBOX_360("Microsoft", "Xbox 360", 2005),
    XBOX_ONE_S("Microsoft", "Xbox One S", 2012),
    NINTENDO_SWITCH("Nintendo", "Switch", 2015);

    private String brand;
    private String model;
    private int releaseYear;

    Console(String brand, String model, int releaseYear) {
        this.brand = brand;
        this.model = model;
        this.releaseYear = releaseYear;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }
}
