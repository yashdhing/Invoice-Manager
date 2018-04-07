
public class Invoice {
    
    private String party;
    private int billNo;
    private String name;
    
    private String item;
    private String marka;
    private String chaap;
    
    private int bag;
    private int katta;
    private double bagFill;
    private double kattaFill;
    
    private double rate;

    public Invoice() {
        bag = 0;
        bagFill = 0;
        katta = 0;
        kattaFill = 0;
        rate = 0;
    }
    
    public String getName() {
        return name;
    }

    public String getMarka() {
        return marka;
    }

    public String chaap() {
        return chaap;
    }

    public int getBag() {
        return bag;
    }

    public double getBagFill() {
        return bagFill;
    }

    public int getKatta() {
        return katta;
    }

    public double getKattaFill() {
        return kattaFill;
    }

    public double getRate() {
        return rate;
    }

    public double getWeight() {
        return ((bag * bagFill) + kattaFill);
    }

    public double getAmount() {
        return (rate * getWeight());
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public void setChaap(String chaap) {
        this.chaap = chaap;
    }

    public void setBag(int bag) {
        this.bag = bag;
    }

    public void setBagFill(double bagFill) {
        this.bagFill = bagFill;
    }

    public void setKatta(int katta) {
        this.katta = katta;
    }

    public void setKattaFill(double kattaFill) {
        this.kattaFill = kattaFill;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}
