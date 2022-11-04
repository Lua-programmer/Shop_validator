package io.luaprogrammer.shopvalidator.controllers.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ShopItemDTO {
    private String productIdentifier;
    private Integer amount;
    private BigDecimal price;
}
