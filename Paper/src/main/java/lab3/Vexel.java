package lab3;

public class Vexel extends Paper{
    private final int cash;
    private int quantity;
    private String type;


    public Vexel(String name, TrendsENUM trendsENUM, int price, RiskEnum riskEnum, int cash){
        super(name, trendsENUM, price, riskEnum);
        this.cash= cash;

    }

    public String getHeaders(){
        return super.getHeaders() + " , " + "cash";
    }

    public String toCSV(){
        return super.toCSV() + " , " + this.cash;
    }

}

