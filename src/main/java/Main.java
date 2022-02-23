import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String text = "The FCC had to censor the network for saying &$#*@!.";
        Pattern pattern = Pattern.compile(".+\\.");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(text.substring(matcher.start(), matcher.end()));
        }


    }
}
// 2  (.*)\d{3,9} (\d{4})  [A-Z,a-z]{3}( )(\d+)