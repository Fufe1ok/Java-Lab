package lab1;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Bird SomeBird=new Bird();
        Bird Parrot= new Bird("Parrot", "Domestic bird", "Yellow", 12 );
        Bird Chicken= new Bird("Chicken" ,"Domestic bird", "White", 10, 50   );


        System.out.println(SomeBird.toString());
        System.out.println(Parrot.toString());
        System.out.println(Chicken.toString());

        
        SomeBird.printSum();
        Parrot.printSum();
        Chicken.printSum();
        Chicken.printStaticSum();
        System.out.println(" ");

       SomeBird.resetValues("Bird", "wild", "color", 12);
       Parrot.resetValues("Parrot", "Domestic", "Green", 14);
       Chicken.setTotalKind(50);


        System.out.println(SomeBird.toString());
        System.out.println(Parrot.toString());
        System.out.println(Chicken.toString());


        Bird.printStaticSum();
        Chicken.printSum();
        SomeBird.printSum();

    }
}
