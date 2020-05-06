package com.atguigu.gmall0401.bean;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;
@Data
@NoArgsConstructor
public class SkuLsResult implements Serializable {

    List<SkuLsInfo> skuLsInfoList;

    long total;

    public void setSkuLsInfoList(List<SkuLsInfo> skuLsInfoList) {
        this.skuLsInfoList = skuLsInfoList;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public void setTotalPages(long totalPages) {
        this.totalPages = totalPages;
    }

    public void setAttrValueIdList(List<String> attrValueIdList) {
        this.attrValueIdList = attrValueIdList;
    }

    public List<SkuLsInfo> getSkuLsInfoList() {
        return skuLsInfoList;
    }

    public long getTotal() {
        return total;
    }

    public long getTotalPages() {
        return totalPages;
    }

    public List<String> getAttrValueIdList() {
        return attrValueIdList;
    }

    long totalPages;

    List<String> attrValueIdList;
}
