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

}
