package yui.hesstina;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Book {

    private String name;

    Book(String name) {
        this.name = name;
    }
}
