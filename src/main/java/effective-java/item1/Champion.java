package Item1;

public class Champion {

    private int hp;
    private int mp;

    Champion(int hp, int mp) {
        this.hp = hp;
        this.mp = mp;
    }

    public static Champion newTopChampion(){
        return new Champion(100, 50);
    }

    public static Champion newMidChampion(){
        return new Champion(50, 100);
    }
}
