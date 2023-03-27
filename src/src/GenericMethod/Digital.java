package GenericMethod;

public class Digital extends Applicant {

    public Digital(int math, int physical, int chemical, int biology, int history) {
        super(math, physical, chemical, biology, history);
    }

    @Override
    int scoreCalculation() {
        return getBiology()*5 + getChemical()*4 +getMath()*8 + getHistory()*2 +getPhysical()*4;
    }
}
