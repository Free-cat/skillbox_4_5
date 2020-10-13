import java.util.Scanner;

public class PhoneNumberClearing {

    public static void main(String[] args) {
        String clear_phone_number = clearPhoneNumber(enterPhoneNumber());
        System.out.println(String.format("Очищенный номер телефона %s", clear_phone_number));
    }

    private static String clearPhoneNumber(String phoneNumber){
        return phoneNumber.replaceAll("[^\\d]", "");
    }

    private static String enterPhoneNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер телефона в любом формате");

        return scanner.nextLine();
    }
}
