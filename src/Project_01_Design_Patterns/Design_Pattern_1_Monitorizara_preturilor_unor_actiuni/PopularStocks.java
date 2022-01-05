package Project_01_Design_Patterns.Design_Pattern_1_Monitorizara_preturilor_unor_actiuni;

import java.util.ArrayList;
import java.util.List;

public class PopularStocks implements Observer {
    private List<Stock> stocks = new ArrayList<>();

    public void addStock(Stock stock) {
        stocks.add(stock);
        stock.addObserver(this);
    }

    public void show() {
        System.out.println("Popular Stocks");
        for (var stock : stocks)
            System.out.println(stock);
    }

    @Override
    public void priceChanged() {
        System.out.println("Price Changed - Refreshing Popular Stocks");
        show();
    }
}
