package src.six_kyu.prime;

public class SplitStrings {

    public static String[] solution(String s) {
        if (s.length() % 2 != 0) {
            s += "_";
        }
        return s.split("(?<=\\G.{2})");
    }

}