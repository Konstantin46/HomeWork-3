package lesson_3.homework;

public class SmartWatch extends SmartphoneAndSmartWatch implements Element {
    protected String iconDescription = "Смартчасы и браслеты";
    protected String name = "Смартчасы и браслеты";
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
        SmartWatch b = new SmartWatch();
        b.click();
        b.open();
        b.Type();
    }
}