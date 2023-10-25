package SimpleFinancialSoftware;

public abstract class ShareAssets implements Assets {

    private String symbol;
    private double totalCost;
    private double currentPrice;

    public ShareAssets(String symbol, double currentPrice){
        this.symbol = symbol;
        this.currentPrice = currentPrice;
        totalCost= 0.0;
    }
    //add a cost the given amount to this asset
    public void addCost(double cost){
        totalCost+= cost; // totalCost=totalCost + cost
    }
    // returns the price per share of this asset
    public double getCurrentPrice(){
        return totalCost;
    }
    
    public double getTotalCost(){
        return totalCost;
    }
    public void setCurrentPrice(double currentPrice){
        this.currentPrice = currentPrice;
    }
    // returns the current market value of this asset
    public abstract double getMarketValue();
    // returns the profit earned om shares of this asset
    public double getProfit(){
        //calls an abstract getMarketValue method
        return getMarketValue() - totalCost;
    }
    
}
