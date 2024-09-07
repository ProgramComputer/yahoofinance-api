package yahoofinance;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import yahoofinance.mock.MockedServersTest;




import java.io.IOException;

//ADD new test Classes here
@RunWith(Suite.class)
@Suite.SuiteClasses({
    HistoricalQuoteRequestTest.class, 
        FxQuoteRequestTest.class, 
        QuoteRequestFlowTest.class, 
        SimpleQuoteRequestTest.class


})
public class MockTestSuite {
    public void MockTestSuite(){
   MockedServersTest.startServers();
    }

}
