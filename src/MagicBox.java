import java.util.Arrays;
import java.util.Random;

public class MagicBox <T> {
    private T item; // объект в коробку
    private int boxSize; // размер коробки
    private T[] items; // массив объектов в коробке

    public MagicBox(int boxSize) {
        this.boxSize = boxSize;
        this.items = (T[]) new Object[boxSize];
    }

    public boolean add(T item) {
        for (int i = 0; i < items.length; i++) { //заполняем массив
            if (items[i] == null) {
                items[i] = item;
                return true;
            }
        }
        return false;
    }

    public void show() {
        System.out.println(Arrays.deepToString(items));
    }

    public T  pick() throws BoxNoFilledException {
        int emptyCell = 0;
        T choice;
        for (T element : items) { //считаем пустые ячейки
            if (element == null) {
                emptyCell++;
            }
        }
        if (emptyCell == 0) { //если коробка полностью заполнена
            Random random = new Random();
            int randomInt = random.nextInt(boxSize);
          choice = items[randomInt];
        } else throw new BoxNoFilledException(emptyCell); // если заполнена не полностью, то ошибка

        return (T) choice ;
    }
}
