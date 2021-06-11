package domain;

import java.math.BigDecimal;

public interface GenericRecord {

    boolean isCreditRecord();
    boolean isDebitRecord();
    public boolean isCounterTransferRecord();
    public boolean hasFee();
    public BigDecimal getAmountAsBigDecimal();
    public String getCurrencyNumericCode();
    public void setCurrencyNumericCode(String code);
    public String getSign();
    public void setSign(String sign);
}