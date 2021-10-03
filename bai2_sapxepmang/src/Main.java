import java.util.Scanner;

public class Main {
    public static void sapXepMangTang( int A[]){
        int tempSort;
        for (int i = 0; i < A.length - 1; i++) {
            for (int j = i + 1; j <= A.length - 1; j++) {
                if (A[i] > A[j]) {
                    tempSort = A[i];
                    A[i] = A[j];
                    A[j] = tempSort;
                }
            }
        }
    }
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Nhập vào số phần tử của mảng: ");
            n = scanner.nextInt();
        } while (n < 0);

        // khởi tạo và cấp phát bộ nhớ cho mảng
        int array[] = new int[n];

        System.out.println("Nhập các phần tử cho mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            array[i] = scanner.nextInt();
        }

        // Hiển thị mảng vừa nhập
        System.out.println("\n Mảng ban đầu: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + "\t");
        }

        sapXepMangTang(array);

        // Hiển thị mảng vừa sap xep
        System.out.println("\n Mảng sap xep tang: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}
