package Item1;

public class Rank{

    private int score;

    public static Rank of(int score){
        if(score > 90) return new Gold();
        else if(score < 90 && score > 50) return new Sliver();
        else return new Bronze();
    }

    static class Gold extends Rank{}
    static class Sliver extends Rank{}
    static class Bronze extends Rank{}
}
