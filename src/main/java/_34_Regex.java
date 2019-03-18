import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class _34_Regex {

    public static void main(String[] args) throws IOException {

        String fileContents = new String(Files.readAllBytes(Paths.get("text.txt")));

        System.out.println(fileContents);

        Pattern pattern = Pattern.compile("\\w+");
        Matcher matcher = pattern.matcher(fileContents);

        matcher.results().forEach(matchResult -> System.out.print(matchResult.group()));

        System.out.println();

        System.out.println(matcher.results().map(MatchResult::group).collect(Collectors.toSet()).contains(""));;


//        String fileContenets = new String(Files.readAllBytes(Paths.get("text.txt")));
//        System.out.println(fileContenets);
//
//        Pattern pattern = Pattern.compile("\\w+");
//
//        Matcher matcher = pattern.matcher(fileContenets);
//
//        matcher.results().forEach(matchResult -> System.out.println(matchResult.group()));
//
//        matcher.results().map(MatchResult::group).forEach(System.out::println);
//
//        matcher.results().map(MatchResult::group).collect(Collectors.toSet()).contains("aaa");

    }
}
