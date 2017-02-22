package com.fr.chain.trade.db.entity;

import com.fr.chain.utils.CustomDateSerializer;
import com.fr.chain.web.bean.Tab;
import java.math.BigDecimal;
import java.util.Date;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@Tab(name="TRADE_ORDER")
public class TradeOrder extends TradeOrderKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRADE_ORDER.MERCHANT_ID
     *
     * @mbggenerated Wed Feb 22 18:19:32 CST 2017
     */
    private String merchantId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRADE_ORDER.APP_ID
     *
     * @mbggenerated Wed Feb 22 18:19:32 CST 2017
     */
    private String appId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRADE_ORDER.OPEN_ID
     *
     * @mbggenerated Wed Feb 22 18:19:32 CST 2017
     */
    private String openId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRADE_ORDER.FROM_OPEN_ID
     *
     * @mbggenerated Wed Feb 22 18:19:32 CST 2017
     */
    private String fromOpenId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRADE_ORDER.TO_OPEN_ID
     *
     * @mbggenerated Wed Feb 22 18:19:32 CST 2017
     */
    private String toOpenId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRADE_ORDER.ORIGIN_OPENID
     *
     * @mbggenerated Wed Feb 22 18:19:32 CST 2017
     */
    private String originOpenid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRADE_ORDER.PRODUCT_ID
     *
     * @mbggenerated Wed Feb 22 18:19:32 CST 2017
     */
    private String productId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRADE_ORDER.PROPERTY_TYPE
     *
     * @mbggenerated Wed Feb 22 18:19:32 CST 2017
     */
    private String propertyType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRADE_ORDER.IS_SELF_SUPPORT
     *
     * @mbggenerated Wed Feb 22 18:19:32 CST 2017
     */
    private String isSelfSupport;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRADE_ORDER.PRODUCT_DESC
     *
     * @mbggenerated Wed Feb 22 18:19:32 CST 2017
     */
    private String productDesc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRADE_ORDER.IS_DIGIT
     *
     * @mbggenerated Wed Feb 22 18:19:32 CST 2017
     */
    private String isDigit;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRADE_ORDER.SIGNTYPE
     *
     * @mbggenerated Wed Feb 22 18:19:32 CST 2017
     */
    private String signtype;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRADE_ORDER.PROPERTY_NAME
     *
     * @mbggenerated Wed Feb 22 18:19:32 CST 2017
     */
    private String propertyName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRADE_ORDER.UNIT
     *
     * @mbggenerated Wed Feb 22 18:19:32 CST 2017
     */
    private String unit;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRADE_ORDER.MINCOUNT
     *
     * @mbggenerated Wed Feb 22 18:19:32 CST 2017
     */
    private String mincount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRADE_ORDER.COUNT
     *
     * @mbggenerated Wed Feb 22 18:19:32 CST 2017
     */
    private String count;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRADE_ORDER.URL
     *
     * @mbggenerated Wed Feb 22 18:19:32 CST 2017
     */
    private String url;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRADE_ORDER.AMOUNT
     *
     * @mbggenerated Wed Feb 22 18:19:32 CST 2017
     */
    private BigDecimal amount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRADE_ORDER.DESCRIPTION
     *
     * @mbggenerated Wed Feb 22 18:19:32 CST 2017
     */
    private String description;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRADE_ORDER.ADDRESS
     *
     * @mbggenerated Wed Feb 22 18:19:32 CST 2017
     */
    private String address;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRADE_ORDER.UPDATE_TIME
     *
     * @mbggenerated Wed Feb 22 18:19:32 CST 2017
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRADE_ORDER.CREATE_TIME
     *
     * @mbggenerated Wed Feb 22 18:19:32 CST 2017
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRADE_ORDER.TRADE_TYPE
     *
     * @mbggenerated Wed Feb 22 18:19:32 CST 2017
     */
    private Integer tradeType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRADE_ORDER.STATUS
     *
     * @mbggenerated Wed Feb 22 18:19:32 CST 2017
     */
    private Integer status;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRADE_ORDER.MERCHANT_ID
     *
     * @return the value of TRADE_ORDER.MERCHANT_ID
     *
     * @mbggenerated Wed Feb 22 18:19:32 CST 2017
     */
    public String getMerchantId() {
        return merchantId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRADE_ORDER.MERCHANT_ID
     *
     * @param merchantId the value for TRADE_ORDER.MERCHANT_ID
     *
     * @mbggenerated Wed Feb 22 18:19:32 CST 2017
     */
    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRADE_ORDER.APP_ID
     *
     * @return the value of TRADE_ORDER.APP_ID
     *
     * @mbggenerated Wed Feb 22 18:19:32 CST 2017
     */
    public String getAppId() {
        return appId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRADE_ORDER.APP_ID
     *
     * @param appId the value for TRADE_ORDER.APP_ID
     *
     * @mbggenerated Wed Feb 22 18:19:32 CST 2017
     */
    public void setAppId(String appId) {
        this.appId = appId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRADE_ORDER.OPEN_ID
     *
     * @return the value of TRADE_ORDER.OPEN_ID
     *
     * @mbggenerated Wed Feb 22 18:19:32 CST 2017
     */
    public String getOpenId() {
        return openId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRADE_ORDER.OPEN_ID
     *
     * @param openId the value for TRADE_ORDER.OPEN_ID
     *
     * @mbggenerated Wed Feb 22 18:19:32 CST 2017
     */
    public void setOpenId(String openId) {
        this.openId = openId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRADE_ORDER.FROM_OPEN_ID
     *
     * @return the value of TRADE_ORDER.FROM_OPEN_ID
     *
     * @mbggenerated Wed Feb 22 18:19:32 CST 2017
     */
    public String getFromOpenId() {
        return fromOpenId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRADE_ORDER.FROM_OPEN_ID
     *
     * @param fromOpenId the value for TRADE_ORDER.FROM_OPEN_ID
     *
     * @mbggenerated Wed Feb 22 18:19:32 CST 2017
     */
    public void setFromOpenId(String fromOpenId) {
        this.fromOpenId = fromOpenId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRADE_ORDER.TO_OPEN_ID
     *
     * @return the value of TRADE_ORDER.TO_OPEN_ID
     *
     * @mbggenerated Wed Feb 22 18:19:32 CST 2017
     */
    public String getToOpenId() {
        return toOpenId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRADE_ORDER.TO_OPEN_ID
     *
     * @param toOpenId the value for TRADE_ORDER.TO_OPEN_ID
     *
     * @mbggenerated Wed Feb 22 18:19:32 CST 2017
     */
    public void setToOpenId(String toOpenId) {
        this.toOpenId = toOpenId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRADE_ORDER.ORIGIN_OPENID
     *
     * @return the value of TRADE_ORDER.ORIGIN_OPENID
     *
     * @mbggenerated Wed Feb 22 18:19:32 CST 2017
     */
    public String getOriginOpenid() {
        return originOpenid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRADE_ORDER.ORIGIN_OPENID
     *
     * @param originOpenid the value for TRADE_ORDER.ORIGIN_OPENID
     *
     * @mbggenerated Wed Feb 22 18:19:32 CST 2017
     */
    public void setOriginOpenid(String originOpenid) {
        this.originOpenid = originOpenid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRADE_ORDER.PRODUCT_ID
     *
     * @return the value of TRADE_ORDER.PRODUCT_ID
     *
     * @mbggenerated Wed Feb 22 18:19:32 CST 2017
     */
    public String getProductId() {
        return productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRADE_ORDER.PRODUCT_ID
     *
     * @param productId the value for TRADE_ORDER.PRODUCT_ID
     *
     * @mbggenerated Wed Feb 22 18:19:32 CST 2017
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRADE_ORDER.PROPERTY_TYPE
     *
     * @return the value of TRADE_ORDER.PROPERTY_TYPE
     *
     * @mbggenerated Wed Feb 22 18:19:32 CST 2017
     */
    public String getPropertyType() {
        return propertyType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRADE_ORDER.PROPERTY_TYPE
     *
     * @param propertyType the value for TRADE_ORDER.PROPERTY_TYPE
     *
     * @mbggenerated Wed Feb 22 18:19:32 CST 2017
     */
    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRADE_ORDER.IS_SELF_SUPPORT
     *
     * @return the value of TRADE_ORDER.IS_SELF_SUPPORT
     *
     * @mbggenerated Wed Feb 22 18:19:32 CST 2017
     */
    public String getIsSelfSupport() {
        return isSelfSupport;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRADE_ORDER.IS_SELF_SUPPORT
     *
     * @param isSelfSupport the value for TRADE_ORDER.IS_SELF_SUPPORT
     *
     * @mbggenerated Wed Feb 22 18:19:32 CST 2017
     */
    public void setIsSelfSupport(String isSelfSupport) {
        this.isSelfSupport = isSelfSupport;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRADE_ORDER.PRODUCT_DESC
     *
     * @return the value of TRADE_ORDER.PRODUCT_DESC
     *
     * @mbggenerated Wed Feb 22 18:19:32 CST 2017
     */
    public String getProductDesc() {
        return productDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRADE_ORDER.PRODUCT_DESC
     *
     * @param productDesc the value for TRADE_ORDER.PRODUCT_DESC
     *
     * @mbggenerated Wed Feb 22 18:19:32 CST 2017
     */
    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRADE_ORDER.IS_DIGIT
     *
     * @return the value of TRADE_ORDER.IS_DIGIT
     *
     * @mbggenerated Wed Feb 22 18:19:32 CST 2017
     */
    public String getIsDigit() {
        return isDigit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRADE_ORDER.IS_DIGIT
     *
     * @param isDigit the value for TRADE_ORDER.IS_DIGIT
     *
     * @mbggenerated Wed Feb 22 18:19:32 CST 2017
     */
    public void setIsDigit(String isDigit) {
        this.isDigit = isDigit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRADE_ORDER.SIGNTYPE
     *
     * @return the value of TRADE_ORDER.SIGNTYPE
     *
     * @mbggenerated Wed Feb 22 18:19:32 CST 2017
     */
    public String getSigntype() {
        return signtype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRADE_ORDER.SIGNTYPE
     *
     * @param signtype the value for TRADE_ORDER.SIGNTYPE
     *
     * @mbggenerated Wed Feb 22 18:19:32 CST 2017
     */
    public void setSigntype(String signtype) {
        this.signtype = signtype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRADE_ORDER.PROPERTY_NAME
     *
     * @return the value of TRADE_ORDER.PROPERTY_NAME
     *
     * @mbggenerated Wed Feb 22 18:19:32 CST 2017
     */
    public String getPropertyName() {
        return propertyName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRADE_ORDER.PROPERTY_NAME
     *
     * @param propertyName the value for TRADE_ORDER.PROPERTY_NAME
     *
     * @mbggenerated Wed Feb 22 18:19:32 CST 2017
     */
    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRADE_ORDER.UNIT
     *
     * @return the value of TRADE_ORDER.UNIT
     *
     * @mbggenerated Wed Feb 22 18:19:32 CST 2017
     */
    public String getUnit() {
        return unit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRADE_ORDER.UNIT
     *
     * @param unit the value for TRADE_ORDER.UNIT
     *
     * @mbggenerated Wed Feb 22 18:19:32 CST 2017
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRADE_ORDER.MINCOUNT
     *
     * @return the value of TRADE_ORDER.MINCOUNT
     *
     * @mbggenerated Wed Feb 22 18:19:32 CST 2017
     */
    public String getMincount() {
        return mincount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRADE_ORDER.MINCOUNT
     *
     * @param mincount the value for TRADE_ORDER.MINCOUNT
     *
     * @mbggenerated Wed Feb 22 18:19:32 CST 2017
     */
    public void setMincount(String mincount) {
        this.mincount = mincount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRADE_ORDER.COUNT
     *
     * @return the value of TRADE_ORDER.COUNT
     *
     * @mbggenerated Wed Feb 22 18:19:32 CST 2017
     */
    public String getCount() {
        return count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRADE_ORDER.COUNT
     *
     * @param count the value for TRADE_ORDER.COUNT
     *
     * @mbggenerated Wed Feb 22 18:19:32 CST 2017
     */
    public void setCount(String count) {
        this.count = count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRADE_ORDER.URL
     *
     * @return the value of TRADE_ORDER.URL
     *
     * @mbggenerated Wed Feb 22 18:19:32 CST 2017
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRADE_ORDER.URL
     *
     * @param url the value for TRADE_ORDER.URL
     *
     * @mbggenerated Wed Feb 22 18:19:32 CST 2017
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRADE_ORDER.AMOUNT
     *
     * @return the value of TRADE_ORDER.AMOUNT
     *
     * @mbggenerated Wed Feb 22 18:19:32 CST 2017
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRADE_ORDER.AMOUNT
     *
     * @param amount the value for TRADE_ORDER.AMOUNT
     *
     * @mbggenerated Wed Feb 22 18:19:32 CST 2017
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRADE_ORDER.DESCRIPTION
     *
     * @return the value of TRADE_ORDER.DESCRIPTION
     *
     * @mbggenerated Wed Feb 22 18:19:32 CST 2017
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRADE_ORDER.DESCRIPTION
     *
     * @param description the value for TRADE_ORDER.DESCRIPTION
     *
     * @mbggenerated Wed Feb 22 18:19:32 CST 2017
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRADE_ORDER.ADDRESS
     *
     * @return the value of TRADE_ORDER.ADDRESS
     *
     * @mbggenerated Wed Feb 22 18:19:32 CST 2017
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRADE_ORDER.ADDRESS
     *
     * @param address the value for TRADE_ORDER.ADDRESS
     *
     * @mbggenerated Wed Feb 22 18:19:32 CST 2017
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRADE_ORDER.UPDATE_TIME
     *
     * @return the value of TRADE_ORDER.UPDATE_TIME
     *
     * @mbggenerated Wed Feb 22 18:19:32 CST 2017
     */
    @JsonSerialize(using = CustomDateSerializer.class)
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRADE_ORDER.UPDATE_TIME
     *
     * @param updateTime the value for TRADE_ORDER.UPDATE_TIME
     *
     * @mbggenerated Wed Feb 22 18:19:32 CST 2017
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRADE_ORDER.CREATE_TIME
     *
     * @return the value of TRADE_ORDER.CREATE_TIME
     *
     * @mbggenerated Wed Feb 22 18:19:32 CST 2017
     */
    @JsonSerialize(using = CustomDateSerializer.class)
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRADE_ORDER.CREATE_TIME
     *
     * @param createTime the value for TRADE_ORDER.CREATE_TIME
     *
     * @mbggenerated Wed Feb 22 18:19:32 CST 2017
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRADE_ORDER.TRADE_TYPE
     *
     * @return the value of TRADE_ORDER.TRADE_TYPE
     *
     * @mbggenerated Wed Feb 22 18:19:32 CST 2017
     */
    public Integer getTradeType() {
        return tradeType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRADE_ORDER.TRADE_TYPE
     *
     * @param tradeType the value for TRADE_ORDER.TRADE_TYPE
     *
     * @mbggenerated Wed Feb 22 18:19:32 CST 2017
     */
    public void setTradeType(Integer tradeType) {
        this.tradeType = tradeType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRADE_ORDER.STATUS
     *
     * @return the value of TRADE_ORDER.STATUS
     *
     * @mbggenerated Wed Feb 22 18:19:32 CST 2017
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRADE_ORDER.STATUS
     *
     * @param status the value for TRADE_ORDER.STATUS
     *
     * @mbggenerated Wed Feb 22 18:19:32 CST 2017
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TRADE_ORDER
     *
     * @mbggenerated Wed Feb 22 18:19:32 CST 2017
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        TradeOrder other = (TradeOrder) that;
        return (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getMerchantId() == null ? other.getMerchantId() == null : this.getMerchantId().equals(other.getMerchantId()))
            && (this.getAppId() == null ? other.getAppId() == null : this.getAppId().equals(other.getAppId()))
            && (this.getOpenId() == null ? other.getOpenId() == null : this.getOpenId().equals(other.getOpenId()))
            && (this.getFromOpenId() == null ? other.getFromOpenId() == null : this.getFromOpenId().equals(other.getFromOpenId()))
            && (this.getToOpenId() == null ? other.getToOpenId() == null : this.getToOpenId().equals(other.getToOpenId()))
            && (this.getOriginOpenid() == null ? other.getOriginOpenid() == null : this.getOriginOpenid().equals(other.getOriginOpenid()))
            && (this.getProductId() == null ? other.getProductId() == null : this.getProductId().equals(other.getProductId()))
            && (this.getPropertyType() == null ? other.getPropertyType() == null : this.getPropertyType().equals(other.getPropertyType()))
            && (this.getIsSelfSupport() == null ? other.getIsSelfSupport() == null : this.getIsSelfSupport().equals(other.getIsSelfSupport()))
            && (this.getProductDesc() == null ? other.getProductDesc() == null : this.getProductDesc().equals(other.getProductDesc()))
            && (this.getIsDigit() == null ? other.getIsDigit() == null : this.getIsDigit().equals(other.getIsDigit()))
            && (this.getSigntype() == null ? other.getSigntype() == null : this.getSigntype().equals(other.getSigntype()))
            && (this.getPropertyName() == null ? other.getPropertyName() == null : this.getPropertyName().equals(other.getPropertyName()))
            && (this.getUnit() == null ? other.getUnit() == null : this.getUnit().equals(other.getUnit()))
            && (this.getMincount() == null ? other.getMincount() == null : this.getMincount().equals(other.getMincount()))
            && (this.getCount() == null ? other.getCount() == null : this.getCount().equals(other.getCount()))
            && (this.getUrl() == null ? other.getUrl() == null : this.getUrl().equals(other.getUrl()))
            && (this.getAmount() == null ? other.getAmount() == null : this.getAmount().equals(other.getAmount()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getTradeType() == null ? other.getTradeType() == null : this.getTradeType().equals(other.getTradeType()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TRADE_ORDER
     *
     * @mbggenerated Wed Feb 22 18:19:32 CST 2017
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getMerchantId() == null) ? 0 : getMerchantId().hashCode());
        result = prime * result + ((getAppId() == null) ? 0 : getAppId().hashCode());
        result = prime * result + ((getOpenId() == null) ? 0 : getOpenId().hashCode());
        result = prime * result + ((getFromOpenId() == null) ? 0 : getFromOpenId().hashCode());
        result = prime * result + ((getToOpenId() == null) ? 0 : getToOpenId().hashCode());
        result = prime * result + ((getOriginOpenid() == null) ? 0 : getOriginOpenid().hashCode());
        result = prime * result + ((getProductId() == null) ? 0 : getProductId().hashCode());
        result = prime * result + ((getPropertyType() == null) ? 0 : getPropertyType().hashCode());
        result = prime * result + ((getIsSelfSupport() == null) ? 0 : getIsSelfSupport().hashCode());
        result = prime * result + ((getProductDesc() == null) ? 0 : getProductDesc().hashCode());
        result = prime * result + ((getIsDigit() == null) ? 0 : getIsDigit().hashCode());
        result = prime * result + ((getSigntype() == null) ? 0 : getSigntype().hashCode());
        result = prime * result + ((getPropertyName() == null) ? 0 : getPropertyName().hashCode());
        result = prime * result + ((getUnit() == null) ? 0 : getUnit().hashCode());
        result = prime * result + ((getMincount() == null) ? 0 : getMincount().hashCode());
        result = prime * result + ((getCount() == null) ? 0 : getCount().hashCode());
        result = prime * result + ((getUrl() == null) ? 0 : getUrl().hashCode());
        result = prime * result + ((getAmount() == null) ? 0 : getAmount().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getTradeType() == null) ? 0 : getTradeType().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TRADE_ORDER
     *
     * @mbggenerated Wed Feb 22 18:19:32 CST 2017
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", merchantId=").append(merchantId);
        sb.append(", appId=").append(appId);
        sb.append(", openId=").append(openId);
        sb.append(", fromOpenId=").append(fromOpenId);
        sb.append(", toOpenId=").append(toOpenId);
        sb.append(", originOpenid=").append(originOpenid);
        sb.append(", productId=").append(productId);
        sb.append(", propertyType=").append(propertyType);
        sb.append(", isSelfSupport=").append(isSelfSupport);
        sb.append(", productDesc=").append(productDesc);
        sb.append(", isDigit=").append(isDigit);
        sb.append(", signtype=").append(signtype);
        sb.append(", propertyName=").append(propertyName);
        sb.append(", unit=").append(unit);
        sb.append(", mincount=").append(mincount);
        sb.append(", count=").append(count);
        sb.append(", url=").append(url);
        sb.append(", amount=").append(amount);
        sb.append(", description=").append(description);
        sb.append(", address=").append(address);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", tradeType=").append(tradeType);
        sb.append(", status=").append(status);
        sb.append("]");
        return sb.toString();
    }
}