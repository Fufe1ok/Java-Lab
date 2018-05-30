package lab3;

import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;


public class AllTests {
	
	Action action = new Action("Google", TrendsENUM.GROWING, 800, RiskEnum.LOW);
    Paper yandex = new Obligation("yandex", TrendsENUM.FALLING, 450, RiskEnum.MEDIUM);
    Paper amazon = new Vexel("amazon", TrendsENUM.GROWING, 600, RiskEnum.MEDIUM);
    Paper Bing= new Action("Bing", TrendsENUM.FALLING, 320, RiskEnum.LOW);
    Paper softServe = new Action("SoftServe", TrendsENUM.GROWING, 120, RiskEnum.MEDIUM);
    Obligation obligation= new Obligation("Elex", TrendsENUM.FALLING, 120, RiskEnum.MEDIUM);
    Vexel vexel= new Vexel("NIX", TrendsENUM.GROWING, 320, RiskEnum.LOW);
	
	@Test
	public void isNullAction() {

		assertNotNull(action);
		assertNotNull(action.getName());
		assertNotNull(action.getRiskEnum());
		assertNotNull(action.getTrendsENUM());

		assertNotNull(new Paper());

	}

	@Test
	public void testGetSetEquals() {
		action.setName("SomeCompany");
		assertEquals("SomeCompany", action.getName());
		action.setPrice(111);
		assertEquals(111, action.getPrice());
		action.setRiskEnum(RiskEnum.SUPERHIGH);
		assertEquals(RiskEnum.SUPERHIGH, action.getRiskEnum());
		action.setTrendsENUM(TrendsENUM.FALLING);
		assertEquals(TrendsENUM.FALLING, action.getTrendsENUM());

		Paper paper = new Paper(action.getName(), action.getTrendsENUM(), action.getPrice(), action.getRiskEnum());


		assertEquals("Paper: " + action.getName() + "\n"
                + "Risk " + action.riskEnum + "\n"
                + "Trend: " + action.trendsENUM + "\n"
                + "Price: " + action.getPrice() + "UAN" + "\n", action.getRisk());


		assertEquals("Paper:{" +

                "name: '" + paper.getName() + '\'' +
                ", Trends: " + paper.trendsENUM +
                ", Risk: " + paper.riskEnum +
                ", price=" + paper.getPrice() +
                '}', paper.toString());
	}

	@Test
	public void isNullVexel() {

		assertNotNull(vexel);
		assertNotNull(vexel.getName());
		assertNotNull(vexel.getPrice());
		assertNotNull(vexel.getRiskEnum());
		assertNotNull(vexel.getTrendsENUM());
	}
	

	
	@Test
	public void isNullObligation() {
		
		assertNotNull(obligation);
		assertNotNull(obligation.getName());
		assertNotNull(obligation.getPrice());
		assertNotNull(obligation.getRiskEnum());
		assertNotNull(obligation.getTrendsENUM());

	}


	@Test
	public void stockExchange() {

		ArrayList<Paper> papers= new ArrayList<>();

		papers.add(action);
		papers.add(yandex);
		papers.add(amazon);
		papers.add(Bing);
		papers.add(softServe);
		papers.add(obligation);
		papers.add(vexel);


		StockExchange stockExchange = new StockExchange(new ArrayList<Paper>());
		ArrayList<Paper> result = stockExchange.searchByRisk(papers, RiskEnum.LOW);
		assertEquals(3 ,result.size());
		ArrayList<Paper> result1=stockExchange.searchByTrends(papers, TrendsENUM.FALLING);
		assertEquals(3, result1.size());


	}
	

	
}
