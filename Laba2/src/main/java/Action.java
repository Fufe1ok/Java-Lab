public class Action extends Paper {

    private int quantity;
    private String type;


    public Action(String name, TrendsENUM trendsENUM, int price, RiskEnum riskEnum){
        super(name, trendsENUM, price, riskEnum);
        this.quantity=quantity;
        this.type=type;

    }

    public int getQuantity() {
        return quantity;
    }
    public String getType() {
        return type;
    }


    @Override
    String getRisk() {
        return "Paper: " + getName() + "\n"
                + "Risk " + riskEnum + "\n"
                + "Trend: " + trendsENUM + "\n"
                + "Quantity: " + getQuantity() + "$ per one" +"\n"
                + "Type: " + getType() + "\n"
                + "Price: " + getPrice() + "UAN" + "\n";
    }
}
