import java.util.Scanner;
import java.util.Arrays;

public class Bai01 {
    public static int findElement(int[] array, int x) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static int findMax(int[] array) {
        int max = array[0];
        for (int i : array) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    public static int findMin(int[] array) {
        int min = array[0];
        for (int i : array) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

    public static int findMaxIndex(int[] array) {
        int max = array[0];
        int maxIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        //a.
        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập phần tử thứ %d: ", i);
            arr[i] = scanner.nextInt();
        }
        //b.
        System.out.println("Các phần tử của mảng:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        //c.
        System.out.print("Nhập số nguyên x cần tìm: ");
        int x = scanner.nextInt();
        int index = findElement(arr, x);
        if (index != -1) {
            System.out.println("Vị trí của " + x + " trong mảng là: " + index);
        } else {
            System.out.println(x + " không có trong mảng.");
        }
        //d.
        int max = findMax(arr);
        System.out.println("Phần tử lớn nhất trong mảng là: " + max);
        //e.
        int min = findMin(arr);
        System.out.println("Phần tử nhỏ nhất trong mảng là: " + min);
        //f.
        int maxIndex = findMaxIndex(arr);
        System.out.println("Vị trí của phần tử lớn nhất trong mảng là: " + maxIndex);
        //g.
        Arrays.sort(arr);
        System.out.println("Mảng sau khi sắp xếp tăng dần:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        scanner.close();
    }
}
