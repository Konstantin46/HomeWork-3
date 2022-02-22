package lesson_3.homework;

public class Computers extends Category implements Element {

    protected String iconDescription = "Компьютеры";
    protected String name = "Компьютеры";
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

    public static class ComputersAndAccessories extends Computers implements Element {

        protected String iconDescription = "Компьютеры";
        protected String name = "Компьютеры и комплектующие";
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
            Computers m = new Computers();
            m.click();
            m.open();
            m.Type();
            ComputersAndAccessories o = new ComputersAndAccessories();
            o.click();
            o.open();
            o.Type();
        }
    }
}
