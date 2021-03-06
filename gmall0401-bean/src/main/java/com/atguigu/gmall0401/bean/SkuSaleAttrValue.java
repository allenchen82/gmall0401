package com.atguigu.gmall0401.bean;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;


@Data
@NoArgsConstructor
public class SkuSaleAttrValue implements Serializable {

    @Id
    @Column
    String id;

    @Column
    String skuId;

    @Column
    String saleAttrId;

    @Column
    String saleAttrValueId;

    public void setId(String id) {
        this.id = id;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    public void setSaleAttrId(String saleAttrId) {
        this.saleAttrId = saleAttrId;
    }

    public void setSaleAttrValueId(String saleAttrValueId) {
        this.saleAttrValueId = saleAttrValueId;
    }

    public void setSaleAttrName(String saleAttrName) {
        this.saleAttrName = saleAttrName;
    }

    public void setSaleAttrValueName(String saleAttrValueName) {
        this.saleAttrValueName = saleAttrValueName;
    }

    @Column
    String saleAttrName;

    @Column
    String saleAttrValueName;

    public String getId() {
        return id;
    }

    public String getSkuId() {
        return skuId;
    }

    public String getSaleAttrId() {
        return saleAttrId;
    }

    public String getSaleAttrValueId() {
        return saleAttrValueId;
    }

    public String getSaleAttrName() {
        return saleAttrName;
    }

    public String getSaleAttrValueName() {
        return saleAttrValueName;
    }
}

