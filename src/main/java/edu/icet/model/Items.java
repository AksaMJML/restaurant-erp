package edu.icet.model;

import lombok.*;

import java.sql.Timestamp;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Items {
    private Integer id;
    private String name;
    private String description;
    private  String category;
    private boolean isActive;
    private Timestamp createAt;
    private Timestamp updatedAt;
}
