package demo51_regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        String number1 = "+380671231212";
        String number2 = "+38(067)1231212";
        String number3 = "+38(067)1231212-nocopy";
        Pattern pattern = Pattern.compile("[+]?[0-9]{1,3}[(]?[0-9]{3}[)]?[0-9]{7,9}");
        Matcher matcher = pattern.matcher(number3);
        boolean result = matcher.matches();
        System.out.println(result);


    }
}
