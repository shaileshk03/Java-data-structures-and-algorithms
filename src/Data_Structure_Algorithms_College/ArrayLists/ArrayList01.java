package Data_Structure_Algorithms_College.ArrayLists;

import java.util.ArrayList;

/**
 * @author Shailesh
 */
public class ArrayList01 {

    // Basic Operations and reverse list
    public static ArrayList<String> getColorListReversed(){
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Red");
        arrayList.add("Green");
        arrayList.add("Orange");
        arrayList.add("White");
        arrayList.add("Black");
        // iterate to the size of arraylist, loop iterate till the last value of index 0,
        // Everytime i-- decrease the index value by 1 index.
        for (int i = arrayList.size()-1; i>=0; i--){
            System.out.println(arrayList.get(i) + " ");
        }
      return arrayList;
    }

    public static ArrayList<String> GetArrayList() {
        return getColorListReversed();
    }


    // SWAP two number important
    public static void swap(ArrayList<Integer> list,  int inx1, int inx2){
        int temp = list.get(inx1);
        list.set(inx1, list.get(inx2));
        list.set(temp, list.get(inx1));
    }

    public static void main(String[] args) {
        GetArrayList();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(6);
        list.add(3);
        // iterate to the size o
        int inx1 = 1;
        int inx2 = 3;
        System.out.print(list);
        swap(list, inx1, inx2);
        System.out.println(list);
    }
}
