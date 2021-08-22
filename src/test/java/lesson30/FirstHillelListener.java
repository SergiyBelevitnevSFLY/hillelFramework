package lesson30;

import org.testng.*;

public class FirstHillelListener implements ISuiteListener, ITestListener {


    @Override
    public void onStart(ISuite suite) {
        System.out.println("Listener on start suite started  ");
    }

    @Override
    public void onFinish(ISuite suite) {
        System.out.println("Listener on start suite finished  ");
    }

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("-----------Listener Test started for test " + result.getMethod().getMethodName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("-----------Listener Test Success for test " + result.getMethod().getMethodName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("-----------Listener Test Failed for test " + result.getMethod().getMethodName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        ITestListener.super.onTestFailedWithTimeout(result);
    }

    @Override
    public void onStart(ITestContext context) {
        ITestListener.super.onStart(context);
    }

    @Override
    public void onFinish(ITestContext context) {
        ITestListener.super.onFinish(context);
    }
}
