public class Developer extends Staff {

    private int codingHour;
    private int codingRate;

    public Developer(String name, int salary, int codingHour, int codingRate) {
        super(name, salary);
        this.codingHour = codingHour;
        this.codingRate = codingRate;
    }

    @Override
    public int getPayment() {
        return this.salary + (this.codingHour * this.codingRate);
    }

    public int getCodingHour() {
        return codingHour;
    }

    public void setCodingHour(int codingHour) {
        this.codingHour = codingHour;
    }

    public int getCodingRate() {
        return codingRate;
    }

    public void setCodingRate(int codingRate) {
        this.codingRate = codingRate;
    }
}
