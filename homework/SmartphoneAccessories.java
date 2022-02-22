package lesson_3.homework;

public class SmartphoneAccessories extends Category implements Element {

    protected String iconDescription = "Иконки Аксессуары для смартфонов";
    protected String name = "Аксессуары для смартфонов";
    private String Type = "дополнительные товары для смартфонов";

    @Override
    public void open() {
        System.out.println("список категорий товаров из" + " " + iconDescription);
    }

    @Override
    public String getType() {
        return Type;
    }

    @Override
    public void Type() {
        System.out.println("Tип товара" + " " + Type);
    }

    @Override
    public void click() {
        System.out.println("Иконка" + " " + name);
    }

    public static void main(String args[]) {
        SmartphoneAccessories m = new SmartphoneAccessories();
        m.click();
        m.open();
        m.Type();

    }
}
