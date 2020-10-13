import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParseSalary
{
    public static void main(String[] args)
    {
        final String regex = "\\d+";
        final String string = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";

        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);

        int summ = 0;
        while (matcher.find()) {
            summ += Integer.parseInt(matcher.group(0));
        }
        System.out.println(String.format("Сумма доходов %d руб.", summ));
    }
}