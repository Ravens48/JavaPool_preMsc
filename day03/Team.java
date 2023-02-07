import java.util.ArrayList;

public class Team {
    private String name;
    private ArrayList<Astronaut> team = new ArrayList<Astronaut>();
    public Team(String n) {
        this.name = n;
    }

    public void add(Astronaut astro) {
        this.team.add(astro);
    }

    public void remove(Astronaut astro) {
        this.team.remove(astro);
    }

    public int countMembers(){
        return this.team.size();
    }

    public void showMembers(){
        String sentences = this.name +":";
        for (Astronaut member: this.team) {
            sentences+=" ";
            if (member.getDestination() != null) {
                sentences += member.getName() + " on mission,";
            }
            else if (member.getDestination() == null ) {
                sentences += member.getName() + " on standby,";
            }
        }
        sentences = sentences.substring(0, sentences.length() - 1) + '.';
        System.out.println(sentences);
    }

    //no parameter
    public void doActions() {
        System.out.println(this.name+ ": Nothing to do.");
    }

    //parameter
    public void doActions(Object obj) {
        for (Astronaut member:this.team ) {
            member.doActions(obj);
        }
    }
    //------getter and setter-------


    public String getName() {
        return this.name;
    }
}