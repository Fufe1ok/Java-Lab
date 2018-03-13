import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Paper google = new Action("Google", TrendsENUM.GROWING, 800, RiskEnum.LOW);
        Paper yandex = new Obligation("Yandex", TrendsENUM.FALLING, 450, RiskEnum.MEDIUM);
        Paper amazon = new Vexel("Amazon", TrendsENUM.GROWING, 600, RiskEnum.MEDIUM);
        Paper bing = new Action("Bing", TrendsENUM.FALLING, 320, RiskEnum.LOW);
        Paper sofServe = new Action("SoftServe", TrendsENUM.GROWING, 120, RiskEnum.MEDIUM);
        Paper elex = new Obligation("Elex", TrendsENUM.FALLING, 120, RiskEnum.MEDIUM);
        Paper nix = new Vexel("NIX", TrendsENUM.GROWING, 320, RiskEnum.LOW);

        ArrayList<Paper> papers = new ArrayList<>();
        String inputNumber;
        Scanner mainmenuScanner = new Scanner(System.in);


        papers.add(google);
        papers.add(yandex);
        papers.add(amazon);
        papers.add(bing);
        papers.add(sofServe);
        papers.add(elex);
        papers.add(nix);


        StockExchange stockExchange = new StockExchange(papers);


        List<Paper> sortedList = stockExchange.searchByTrends(TrendsENUM.FALLING); // Sort by trends

        List<Paper> sortedList2 = stockExchange.searchByRisk(RiskEnum.LOW); // Sort by risk

        List<Paper> sortedList3 = stockExchange.sortByPrice(papers); // Sort by pages


        do {

            System.out.println("\n" + "\n" +
                    "Choose an option:" + "\n" + "1. Sort by trends." + "\n" + "2. Sort by Risk." + "\n" + "3. Sort by price." + "\n");

            inputNumber = mainmenuScanner.next(); // Scans the next token of the input.

            switch (inputNumber) {
                case "1": {
                    System.out.println("Sorted by trends:");
                    for (int i = 0; i < sortedList.size(); i++) {
                        System.out.println(sortedList.get(i).toString());
                    }
                    break;
                }

                case "2": {
                    System.out.println("Sorted by risk:");
                    for (int i = 0; i < sortedList2.size(); i++) {
                        System.out.println(sortedList2.get(i).toString());
                    }
                    break;
                }

                case "3": {
                    System.out.println("Sorted by price:");
                    for (int i = 0; i < sortedList3.size(); i++) {
                        System.out.println(sortedList3.get(i).toString());
                    }
                    break;
                }


            }
        } while (!inputNumber.equals("0"));


    }
}

