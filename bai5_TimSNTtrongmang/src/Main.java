import java.util.Scanner;

public class Main {
    public static void nhapMang(int array[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập các phần tử cho mảng: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            array[i] = scanner.nextInt();
        }

    }

    public static void inMang(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }

    public static boolean KTSNT(int a) {
        boolean check ;
        int dem = 0;
        if (a <= 3) {
            check = true;
        } else {
            for (int i = 2; i <= Math.sqrt(a); i++) {
                if (a % i == 0) {
                    dem++;
                    break;
                }
            }
            if (dem > 0) {
                check = false;
            } else {
                check = true;
            }
        }
        return check;
    }

    public static int timSoNNTrongMang(int a[]){
        int min = a[0];
        for (int i = 1; i < a.length; i ++){
            if(min > a[i]){
                min = a[i];
            }
        }
        return  min;
    }

    public static void timViTri(int a[], int x) {
        int length = 0;
        int minLength = Math.abs(timSoNNTrongMang(a) - x);
        int vitri = -1;
        for (int i = 0; i < a.length; i++) {
            if (KTSNT(a[i])) {
                length = Math.abs(x - a[i]);

                if(minLength >= length){
                    minLength = length;
                    vitri = i;
                }
            }
        }
        System.out.println("min length: " + minLength);
            System.out.println("vị trí số nguyên tố trong mảng a gần x =  " + x + " : " + vitri);
    }

    public static void main(String[] args) {
        int n, x;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Nhập vào số phần tử của mảng: ");
            n = scanner.nextInt();
        } while (n < 0);

        // khởi tạo và cấp phát bộ nhớ cho mảng
        int array[] = new int[n];

        nhapMang(array);
        System.out.println("Nhập vào số x: ");
        x = scanner.nextInt();
        System.out.println("\n mảng vừa nhập: ");
        inMang(array);
        timViTri(array,x );
    }
}
