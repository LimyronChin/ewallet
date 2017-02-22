package com.fr.chain.trade.db.entity;

public class TradeFlowKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRADE_FLOW.FLOW_ID
     *
     * @mbggenerated Wed Feb 22 15:15:57 CST 2017
     */
    private String flowId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRADE_FLOW.FLOW_ID
     *
     * @return the value of TRADE_FLOW.FLOW_ID
     *
     * @mbggenerated Wed Feb 22 15:15:57 CST 2017
     */
    public String getFlowId() {
        return flowId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRADE_FLOW.FLOW_ID
     *
     * @param flowId the value for TRADE_FLOW.FLOW_ID
     *
     * @mbggenerated Wed Feb 22 15:15:57 CST 2017
     */
    public void setFlowId(String flowId) {
        this.flowId = flowId;
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
        TradeFlowKey other = (TradeFlowKey) that;
        return (this.getFlowId() == null ? other.getFlowId() == null : this.getFlowId().equals(other.getFlowId()));
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
        sb.append(", flowId=").append(flowId);
        sb.append("]");
        return sb.toString();
    }
}