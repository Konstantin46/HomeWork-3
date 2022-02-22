package lesson_3.homework;

public class television extends Category implements Element {
    protected String iconDescription = "Телевизоры";
    protected String name = "Телевизоры";
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
        television m = new television();
        m.click();
        m.open();
        m.Type();

    }
}
