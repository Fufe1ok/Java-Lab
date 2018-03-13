import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StockExchange {

    private List<Paper> papers;

    public StockExchange(ArrayList<Paper> papers) {
        this.papers = papers;
    }

    List<Paper> searchByTrends(TrendsENUM trendsENUM) {
        List<Paper> listInput = new ArrayList<Paper>();
        for (int i = 0; i < papers.size(); i++) {
            if (papers.get(i).trendsENUM == trendsENUM) {
                listInput.add(papers.get(i));
            }
        }
        return listInput;

    }

    List<Paper> searchByRisk(RiskEnum riskEnum) {
        List<Paper> listInput = new ArrayList<Paper>();
        for (int i = 0; i < papers.size(); i++) {
            if (papers.get(i).riskEnum == riskEnum) {
                listInput.add(papers.get(i));
            }
        }
        return listInput;

    }

    List<Paper> sortByPrice(ArrayList<Paper> papers) {
        papers.sort(Comparator.comparingInt(Paper::getPrice));
        return papers;
    }
}
