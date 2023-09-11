package com.gupaoedu.vip.mall.goods.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


/**
 * @author 赵浩成
 * @date 2023/09/07
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    // Spu
    private Spu spu;
    // Sku
    private List<Sku> skus;
}
