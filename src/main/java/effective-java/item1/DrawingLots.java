package Item1;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class DrawingLots {
    private static final int MIN_NUM = 1;
    private static final int MAX_NUM = 10;

    private static final Map<Integer, DrawingLots> DrawingLotsBox = new HashMap<>();

    static {
        IntStream.range(MIN_NUM, MAX_NUM)
                .forEach(i -> DrawingLotsBox.put(i, new DrawingLots()));
    }

    public int number;

    private DrawingLots(){
        number = (int)((Math.random()*10000)%10);
    }

    public static DrawingLots of(int number){
        return DrawingLotsBox.get(number);
    }
}
