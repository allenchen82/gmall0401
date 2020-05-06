package com.atguigu.gmall0401.bean;

import com.atguigu.gmall0401.enums.OrderStatus;
import com.atguigu.gmall0401.enums.PaymentWay;
import com.atguigu.gmall0401.enums.ProcessStatus;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
public class OrderInfo implements Serializable {
    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column
    private String consignee;

    @Column
    private String consigneeTel;

    public void setId(String id) {
        this.id = id;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }

    public void setConsigneeTel(String consigneeTel) {
        this.consigneeTel = consigneeTel;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public void setProcessStatus(ProcessStatus processStatus) {
        this.processStatus = processStatus;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setPaymentWay(PaymentWay paymentWay) {
        this.paymentWay = paymentWay;
    }

    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public void setOrderComment(String orderComment) {
        this.orderComment = orderComment;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void setParentOrderId(String parentOrderId) {
        this.parentOrderId = parentOrderId;
    }

    public void setTrackingNo(String trackingNo) {
        this.trackingNo = trackingNo;
    }

    public void setOrderDetailList(List<OrderDetail> orderDetailList) {
        this.orderDetailList = orderDetailList;
    }

    public void setOrderSubList(List<OrderInfo> orderSubList) {
        this.orderSubList = orderSubList;
    }

    public void setWareId(String wareId) {
        this.wareId = wareId;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    @Column
    private BigDecimal totalAmount;

    @Column
    private OrderStatus orderStatus;

    @Column
    private ProcessStatus processStatus;


    @Column
    private String userId;

    @Column
    private PaymentWay paymentWay;

    @Column
    private Date expireTime;

    @Column
    private String deliveryAddress;

    @Column
    private String orderComment;

    @Column
    private Date createTime;

    @Column
    private String parentOrderId;

    @Column
    private String trackingNo;


    @Transient
    private List<OrderDetail> orderDetailList;

    private List<OrderInfo> orderSubList;
    @Transient
    private String wareId;

    @Column
    private String outTradeNo;

    public void sumTotalAmount(){
        BigDecimal totalAmount=new BigDecimal("0");
        for (OrderDetail orderDetail : orderDetailList) {
            totalAmount= totalAmount.add(orderDetail.getOrderPrice().multiply(new BigDecimal(orderDetail.getSkuNum())));
        }
        this.totalAmount=  totalAmount;
    }


    public String genSubject(){
        if(orderDetailList.size()>0) {
            OrderDetail orderDetail = orderDetailList.get(0);
             return orderDetail.getSkuName()+"等"+orderDetailList.size()+"件商品";
        }
        return null;
    }
}
