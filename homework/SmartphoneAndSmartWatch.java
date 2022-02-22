package lesson_3.homework;

public class SmartphoneAndSmartWatch extends Category implements Element {
    protected String iconDescription = "Смартфоны и Смарт часы";
    protected String name = "Смартфоны и Смарт часы";
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

    @Override
    public void click() {
        System.out.println("Иконка" + " " + name);
    }

    public static void main(String args[]) {
        SmartphoneAndSmartWatch f = new SmartphoneAndSmartWatch();
        f.click();
        f.open();
        f.Type();
    }
}
