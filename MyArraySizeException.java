public class MyArraySizeException extends RuntimeException {
    int line, column;

    public MyArraySizeException(int line, int column) {
        super("Введено неверное значение, массив должен быть 4х4, а у вас " + line + "x" + column);
        this.line = line;
        this.column = column;
    }
}
