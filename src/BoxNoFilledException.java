public class BoxNoFilledException extends RuntimeException {
    public BoxNoFilledException (int msg) {
        super ("Коробка не заполнена! Осталось заполнить " + msg + " ячеек");
    }
}
