package lab3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
	// write your code here
        Paper Google = new Action("Google", TrendsENUM.GROWING, 800, RiskEnum.LOW);
        Paper Yandex = new Obligation("Yandex", TrendsENUM.FALLING, 450, RiskEnum.MEDIUM);
        Paper Amazon = new Vexel("Amazon", TrendsENUM.GROWING, 600, RiskEnum.MEDIUM);
        Paper Bing= new Action("Bing", TrendsENUM.FALLING, 320, RiskEnum.LOW);
        Paper SofServe= new Action("SoftServe", TrendsENUM.GROWING, 120, RiskEnum.MEDIUM);
        Paper Elex= new Obligation("Elex", TrendsENUM.FALLING, 120, RiskEnum.MEDIUM);
        Paper NIX= new Vexel("NIX", TrendsENUM.GROWING, 320, RiskEnum.LOW);

        ArrayList<Paper> papers= new ArrayList<>();

        String inputNumber;
        Scanner mainmenuScanner = new Scanner(System.in); // Reading from System.in

        papers.add(Google);
        papers.add(Yandex);
        papers.add(Amazon);
        papers.add(Bing);
        papers.add(SofServe);
        papers.add(Elex);
        papers.add(NIX);

        StockExchange stockExchange = new StockExchange(papers);


        List<Paper> sortedList = stockExchange.searchByTrends(papers, TrendsENUM.FALLING); // Sort by trends

        List<Paper> sortedList2 = stockExchange.searchByRisk(papers, RiskEnum.LOW); // Sort by risk


        do {

            System.out.println("\n"+"\n"+
                    "Choose an option:" + "\n" + "1. Sort by trends." + "\n" + "2. Sort by Risk." + "\n");

            inputNumber = mainmenuScanner.next(); // Scans the next token of the input.

            switch (inputNumber) {
                case "1":{
                    System.out.println("Sorted by trends:");
                    for(int i = 0; i < sortedList.size(); i++ ) {
                        System.out.println(sortedList.get(i).toString());
                    }
                    break;
                }

                case "2": {
                    System.out.println("Sorted by risk:");
                    for(int i = 0; i < sortedList2.size(); i++ ) {
                        System.out.println(sortedList2.get(i).toString());
                    }
                    break;
                }



            }
        } while (!inputNumber.equals("0"));


    }
}
