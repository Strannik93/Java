package hw.seminar3.getNamesGoodsGivenGrade.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Items {
    private String name;
    private String country;
    private Integer weight;
    private Integer price;
    private String sort;
}