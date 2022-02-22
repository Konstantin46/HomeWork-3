package lesson_3.homework;

public class Smartphone extends SmartphoneAndSmartWatch implements Element {
    protected String iconDescription = "Смартфоны";
    protected String name = "Смартфоны";
    private String Type = "Электроника";

    @Override
    public void open() {
        System.out.println("список категорий товаров" + " " + iconDescription);
    }

    @Override
    public String getType() {
        return Type;
    }

    @Override
    public void Type() {
        System.out.println("Tип товара" + " " + Type);
    }

    public void click() {
        System.out.println("Иконка" + " " + name);
    }

    public static void main(String args[]) {
        Smartphone v = new Smartphone();
        v.click();
        v.open();
        v.Type();
    }
}


