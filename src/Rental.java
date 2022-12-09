public class Rental implements IPayment{
    private int monthlyRentalRate;


    public Rental(int rental) {
        this.monthlyRentalRate = rental;
    }

    public int getRental() {
        return monthlyRentalRate;
    }

    public void setRental(int rental) {
        this.monthlyRentalRate = rental;
    }


    @Override
    public int getPayment() {
        return monthlyRentalRate;
    }

    @Override
    public String getName() {
        return "Monthly Rental Payment";
    }
}
