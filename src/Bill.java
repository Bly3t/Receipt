import java.io.IOException;
import java.util.Scanner;


public class Bill {
    public static void main(String[] args) throws IOException {
        Scanner sc_1 = new Scanner(System.in);
        System.out.print("Name: ");
        String name = sc_1.nextLine();
        System.out.print("Surname: ");
        String surname = sc_1.nextLine();

        UserContact client = new UserContact(name, surname);
        client.getRecipe(client);


    }

}
