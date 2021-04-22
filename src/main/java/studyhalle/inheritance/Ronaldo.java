package studyhalle.inheritance;

public class Ronaldo extends FootballPlayer{

    int shootPower;

    public Ronaldo(String name, int stamina, int speed, int shootPower) {
        super(name, stamina, speed);
        this.shootPower = shootPower;
    }
}
