package lk.ijse.theQuailRanch.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class SellStockDto {
    private String id;
    private String category;
    private int quantity;
    private double unitPrice;
}
