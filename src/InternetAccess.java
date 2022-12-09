public class InternetAccess implements IPayment{
    private int internetRate;

    public InternetAccess(int internetRate) {
        this.internetRate = internetRate;
    }

    public int getInternetRate() {
        return internetRate;
    }

    public void setInternetRate(int internetRate) {
        this.internetRate = internetRate;
    }

    @Override
    public int getPayment() {
        return internetRate;
    }

    @Override
    public String getName() {
        return "Monthly Internet Access Payment";
    }
}
