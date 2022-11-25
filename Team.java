import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>>{
    private String name;
    private int played=0,won=0,lost=0,tied=0;

    private ArrayList<T> members= new ArrayList<>();

    public Team(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public boolean addPlayer(T player){
        if(members.contains(player)){
            System.out.println(player.getName()+" is already on the team");
            return false;
        }else{
            members.add(player);
            System.out.println(player.getName()+" was picked for team "+this.name);
            return true;
        }
    }
    public int numPlayers(){
        return this.members.size();
    }
    public void matchResult(Team<T> opponent, int ourScore, int theirScore){
        String msg;
        if(ourScore> theirScore){
            won++;
            msg= " Won against ";
        }else if(theirScore> ourScore){
            lost++;
            msg = " lost to ";
        }else{
            tied++;
            msg= " tied with ";
        }
        played++;
        if(opponent != null){
            System.out.println(this.getName()+ msg+opponent.getName());
            matchResult(null,theirScore, ourScore);
        }
    }
    public int ranking(){
        return (won*2)+ tied;
    }

    @Override
    public int compareTo(Team<T> team){
        if(this.ranking()> team.ranking()){
            return -1;
        }else if(this.ranking()< team.ranking()){
            return 1;
        }
        return 0;
    }

}
