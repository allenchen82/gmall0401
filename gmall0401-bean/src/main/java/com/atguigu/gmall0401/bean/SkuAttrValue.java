package com.atguigu.gmall0401.bean;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

@Data
@NoArgsConstructor
public class SkuAttrValue implements Serializable {

    @Id
    @Column
    String id;

    @Column
    String attrId;

    @Column
    String valueId;

    public void setId(String id) {
        this.id = id;
    }

    public void setAttrId(String attrId) {
        this.attrId = attrId;
    }

    public void setValueId(String valueId) {
        this.valueId = valueId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    @Column
    String skuId;

    public String getId() {
        return id;
    }

    public String getAttrId() {
        return attrId;
    }

    public String getValueId() {
        return valueId;
    }

    public String getSkuId() {
        return skuId;
    }
}

