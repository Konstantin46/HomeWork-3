package lesson_3.homework;

public class SmartHomeAndSecurity extends Category implements Element {

    protected String iconDescription = "Иконки Умный дом и безопасность";
    protected String name = "Умный дом и безопасность";
    private String Type = "Товары для дома";

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
        SmartHomeAndSecurity m = new SmartHomeAndSecurity();
        m.click();
        m.open();
        m.Type();

    }
}

