public class MyArrayDataException extends Exception{
    int i;
    int j;

    MyArrayDataException(int i, int j) {
        this.i = i;
        this.j = j;
    }

    @Override
    public String toString() {
        return "Ошибка! В ячейке: " + i + "x" + j + " отсутствует число";
    }
}
