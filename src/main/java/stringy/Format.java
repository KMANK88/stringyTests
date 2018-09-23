package stringy;

import java.util.List;
import java.util.stream.Collectors;

public class Format {
    /**
     * Indent each line of a string by the given number of
     * spaces.
     *
     * @param input - the input string
     * @param distance - number of spaces
     * @return an indented copy of the string
     */
    public static String indent(String input, int distance) {
        var padding = new String(new char[distance])
                .replace("\0", " ");
        var lines = List.of(input.split("\n"))
                .stream()
                .map(l -> padding + l)
                .collect(Collectors.toList());
        return String.join("\n", lines);
    }

    /**
     * Word wrap a string at the given line length by inserting
     * newline characters on word boundaries such that the total
     * length of a line does no exceed the length given.
     *
     * @param input - the input string
     * @param lineLength - maximum line length
     * @return a word wrapped copy of the input
     */
    public static String wordWrap(String input, int lineLength) {
        var buffer = new StringBuilder();
        var currentLength = 0;

        for (var word: input.split(" ")) {
            // Add 1 below for the space
            var candidateLength = currentLength + 1 + word.length();
            if (currentLength == 0) {
                buffer.append(word);
                currentLength = word.length();
            } else if (candidateLength <= lineLength) {
                buffer.append(' ');
                buffer.append(word);
                currentLength = candidateLength;
            } else {
                buffer.append('\n');
                buffer.append(word);
                currentLength = word.length();
            }
        }

        return buffer.toString();
    }
}
