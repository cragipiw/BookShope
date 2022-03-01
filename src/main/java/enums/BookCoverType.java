package enums;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum BookCoverType {
    SOFT("Мягкий переплет"),
    HARD("Твердый переплет");

    private String title;

    BookCoverType(String title) {
        this.title = title;
    }

    public static List<String> getAllCovers(){
        return Stream.of(BookCoverType.values())
                .map(Enum::toString)
                .collect(Collectors.toList());
    }
}
