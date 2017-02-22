package com.fr.chain.trade.db.entity;

import com.fr.chain.utils.CustomDateSerializer;
import com.fr.chain.web.bean.Tab;
import java.math.BigDecimal;
import java.util.Date;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@Tab(name="TRADE_FLOW")
public class TradeFlow extends TradeFlowKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRADE_FLOW.ORDER_ID
     *
     * @mbggenerated Wed Feb 22 15:15:57 CST 2017
     */
    private String orderId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRADE_FLOW.MERCHANT_ID
     *
     * @mbggenerated Wed Feb 22 15:15:57 CST 2017
     */
    private String merchantId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRADE_FLOW.APP_ID
     *
     * @mbggenerated Wed Feb 22 15:15:57 CST 2017
     */
    private String appId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRADE_FLOW.OPEN_ID
     *
     * @mbggenerated Wed Feb 22 15:15:57 CST 2017
     */
    private String openId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRADE_FLOW.TALLY_TAG
     *
     * @mbggenerated Wed Feb 22 15:15:57 CST 2017
     */
    private Integer tallyTag;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRADE_FLOW.ORIGIN_OPENID
     *
     * @mbggenerated Wed Feb 22 15:15:57 CST 2017
     */
    private String originOpenid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRADE_FLOW.PRODUCT_ID
     *
     * @mbggenerated Wed Feb 22 15:15:57 CST 2017
     */
    private String productId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRADE_FLOW.PROPERTY_TYPE
     *
     * @mbggenerated Wed Feb 22 15:15:57 CST 2017
     */
    private String propertyType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRADE_FLOW.IS_SELF_SUPPORT
     *
     * @mbggenerated Wed Feb 22 15:15:57 CST 2017
     */
    private String isSelfSupport;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRADE_FLOW.PRODUCT_DESC
     *
     * @mbggenerated Wed Feb 22 15:15:57 CST 2017
     */
    private String productDesc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRADE_FLOW.IS_DIGIT
     *
     * @mbggenerated Wed Feb 22 15:15:57 CST 2017
     */
    private String isDigit;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRADE_FLOW.SIGNTYPE
     *
     * @mbggenerated Wed Feb 22 15:15:57 CST 2017
     */
    private String signtype;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRADE_FLOW.PROPERTY_NAME
     *
     * @mbggenerated Wed Feb 22 15:15:57 CST 2017
     */
    private String propertyName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRADE_FLOW.UNIT
     *
     * @mbggenerated Wed Feb 22 15:15:57 CST 2017
     */
    private String unit;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRADE_FLOW.MINCOUNT
     *
     * @mbggenerated Wed Feb 22 15:15:57 CST 2017
     */
    private String mincount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRADE_FLOW.COUNT
     *
     * @mbggenerated Wed Feb 22 15:15:57 CST 2017
     */
    private String count;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRADE_FLOW.URL
     *
     * @mbggenerated Wed Feb 22 15:15:57 CST 2017
     */
    private String url;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRADE_FLOW.AMOUNT
     *
     * @mbggenerated Wed Feb 22 15:15:57 CST 2017
     */
    private BigDecimal amount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRADE_FLOW.DESCRIPTION
     *
     * @mbggenerated Wed Feb 22 15:15:57 CST 2017
     */
    private String description;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRADE_FLOW.ADDRESS
     *
     * @mbggenerated Wed Feb 22 15:15:57 CST 2017
     */
    private String address;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRADE_FLOW.TRADE_TYPE
     *
     * @mbggenerated Wed Feb 22 15:15:57 CST 2017
     */
    private Integer tradeType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRADE_FLOW.CREATE_TIME
     *
     * @mbggenerated Wed Feb 22 15:15:57 CST 2017
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRADE_FLOW.UPDATE_TIME
     *
     * @mbggenerated Wed Feb 22 15:15:57 CST 2017
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRADE_FLOW.ORDER_ID
     *
     * @return the value of TRADE_FLOW.ORDER_ID
     *
     * @mbggenerated Wed Feb 22 15:15:57 CST 2017
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRADE_FLOW.ORDER_ID
     *
     * @param orderId the value for TRADE_FLOW.ORDER_ID
     *
     * @mbggenerated Wed Feb 22 15:15:57 CST 2017
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRADE_FLOW.MERCHANT_ID
     *
     * @return the value of TRADE_FLOW.MERCHANT_ID
     *
     * @mbggenerated Wed Feb 22 15:15:57 CST 2017
     */
    public String getMerchantId() {
        return merchantId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRADE_FLOW.MERCHANT_ID
     *
     * @param merchantId the value for TRADE_FLOW.MERCHANT_ID
     *
     * @mbggenerated Wed Feb 22 15:15:57 CST 2017
     */
    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRADE_FLOW.APP_ID
     *
     * @return the value of TRADE_FLOW.APP_ID
     *
     * @mbggenerated Wed Feb 22 15:15:57 CST 2017
     */
    public String getAppId() {
        return appId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRADE_FLOW.APP_ID
     *
     * @param appId the value for TRADE_FLOW.APP_ID
     *
     * @mbggenerated Wed Feb 22 15:15:57 CST 2017
     */
    public void setAppId(String appId) {
        this.appId = appId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRADE_FLOW.OPEN_ID
     *
     * @return the value of TRADE_FLOW.OPEN_ID
     *
     * @mbggenerated Wed Feb 22 15:15:57 CST 2017
     */
    public String getOpenId() {
        return openId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRADE_FLOW.OPEN_ID
     *
     * @param openId the value for TRADE_FLOW.OPEN_ID
     *
     * @mbggenerated Wed Feb 22 15:15:57 CST 2017
     */
    public void setOpenId(String openId) {
        this.openId = openId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRADE_FLOW.TALLY_TAG
     *
     * @return the value of TRADE_FLOW.TALLY_TAG
     *
     * @mbggenerated Wed Feb 22 15:15:57 CST 2017
     */
    public Integer getTallyTag() {
        return tallyTag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRADE_FLOW.TALLY_TAG
     *
     * @param tallyTag the value for TRADE_FLOW.TALLY_TAG
     *
     * @mbggenerated Wed Feb 22 15:15:57 CST 2017
     */
    public void setTallyTag(Integer tallyTag) {
        this.tallyTag = tallyTag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRADE_FLOW.ORIGIN_OPENID
     *
     * @return the value of TRADE_FLOW.ORIGIN_OPENID
     *
     * @mbggenerated Wed Feb 22 15:15:57 CST 2017
     */
    public String getOriginOpenid() {
        return originOpenid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRADE_FLOW.ORIGIN_OPENID
     *
     * @param originOpenid the value for TRADE_FLOW.ORIGIN_OPENID
     *
     * @mbggenerated Wed Feb 22 15:15:57 CST 2017
     */
    public void setOriginOpenid(String originOpenid) {
        this.originOpenid = originOpenid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRADE_FLOW.PRODUCT_ID
     *
     * @return the value of TRADE_FLOW.PRODUCT_ID
     *
     * @mbggenerated Wed Feb 22 15:15:57 CST 2017
     */
    public String getProductId() {
        return productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRADE_FLOW.PRODUCT_ID
     *
     * @param productId the value for TRADE_FLOW.PRODUCT_ID
     *
     * @mbggenerated Wed Feb 22 15:15:57 CST 2017
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRADE_FLOW.PROPERTY_TYPE
     *
     * @return the value of TRADE_FLOW.PROPERTY_TYPE
     *
     * @mbggenerated Wed Feb 22 15:15:57 CST 2017
     */
    public String getPropertyType() {
        return propertyType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRADE_FLOW.PROPERTY_TYPE
     *
     * @param propertyType the value for TRADE_FLOW.PROPERTY_TYPE
     *
     * @mbggenerated Wed Feb 22 15:15:57 CST 2017
     */
    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRADE_FLOW.IS_SELF_SUPPORT
     *
     * @return the value of TRADE_FLOW.IS_SELF_SUPPORT
     *
     * @mbggenerated Wed Feb 22 15:15:57 CST 2017
     */
    public String getIsSelfSupport() {
        return isSelfSupport;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRADE_FLOW.IS_SELF_SUPPORT
     *
     * @param isSelfSupport the value for TRADE_FLOW.IS_SELF_SUPPORT
     *
     * @mbggenerated Wed Feb 22 15:15:57 CST 2017
     */
    public void setIsSelfSupport(String isSelfSupport) {
        this.isSelfSupport = isSelfSupport;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRADE_FLOW.PRODUCT_DESC
     *
     * @return the value of TRADE_FLOW.PRODUCT_DESC
     *
     * @mbggenerated Wed Feb 22 15:15:57 CST 2017
     */
    public String getProductDesc() {
        return productDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRADE_FLOW.PRODUCT_DESC
     *
     * @param productDesc the value for TRADE_FLOW.PRODUCT_DESC
     *
     * @mbggenerated Wed Feb 22 15:15:57 CST 2017
     */
    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRADE_FLOW.IS_DIGIT
     *
     * @return the value of TRADE_FLOW.IS_DIGIT
     *
     * @mbggenerated Wed Feb 22 15:15:57 CST 2017
     */
    public String getIsDigit() {
        return isDigit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRADE_FLOW.IS_DIGIT
     *
     * @param isDigit the value for TRADE_FLOW.IS_DIGIT
     *
     * @mbggenerated Wed Feb 22 15:15:57 CST 2017
     */
    public void setIsDigit(String isDigit) {
        this.isDigit = isDigit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRADE_FLOW.SIGNTYPE
     *
     * @return the value of TRADE_FLOW.SIGNTYPE
     *
     * @mbggenerated Wed Feb 22 15:15:57 CST 2017
     */
    public String getSigntype() {
        return signtype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRADE_FLOW.SIGNTYPE
     *
     * @param signtype the value for TRADE_FLOW.SIGNTYPE
     *
     * @mbggenerated Wed Feb 22 15:15:57 CST 2017
     */
    public void setSigntype(String signtype) {
        this.signtype = signtype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRADE_FLOW.PROPERTY_NAME
     *
     * @return the value of TRADE_FLOW.PROPERTY_NAME
     *
     * @mbggenerated Wed Feb 22 15:15:57 CST 2017
     */
    public String getPropertyName() {
        return propertyName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRADE_FLOW.PROPERTY_NAME
     *
     * @param propertyName the value for TRADE_FLOW.PROPERTY_NAME
     *
     * @mbggenerated Wed Feb 22 15:15:57 CST 2017
     */
    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRADE_FLOW.UNIT
     *
     * @return the value of TRADE_FLOW.UNIT
     *
     * @mbggenerated Wed Feb 22 15:15:57 CST 2017
     */
    public String getUnit() {
        return unit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRADE_FLOW.UNIT
     *
     * @param unit the value for TRADE_FLOW.UNIT
     *
     * @mbggenerated Wed Feb 22 15:15:57 CST 2017
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRADE_FLOW.MINCOUNT
     *
     * @return the value of TRADE_FLOW.MINCOUNT
     *
     * @mbggenerated Wed Feb 22 15:15:57 CST 2017
     */
    public String getMincount() {
        return mincount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRADE_FLOW.MINCOUNT
     *
     * @param mincount the value for TRADE_FLOW.MINCOUNT
     *
     * @mbggenerated Wed Feb 22 15:15:57 CST 2017
     */
    public void setMincount(String mincount) {
        this.mincount = mincount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRADE_FLOW.COUNT
     *
     * @return the value of TRADE_FLOW.COUNT
     *
     * @mbggenerated Wed Feb 22 15:15:57 CST 2017
     */
    public String getCount() {
        return count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRADE_FLOW.COUNT
     *
     * @param count the value for TRADE_FLOW.COUNT
     *
     * @mbggenerated Wed Feb 22 15:15:57 CST 2017
     */
    public void setCount(String count) {
        this.count = count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRADE_FLOW.URL
     *
     * @return the value of TRADE_FLOW.URL
     *
     * @mbggenerated Wed Feb 22 15:15:57 CST 2017
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRADE_FLOW.URL
     *
     * @param url the value for TRADE_FLOW.URL
     *
     * @mbggenerated Wed Feb 22 15:15:57 CST 2017
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRADE_FLOW.AMOUNT
     *
     * @return the value of TRADE_FLOW.AMOUNT
     *
     * @mbggenerated Wed Feb 22 15:15:57 CST 2017
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRADE_FLOW.AMOUNT
     *
     * @param amount the value for TRADE_FLOW.AMOUNT
     *
     * @mbggenerated Wed Feb 22 15:15:57 CST 2017
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRADE_FLOW.DESCRIPTION
     *
     * @return the value of TRADE_FLOW.DESCRIPTION
     *
     * @mbggenerated Wed Feb 22 15:15:57 CST 2017
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRADE_FLOW.DESCRIPTION
     *
     * @param description the value for TRADE_FLOW.DESCRIPTION
     *
     * @mbggenerated Wed Feb 22 15:15:57 CST 2017
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRADE_FLOW.ADDRESS
     *
     * @return the value of TRADE_FLOW.ADDRESS
     *
     * @mbggenerated Wed Feb 22 15:15:57 CST 2017
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRADE_FLOW.ADDRESS
     *
     * @param address the value for TRADE_FLOW.ADDRESS
     *
     * @mbggenerated Wed Feb 22 15:15:57 CST 2017
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRADE_FLOW.TRADE_TYPE
     *
     * @return the value of TRADE_FLOW.TRADE_TYPE
     *
     * @mbggenerated Wed Feb 22 15:15:57 CST 2017
     */
    public Integer getTradeType() {
        return tradeType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRADE_FLOW.TRADE_TYPE
     *
     * @param tradeType the value for TRADE_FLOW.TRADE_TYPE
     *
     * @mbggenerated Wed Feb 22 15:15:57 CST 2017
     */
    public void setTradeType(Integer tradeType) {
        this.tradeType = tradeType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRADE_FLOW.CREATE_TIME
     *
     * @return the value of TRADE_FLOW.CREATE_TIME
     *
     * @mbggenerated Wed Feb 22 15:15:57 CST 2017
     */
    @JsonSerialize(using = CustomDateSerializer.class)
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRADE_FLOW.CREATE_TIME
     *
     * @param createTime the value for TRADE_FLOW.CREATE_TIME
     *
     * @mbggenerated Wed Feb 22 15:15:57 CST 2017
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRADE_FLOW.UPDATE_TIME
     *
     * @return the value of TRADE_FLOW.UPDATE_TIME
     *
     * @mbggenerated Wed Feb 22 15:15:57 CST 2017
     */
    @JsonSerialize(using = CustomDateSerializer.class)
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRADE_FLOW.UPDATE_TIME
     *
     * @param updateTime the value for TRADE_FLOW.UPDATE_TIME
     *
     * @mbggenerated Wed Feb 22 15:15:57 CST 2017
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TRADE_FLOW
     *
     * @mbggenerated Wed Feb 22 15:15:57 CST 2017
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
        TradeFlow other = (TradeFlow) that;
        return (this.getFlowId() == null ? other.getFlowId() == null : this.getFlowId().equals(other.getFlowId()))
            && (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getMerchantId() == null ? other.getMerchantId() == null : this.getMerchantId().equals(other.getMerchantId()))
            && (this.getAppId() == null ? other.getAppId() == null : this.getAppId().equals(other.getAppId()))
            && (this.getOpenId() == null ? other.getOpenId() == null : this.getOpenId().equals(other.getOpenId()))
            && (this.getTallyTag() == null ? other.getTallyTag() == null : this.getTallyTag().equals(other.getTallyTag()))
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
            && (this.getTradeType() == null ? other.getTradeType() == null : this.getTradeType().equals(other.getTradeType()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TRADE_FLOW
     *
     * @mbggenerated Wed Feb 22 15:15:57 CST 2017
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getFlowId() == null) ? 0 : getFlowId().hashCode());
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getMerchantId() == null) ? 0 : getMerchantId().hashCode());
        result = prime * result + ((getAppId() == null) ? 0 : getAppId().hashCode());
        result = prime * result + ((getOpenId() == null) ? 0 : getOpenId().hashCode());
        result = prime * result + ((getTallyTag() == null) ? 0 : getTallyTag().hashCode());
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
        result = prime * result + ((getTradeType() == null) ? 0 : getTradeType().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TRADE_FLOW
     *
     * @mbggenerated Wed Feb 22 15:15:57 CST 2017
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orderId=").append(orderId);
        sb.append(", merchantId=").append(merchantId);
        sb.append(", appId=").append(appId);
        sb.append(", openId=").append(openId);
        sb.append(", tallyTag=").append(tallyTag);
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
        sb.append(", tradeType=").append(tradeType);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }
}