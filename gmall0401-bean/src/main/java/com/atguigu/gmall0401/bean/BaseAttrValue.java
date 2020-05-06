package com.atguigu.gmall0401.bean;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.io.Serializable;

@Data
@NoArgsConstructor
public class BaseAttrValue implements Serializable {
    @Id
    @Column
    private String id;

    public void setId(String id) {
        this.id = id;
    }

    public void setValueName(String valueName) {
        this.valueName = valueName;
    }

    public void setAttrId(String attrId) {
        this.attrId = attrId;
    }

    public void setParamUrl(String paramUrl) {
        this.paramUrl = paramUrl;
    }

    public String getId() {
        return id;
    }

    public String getValueName() {
        return valueName;
    }

    public String getAttrId() {
        return attrId;
    }

    public String getParamUrl() {
        return paramUrl;
    }

    @Column
    private String valueName;
    @Column
    private String attrId;

    @Transient
    private String paramUrl;
}
