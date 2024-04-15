import java.util.Scanner;
public class Q_2 {
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
        int[] arr_1 = new int[num];
        for(int i=0;i<num;i++){
            arr_1[i] = arr[i];
        }
        System.out.println("");
        System.out.print("The elements of the second array are: ");
        for(int i=0;i<num;i++){
            System.out.print(arr_1[i]+" ");
        }


    }
}
