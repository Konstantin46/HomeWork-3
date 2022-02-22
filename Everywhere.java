package lesson_3.homework;

public class Everywhere extends Category implements Element {

    protected String iconDescription = "Иконка Везде";
    protected String name = "Везде";
    private String Type = "Все виды продукции";
    @Override
    public void open() {
        System.out.println("поисковик и список со всеми категориями товаров из" + " " + iconDescription);
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
        Everywhere m = new Everywhere();
        m.click();
        m.open();
        m.Type();

    }
}
