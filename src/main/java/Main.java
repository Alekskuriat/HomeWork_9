import java.util.Random;

public class Main {

    static Random random = new Random();

    public static void main(String[] args) {

        int rows = 4;
        int column = 4;
        char ch = 45;
        String[][] arrayString = new String[rows][column];

        try {

                creatingAnArray(arrayString);

                arrayString[2][3] = String.valueOf(ch);

                arrayDisplay(arrayString);

                arrayTransformation(arrayString);

        } catch (MyArraySizeException | MyArrayDataException e) {
            System.err.println(e);
        }


    }

    public static void creatingAnArray(String[][] array) throws MyArraySizeException {
        if (array.length == 4 & array[0].length == 4) {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[0].length; j++) {
                    array[i][j] = Integer.toString(random.nextInt(10));
                }
            }
        } else throw new MyArraySizeException(array.length, array[0].length);
    }

    private static void arrayDisplay(String[][] array) {
        System.out.println("Массив: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void arrayTransformation(String[][] array) throws MyArrayDataException {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        System.out.println("Сумма всех элементов массива: " + sum);
    }


}
