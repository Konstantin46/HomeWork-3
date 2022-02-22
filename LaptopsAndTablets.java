package lesson_3.homework;

public class LaptopsAndTablets extends Category implements Element {
    protected String iconDescription = "Ноутбуки и планшеты";
    protected String name = "Ноутбуки и планшеты";
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

    public static class Laptops extends LaptopsAndTablets implements Element {
        protected String iconDescription = "Ноутбуки";
        protected String name = "Ноутбуки";
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
    }
        public static class Tablets extends LaptopsAndTablets implements Element {
            protected String iconDescription = "Планшеты";
            protected String name = "Планшеты";
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
        }
    public static void main(String args[]) {
        LaptopsAndTablets m = new LaptopsAndTablets();
        m.click();
        m.open();
        m.Type();
        Laptops o = new Laptops();
        o.click();
        o.open();
        o.Type();
        Tablets d = new Tablets();
        d.click();
        d.open();
        d.Type();
    }
}
