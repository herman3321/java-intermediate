package SimpleFinancialSoftware;

public class Main {
    public static void main(String[] args){
        Assets asset = new MutualFunds("AMZ", 300);
        Assets asset2 = new Stocks("USD", 400);
        System.out.println(asset.getMarketValue());
    }
}
