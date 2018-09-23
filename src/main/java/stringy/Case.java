package stringy;

import java.util.List;
import java.util.stream.Collectors;

public class Case {
    /**
     * Transform a string to alternate upper and lower case
     * starting with the case of the first character.
     *
     * @param input - the string to transform
     * @return an alternating case copy of the input
     */
    public static String alternating(String input) {
        var buffer = new StringBuilder();
        var nextShouldBeUpperCase = isUpperCase(input.substring(0, 1));

        for (var character: input.split("")) {
            if (nextShouldBeUpperCase) {
                buffer.append(character.toUpperCase());
            } else {
                buffer.append(character.toLowerCase());
            }
            nextShouldBeUpperCase = !nextShouldBeUpperCase;
        }

        return buffer.toString();
    }

    private static boolean isUpperCase(String input) {
        return input.toUpperCase().equals(input);
    }

    /**
     * Transform a string into sentence case by capitalizing the
     * first letter and then lower casing every letter that
     * immediately follows a space character.
     *
     * @param input - the string to transform
     * @return a sentence case copy of the input
     */
    public static String sentence(String input) {
        var buffer = new StringBuilder();
        var words = input.split(" ");
        var first = words[0];

        buffer.append(first.substring(0, 1).toUpperCase());
        buffer.append(first.substring(1));

        List.of(words).stream().skip(1).forEach(word -> {
            buffer.append(" ");
            buffer.append(word.substring(0, 1).toLowerCase());
            buffer.append(word.substring(1));
        });

        return buffer.toString();
    }

    /**
     * Transform a string into title case by capitalizing the
     * first letter and then every letter that immediately follows
     * a space character.
     *
     * @param input - the string to transform
     * @return a title case copy of the input
     */
    public static String title(String input) {
        return List.of(input.split(" "))
                .stream()
                .map(word -> word.substring(0, 1).toUpperCase() + word.substring(1))
                .collect(Collectors.joining(" "));
    }
}
