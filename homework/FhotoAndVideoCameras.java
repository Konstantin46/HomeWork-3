package lesson_3.homework;

public class FhotoAndVideoCameras extends Category implements Element {

    protected String iconDescription = "Иконка Фото и Видеокамеры";
    protected String name = "Фото и Видеокамеры";
    private String Type = "Электроника";

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
        FhotoAndVideoCameras m = new FhotoAndVideoCameras();
        m.click();
        m.open();
        m.Type();

    }
}
