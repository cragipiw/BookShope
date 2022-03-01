package enums;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public enum Category {
    CLASSIC("Классика"),
    NOVEL("Роман"),
    CHILDREN("Детское"),
    FANTASY("Фэнтези"),
    HISTORY("Исторический"),
    FANTASTIC("Фантастика");


    private String title;

    Category(String title) {
        this.title = title;
    }

    public static List<String> getAllCategory(){
        return Stream.of(Category.values())
                .map(Enum::toString)
                .collect(Collectors.toList());
    }

}
