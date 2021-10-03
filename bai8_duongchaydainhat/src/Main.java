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

    public static void duongChayDaiNhat(int a[]){
        int max = 1;
        int dodai = 1;
        int vitribatdau = -1;
        for(int i = 0; i< a.length-1; i++){
//            System.out.println("a[i] = " + a[i]);
//            System.out.println("a[i + 1] = " + a[i + 1]);
            if( a[i] <= a[i+1]){
                dodai ++;
                if( max < dodai){
                    max = dodai;
                    vitribatdau = i+1-(max-1);
//                    System.out.println("max = " + max);
                }

            }else {
                dodai = 1;
//                System.out.println("dodai = " + dodai);
//                System.out.println("max = " + max);

            }
        }
        System.out.println("\n max = " + max);
        System.out.println("vi tri bat dau: " + vitribatdau);
    }

    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Nhập vào số phần tử của mảng: ");
            n = scanner.nextInt();
        } while (n < 0 || n > 1000);

        // khởi tạo và cấp phát bộ nhớ cho mảng
        int array[] = new int[n];

        nhapMang(array);
        System.out.println("\n mảng vừa nhập: ");
        inMang(array);
        duongChayDaiNhat(array);
    }
}
