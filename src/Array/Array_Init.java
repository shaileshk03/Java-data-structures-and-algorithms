package Array;

/**
 * @author Shailesh
 */
public class Array_Init {

    public int[] loopUse(int[] arr){
        for (int i = 0; i < arr.length; i++){
            for (int j = 0 ; j < i; j++){
            if(arr[i] == arr[j]){
                System.out.println(arr[i]);
             }
            }
        }
        return null;
    }

    static void findRepeatingElements(int arr[]) {
        int cnt = 0;
        int[] dup = new int[arr.length];
        for(int i=0;i<arr.length-1;i++) {
            for(int j=i+1;j<arr.length;j++) {
                if(arr[i]==arr[j])
                    dup[cnt++] = arr[i];
            }
        }
        System.out.print("The repeating elements are: ");
        for(int i=0;i<cnt;i++)
            if(dup[i] != dup[i+1])
                System.out.print(dup[i]+" ");
    }
    public static void main(String[] args) {
      int[] arr = {1,1,2,3,4,4,5,2};
      Array_Init arrayInit = new Array_Init();
      arrayInit.findRepeatingElements(arr);
    }
}
