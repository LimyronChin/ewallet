package com.fr.chain.ewallet.db.entity;

public class WalletAdressKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column WALLET_ADDRESS.WALLET_ID
     *
     * @mbggenerated Wed Feb 22 18:19:31 CST 2017
     */
    private String walletId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column WALLET_ADDRESS.WALLET_ID
     *
     * @return the value of WALLET_ADDRESS.WALLET_ID
     *
     * @mbggenerated Wed Feb 22 18:19:31 CST 2017
     */
    public String getWalletId() {
        return walletId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column WALLET_ADDRESS.WALLET_ID
     *
     * @param walletId the value for WALLET_ADDRESS.WALLET_ID
     *
     * @mbggenerated Wed Feb 22 18:19:31 CST 2017
     */
    public void setWalletId(String walletId) {
        this.walletId = walletId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WALLET_ADDRESS
     *
     * @mbggenerated Wed Feb 22 18:19:31 CST 2017
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
        WalletAdressKey other = (WalletAdressKey) that;
        return (this.getWalletId() == null ? other.getWalletId() == null : this.getWalletId().equals(other.getWalletId()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WALLET_ADDRESS
     *
     * @mbggenerated Wed Feb 22 18:19:31 CST 2017
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getWalletId() == null) ? 0 : getWalletId().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WALLET_ADDRESS
     *
     * @mbggenerated Wed Feb 22 18:19:31 CST 2017
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", walletId=").append(walletId);
        sb.append("]");
        return sb.toString();
    }
}