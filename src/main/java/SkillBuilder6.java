
/**
 * SkillBuilder6 is a class for completing this Skill
 * Builder assignment in Java.
 *
 * @author <Leen Ed'Anne Jean>
 * @version 1.0
 */

public class SkillBuilder6 {
    private static final char START_CHAR = 't';
    private static final char END_CHAR = 'y';


    public static String findTYPattern(String s)
    {
        int beginIndex = -1;
        int endIndex = -1;

        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (c == START_CHAR || c == Character.toUpperCase(START_CHAR)) {
                beginIndex = i;
            } else if (( c == END_CHAR || c ==  Character.toUpperCase(END_CHAR)) && beginIndex!=-1) {
                endIndex = i;
                return s.substring(beginIndex, endIndex + 1);
            } else {
                beginIndex = -1;
                }
            }

             return "";

    }
}
