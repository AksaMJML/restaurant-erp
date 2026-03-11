package edu.icet.model;

import lombok.*;

import java.security.Timestamp;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MenuItemVarient {
    private Integer variantId;
    private Integer menuItemId;
    private Integer portionSizeId;
    private Double price;
    private Integer prepTimeMinutes;
    private Integer isAvailable;
    private Timestamp createdAt;
    private Timestamp updatedAt;
}
