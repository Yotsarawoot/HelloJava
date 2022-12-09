public class Marketing extends Staff{

    private int extraLanguage;
    private int extraLanguageRate;

    public Marketing(String name, int salary, int extraLanguage, int extraLanguageRate) {
        super(name, salary);
        this.extraLanguage = extraLanguage;
        this.extraLanguageRate = extraLanguageRate;
    }

    public int getExtraLanguage() {
        return extraLanguage;
    }

    public void setExtraLanguage(int extraLanguage) {
        this.extraLanguage = extraLanguage;
    }

    public int getExtraLanguageRate() {
        return extraLanguageRate;
    }

    public void setExtraLanguageRate(int extraLanguageRate) {
        this.extraLanguageRate = extraLanguageRate;
    }

    @Override
    public int getPayment() {
        return salary + (extraLanguage * extraLanguageRate);
    }
}
