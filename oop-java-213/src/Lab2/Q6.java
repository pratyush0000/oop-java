package Lab2;
import java.util.Scanner;
public class Q6 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double[] numbers = new double[10];

            System.out.println("Enter 10 double numbers:");

            for (int i = 0; i < 10; i++) {
                numbers[i] = scanner.nextDouble();
            }

            insertionSort(numbers);

            System.out.println("Sorted numbers:");
            for (double number : numbers) {
                System.out.print(number + " ");
            }

            scanner.close();
        }

        public static void insertionSort(double[] arr) {
            int n = arr.length;
            for (int i = 1; i < n; i++) {
                double key = arr[i];
                int j = i - 1;

                while (j >= 0 && arr[j] > key) {
                    arr[j + 1] = arr[j];
                    j = j - 1;
                }
                arr[j + 1] = key;
            }
        }
}


