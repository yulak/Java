import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int line;
        int column;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размер двумерного массива 4х4");
        line = scanner.nextInt();
        column = scanner.nextInt();

        String[][] newArray = new String[line][column];
        try {
            createArr(newArray, scanner, line, column);
            printArr(newArray);
            calcArr(newArray, line, column);
            System.out.println("\nСумма" + +calcArr(newArray, line, column));
        }catch (MyArraySizeException e){
            System.out.println("Нужно вводить только цыфры 4 и 4");
        }catch (MyArrayDataException e){
            System.out.println("Нужно вводить только цыфры");
        }
    }

    private static void createArr(String[][] array, Scanner scanner, int line, int column) {
        if (line != 4 | column != 4) throw new MyArraySizeException(line, column);
        System.out.println("Создайте новый массив");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.println("Строк " + line + " столбцов " + column);
                array[i][j] = scanner.next();
            }
        }
        printArr(array);
        calcArr(array, line, column);
    }

    private static int calcArr(String[][] array, int line, int column){
        int sum = 0;
        int[][] arrayInt = new int[line][column];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    arrayInt[i][j] = Integer.parseInt(array[i][j]);
                    sum += arrayInt[i][j];
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        printArrInt(arrayInt);
        return sum;
    }
    private static void printArr(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
        }
    }
    private static void printArrInt(int[][] array) {
        System.out.println("\nЭто целочисленный интовый массив\n");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
        }
    }
}


