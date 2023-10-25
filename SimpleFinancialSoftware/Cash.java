package SimpleFinancialSoftware;

public class Cash implements Assets {

    private double amount;

    public Cash (double amount){
        this.amount = amount;
    }

    @Override
    public double getMarketValue(){
        return amount;// no profit since cash is fixed asset
    }

    @Override
    public double getProfit(){
        return 0;
    }

    public void setAmount(double amount){
        this.amount = amount;
    }
}
