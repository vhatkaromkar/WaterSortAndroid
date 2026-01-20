
package com.example.watersort;

import java.util.*;

public class GameState {
    public List<Tube> tubes = new ArrayList<>();

    public boolean isSolved() {
        for (Tube t : tubes) {
            if (!t.colors.isEmpty()) {
                int c = t.colors.get(0);
                for (int i : t.colors)
                    if (i != c) return false;
            }
        }
        return true;
    }
}
