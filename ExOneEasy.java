import java.util.Arrays;

public class ExOneEasy {

    public static void sum(){
        int arr[] = {1,2,3};
        int sum = 0;

        for (int i = 0; i < 3; i++){
            sum += arr[i];
        }

        System.out.println(sum);
    }

    public static void sumEven(){
        int arr[] = {1, 2, 3};
        int sum = 0;

        for (int i = 0; i < arr.length; i++){
            sum += arr[i] % 2 == 0 ? arr[i] : 0;
        }

        System.out.println(sum);
    }

    public static void sumOdd(){
        int arr[] = {1, 2, 3};
        int sum = 0;

        for (int i = 0; i < arr.length; i++){
            sum += arr[i] % 2 == 1 ? arr[i] : 0;
        }

        System.out.println(sum);
    }

    public static void reverse(){
        int arr[] = {1, 2, 3, 4, 5};
        int temp = 0;

        for (int i = 0; i < arr.length / 2; i++){
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void findMax(){
        int arr[] = {1, 2, 3, 4, 5};
        int max = arr[0];

        for (int i = 1; i < arr.length; i++){
            max = max < arr[i] ? arr[i] : max;
        }

        System.out.println(max);
    }

    public static void diagonSum(){
        int arr[][] = {{1, 2}, {3, 4}};
        int sum = 0;

        for (int i = 0; i < arr.length; i++){
            //primary diagonal
            sum += arr[i][i];
            //secondary diagonal
            sum += arr[i][arr[0].length - 1 - i];
        }


        System.out.println(sum);
    }
    public static void firstRowSum(){
        int arr[][] = {{1, 2}, {3, 4}};
        int sum = 0;

        for (int i = 0; i < arr[0].length; i++){
            sum += arr[0][i];
        }

        System.out.println(sum);
    }

    public static void secondRowSum(){
        int arr[][] = {{1, 2}, {3, 4}};
        int sum = 0;

        for (int i = 0; i < arr[0].length; i++){
            sum += arr[1][i];
        }

        System.out.println(sum);
    }

    public static void evenOrOdd(int num){
        if(num % 2 == 0) {
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }

    public static void positiveOrNegative(int num){
        if(num < 0) {
            System.out.println("Negative");
        }
        else{
            System.out.println("Positive");
        }
    }

    public static void biggerThanTen(int num){
        if(num > 10) {
            System.out.println("Bigger");
        }
        else{
            System.out.println("Smaller");
        }
    }

    public static void areEqual(int num1, int num2){
        if(num1 == num2) {
            System.out.println("Equal");
        }
        else{
            System.out.println("Different");
        }
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

    public static void printStarsSquare(int num){
        for (int i = 1; i <= num * num; i++){
            System.out.print("* ");
            if(i % num == 0){
                System.out.println();
            }
        }
    }
    public static void prinTriangle(int num){
        for (int i = 0; i < num; i++){
            for (int j = 0; j <= i; j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
    public static void printStarsIsoscelesTriangle(int num){
        for (int i = 0; i < num; i++){
            for (int j = 0; j < num * 2; j++){
                if(j == num - 1 - i || //left side of triangle
                  (j == num - 2 + i && i != 0 && i != num - 1) || //right side of triangle when not first or last row
                  (i == num - 1 && j < num )) //last row fill
                {
                    System.out.print("*");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }


}
