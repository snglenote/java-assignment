import java.io.IOException;
import java.nio.file.*;
import java.util.function.Function;
import java.util.stream.Stream;

public class SaveToFile {

    public static void main(String[] args) throws IOException {
        Path initialFile = Paths.get("100.txt");
        Path sortedFile = Paths.get("sorted.txt");

        Stream<CharSequence> sortedLines = Files.lines(initialFile).sorted().map(Function.identity());

        Files.write(sortedFile, sortedLines::iterator, StandardOpenOption.CREATE);
    }
}