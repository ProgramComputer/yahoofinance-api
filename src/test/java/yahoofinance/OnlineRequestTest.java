package yahoofinance;

import org.junit.Test;
import yahoofinance.quotes.fx.FxQuote;
import yahoofinance.quotes.fx.FxSymbols;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Map;

import static org.junit.Assert.*;

/**
 *
 * @author Paul ProgramComputer
 */
public class OnlineRequestTest {

    @Test
    public void OnlineRequestTest() throws IOException {
        Stock stock = YahooFinance.get("AAPL");
     assertEquals(stock.getStats().getSymbol(),"AAPL");

    }
    }