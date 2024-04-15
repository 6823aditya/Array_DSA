import java.util.Scanner;

public class Q_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of elements of array: ");
        int num = input.nextInt();
        int[] arr = new int[num];
        for(int i=0;i<num;i++){
            System.out.print("Enter element "+i+": ");
            int n = input.nextInt();
            arr[i] = n;


        }
        System.out.print("the elements of array are: ");
        for(int i=0;i<num;i++){

            System.out.print(arr[i]+" ");
        }
        int size=0;
        int[] arr_missing = new int[num];
        int[] arr_num ={0,1,2,3,4,5,6,7,8,9};
        for(int i =0;i<num;i++){
            for(int j=0;j<10;j++){
                if(arr[i]!=arr_num[j]){
                    size++;
                    arr_missing[i] = arr_num[j];
                }else{
                    continue;
                }
            }


        }
        System.out.println("");
        System.out.print("the missing elements are:");
        for(int i =0;i<num;i++){
            System.out.println(arr_missing[i]);
        }


    }
}
