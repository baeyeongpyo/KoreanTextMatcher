import static java.lang.System.out;

public class MainTest {

    public static void main(String[] args) {
       KoreanMatcher matcher = new KoreanMatcher();
       matcher.inputMatcherString("거너ㄴ");
       out.println(matcher.match("ㄴ거너ㄴㄷ"));
       out.println(matcher.match("ㄴ거너ㄷ"));
    }
}
