package hw.seminar3.searchBookTitles.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Books {
    private String name;
    private String surname;
    private Integer price;
    private Integer year;
    private Integer number;
}
