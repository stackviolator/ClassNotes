import java.util.Scanner;

public class IST311_class1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a string: ");
        String str = input.nextLine();

        for(int j=1; j <= str.length(); j++) {
            for (int i = 0; str.length() >= (i + j); i++) {
                System.out.println(str.substring(i, (i + j)));
            }
        }
    }
}

