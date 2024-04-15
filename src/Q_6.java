import java.util.Scanner;

public class Q_6 {
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
        int zero = 0;
        int one =0;
        for(int i =0;i<num;i++){
            if (arr[i]==0){
                zero++;
            }else{
                one++;
            }
        }
        for(int i =0;i<zero;i++){
            arr[i]=0;
        }
        for(int i =zero;i<num;i++){
            arr[i] =1;
        }
        System.out.println("");
        System.out.print("the new array is: ");
        for(int i =0; i<num;i++){
            System.out.print(arr[i]+" ");
        }


    }
}
