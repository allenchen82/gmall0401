package com.atguigu.gmall0401.bean;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@Data
@NoArgsConstructor
public class SpuInfo implements Serializable {
    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column
    private String spuName;

    @Column
    private String description;

    @Column
    private  String catalog3Id;

    @Transient
    private List<SpuImage> spuImageList;

    public void setId(String id) {
        this.id = id;
    }

    public void setSpuName(String spuName) {
        this.spuName = spuName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCatalog3Id(String catalog3Id) {
        this.catalog3Id = catalog3Id;
    }

    public void setSpuImageList(List<SpuImage> spuImageList) {
        this.spuImageList = spuImageList;
    }

    public void setSpuSaleAttrList(List<SpuSaleAttr> spuSaleAttrList) {
        this.spuSaleAttrList = spuSaleAttrList;
    }

    @Transient
    private  List<SpuSaleAttr> spuSaleAttrList;

    public String getId() {
        return id;
    }

    public String getSpuName() {
        return spuName;
    }

    public String getDescription() {
        return description;
    }

    public String getCatalog3Id() {
        return catalog3Id;
    }

    public List<SpuImage> getSpuImageList() {
        return spuImageList;
    }

    public List<SpuSaleAttr> getSpuSaleAttrList() {
        return spuSaleAttrList;
    }
}
