package menu;

public enum MenuItem {

    COFFEE ("Coffee", 3, ItemCategory.DRINK),
    TEA ("Tea", 2, ItemCategory.DRINK),
    PASTRY ("Pastry", 5, ItemCategory.FOOD);

    private final String name;
    private final int price;
    private final ItemCategory category;

    MenuItem( String name, int price, ItemCategory category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public ItemCategory getCategory() {
        return category;
    }

    @Override
    public String toString(){
        return name;
    }
}

