import static java.lang.System.out;

public class MainTest {

    public static void main(String[] args) {
        KoreanMatcher matcher = new KoreanMatcher();
//       matcher.inputMatcherString("거너ㄴ");
//       out.println(matcher.match("ㄴ거너ㄴㄷ"));
//       out.println(matcher.match("ㄴ거너ㄷ"));


        out.println(KoreanMatcher.doubleThirdWord('가'));
        out.println(KoreanMatcher.doubleThirdWord('각'));
        out.println(KoreanMatcher.doubleThirdWord('갂'));
        out.println(KoreanMatcher.doubleThirdWord('갃'));
        out.println(KoreanMatcher.doubleThirdWord('간'));
        out.println(KoreanMatcher.doubleThirdWord('갅'));
        out.println(KoreanMatcher.doubleThirdWord('갆'));
        out.println(KoreanMatcher.doubleThirdWord('갇'));
        out.println(KoreanMatcher.doubleThirdWord('갈'));
        out.println(KoreanMatcher.doubleThirdWord('갉'));
        out.println(KoreanMatcher.doubleThirdWord('갊'));
        out.println(KoreanMatcher.doubleThirdWord('갋'));
        out.println(KoreanMatcher.doubleThirdWord('갌'));
        out.println(KoreanMatcher.doubleThirdWord('갍'));
        out.println(KoreanMatcher.doubleThirdWord('갎'));
        out.println(KoreanMatcher.doubleThirdWord('갏'));
        out.println(KoreanMatcher.doubleThirdWord('감'));
        out.println(KoreanMatcher.doubleThirdWord('갑'));
        out.println(KoreanMatcher.doubleThirdWord('값'));
        out.println(KoreanMatcher.doubleThirdWord('갓'));
        out.println(KoreanMatcher.doubleThirdWord('갔'));
        out.println(KoreanMatcher.doubleThirdWord('강'));
        out.println(KoreanMatcher.doubleThirdWord('갖'));
        out.println(KoreanMatcher.doubleThirdWord('갗'));
        out.println(KoreanMatcher.doubleThirdWord('갘'));
        out.println(KoreanMatcher.doubleThirdWord('같'));
        out.println(KoreanMatcher.doubleThirdWord('갚'));
        out.println(KoreanMatcher.doubleThirdWord('갛'));


        out.println(KoreanMatcher.doubleSecondWord('가'));
        out.println(KoreanMatcher.doubleSecondWord('개'));
        out.println(KoreanMatcher.doubleSecondWord('갸'));
        out.println(KoreanMatcher.doubleSecondWord('걔'));
        out.println(KoreanMatcher.doubleSecondWord('거'));
        out.println(KoreanMatcher.doubleSecondWord('게'));
        out.println(KoreanMatcher.doubleSecondWord('겨'));
        out.println(KoreanMatcher.doubleSecondWord('계'));
        out.println(KoreanMatcher.doubleSecondWord('고'));
        out.println(KoreanMatcher.doubleSecondWord('과'));
        out.println(KoreanMatcher.doubleSecondWord('괘'));
        out.println(KoreanMatcher.doubleSecondWord('괴'));
        out.println(KoreanMatcher.doubleSecondWord('교'));
        out.println(KoreanMatcher.doubleSecondWord('구'));
        out.println(KoreanMatcher.doubleSecondWord('궈'));
        out.println(KoreanMatcher.doubleSecondWord('궤'));
        out.println(KoreanMatcher.doubleSecondWord('귀'));
        out.println(KoreanMatcher.doubleSecondWord('규'));
        out.println(KoreanMatcher.doubleSecondWord('그'));
        out.println(KoreanMatcher.doubleSecondWord('긔'));
        out.println(KoreanMatcher.doubleSecondWord('기'));

        out.println(KoreanMatcher.firstWord('ㄱ'));
        out.println(KoreanMatcher.firstWord('ㄲ'));
        out.println(KoreanMatcher.firstWord('ㄴ'));
        out.println(KoreanMatcher.firstWord('ㄷ'));
        out.println(KoreanMatcher.firstWord('ㄸ'));
        out.println(KoreanMatcher.firstWord('ㄹ'));
        out.println(KoreanMatcher.firstWord('ㅁ'));
        out.println(KoreanMatcher.firstWord('ㅂ'));
        out.println(KoreanMatcher.firstWord('ㅃ'));
        out.println(KoreanMatcher.firstWord('ㅅ'));
        out.println(KoreanMatcher.firstWord('ㅆ'));
        out.println(KoreanMatcher.firstWord('ㅇ'));
        out.println(KoreanMatcher.firstWord('ㅈ'));
        out.println(KoreanMatcher.firstWord('ㅉ'));
        out.println(KoreanMatcher.firstWord('ㅊ'));
        out.println(KoreanMatcher.firstWord('ㅋ'));
        out.println(KoreanMatcher.firstWord('ㅌ'));
        out.println(KoreanMatcher.firstWord('ㅍ'));
        out.println(KoreanMatcher.firstWord('ㅎ'));
    }
}
