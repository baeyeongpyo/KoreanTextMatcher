import static java.lang.System.out;

public class KoreanMatcher {

    private static final int koreanFirstCode = 12593; // ㄱ
    private static final int koreanFirstCodeRange = 29; // ㄱ ~ ㅎ
    private static final int koreanFirstWordCode = 44032; // 가
    private static final int koreanFirstWordCodeToGapFirstCode = 31439; // 가 - ㄱ
    private static final int koreanFirstRanges = 11171; // 가 ~ 힣
    private static final int koreanSecondRanges = 588; // 가 ~ 깋
    private static final int koreanThirdRanges = 28; // 가 ~ 갛

    private String matcherInputRegex;

    @SuppressWarnings("UnusedReturnValue")
    public KoreanMatcher inputMatcherString(String input) {
        makeRegex(input);
        return this;
    }

    @SuppressWarnings({"StringConcatenationInLoop", "ConditionCoveredByFurtherCondition"})
    private void makeRegex(String input) {
        matcherInputRegex = "";
        if (input != null && !input.isEmpty()) {
            char[] inputChars = input.toCharArray();
            for (int i = 0; i < inputChars.length; i++) {
                char c = inputChars[i];
                if (koreanFirstCode <= c && koreanFirstCode + koreanFirstCodeRange >= c) {
                    int wordFirst = (c - koreanFirstCode - 1) * koreanSecondRanges + koreanFirstWordCode;
                    matcherInputRegex += "[" + (char) wordFirst + "-" + (char) (wordFirst + koreanSecondRanges - 1) + c + "]";
                } else if (koreanFirstWordCode <= c && c >= koreanFirstWordCode + koreanFirstRanges) {
                    if (c % koreanThirdRanges == 0) {
                        matcherInputRegex += "[" + c + "-" + (char) (c + koreanThirdRanges) + "]";
                    } else {
                        matcherInputRegex += c;
                    }
                } else {
                    matcherInputRegex += c;
                }
            }
            matcherInputRegex = "(.*)" + matcherInputRegex + "(.*)";
        }
    }

    public boolean match(String word) {
        out.println(matcherInputRegex);
        return word.matches(matcherInputRegex);
    }


    public static char[] doubleSecondWord(char inputChar) {
        int inputCharCode = inputChar - koreanFirstWordCode;
        int inputSecondCode = inputCharCode / koreanThirdRanges;
        int secondCount = 1;
        switch (inputSecondCode) {
            case 8: // ㅗ -> ㅘ, ㅙ, ㅚ
            case 13: // ㅜ -> ㅝ, ㅞ, ㅟ
                return new char[]{
                        inputChar,
                        (char) (inputChar + koreanThirdRanges * secondCount++),
                        (char) (inputChar + koreanThirdRanges * secondCount++),
                        (char) (inputChar + koreanThirdRanges * secondCount),
                };
            case 18: // ㅡ -> ㅢ
                return new char[]{
                        inputChar,
                        (char) (inputChar + koreanThirdRanges * secondCount)
                };
        }
        return new char[]{inputChar};
    }

    @SuppressWarnings("DuplicatedCode")
    public static char[] doubleThirdWord(char inputChar) {
        int inputCharCode = inputChar - koreanFirstWordCode;
        int thirdCount = 1;
        switch (inputCharCode % koreanSecondRanges % koreanThirdRanges) {
            case 1: // ㄱ -> ㄲ, ㄳ
            case 4: // ㄴ -> ㄵ, ㄶ
                return new char[]{
                        inputChar,
                        (char) (inputChar + thirdCount++),
                        (char) (inputChar + thirdCount)
                };
            case 17: // ㅂ -> ㅄ
            case 19: // ㅅ -> ㅆ
                return new char[]{
                        inputChar,
                        (char) (inputChar + thirdCount)
                };
            case 8: // ㄹ -> ㄺ, ㄻ, ㄼ, ㄽ, ㄾ, ㄿ, ㅀ
                return new char[]{
                        inputChar,
                        (char) (inputChar + thirdCount++), //ㄺ
                        (char) (inputChar + thirdCount++), //ㄻ
                        (char) (inputChar + thirdCount++), //ㄼ
                        (char) (inputChar + thirdCount++), //ㄽ
                        (char) (inputChar + thirdCount++), //ㄾ
                        (char) (inputChar + thirdCount++), //ㄿ
                        (char) (inputChar + thirdCount) //ㅀ
                };
        }
        return new char[]{inputChar};
    }

}