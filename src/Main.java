import HomeWork.CustomStringList;

public class Main {
    public static void main(String[] args) {
        int[] array = {12,56,7,34,22,34, 7};
        CustomList customList = new CustomList(array);
//        System.out.println(customList);
//        System.out.println(customList.lastIndexOf(34));
//        System.out.println(customList.getList(34, 3));
//        System.out.println(customList.getList(2, 3));
//        System.out.println(customList.get(6));
//        customList.add(-3);
//        customList.add(-3);
//        customList.add(-3);
//        customList.add(-3);
//        System.out.println(customList);
//        String [] text = {"Harry", "Bob", "Kane"};
//        CustomStringList list1 = new CustomStringList(text);
 //       customList.remove(56);

//        System.out.println(customList);
//        customList.removeAll(22);
//        System.out.println(customList);
//        customList.removeAll2(34);
//        System.out.println(customList);
//        System.out.println(customList);
//        customList.removeByIndex(3);
//        System.out.println(customList);
//        customList.removeByIndex(4);
//        System.out.println(customList);
        System.out.println(customList);
        customList.removeAllByIndex(8);
        System.out.println(customList);



    }
}
