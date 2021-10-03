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
        // Hiển thị mảng sau khi sap xep
        System.out.println("\n Mảng sap xep: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + "\t");
        }
        int dem = 0;
        int max = 0;
        String value = "" ;

        for( int i = 0 ; i< array.length ; i ++) {
            while (i < array.length-1 && array[i] == array[i+1]){
                    i++;
            }
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    dem++;
                }
            }
            if( max < dem){
                max = dem;
                value = String.valueOf(array[i]);
            }
            System.out.print("\n phan tu co gia tri: " + array[i] + " xuat hien " + dem + " lan trong mang");
            dem = 0;
        }
        System.out.println("\n Phan tu co so lan xuat hien nhieu nhat trong mang la phan tu co gia tri: " + value);
    }
}
