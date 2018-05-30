package lab3;

public class Vexel extends Paper{
    private int quantity;
    private String type;


    public Vexel(String name, TrendsENUM trendsENUM, int price, RiskEnum riskEnum){
        super(name, trendsENUM, price, riskEnum);

    }

    public String getHeaders(){
        return super.getHeaders() + " , " + "cash";
    }

    public String toCSV(){
        return super.toCSV() + " , " + this.riskEnum;
    }

}

