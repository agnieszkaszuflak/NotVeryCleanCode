package domain;

import record.service.impl.Constants;

public class Currency {
    private String code;
    private String currencyType;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCurrencyType() {
        return currencyType;
    }

    public void setCurrencyType(String currencyType) {
        this.currencyType = currencyType;
    }

    public static String getCurrencyByCode(String code) {

        if (Constants.EUR_CURRENCY_CODE.equals(code)) {
            return Constants.CURRENCY_EURO;
        } else if (Constants.FL_CURRENCY_CODE.equals(code)
                || Constants.FL_CURRENCY_CODE_FOR_WEIRD_BANK.equals(code)) {
            return Constants.CURRENCY_FL;
        } else if (Constants.USD_CURRENCY_CODE.equals(code)) {
            return Constants.CURRENCY_USD;
        } else {
            throw new IllegalArgumentException("Unknown currency code encountered");
        }
    }
}
