
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        int n = 5;
        int[] array = new int[n];
        main.readArray(array);
        main.FindDistance(array);
    }

    private void readArray(int a[]){
        System.out.println("Введите ряд чисел");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
    }


    private void FindDistance(int a[]) {
        int min1 , min2, index1, index2, n;

        if (a[0]<a[1]){
            min1 = a[0];
            index1 = 0;
            min2 = a[1];
            index2 = 1;
        }
        else {
            min1 = a[1];
            index1 = 1;
            min2 = a[0];
            index2 = 0;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min2) {
                if (a[i]<min1){
                    min1 = a[i];
                    index1 = i;
                }
                else{
                    min2 = a[i];
                    index2= i;
                }
            }
        }
        System.out.println("Минимальное число1: "+min1 +" індекс: "+index1);
        System.out.println("Минимальное число2: "+min2+" індекс "+index2);
        if (index1>index2){
            n=index1-index2-1;
        }
        else {
            n=index2-index1-1;
        }
        System.out.println("Растояние между двумя наименшими числами "+ n);
    }
}
