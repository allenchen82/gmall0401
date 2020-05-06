package com.atguigu.gmall0401.bean;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.io.Serializable;


@Data
@NoArgsConstructor
    public class SpuSaleAttrValue implements Serializable {

        @Id
        @Column
        String id ;

        @Column
        String spuId;

        @Column
        String saleAttrId;

        @Column
        String saleAttrValueName;

    public void setId(String id) {
        this.id = id;
    }

    public void setSpuId(String spuId) {
        this.spuId = spuId;
    }

    public void setSaleAttrId(String saleAttrId) {
        this.saleAttrId = saleAttrId;
    }

    public void setSaleAttrValueName(String saleAttrValueName) {
        this.saleAttrValueName = saleAttrValueName;
    }

    public void setIsChecked(String isChecked) {
        this.isChecked = isChecked;
    }

    @Transient
        String isChecked;

    public String getId() {
        return id;
    }

    public String getSpuId() {
        return spuId;
    }

    public String getSaleAttrId() {
        return saleAttrId;
    }

    public String getSaleAttrValueName() {
        return saleAttrValueName;
    }

    public String getIsChecked() {
        return isChecked;
    }
}


