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
        newList[newList.length - 1] = numb;
        this.list = newList;
    }
//----------------------------------------------------
// добавить метод  getMax. Который возвращает максимальное число

    public int getMax() {
        int maxStg = list[0];
        for (int stg : list) {
            if (stg > maxStg) {
                maxStg = stg;
            }
        }
        return maxStg;
    }
//----------------------------------------------------
    // создать метод pop который возвращает последний элемент массива
    // и удаляет этот элемент (создает новый массив с длинной на 1 меньше и
    // перекидывает туда все элементы кроме последнего и присваивает его в this.list)

    public int pop() {
        int lastElem = list[list.length - 1];
        int[] newInt = new int[this.list.length - 1];
        for (int i = 0; i < newInt.length; i++) {
            newInt[i] = this.list[i];
        }
        this.list = newInt;
        return lastElem;
    }

    //----------------------------------------------------
    private void copyArray(int[] init, int[] result) {
        int minLength = (init.length > result.length) ? result.length : init.length;
        for (int i = 0; i < minLength; i++) {
            result[i] = init[i];
        }
    }

    // создать метод remove, который получает число в качестве аргумента и
// сравнивает его с каждым числом массива
// если совпадение, то выводится в терминал "YES", в ином случае "NO" (на каждое сравнение)
    public void remove(int value) {
        for (int i = 0; i < this.list.length; i++) {
            if (this.list[i] == value) {
                shiftByIndex(i);
                pop();
                return;
            }
        }
//----------------------------------------------------
        // создать метод shiftByIndex, который получает через аргументы индекс в массиве
// и начиная с этого индекса сдвигает все элементы на 1 шаг в лево

    }

    private void shiftByIndex(int index) {
        for (int i = index; i < this.list.length - 1; i++) {
            this.list[i] = this.list[i + 1];

        }
    }
    //----------------------------------------------------
    // доработать метод remove таким образом, чтобы в цикле определялся индекс
    // удаляемого элемента и все последующие элементы массива сдвигает на один шаг в лево

//----------------------------------------------------------------------
// создать метод removeRight, который удаляет первое вхождени с права на лево

    public void removeRight(int value) {
        for (int i = this.list.length - 1; i >= 0; i--) {
            if (this.list[i] == value) {
                shiftByIndex(i);
                pop();
                return;

            }
        }
    }
    //----------------------------------------------------
    public void remove2(int value){
    int index = indexOf(value);
    if (index != - 1){
        shiftByIndex(index);
        pop();
    }

  }
    //----------------------------------------------------
    // создать метод removeAll, который удаляет все вхождения указанного элемента
    public void removeAll(int value){
        for (int i = 0; i < this.list.length; i++) {
            if (this.list[i] == value) {
                shiftByIndex(i);
                pop();
            }
        }
    }
    //----------------------------------------------------
    // 2й способ удаления указанного элемента
    public void removeAll2(int value){
        int i = 0;
        while (i < this.list.length){
            if (this.list[i] == value) {
                shiftByIndex(i);
                pop();
            }else {
                i++;
            }
        }
    }
    //-------------------------------------
    // Задание 1: Реализация метода removeByIndex для удаления элемента по индексу в пользовательском списке.
    //Описание задания: Вам необходимо разработать метод removeByIndex для пользовательского списка (CustomList),
    // который будет осуществлять удаление элемента по указанному индексу.
    //Убедитесь, что метод обрабатывает ситуации с корректными и некорректными индексами,
    // а также что он корректно сдвигает и обновляет элементы списка после удаления.

    public void removeByIndex(int index){
        if (index >= 0 && index < this.list.length) {
            shiftByIndex(index);
            pop();
        }
    }
//-------------------------------------------------------------

    // Задание 2: Реализация метода removeAllByIndex для удаления всех элементов по индексу в пользовательском списке.
    // Описание задания: Вам необходимо разработать метод removeAllByIndex для пользовательского списка (CustomList),
    // который будет осуществлять удаление всех элементов по указанному индексу.
    // Метод по указанному индексу находит значение и удаляет все вхождения данного значения.
    // Убедитесь, что метод обрабатывает ситуации с корректными и некорректными индексами,
    // а также что он корректно сортирует и обновляет элементы списка после удаления.

    public void removeAllByIndex(int index){
        for (int i = 0; i < this.list.length; i++) {
            if (i == index){
                removeAll(this.list[i]);
            }
        }
    }
}
