package lesson_3.homework;

public class Appliances extends Category implements Element {

    protected String iconDescription = "Бытовая техника";
    protected String name = "Бытовая техника";
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
        Appliances m = new Appliances();
        m.click();
        m.open();
        m.Type();

    }
}