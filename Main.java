public class Main {
    public static void main(String[] args) {

        League<Team<BaseballPlayer>> bbl = new League<>("BBL");
        Team<BaseballPlayer> nym = new Team<>("Ney York Mets");
        Team<BaseballPlayer> cc = new Team<>("Chicago Cubs");
        Team<BaseballPlayer> brs = new Team<>("Boston Red Sox");
        Team<BaseballPlayer> lad = new Team<>("L. A. Dodgers");
        Team<FootballPlayer> por = new Team<>("Portugal");

        nym.matchResult(cc,3,5);
        nym.matchResult(lad,4,1);
        brs.matchResult(lad,2,4);

        bbl.addTeam(nym);
        bbl.addTeam(cc);
        bbl.addTeam(brs);
        bbl.addTeam(lad);

        bbl.showLeagueTable();
    }
}
