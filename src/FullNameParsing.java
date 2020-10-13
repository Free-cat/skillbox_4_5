import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FullNameParsing {

    public static void main(String[] args) {
        parsingFullName(enterFullName());
    }

    private static void parsingFullName(String full_name){
        final String regex = "(?<lastname>[\\w+а-яА-Я]+)\\s+(?<firstname>[\\w+а-яА-Я]+)\\s+(?<middlename>[\\w+а-яА-Я]+)";

        if (!full_name.matches(regex)){
            System.out.println("Неправильный формат ввода");
            return;
        }

        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(full_name);

        while (matcher.find()) {
            System.out.println(String.format("Фамилия: %s\nИмя: %s\nОтчество: %s\n", matcher.group("lastname"), matcher.group("firstname"), matcher.group("middlename")));
        }
    }

    private static String enterFullName(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ФИО в формате {Фамилия} {Имя} {Отчество} например, “Иванов Сергей Петрович”");

        return scanner.nextLine();
    }
}
