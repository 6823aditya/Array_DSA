import java.util.Scanner;

public class Q_4 {
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
        int odd = 0;
        int[] arr_odd = new int[num];
        int even = 0;
        int[] arr_even = new int[num];
        for(int i =0;i<num;i++){
            if(arr[i]%2==0){
                arr_even[even] = arr[i];
                even++;
            }else{
                arr_odd[odd] = arr[i];
                odd++;
            }
        }
        System.out.println("");
        System.out.print("The even elements are: ");
        for(int i =0;i<even;i++){
            System.out.print(arr_even[i]+" ");
        }
        System.out.println("");
        System.out.print("The odd elements are:");
        for(int i = 0;i<odd;i++){
            System.out.print(arr_odd[i]+" ");
        }



    }
}
