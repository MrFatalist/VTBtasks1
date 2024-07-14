import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Main {
    public static int n;

    public static void main(String[] args) {
        System.out.println("Please type number equal 3 or more");

        try (Scanner sc = new Scanner(System.in)) {
            while ((n = sc.nextInt()) < 3) {
                System.out.println("Your number is wrong. Please type number equal 3 or more");
            }
        } catch (Exception x) {
            System.out.println("Your input was not a number");
        }
        try {
            int[][] mas = new int[n][n];
            Random random = new Random();
            for (int k = 0; k < n; k++) { // наполняем
                for (int i = 0; i < n; i++) {
                    mas[k][i] = random.nextInt(9);
                }
            }

            for (int k = 0; k < n; k++) { // выводим
                for (int i = 0; i < n; i++) {
                    System.out.print(mas[k][i] + " ");
                }
                System.out.println();
            }

            int[] diag = new int[n]; // отбор чисел из диагонали
            int tmp = n - 1;
            for (int k = 0; k < n; k++) {
                diag[k] = mas[k][tmp - k];
            }
            //System.out.println(diag.toString());
            Arrays.sort(diag);//сортировка по возрастанию
            System.out.println("\n" + "Minimal number in the side diagonal is: " + diag[0]);//вывод первого числа в массиве

        }catch (ArrayIndexOutOfBoundsException y){
            System.out.println("Restart the programm and input correct number");
        }
        }
    }

