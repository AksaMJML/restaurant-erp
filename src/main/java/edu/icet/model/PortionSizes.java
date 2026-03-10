package edu.icet.model;

import lombok.*;

import java.sql.Timestamp;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PortionSizes {
    private Integer  portionSizeId;
    private String sizeName;
    private String description;
    private Timestamp createdAt;
}
