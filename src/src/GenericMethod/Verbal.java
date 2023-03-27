package GenericMethod;

public class Verbal extends Applicant {
    public Verbal(int math, int physical, int chemical, int biology, int history) {
        super(math, physical, chemical, biology, history);
    }

    @Override
    int scoreCalculation() {
        return getBiology()*3+getMath()*8+getChemical()*2+getPhysical()*5+getHistory()*6;
    }
}
