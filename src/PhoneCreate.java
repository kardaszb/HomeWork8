import java.util.Scanner;

public class PhoneCreate {
    public Phone create() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj model tel: ");
        String model = scanner.nextLine();

        System.out.println("Podaj cene: ");
        int price = scanner.nextInt();

        return new Phone(model, price);
    }
}
