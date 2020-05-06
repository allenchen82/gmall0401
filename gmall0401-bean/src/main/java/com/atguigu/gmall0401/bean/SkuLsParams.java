package com.atguigu.gmall0401.bean;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class SkuLsParams implements Serializable {

    String  keyword;

    String catalog3Id;

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public void setCatalog3Id(String catalog3Id) {
        this.catalog3Id = catalog3Id;
    }

    public void setValueId(String[] valueId) {
        this.valueId = valueId;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public String getKeyword() {
        return keyword;
    }

    public String getCatalog3Id() {
        return catalog3Id;
    }

    public String[] getValueId() {
        return valueId;
    }

    public int getPageNo() {
        return pageNo;
    }

    public int getPageSize() {
        return pageSize;
    }

    String[] valueId;

    int pageNo=1;

    int pageSize=20;
}

