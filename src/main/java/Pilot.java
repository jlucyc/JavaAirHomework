public class Pilot extends CabinCrew{

    private String licence;

    public Pilot(String name, String rank, String licence){
        super(name, rank, message);
        this.licence = licence;

    }


    public String getLicence() {
        return licence;
    }

    public void setLicence(String licence) {
        this.licence = licence;
    }
}
