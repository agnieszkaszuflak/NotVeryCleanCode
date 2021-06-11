import dao.CurrencyDao;
import domain.Client;
import domain.Currency;

public class Util {
    private static Util utilInstance;
    private CurrencyDao currencyDao;

    public static Util getInstance() {
        return utilInstance;
    }

    public Currency getDefaultCurrencyForClient(Client client) {
        String currencyId = currencyDao.retrieveCurrencyDefault(client
                .getProfile());
        return currencyDao
                .retrieveCurrencyOnId(new Integer(currencyId));
    }

}