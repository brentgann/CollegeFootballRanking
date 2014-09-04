package me.gann.ranking.constants;

import java.util.HashMap;
import java.util.Map;

import static me.gann.ranking.constants.Conference.*;

/**
 * Created by BGann on 8/23/14.
 */
public enum CollegeFootballTeam {

    //Division 1-A
    AIR_FORCE("Air Force", "Falcons", "Colorado Springs", State.COLORADO, MWC),
    AKRON("Akron", "Zips", "Akron", State.OHIO, MAC),
    ALABAMA("Alabama", "Crimson Tide", "Tuscaloosa", State.ALABAMA, SEC),
    APPALACHIAN_STATE("Appalachian State", "Mountaineers", "Boone", State.NORTH_CAROLINA, SBC),
    ARIZONA("Arizona", "Wildcats", "Tucson", State.ARIZONA, PAC12),
    ARIZONA_STATE("Arizona State", "Sun Devils", "Tempe", State.ARIZONA, PAC12),
    ARKANSAS("Arkansas", "Razorbacks", "Fayetteville", State.ARKANSAS, SEC),
    ARKANSAS_STATE("Arkansas State", "Red Wolves", "Jonesboro", State.ARKANSAS, SBC),
    ARMY("Army", "Black Knights", "West Point", State.NEW_YORK, INDEPENDENT),
    AUBURN("Auburn", "Tigers", "Auburn", State.ALABAMA, SEC),
    BALL_STATE("Ball State", "Cardinals", "Muncie", State.INDIANA, MAC),
    BAYLOR("Baylor", "Bears", "Waco", State.TEXAS, BIG12),
    BOISE_STATE("Boise State", "Broncos", "Boise", State.IDAHO, MWC),
    BOSTON_COLLEGE("Boston College", "Eagles", "Chestnut Hill", State.MASSACHUSETTS, ACC),
    BOWLING_GREEN("Bowling Green", "Falcons", "Bowling Green", State.OHIO, MAC),
    BUFFALO("Buffalo", "Bulls", "Buffalo", State.NEW_YORK, MAC),
    BRIGHAM_YOUNG("BYU", "Cougars", "Provo", State.UTAH, MWC),
    CALIFORNIA("California", "Golden Bears", "Berkeley", State.CALIFORNIA, PAC12),
    CENTRAL_MICHIGAN("Central Michigan", "Chippewas", "Mount Pleasant", State.MICHIGAN, MAC),
    CINCINNATI("Cincinnati", "Bearcats", "Cincinnati", State.OHIO, AAC),
    CLEMSON("Clemson", "Tigers", "Clemson", State.SOUTH_CAROLINA, ACC),
    COLORADO("Colorado", "Buffalos", "Boulder", State.COLORADO, PAC12),
    COLORADO_STATE("Colorado State", "Rams", "Fort Collins", State.COLORADO, MWC),
    CONNECTICUT("Connecticut", "Huskies", "Storrs", State.CONNECTICUT, AAC),
    DUKE("Duke", "Blue Devils", "Durham", State.NORTH_CAROLINA, ACC),
    EAST_CAROLINA("East Carolina", "Pirates", "Greenville", State.NORTH_CAROLINA, AAC),
    EASTERN_MICHIGAN("Eastern Michigan", "Eagles", "Ypsilanti", State.MICHIGAN, MAC),
    FLORIDA("Florida", "Gators", "Gainesville", State.FLORIDA, SEC),
    FLORIDA_ATLANTIC("Florida Atlantic", "Owls", "Boca Raton", State.FLORIDA, CUSA),
    FLORIDA_INTERNATIONAL("Florida International", "Panthers", "Miami", State.FLORIDA, CUSA),
    FLORIDA_STATE("Florida State", "Seminoles", "Tallahassee", State.FLORIDA, ACC),
    FRESNO_STATE("Fresno State", "Bulldogs", "Fresno", State.CALIFORNIA, MWC),
    GEORGIA("Georgia", "Bulldogs", "Athens", State.GEORGIA, SEC),
    GEORGIA_SOUTHERN("Georgia Southern", "Eagles", "Statesboro", State.GEORGIA, SBC),
    GEORGIA_STATE("Georgia State", "Panthers", "Atlanta", State.GEORGIA, SBC),
    GEORGIA_TECH("Georgia Tech", "Yellow Jackets", "Atlanta", State.GEORGIA, ACC),
    HAWAII("Hawaii", "Rainbow Warriors", "Honolulu", State.HAWAII, MWC),
    HOUSTON("Houston", "Cougars", "Houston", State.TEXAS, AAC),
    IDAHO("Idaho", "Vandals", "Moscow", State.IDAHO, SBC),
    ILLINOIS("Illinois", "Fighting Illini", "Urbana-Champaign", State.ILLINOIS, BIG10),
    INDIANA("Indiana", "Hoosiers", "Bloomington", State.ILLINOIS, BIG10),
    IOWA("Iowa", "Hawkeyes", "Iowa City", State.IOWA, BIG10),
    IOWA_STATE("Iowa State", "Cyclones", "Ames", State.IOWA, BIG12),
    KANSAS("Kansas", "Jayhawks", "Lawrence", State.KANSAS, BIG12),
    KANSAS_STATE("Kansas State", "Wildcats", "Manhattan", State.KANSAS, BIG12),
    KENT_STATE("Kent State", "Golden Flashes", "Kent", State.OHIO, MAC),
    KENTUCKY("Kentucky", "Wildcats", "Lexington", State.KENTUCKY, SEC),
    LOUISIANA_TECH("Louisiana Tech", "Bulldogs", "Ruston", State.LOUISIANA, CUSA),
    LOUISIANA_LAFAYETTE("Louisiana-Lafayette", "Ragin' Cajuns", "Lafaette", State.LOUISIANA, SBC),
    LOUISIANA_MONROE("Louisiana-Monroe", "Warhawks", "Monroe", State.LOUISIANA, SBC),
    LOUISVILLE("Louisville", "Cardinals", "Louisville", State.KENTUCKY, ACC),
    LOUISIANA_STATE("LSU", "Tigers", "Baton Rouge", State.LOUISIANA, SEC),
    MARSHALL("Marshall", "Thundering Herds", "Huntington", State.WEST_VIRGINIA, CUSA),
    MARYLAND("Maryland", "Terrapins", "College Park", State.MARYLAND, BIG10),
    MEMPHIS("Memphis", "Tigers", "Memphis", State.TENNESSEE, AAC),
    MIAMI_FL("Miami (FL)", "Hurricanes", "Coral Gables", State.FLORIDA, ACC),
    MIAMI_OH("Miami (OH)", "RedHawks", "Oxford", State.OHIO, MAC),
    MICHIGAN("Michigan", "Wovlerines", "Ann Arbor", State.MICHIGAN, BIG10),
    MICHIGAN_STATE("Michigan State", "Spartans", "East Lansing", State.MICHIGAN, BIG10),
    MIDDLE_TENNESSEE("Middle Tennessee", "Blue Raiders", "Murfreesboro", State.TENNESSEE, CUSA),
    MINNESOTA("Minnesota", "Golden Gophers", "Minneapolis", State.MINNESOTA, BIG10),
    MISSISSIPPI("Ole Miss", "Rebels", "Oxford", State.MISSISSIPPI, SEC),
    MISSISSIPPI_STATE("Mississippi State", "Bulldogs", "Starkville", State.MISSISSIPPI, SEC),
    MISSOURI("Missouri", "Tigers", "Columbia", State.MISSOURI, SEC),
    NAVY("Navy", "Midshipmen", "Annapolis", State.MARYLAND, INDEPENDENT),
    NEBRASKA("Nebraska", "Cornhuskers", "Lincoln", State.NEBRASKA, BIG10),
    NEVADA("Nevada", "Wolf Pack", "Reno", State.NEVADA, MWC),
    NEW_MEXICO("New Mexico", "Lobos", "Albuquerque", State.NEW_MEXICO, MWC),
    NEW_MEXICO_STATE("New Mexico State", "Aggies", "Las Cruces", State.NEW_MEXICO, SBC),
    NORTH_CAROLINA("North Carolina", "Tarheels", "Chapel Hill", State.NORTH_CAROLINA, ACC),
    NORTH_CAROLINA_STATE("North Carolina State", "Wolf Pack", "Raleigh", State.NORTH_CAROLINA, ACC),
    NORTH_TEXAS("North Texas", "Mean Green", "Denton", State.TEXAS, CUSA),
    NORTHERN_ILLINOIS("Northern Illinois", "Huskies", "DeKalb", State.ILLINOIS, MAC),
    NORTHWESTERN("Northwestern", "Wildcats", "Evanston", State.ILLINOIS, BIG10),
    NOTRE_DAME("Notre Dame", "Fighting Irish", "South Bend", State.INDIANA, INDEPENDENT),
    OHIO("Ohio", "Bobcats", "Athens", State.OHIO, MAC),
    OHIO_STATE_BUCKEYES("Ohio State", "Buckeyes", "Columbus", State.OHIO, BIG10),
    OKLAHOMA("Oklahoma", "Sonners", "Norman", State.OKLAHOMA, BIG12),
    OKLAHOMA_STATE("Oklahoma State", "Cowboys", "Stillwater", State.OKLAHOMA, BIG12),
    OREGON("Oregon", "Ducks", "Eugene", State.OREGON, PAC12),
    OREGON_STATE("Oregon State", "Beavers", "Corvallis", State.OREGON, PAC12),
    PENN_STATE("Penn State", "Nittany Lions", "University Park", State.PENNSYLVANIA, BIG10),
    PITTSBURGH("Pittsburgh", "Panthers", "Pittsburgh", State.PENNSYLVANIA, ACC),
    PURDUE("Purdue", "Boilermakers", "West Lafayette", State.INDIANA, BIG10),
    RICE("Rice", "Owls", "Houston", State.TEXAS, CUSA),
    RUTGERS("Rutgers", "Piscataway", "Scarlet Knights", State.NEW_JERSEY, BIG10),
    SAN_DIEGO_STATE("San Diego State", "Aztecs", "San Diego", State.CALIFORNIA, MWC),
    SAN_JOSE_STATE("San Jose State", "Spartans", "San Jose", State.CALIFORNIA, MWC),
    SOUTHERN_METHODIST("SMU", "Mustangs", "University Park", State.TEXAS, AAC),
    SOUTH_ALABAMA("South Alabama", "Jaguars", "Mobile", State.ALABAMA, SBC),
    SOUTH_CAROLINA("South Carolina", "Gamecocks", "Columbia", State.SOUTH_CAROLINA, SEC),
    SOUTH_FLORIDA("South Florida", "Bulls", "Tampa", State.FLORIDA, AAC),
    SOUTHERN_MISSISSIPPI("Southern Miss", "Golden Eagles", "Hattiesburg", State.MISSISSIPPI, CUSA),
    STANFORD("Stanford", "Cardinal", "Palo Alto", State.CALIFORNIA, PAC12),
    SYRACUSE("Syracuse", "Orange", "Syracuse", State.NEW_YORK, ACC),
    TEXAS_CHRISTIAN("TCU", "Horned Frogs", "Fort Worth", State.TEXAS, BIG12),
    TEMPLE("Temple", "Owls", "Philadelphia", State.PENNSYLVANIA, AAC),
    TENNESSEE("Tennessee", "Volunteers", "Knoxville", State.TENNESSEE, SEC),
    TEXAS("Texas", "Longhorns", "Austin", State.TEXAS, BIG12),
    TEXAS_A_AND_M("Texas A&M", "Aggies", "College Station", State.TEXAS, SEC),
    TEXAS_STATE("Texas State", "Bobcats", "San Marcos", State.TEXAS, SBC),
    TEXAS_TECH("Texas Tech", "Red Raiders", "Lubbock", State.TEXAS, BIG12),
    TOLEDO("Toldeo", "Rockets", "Toledo", State.OHIO, MAC),
    TROY("Troy", "Trojans", "Troy", State.ALABAMA, SBC),
    TULANE("Tulane", "Green Wave", "New Orleans", State.LOUISIANA, AAC),
    TULSA("Tulsa", "Golden Hurricane", "Tulsa", State.OKLAHOMA, AAC),
    UAB("UAB", "Blazers", "Birmingham", State.ALABAMA, CUSA),
    CENTRAL_FLORIDA("UCF", "Knights", "Orlando", State.FLORIDA, AAC),
    UCLA("UCLA", "Bruins", "Los Angeles", State.CALIFORNIA, PAC12),
    UMASS("UMass", "Minutemen", "Amherst", State.MASSACHUSETTS, MAC),
    UNLV("UNLV", "Rebels", "Paradise", State.NEVADA, MWC),
    SOUTHERN_CALIFORNIA("USC", "Trojans", "Los Angeles", State.CALIFORNIA, PAC12),
    UTAH("Utah", "Utes", "Salt Lake City", State.UTAH, PAC12),
    UTAH_STATE("Utah State", "Aggies", "Logan", State.UTAH, PAC12),
    UTEP("UTEP", "Miners", "El Paso", State.TEXAS, CUSA),
    UTSA("UTSA", "Roadrunners", "San Antonio", State.TEXAS, CUSA),
    VANDERBILT("Vanderbilt", "Commodores", "Nashville", State.TENNESSEE, SEC),
    VIRGINIA("Virginia", "Cavaliers", "Charlottesville", State.VIRGINIA, ACC),
    VIRGINIA_TECH("Virginia Tech", "Hokies", "Blacksburg", State.VIRGINIA, ACC),
    WAKE_FOREST("Wake Forest", "Demon Deacons", "Winston-Salem", State.NORTH_CAROLINA, ACC),
    WASHINGTON("Washington", "Huskies", "Seattle", State.WASHINGTON, PAC12),
    WASHINGTON_STATE("Washinton State", "Cougars", "Pullman", State.WASHINGTON, PAC12),
    WEST_VIRGINIA("West Virginia", "Mountaineers", "Morgantown", State.WEST_VIRGINIA, BIG12),
    WESTERN_KENTUCKY("Western Kentucky", "Hilltoppers", "Bowling Green", State.KENTUCKY, CUSA),
    WESTERN_MICHIGAN("Western Michigan", "Broncos", "Kalamazoo", State.MICHIGAN, MAC),
    WISCONSIN("Wisconsin", "Badgers", "Madison", State.WISCONSIN, BIG10),
    WYOMING("Wyoming", "Cowboys", "Laramie", State.WYOMING, MWC),
    // Division 1-AA
    OTHER("Other", "Other", "", null, null);

    private String location;
    private String nickname;
    private String city;
    private State state;
    private Conference conference;

    private static final Map<String, CollegeFootballTeam> TEAM_BY_LOCATION = new HashMap<>();

    static {
        for (CollegeFootballTeam team : values()) {
            TEAM_BY_LOCATION.put(team.getLocation(), team);
        }
    }

    public static CollegeFootballTeam getTeamByLocation(String loc){
        if(!TEAM_BY_LOCATION.keySet().contains(loc)){
            return OTHER;
        }

        return TEAM_BY_LOCATION.get(loc);
    }

    private CollegeFootballTeam(String l, String n, String c, State s, Conference conf){

        this.location = l;
        this.nickname = n;
        this.city = c;
        this.state = s;
        this.conference = conf;

    }

    public String getLocation() {
        return location;
    }

    public String getNickname() {
        return nickname;
    }

    public String getCity() {
        return city;
    }

    public State getState() {
        return state;
    }

    public Conference getConference() {
        return conference;
    }
}
