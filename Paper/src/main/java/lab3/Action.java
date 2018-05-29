package lab3;

public class Action extends Paper {

    private int quantity;
    private String type;


    public Action(String name, TrendsENUM trendsENUM, int price, RiskEnum riskEnum){
        super(name, trendsENUM, price, riskEnum);
    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + " , " + " type";
    }

    @Override
    public String toCSV() {
        return super.toCSV() + " , " + this.type;
    }


}
