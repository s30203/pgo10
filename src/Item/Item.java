package Item;
class Item {
    public int id;
    public String name;

    public Item(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void show() {
        System.out.println(name);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    @Override

    public String toString() {
        return "id: " + id + ", name: " + name;
    }
}