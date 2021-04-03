package njava.inheritance;

public class Messi extends FootballPlayer{

    int dribble;

    public Messi(String name, int stamina, int speed, int dribble) {
        super(name, stamina, dribble);
        this.dribble = dribble;
    }
}
