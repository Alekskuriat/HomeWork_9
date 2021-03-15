public class Main {
    public static void main(String[] args) {
        int rows = 4;
        int column = 4;
        char ch = 45;
        String[][] arrayString;

        try {
            if (rows == 4 & column == 4) {
                arrayString = new String[rows][column];

                creatingAnArray(arrayString);

                arrayString[2][3] = String.valueOf(ch);

                arrayDisplay(arrayString);

            } else throw new MyArraySizeException(rows, column);

            arrayTransformation(arrayString);

        } catch (MyArraySizeException | MyArrayDataException e) {
            System.err.println(e);
        }


    }

    public static void creatingAnArray(String[][] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = Integer.toString(i + j);
            }
        }
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
