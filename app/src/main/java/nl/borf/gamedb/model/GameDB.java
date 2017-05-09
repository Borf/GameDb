package nl.borf.gamedb.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by johan on 2017-05-03.
 */

public class GameDB {
    public static final List<Game> items = new ArrayList<>();

    static {
        // Add some sample items.
        for (int i = 1; i <= 25; i++) {
            items.add(new Game("Zelda - Breath of the Wild", Platform.Switch, "1234"));
        }
    }



}
