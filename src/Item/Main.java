package Item;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Item> items = new ArrayList<>();
        items.add(new Item(1, "Item1"));
        items.add(new Item(2, "Item2"));
        items.add(new Item(3, "Item3"));
        items.add(new Item(4, "Item4"));
        items.add(new Item(5, "Item5"));
        items.add(new Item(6, "Item6"));
        items.add(new Item(7, "Item7"));
        items.add(new Item(8, "Item8"));
        items.add(new Item(9, "Item9"));
        items.add(new Item(10, "Item10"));

        for (Item item : items) {
            item.show();
        }

        Map<Integer, String> itemMap = new HashMap<>();

        for (Item item : items) {
            itemMap.put(item.getId(), item.getName());
        }

        for (Map.Entry<Integer, String> entry : itemMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
        List<Item> firstFiveItems = items.subList(0, 5);
        Set<Item> itemSet = new HashSet<>(firstFiveItems);
        for (Item item : itemSet){
            System.out.println("HashSet Item" + item);
        }
    }
}
