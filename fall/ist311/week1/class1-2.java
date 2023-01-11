import java.util.Scanner;

public class IST311_class1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numList = new int[10];
        int i = 0;
        int exit = 0;
        while ((exit != 1) && (i < 10)) {
            System.out.printf("Enter an integer: ");
            numList[i] = input.nextInt();
            i++;
            System.out.println("Do you want to exit? 1/0");
            exit = input.nextInt();
        }

        double avg = calcAvg(numList, i);
        System.out.println("Average = " + avg);
    }

    public static double calcAvg(int[] arr, int elements) {
        double avg = 0;
        for (int n : arr) {
            avg += n;
        }
        
        avg = avg / elements;
        return avg;
    }
}

