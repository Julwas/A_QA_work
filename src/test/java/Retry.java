import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.internal.TestResult;

public class Retry implements IRetryAnalyzer {
    private static final int MAX_RETRY = 5;//задаем константу попуток
    private int attempt = 1;// подсчет попыток

    @Override
    public boolean retry(ITestResult iTestResult) {
        if (!iTestResult.isSuccess()) {
            if (attempt < MAX_RETRY) {
                attempt++;
                iTestResult.setStatus(TestResult.FAILURE);
                System.out.println("Retrying one more time");
                return true;
            } else {
                iTestResult.setStatus(TestResult.FAILURE);
            }
        } else {
            iTestResult.setStatus(TestResult.SUCCESS);
        }

        return false;
    }
}
