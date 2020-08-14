package com.observer;

import java.util.ArrayList;
import java.util.List;

public class StockListView implements Observer{
    private List<Stock> stocks = new ArrayList<>();

    public void addStock(Stock stock) {
        stock.attach(this);
        stocks.add(stock);
    }

    public void show() {
        for (Stock stock : stocks)
            System.out.println(stock);
    }

    @Override
    public void update() {
        System.out.println("Price updated");
        show();
    }
}
