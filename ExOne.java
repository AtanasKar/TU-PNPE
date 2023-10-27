import java.util.Arrays;
import java.util.Scanner;

public class ExOne {
    public  static void arrElementSums(){
        int arr[] = {1, 2, 3, 4, 5};

        int sum = 0;
        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
            if(arr[i] % 2 == 0){
                sumEven += arr[i];
            }else{
                sumOdd += arr [i];
            }
        }

        System.out.println("Sum:" + sum);
        System.out.println("Sum of even elements:" + sumEven);
        System.out.println("Sum of odd elements:" + sumOdd);
    }

    public static void reverseArr(){
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int temp = 0;

        for (int i = 0; i < arr.length / 2; i++){
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void arrMinMax(){
        int arr[] = {1, 2, 3, 4, 5};
        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
            else if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Min: " + min + "; Max: " + max);
    }

    public static void isPrime(int num){
        for (int i = 2; i < num; i++){
            if(num % i == 0){
                System.out.println("Not a prime number");
                return;
            }
        }

        System.out.println("Prime number");
    }

    public static void diagSum(){
        int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int sum = 0;

        for (int i = 0; i < arr.length; i++){
            //primary diagonal
            sum += arr[i][i];
            //secondary diagonal
            sum += arr[i][arr[0].length - 1 - i];
        }

        System.out.println(sum);
    }

    public static void diagSumWithoutRepetition(){
        int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int sum = 0;

        for (int i = 0; i < arr.length; i++){
            //primary diagonal
            sum += arr[i][i];
            if(i == arr.length - 1 - i){
                continue;
            }
            //secondary diagonal
            sum += arr[i][arr[0].length - 1 - i];

        }

        System.out.println(sum);
    }

    public static void prinTriangle(){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        for (int i = 0; i < num; i++){
            for (int j = 0; j <= i; j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public static void printAll(){
        ExOne.arrElementSums();
        ExOne.reverseArr();
        ExOne.arrMinMax();
        ExOne.isPrime(7);
        ExOne.diagSum();
    }
}
