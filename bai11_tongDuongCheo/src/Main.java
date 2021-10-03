import java.util.Scanner;

public class Main {
    public static void nhapMaTran(int array[][], int n) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập các phần tử cho mảng: ");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) {
                System.out.print("Nhập phần tử thứ [" + i + "," + j + "]: ");
                array[i][j] = scanner.nextInt();
            }

    }

    public static void inMaTran(int array[][], int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.print("\n");
        }

    }

    public static void tinhTongCacDuongcheo(int array[][], int n) {
        // duong cheo chinh
        int duongcheochinh =0;
        int duongcheophu = 0;
        for (int i = 0; i < n; i++) {
            duongcheochinh += array[i][i];
            duongcheophu += array[i][n-1-i];
        }
        System.out.println(" Đường chéo chính: " + duongcheochinh);
        System.out.println(" Đường chéo phụ: " + duongcheophu);
    }

    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap n: ");
        n = scanner.nextInt();

        int a[][] = new int[n][n];
        nhapMaTran(a, n);
        System.out.println("Ma tran vua nhap \n");
        inMaTran(a, n);
        tinhTongCacDuongcheo(a,n);
    }
}
