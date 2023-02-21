package hw.seminar3.searchHighestPrice.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Items {
    private String name;
    private Integer price;
    private String sort;
}
