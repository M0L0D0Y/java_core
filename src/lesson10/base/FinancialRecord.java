package lesson10.base;

public class FinancialRecord {
    private Integer incomes;
    private Integer outcomes;

    public FinancialRecord(Integer incomes, Integer outcomes) {
        this.incomes = incomes;
        this.outcomes = outcomes;
    }

    public Integer getIncomes() {
        return incomes;
    }

    public void setIncomes(Integer incomes) {
        this.incomes = incomes;
    }

    public Integer getOutcomes() {
        return outcomes;
    }

    public void setOutcomes(Integer outcomes) {
        this.outcomes = outcomes;
    }
}
