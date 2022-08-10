public class Main {
    public static void main(String[] args) {
        MagicBox <String> boxDishes = new MagicBox<>(3);
        System.out.println(boxDishes.add("Тарелка"));
        boxDishes.add("Чашка");
        boxDishes.add ("Кувшин");
        System.out.println(boxDishes.add ("Поднос")); // Добавим "лишний" объект
        System.out.println(boxDishes.pick());

        MagicBox <Double> x = new MagicBox<Double>(5);
        x.add(0.0);
        x.add(2.3);
        x.add(3.2);
        x.add(3.2);
        x.add(3.2);
        x.show();

        System.out.printf(x.pick());
    }
}
