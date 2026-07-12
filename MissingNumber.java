import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements:");
        int sum = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }

        int expectedSum = (n + 1) * (n + 2) / 2;

        int missingNumber = expectedSum - sum;

        System.out.println("Missing number is: " + missingNumber);

        sc.close();
    }
}