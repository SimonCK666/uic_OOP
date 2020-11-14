
public class SportsCourt {
    private Sport sport;

    public SportsCourt(Sport sport) {
        // create the constructor
        this.sport = sport;
    }

    public Sport playSport() {
        // play sport
        return sport;
    }

    public static void testSportsCourt() {
        HalfMarathon hm1 = new HalfMarathon();
        SportsCourt sportsCourt = new SportsCourt(hm1);
        Sport hm2 = sportsCourt.playSport();
        // judge the equality
        if (hm1 == hm2) {
            System.out.println("hm1 and hm2 are the same half marathon");
        } else {
            System.out.println("hm1 and hm2 are not the same half marathon");
        }
    }
}
