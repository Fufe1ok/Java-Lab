package lab3;

public class Paper {
    private String name;
    TrendsENUM trendsENUM;
    RiskEnum riskEnum;
    private int price;

    public Paper(){}

    public String getHeaders(){
        return "name, trends, risk, price";
    }

    public String toCSV(){
        return this.name + " , " + this.trendsENUM + " , " + this.riskEnum + " , " + this.price;
    }

    public Paper(String name, TrendsENUM trendsENUM, int price, RiskEnum riskEnum) {
        this.setName(name);
        this.riskEnum=riskEnum;
        this.trendsENUM=trendsENUM;
        this.setPrice(price);

        }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setTrendsENUM(TrendsENUM trendsENUM ){
        this.trendsENUM=trendsENUM;
    }

    public TrendsENUM getTrendsENUM() {
        return trendsENUM;
    }

    public RiskEnum getRiskEnum() {
        return riskEnum;
    }

    public void setRiskEnum(RiskEnum riskEnum) {
        this.riskEnum = riskEnum;
    }

    String getTrends(){
        return trendsENUM.toString();
    }

    String getRisk(){
        return riskEnum.toString();
    }

}
