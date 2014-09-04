package me.gann.ranking.constants;

/**
 * Created by BGann on 8/23/14.
 */
public enum Conference {

    ACC("Atlantic Coast Conference"),
    AAC("American Athletic Conference"),
    BIG12("Big XII Conference"),
    BIG10("Big Ten Conference"),
    CUSA("Conference USA"),
    INDEPENDENT("Independent"),
    MAC("Mid-American Conference"),
    MWC("Mountain West Conference"),
    PAC12("Pacific 12 Conference"),
    SBC("Sun Belt Conference"),
    SEC("Southeastern Conference");

    private String name;

    private Conference(String name)

    {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
