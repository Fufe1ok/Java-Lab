package lab1;

public class Bird {
    private String name= "no name";
    private String type;
    private String color;
    private int quantity;
    private int price;
    private static double totalKind =0;

    public Bird(){

    };

    public Bird(String name, String type, String color, int quantity){
        setName(name);
        setType(type);
        setColor(color);
        setQuantity(quantity);
    }

    public Bird ( String name, String type, String color, int quantity, int price){
        setName(name);
        setType(type);
        setColor(color);
        setQuantity(quantity);
        setPrice(price);
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType(){
        return type;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity(){
        return quantity;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getPrice(){
        return price;
    }

    public String toString(){
        return "Info about birds in shop: \nname: " + getName()
                + "\ntype: " + getType()
                + "\ncolor: " + getColor()
                + "\nquantity: " + getQuantity()
                + "\nprice: " + getPrice()
                +"\n";


    }

    public static void printStaticSum(){
        System.out.print("All of these kinds:" + totalKind + "\n");

    }

    public void printSum(){
        System.out.println("Name of this bird: " +getName()+ "." + " It is a " +getType()+" bird. It has a "+ getColor() +" color.Price of this bird: " + getPrice() +" grn.");

    }

    public void resetValues(String name, String type, String color, int quantity){
        setName(name);
        setType(type);
        setPrice(price);
        setColor(color);
        setQuantity(quantity);
    }

    public void setTotalKind(double totalKind){
        Bird.totalKind -=this.totalKind;
        Bird.totalKind += Bird.totalKind;
        this.totalKind = Bird.totalKind;
    }
}
