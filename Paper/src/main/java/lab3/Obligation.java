package lab3;

public class Obligation extends Paper {
    private int quantity;
    private String type;


    public Obligation(String name, TrendsENUM trendsENUM, int price, RiskEnum riskEnum){
        super(name, trendsENUM, price, riskEnum);
        this.quantity=quantity;
        this.type=type;

    }

    public String getHeaders(){
        return super.getHeaders() + " , " + "quantity";
    }

    public String toCSV() {
        return super.toCSV() + " , " + this.quantity;
    }
}
