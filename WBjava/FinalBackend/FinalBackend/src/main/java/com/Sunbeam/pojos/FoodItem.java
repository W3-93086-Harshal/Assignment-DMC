package com.Sunbeam.pojos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class FoodItem {
    private int fid;
    private String name;
    private double price;
    private String description;
    private String image;
    private String type;
}
