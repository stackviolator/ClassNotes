import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class IST311_class1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList strings = new ArrayList();
        boolean running = true;

        while (true) {
            System.out.printf("Enter a string: ");
            String str = input.nextLine();
            strings.add(str);

            System.out.println("Would you like to continue? y/n");
            String con = input.nextLine();
            if (con.equals("n"))
                break;
        }
        write(strings);
    }

    public static void write(ArrayList strList) {
        try {
            FileWriter fw = new FileWriter("./string.txt");
            for (int i = strList.size(); i > 0; i--) {
                fw.write((String) strList.get(i-1) + "\n");
            }
            fw.close();
            System.out.println("Wrote items");
        } catch (IOException e) {
            System.out.println("failed to write to file");
        }

    }
}

