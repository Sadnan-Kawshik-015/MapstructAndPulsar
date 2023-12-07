package com.example.PulsarAndMapstructDemo.DTO;

import com.example.PulsarAndMapstructDemo.Entity.ItemDetails;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO {
    private String id;
    private String name;
    private String description;
    private int quantity;
    private long price;
    private String itemId;

    List<ItemDetails> itemDetails;
}
