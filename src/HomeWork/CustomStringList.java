package HomeWork;
// 0. Добавить начальный набор методов и свойств
// Добавить конструктор, который получает массив из строк и присваивает его в свойство list.

//1. Метод check
//Данный метод получает в качестве аргумента строку и проверяет, находится ли эта строка в списке строк или нет.
// Если да, метод возвращает true, в ином случае false.

//2. Метод check
//Данный метод получает в качестве аргумента массив из строк и проверяет, находятся ли строки из полученного списка в списке строк list.
// Если все находятся, метод возвращает true, в ином случае false.

//3. Метод longestWord
//Данный метод не получает аргументов и возвращает самое длинное слово из массива list.

//4. Метод add
//Данный метод получает в качестве аргумента строку и создает новый массив в list, который содержит все старые элементы и новый.

//5. Метод addIfNotExists

//Данный метод получает в качестве аргумента строку и если данной строки нет в list создает новый массив в list,
// который содержит все старые элементы и новый. В ином случае выводит в терминал сообщение "Строка <значение строки> в массиве уже есть"
//Результат необходимо загрузить на github и ссылку прислать в качестве результата.

import java.util.Arrays;

public class CustomStringList {

 public String[] list;

    public CustomStringList(String[] text) {
        this.list = text;
    }

    public boolean check(String checkList) {
        for (String textStr : this.list) {
            if (textStr.equals(checkList)) {
                return true;
            }
        }return false;
    }
    // 2. Метод check
    // Данный метод получает в качестве аргумента массив из строк и проверяет,
    // находятся ли строки из полученного списка в списке строк list.
    // Если все находятся, метод возвращает true, в ином случае false.
    public boolean check(String []arrays){
 //      return Arrays.equals(this.list, arrays);
        for (int i = 0; i < this.list.length; i++) {
            for (int j = 0; j < arrays.length; j++) {
                if (this.list[i].equals(arrays[j])){
                    break;
                }

            }return false;

        }return true;
    }

    public String longestWord(){
        String nonText = "";
        for (String checkLangWord : this.list) {
            if (checkLangWord.length() > nonText.length()){
                nonText = checkLangWord;
            }
        }return nonText;
    }
    public void add(String newString){
        String[] arrayText = new String[this.list.length + 1];
        for (int i = 0; i < this.list.length; i++) {
            arrayText[i] = this.list[i];
        }
        arrayText[arrayText.length -1] = newString;
        this.list = arrayText;
    }
    //5. Метод addIfNotExists
    //Данный метод получает в качестве аргумента строку и если данной строки нет в list создает новый массив в list,
    // который содержит все старые элементы и новый. В ином случае выводит в терминал сообщение "Строка <значение строки> в массиве уже есть"
    //Результат необходимо загрузить на github и ссылку прислать в качестве результата.
    public void addIfNotExists( String checkExistString){
        for (String simpleText : this.list) {
            if (simpleText.equals(checkExistString)){
                System.out.println("Строка <значение строки> в массиве уже есть");
            }else {
                String [] simpleArray = new String[this.list.length +1];
                for (int i = 0; i < this.list.length; i++) {
                    simpleArray[i] = this.list[i];
                    simpleArray[simpleArray.length -1] = checkExistString;
                }
            }
        }
    }
}



