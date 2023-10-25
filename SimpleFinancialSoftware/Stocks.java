package SimpleFinancialSoftware;

public  class Stocks extends ShareAssets  {

    private int totalShares;

    public Stocks(String symbol, double currentPrice){
        super(symbol, currentPrice);
        totalShares= 0;
    }

    @Override
    public double getMarketValue(){
        return totalShares * getCurrentPrice();
    }

    public int getTotalShares(){
        return totalShares;
    }
    //records a purchase of the given number of shares of the stock at the given per share
    public void purchase(int shares, double pricePerShare){
        totalShares += shares;
        addCost(shares*pricePerShare);
    }
}
