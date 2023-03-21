import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    public static void Base() {
        System.out.println("Базовый уровень");
        int[] arr = new int[20];
        for (int i = 0; i < 20; i++) {
            arr[i] = (int) (Math.random() * (500 - 1)+ 1);
        }
        System.out.println("Массив заполнен псевдослучайными значениями");
        for (int i = 0; i < 20; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
        int neg_counter = 0;
        int pos_counter = 0;
        for (int i = 0; i < 20; i++) {
            if (arr[i] % 2 == 0) {
                pos_counter++;
            }
            else {
                neg_counter++;
            }
        }
        if(pos_counter > neg_counter) {
            System.out.println("Четных значений больше");
        }
        else {
            System.out.println("Нечетных значений больше");
        }
    }

    public static void Medium() {
        System.out.println("Средний уровень");
        double[] arr = new double[12];
        for (int i = 0; i < 12; i++) {
            arr[i] = Math.pow(i, 2) - 2*i + 19.3 * Math.cos(i);
        }

        System.out.println("Массив до обработки");
        for (int i = 0; i < 12; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");

        double arithmetic = 0;
        for (int i = 0; i < 12; i++) {
            arithmetic = arr[i] + arithmetic;
        }

        arithmetic = arithmetic / 12;
        int checker = 0;
        for (int i = 0; i < 12; i++) {
            if (arr[i] > arithmetic) {
                checker ++;
            }
        }

        double[] newArrMore = new double[checker];
        int counterMore = -1;
        double[] newArrLess = new double[12 - checker];
        int counterLess = -1;
        for (int i = 0; i < 12; i++) {
            if (arr[i] > arithmetic) {
                counterMore++;
                newArrMore[counterMore] = arr[i];
            }
            else {
                counterLess++;
                newArrLess[counterLess] = arr[i];
            }
        }

        int count = 0;
        double[] newArrFinal = new double[12];

        for(int i = 0; i < newArrMore.length; i++) {
            newArrFinal[i] = newArrMore[i];
            count++;
        }
        for (double arrLess : newArrLess) {
            newArrFinal[count++] = arrLess;
        }
        System.out.println("Массив после обработки");
        for (int i = 0; i < 12; i++) {
            System.out.print(newArrFinal[i] + " ");
        }
        System.out.println(" ");
    }

    public static void Hard() {
        String binary = in.nextLine();
        while(binary.length() % 4 != 0) {
            binary = "0" + binary;
        }
        int decimal = Integer.parseInt(binary, 2);
        String hex = Integer.toHexString(decimal);
        System.out.println("Число в двоичной системе исчисления: " + binary);
        System.out.println("Число в десятичной системе исчисления: " + decimal);
        System.out.println("Число в шестнадцатиричной системе исчисления: " + hex);
    }
    public static void main(String[] args) {
        Base();
        Medium();
        Hard();
    }
}