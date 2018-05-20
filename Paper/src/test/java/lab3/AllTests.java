package lab3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class AllTests {
	
	Action action = new Action("Google", TrendsENUM.GROWING, 800, RiskEnum.LOW);
    Paper Yandex = new Obligation("Yandex", TrendsENUM.FALLING, 450, RiskEnum.MEDIUM);
    Paper Amazon = new Vexel("Amazon", TrendsENUM.GROWING, 600, RiskEnum.MEDIUM);
    Paper Bing= new Action("Bing", TrendsENUM.FALLING, 320, RiskEnum.LOW);
    Paper SofServe= new Action("SoftServe", TrendsENUM.GROWING, 120, RiskEnum.MEDIUM);
    Obligation obligation= new Obligation("Elex", TrendsENUM.FALLING, 120, RiskEnum.MEDIUM);
    Vexel vexel= new Vexel("NIX", TrendsENUM.GROWING, 320, RiskEnum.LOW);
	
	@Test
	public void isNullAction() {
		
		assertNotNull(action);
		assertNotNull(action.getName());
		assertNotNull(action.getPrice());
		assertNotNull(action.getQuantity());
		assertNotNull(action.getRiskEnum());
		assertNotNull(action.getTrendsENUM());
		//assertNotNull(action.getType()); <-- is null
		
		//Test Empty Paper Constructor
		assertNotNull(new Paper());
		
	}
	
	@Test
	public void getSetEquals() {
		action.setName("SomeCompany");
		assertEquals("SomeCompany", action.getName());
		action.setPrice(111);
		assertEquals(111, action.getPrice());
		action.setQuantity(222);
		assertEquals(222, action.getQuantity());
		action.setRiskEnum(RiskEnum.SUPERHIGH);
		assertEquals(RiskEnum.SUPERHIGH, action.getRiskEnum());
		action.setTrendsENUM(TrendsENUM.FALLING);
		
		Paper paper = new Paper(action.getName(), action.getTrendsENUM(), action.getPrice(), action.getRiskEnum());
		assertEquals(RiskEnum.SUPERHIGH.toString(), paper.getRisk());
		
		assertEquals(TrendsENUM.FALLING, action.getTrendsENUM());
		assertEquals(TrendsENUM.FALLING.toString(), action.getTrends());
		action.setType("SomeType");
		assertEquals("SomeType", action.getType());
		
		assertEquals("Paper: " + action.getName() + "\n"
                + "Risk " + action.riskEnum + "\n"
                + "Trend: " + action.trendsENUM + "\n"
                + "Quantity: " + action.getQuantity() + "$ per one" +"\n"
                + "Type: " + action.getType() + "\n"
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
		assertNotNull(vexel.getQuantity());
		assertNotNull(vexel.getRiskEnum());
		assertNotNull(vexel.getTrendsENUM());
	}
	
	@Test
	public void getSetEqualsVexel() {
		vexel.setName("SomeCompany");
		assertEquals("SomeCompany", vexel.getName());
		vexel.setPrice(111);
		assertEquals(111, vexel.getPrice());
		vexel.setQuantity(222);
		assertEquals(222, vexel.getQuantity());
		vexel.setRiskEnum(RiskEnum.SUPERHIGH);
		assertEquals(RiskEnum.SUPERHIGH, vexel.getRiskEnum());
		vexel.setTrendsENUM(TrendsENUM.FALLING);
		
		Paper paper = new Paper(vexel.getName(), vexel.getTrendsENUM(), vexel.getPrice(), vexel.getRiskEnum());
		assertEquals(RiskEnum.SUPERHIGH.toString(), paper.getRisk());
		
		assertEquals(TrendsENUM.FALLING, vexel.getTrendsENUM());
		assertEquals(TrendsENUM.FALLING.toString(), vexel.getTrends());
		vexel.setType("SomeType");
		assertEquals("SomeType", vexel.getType());
		
		assertEquals("Paper: " + vexel.getName() + "\n"
                + "Risk " + vexel.riskEnum + "\n"
                + "Trend: " + vexel.trendsENUM + "\n"
                + "Quantity: " + vexel.getQuantity() + "$ per one" +"\n"
                + "Type: " + vexel.getType() + "\n"
                + "Price: " + vexel.getPrice() + "UAN" + "\n", vexel.getRisk());
		
		assertEquals("Paper:{" +

                "name: '" + paper.getName() + '\'' +
                ", Trends: " + paper.trendsENUM +
                ", Risk: " + paper.riskEnum +
                ", price=" + paper.getPrice() +
                '}', paper.toString());
	}
	
	@Test
	public void isNullObligation() {
		
		assertNotNull(obligation);
		assertNotNull(obligation.getName());
		assertNotNull(obligation.getPrice());
		assertNotNull(obligation.getQuantity());
		assertNotNull(obligation.getRiskEnum());
		assertNotNull(obligation.getTrendsENUM());
	}
	
	@Test
	public void getSetEqualsObligation() {
		obligation.setName("SomeCompany");
		assertEquals("SomeCompany", obligation.getName());
		obligation.setPrice(111);
		assertEquals(111, obligation.getPrice());
		obligation.setQuantity(222);
		assertEquals(222, obligation.getQuantity());
		obligation.setRiskEnum(RiskEnum.SUPERHIGH);
		assertEquals(RiskEnum.SUPERHIGH, obligation.getRiskEnum());
		obligation.setTrendsENUM(TrendsENUM.FALLING);
		
		Paper paper = new Paper(obligation.getName(), obligation.getTrendsENUM(), obligation.getPrice(), obligation.getRiskEnum());
		assertEquals(RiskEnum.SUPERHIGH.toString(), paper.getRisk());
		
		assertEquals(TrendsENUM.FALLING, obligation.getTrendsENUM());
		assertEquals(TrendsENUM.FALLING.toString(), obligation.getTrends());
		obligation.setType("SomeType");
		assertEquals("SomeType", obligation.getType());
		
		assertEquals("Paper: " + obligation.getName() + "\n"
                + "Risk " + obligation.riskEnum + "\n"
                + "Trend: " + obligation.trendsENUM + "\n"
                + "Quantity: " + obligation.getQuantity() + "$ per one" +"\n"
                + "Type: " + obligation.getType() + "\n"
                + "Price: " + obligation.getPrice() + "UAN" + "\n", obligation.getRisk());
		
		assertEquals("Paper:{" +
                "name: '" + paper.getName() + '\'' +
                ", Trends: " + paper.trendsENUM +
                ", Risk: " + paper.riskEnum +
                ", price=" + paper.getPrice() +
                '}', paper.toString());
	}
	
	
	

	
}
