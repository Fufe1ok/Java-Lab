package lab3;

import java.util.ArrayList;
import java.util.List;

public class Root {
    public static void main(String [] argv) {

        Action action = new Action("Roshen", TrendsENUM.FALLING, 50, RiskEnum.MEDIUM );

        List vexel = new ArrayList();
        vexel.add(action);

        String headers = action.getHeaders();

        PaperWriter writer = new PaperWriter();
        writer.writeToFile(vexel, headers);
    }
}