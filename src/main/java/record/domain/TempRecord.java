package record.domain;

import domain.GenericRecord;

import java.math.BigDecimal;

public class TempRecord implements GenericRecord {
    private String sign;
    private String currencyCode;
    private Integer amount;

    @Override
    public boolean isCreditRecord() {
        return false;
    }

    @Override
    public boolean isDebitRecord() {
        return false;
    }

    @Override
    public boolean isCounterTransferRecord() {
        return false;
    }

    @Override
    public boolean hasFee() {
        return false;
    }

    @Override
    public BigDecimal getAmountAsBigDecimal() {
        return null;
    }

    @Override
    public String getCurrencyNumericCode() {
        return null;
    }

    @Override
    public void setCurrencyNumericCode(String code) {

    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}
