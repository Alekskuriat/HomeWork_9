public class MyArraySizeException extends Exception{
    int i;
    int j;

    MyArraySizeException(int i, int j){
        this.i = i;
        this.j = j;
    }

    @Override
    public String toString() {
        return "Ошибка! Указанный размер: " + i + "x" + j + "\nУкажите размер 4х4";
    }
}
