package lab3;

import java.util.ArrayList;
import java.util.List;

public class Root {
    public static void main(String [] argv) {

        Action action = new Action("Roshen", TrendsENUM.FALLING, 50, RiskEnum.MEDIUM);
        Vexel obligation= new Vexel( "Rozetka", TrendsENUM.GROWING, 140, RiskEnum.MEDIUM);
        Vexel obligation1 = new Vexel("Ebay", TrendsENUM.FALLING, 290, RiskEnum.LOW);
        List vexel = new ArrayList();

        vexel.add(action);
        vexel.add(obligation);
        vexel.add(obligation1);

        String headers = action.getHeaders();

        PaperWriter writer = new PaperWriter();
        writer.writeToFile(vexel, headers);
    }
}