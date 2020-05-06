package com.atguigu.gmall0401.bean;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.io.Serializable;
import java.math.BigDecimal;

@NoArgsConstructor
@Data
public class OrderDetail implements Serializable {
    @Id
    @Column
    private String id;

    public void setId(String id) {
        this.id = id;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    public void setSkuName(String skuName) {
        this.skuName = skuName;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public void setOrderPrice(BigDecimal orderPrice) {
        this.orderPrice = orderPrice;
    }

    public void setSkuNum(Integer skuNum) {
        this.skuNum = skuNum;
    }

    public void setHasStock(String hasStock) {
        this.hasStock = hasStock;
    }

    public String getId() {
        return id;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getSkuId() {
        return skuId;
    }

    public String getSkuName() {
        return skuName;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public BigDecimal getOrderPrice() {
        return orderPrice;
    }

    public Integer getSkuNum() {
        return skuNum;
    }

    public String getHasStock() {
        return hasStock;
    }

    @Column
    private String orderId;
    @Column
    private String skuId;
    @Column
    private String skuName;
    @Column
    private String imgUrl;
    @Column
    private BigDecimal orderPrice;
    @Column
    private Integer skuNum;

    @Transient
    private String hasStock;
}

