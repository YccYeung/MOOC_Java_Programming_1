public class Storage {
    
    private String hometeam;
    private String awayteam;
    private int homescore;
    private int awayscore;

    public Storage (String firstteam, String secondteam, int homescore , int awayscore) {
        this.hometeam = firstteam;
        this.awayteam = secondteam;
        this.homescore = homescore;
        this.awayscore = awayscore;
    }

    public String home () {
        return this.hometeam;
    }

     public String away () {
        return this.awayteam;
    }

     public int homepts () {
        return this.homescore;
    }

     public int awaypts () {
        return this.awayscore;
    }

    public int win () {
        int win = 0;

        if (this.homescore > this.awayscore) {
            win++;
        }

        return win; 
    }

    public int lose () {
        int lose = 0;

        if (this.homescore < this.awayscore) {
            lose++;
        }

        return lose; 
    }

}
