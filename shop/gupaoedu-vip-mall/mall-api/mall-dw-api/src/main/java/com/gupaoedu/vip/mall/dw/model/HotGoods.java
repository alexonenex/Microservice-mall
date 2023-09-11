package com.gupaoedu.vip.mall.dw.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

/**
 * @author 赵浩成
 * @date 2023/09/07
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "msitemslog")
public class HotGoods {
    //IP
    private String ip;
    //访问的uri
    private String uri;
    //时间.
    @TableField("__time")
    private Date accesstime;
}