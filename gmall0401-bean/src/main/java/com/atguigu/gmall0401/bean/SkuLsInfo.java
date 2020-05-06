package com.atguigu.gmall0401.bean;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;


@Data
@NoArgsConstructor
public class SkuLsInfo implements Serializable {

    String id;

    BigDecimal price;

    String skuName;

    public void setId(String id) {
        this.id = id;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setSkuName(String skuName) {
        this.skuName = skuName;
    }

    public void setCatalog3Id(String catalog3Id) {
        this.catalog3Id = catalog3Id;
    }

    public void setSkuDefaultImg(String skuDefaultImg) {
        this.skuDefaultImg = skuDefaultImg;
    }

    public void setHotScore(Long hotScore) {
        this.hotScore = hotScore;
    }

    public void setSkuAttrValueList(List<SkuLsAttrValue> skuAttrValueList) {
        this.skuAttrValueList = skuAttrValueList;
    }

    public String getId() {
        return id;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public String getSkuName() {
        return skuName;
    }

    public String getCatalog3Id() {
        return catalog3Id;
    }

    public String getSkuDefaultImg() {
        return skuDefaultImg;
    }

    public Long getHotScore() {
        return hotScore;
    }

    public List<SkuLsAttrValue> getSkuAttrValueList() {
        return skuAttrValueList;
    }

    String catalog3Id;

    String skuDefaultImg;

    Long hotScore=0L;

    List<SkuLsAttrValue> skuAttrValueList;
}

