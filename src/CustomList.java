import java.util.Arrays;

public class CustomList {

    private int[] list;

    public CustomList(int[] array) {
        this.list = array;
    }

    public CustomList(int numb) {

        this.list = new int[0];
    }

    @Override
    public String toString() {
        return Arrays.toString(this.list);
    }

    public int indexOf(int numb) {
        for (int i = 0; i < this.list.length; i++) {
            if (list[i] == numb) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(int numb) {
        for (int i = this.list.length - 1; i >= 0; i--) {
            if (list[i] == numb) {
                return i;
            }
        }
        return -1;
    }

    public int getList(int index, int numb) {
        if (index >= 0 && index < this.list.length) {
            return this.list[index];
        } else {
            return numb;
        }
    }

    //    public int get(int index){
//        return get(index, 0);
//  }
    //    1) создать метод add и добавить в него переменную newList c
//    пустым массивом длинной на 1 больше this.list
    public void add(int numb) {
        int[] newList = new int[this.list.length + 1];
        for (int i = 0; i < this.list.length; i++) {
            newList[i] = this.list[i];
        }
        newList[newList.length -1] = numb;
        this.list = newList;
    }
}
    //    2) присвоить все значения из list в newList

//    3) получить в метод add число и подставить его в качестве последнего
//      элемента в newList

//    4) присвоить newList в this.list






// добавить метод indexOf, который получает целове число и
// возвращает индекс первого вхождения данного числа в массив
// если вхождений нет, то вернуть -1

// написать метод get который получает два аргумента
// 1) индекс элемента в массиве
// 2) значение по умолчанию

// если в массиве есть значение с указанным индексом, то вернуть его
// если нет, то вернуть значение по умолчанию

//    добавить еще один метод get, который получает только индекс
//    в качестве аргумента. Значение по умолчанию должно быть 0

//    добавить метод add который получает новое значение
//    формирует новый массив на 1 длиннее this.list и подставляет в него
//    полученное значение
//    новый массив присвоить в this.list

