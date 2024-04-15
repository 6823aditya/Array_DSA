import java.util.Scanner;

public class Q_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of elements of array: ");
        int num = input.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.print("Enter element " + i + ": ");
            int n = input.nextInt();
            arr[i] = n;


        }
        System.out.print("the elements of array are: ");
        for (int i = 0; i < num; i++) {

            System.out.print(arr[i] + " ");
        }
        int max =arr[0];
        for(int i =0; i<num-1 ;i++){
            if(arr[i] < arr[i+1]){
                max = arr[i+1];
            }else{
                continue;
            }
        }
        System.out.println("");
        System.out.print(max +" is the largest element");
        int min =arr[0];
        for(int i =1; i<num ;i++){
            if(arr[i-1] > arr[i]){
                min = arr[i];
            }else{
                continue;
            }
        }
        System.out.println("");
        System.out.print(min+" is smallest element");




    }
}
