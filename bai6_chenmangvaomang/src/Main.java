import java.util.Scanner;

public class Main {
    public static void nhapMang(int array[]){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập các phần tử cho mảng: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            array[i] = scanner.nextInt();
        }

    }
    public static void inMang(int array[]){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }

    public static int[] chenMang(int a[], int b[], int p){
        int newLength = a.length + b.length;
        int result[] = new int[newLength];
        for(int i=0;i<newLength ; i ++){
            // coppy mang a vao mang result den vị trí p;

            while (i < p){
                result[i]= a[i];
                i++;
            }

            // coppy mang b vao mang result bắt đầu từ p;
            for( int j =0 ; j < b.length; j ++){
                result[i]= b[j];
                i++;
            }

            if( p < a.length){
                // chen phan con lai cua mang a vao result bat dau tu a[p]
                for( int k = p ; k < a.length; k ++){
                    result[i] = a[k];
                    i++;
                }
            }

        }
        return result;
    }

    public static void main(String[] args) {
        int n, m, p;
        Scanner scanner = new Scanner(System.in);
        //  nhap mang a
        do {
            System.out.println("Nhập vào số phần tử của mảng a: ");
            n = scanner.nextInt();
        } while (n < 0);
        int a[] = new int[n];
        nhapMang(a);
        // nhap mang b
        do {
            System.out.println("Nhập vào số phần tử của mảng b: ");
            m = scanner.nextInt();
        } while (m < 0);
        int b[] = new int[m];
        nhapMang(b);

        do {
            System.out.println("Nhập vị trí cần chèn p: ");
            p = scanner.nextInt();
        } while (p < 0);

        // in mang a,b
        System.out.println("\n mang a:" );
        inMang(a);
        System.out.println("\n mang b:" );
        inMang(b);
        System.out.println("\n chèn mảng a vào mảng b tại vị trí: " + p);
        int temp[]= new int[n + m];
        temp = chenMang(a,b,p);
        inMang(temp);

    }

}
