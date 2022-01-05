package Project_01_Design_Patterns.Design_Pattern_1_Monitorizara_preturilor_unor_actiuni;

public class Main {
    public static void main(String[] args) {
        var popularStocks = new PopularStocks();
        var stockListView = new StockListView();


        var stock1 = new Stock("stock1", 10);
        var stock2 = new Stock("stock2", 20);
        var stock3 = new Stock("stock3", 30);
        var stock4 = new Stock("stock4", 40);

        // In popularStocks voi stoca actiunile cele mai populare
        popularStocks.addStock(stock1);
        popularStocks.addStock(stock2);

        // In stockListView voi stoca toate actiunile existente
        stockListView.addStock(stock1);
        stockListView.addStock(stock2);
        stockListView.addStock(stock3);
        stockListView.addStock(stock4);

        stock2.setPrice(50);

        stock4.setPrice(12);
    }
}
