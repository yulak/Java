public class MyArrayDataException extends RuntimeException {
    int i, j;

    public MyArrayDataException(int i, int j) {
        super("Неверно введенные данные в строке " + i + " и столбце " + j);
        this.i = i;
        this.j = j;
    }
}
