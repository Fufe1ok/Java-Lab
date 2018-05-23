package lab3;

public class Vexel extends Paper{
    private int quantity;
    private String type;


    public Vexel(String name, TrendsENUM trendsENUM, int price, RiskEnum riskEnum){
        super(name, trendsENUM, price, riskEnum);

    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
