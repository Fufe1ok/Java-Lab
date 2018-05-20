package lab3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StockExchange {

    public StockExchange(ArrayList<Paper> papers){

    }

    ArrayList<Paper> searchByTrends (ArrayList<Paper> papers, TrendsENUM trendsENUM){
        List<Paper> listInput = new ArrayList<Paper>();
        for (int i = 0; i < papers.size(); i++) {
            if(papers.get(i).trendsENUM == trendsENUM) {
                listInput.add(papers.get(i));
            }
        }
        return (ArrayList<Paper>) listInput;

    }

    ArrayList<Paper> searchByRisk (ArrayList<Paper> papers, RiskEnum riskEnum){
        List<Paper> listInput = new ArrayList<Paper>();
        for (int i = 0; i < papers.size(); i++) {
            if(papers.get(i).riskEnum == riskEnum) {
                listInput.add(papers.get(i));
            }
        }
        return (ArrayList<Paper>) listInput;

    }
}
