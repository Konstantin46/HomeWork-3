package lesson_3.homework;

public class OfficeEquipment extends Category implements Element {

    protected String iconDescription = "Иконки Офисная техника";
    protected String name = "Офисная техника";
    private String Type = "Товары для офиса";

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
        OfficeEquipment m = new OfficeEquipment();
        m.click();
        m.open();
        m.Type();

    }
}

