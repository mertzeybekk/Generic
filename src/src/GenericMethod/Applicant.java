package GenericMethod;

public abstract class Applicant {
    private int math;
    private int physical;
    private int chemical;
    private int biology;
    private int history;

    public Applicant(int math, int physical, int chemical, int biology, int history) {
        this.math = math;
        this.physical = physical;
        this.chemical = chemical;
        this.biology = biology;
        this.history = history;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getPhysical() {
        return physical;
    }

    public void setPhysical(int physical) {
        this.physical = physical;
    }

    public int getChemical() {
        return chemical;
    }

    public void setChemical(int chemical) {
        this.chemical = chemical;
    }

    public int getBiology() {
        return biology;
    }

    public void setBiology(int biology) {
        this.biology = biology;
    }

    public int getHistory() {
        return history;
    }

    public void setHistory(int history) {
        this.history = history;
    }
    abstract int scoreCalculation();
}
