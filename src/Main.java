public class Main {
    public static void main(String[] args) {
        MagicBox <String> boxDishes = new MagicBox<>(3);
        System.out.println(boxDishes.add("Тарелка"));
        boxDishes.add("Чашка");
        boxDishes.add ("Кувшин");
        System.out.println(boxDishes.add ("Поднос")); // Добавим "лишний" объект
        System.out.println(boxDishes.pick());

        MagicBox <Double> numbers = new MagicBox<Double>(5);
        numbers.add(0.0);
        numbers.add(2.3);
        numbers.add(1.2);
        numbers.add(13.2);
        numbers.show();

        System.out.println(numbers.pick());
    }
}
