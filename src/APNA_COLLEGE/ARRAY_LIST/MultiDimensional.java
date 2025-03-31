package APNA_COLLEGE.ARRAY_LIST;

import java.util.ArrayList;

/**
 * @author Shailesh
 */
public class MultiDimensional {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1); list.add(2);
        mainList.add(list);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3); list2.add(4);
        mainList.add(list2);

        for (int i = 0; i < mainList.size(); i++){
            ArrayList<Integer> currentList = mainList.get(i);
            for (int j=0; j<mainList.size(); j++){
                System.out.print(currentList.get(i) + " ");
            }
            System.out.println();
        }
    }

}
