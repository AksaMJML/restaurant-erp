package edu.icet.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Items {
    private Integer id;
    private String name;
    private String size;
    private Double price;
    private Integer preperationTime;
    private String ingredients;
}
