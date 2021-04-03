package Item1;

public class Main {
    public static void main(String[] args) {

        Champion malphite = new Champion(100, 50);
        Champion oriana = new Champion(50, 100);

        Champion shen = Champion.newTopChampion();
        Champion syndra = Champion.newMidChampion();

        DrawingLots drawingLots = DrawingLots.of(5);
        System.out.println(drawingLots.number);

        Rank gold = Rank.of(100);
        Rank sliver = Rank.of(70);
        Rank bronze = Rank.of(30);

        System.out.println(gold.getClass().getSimpleName());
        System.out.println(sliver.getClass().getSimpleName());
        System.out.println(bronze.getClass().getSimpleName());

    }
}
