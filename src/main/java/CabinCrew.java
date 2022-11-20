public class CabinCrew {

    private String name;

    private String rank;

    public static String message;

    public CabinCrew(String name, String rank, String message){
        this.name = name;
        this.rank = rank;
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }


    public String getRelayMessage() {
        return message;

    }

}
