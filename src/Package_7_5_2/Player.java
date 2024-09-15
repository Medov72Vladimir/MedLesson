package Package_7_5_2;

import java.util.ArrayList;
import java.util.List;

public class Player extends Human{
    public Backpack backpack = new Backpack();
    public Player(String name) {
        super(name + " the player");
    }
    public void take(String thing) {
        backpack.addThing(thing);
    }

    class Backpack {
        private List<String> items = new ArrayList<>();

        public void addThing(String thing) {
            if (!items.contains(thing)) {
                items.add(thing);
            }
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (items.size() == 0) {
                return "the backpack is empty";
            } else {
                for (int i = 0; i < items.size(); ++i) {
                    if (i > 0) {
                        sb.append(",");
                    }
                    sb.append(items.get(i));
                }
                return sb.toString() + " in the backpack";
            }
        }
    }
}
