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

    public static void sapXepMangTang(int A[]) {
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

    public static void inMang(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }


    public static int[] chenSoVaoMang(int x, int a[]) {
        int temp[] = new int[a.length + 1];

        // 1. tìm vị trí chèn phần tử x vào mảng a;
        int vitrichen = -1;
        for (int j = 0; j < a.length; j++) {
            if (x <= a[0]) {
                vitrichen = 0;
                break;
            } else if( x > a[a.length-1]){
                vitrichen = a.length -1;
                 break;
            } else {
                for (int k = 1; k < a.length - 1; k++){
                    while(x < a[k]){
                        k++;
                    }
                    vitrichen = k + 1;
                    break;

                }
            }
        }
        // 2. chen so x vao mang a
        if( vitrichen == 0){
            temp[0] = x;
            for (int i = 1; i< temp.length; i ++){
                temp[i] = a[i-1];
            }
        } else if( vitrichen == a.length -1){
            temp[a.length - 1] = x;
            for (int i = 0; i< (temp.length - 1); i++){
                temp[i] = a[i];
            }
        } else {
            for( int i = 0 ; i < temp.length; i ++){
                while (i < vitrichen){
                   temp[i] = a[i];
                   i++;
                }
                temp[vitrichen] = x;
                i++;
                for(int j = i; j < temp.length; j++ ){
                    temp[j] = a[j-1];
                }
            }

        }
        return temp;
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

        System.out.println("Nhập số cần chèn:  ");
        x = scanner.nextInt();
        System.out.println("\n Mảng vừa nhập");
        inMang(array);
        int temp[];
        temp =  chenSoVaoMang(x, array);
        System.out.println("\n Mảng sau khi chèn phần tử x = " + x);
        inMang(temp);
    }
}
