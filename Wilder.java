public class Wilder {
    private String firstname;
    private boolean aware;

    public Wilder(String firstname, boolean aware) {
        this.firstname = firstname;
        this.aware = aware;

    }

    public String whoIam() {
        if (this.aware) {
            return "Je m'appelle " + this.getFirstname() + " et je suis aware";
        } else  {
            return "Je m'appelle " + this.getFirstname() + " et je ne suis pas aware";
        }
    }

    public String getFirstname(){
        return this.firstname;
    }

}