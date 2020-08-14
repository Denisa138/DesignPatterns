package com;


//import com.chain.Demo;
import com.composite.Demo;
import com.command.*;
import com.mediator.SignUpDialogBox;
import com.observer.Stock;
import com.observer.StockListView;
import com.strategy.Aes;
import com.strategy.ChatClient;
import com.strategy.EncrypthionAlgorithm;

public class Main {

    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.show();
    }
}


/* //observer
        Stock stock = new Stock("banana",2);
        StockListView stocks = new StockListView();
        stocks.addStock(stock);
        stocks.show();

        stock.setPrice(4);*/
/*//command
        History history = new History();
        Video video = new Video("mar");
        UndoableCommand contrastCommand = new ContrastCommand(video, history);
        contrastCommand.execute();

        System.out.println(video.getVideo());
        Command undo = new UndoCommand(history);

        undo.execute();
        System.out.println(video.getVideo());
        */
        /* //strategy
        EncrypthionAlgorithm encrypthionAlgorithm = new Aes();
        ChatClient client = new ChatClient(encrypthionAlgorithm);
        client.chat();
        */
        /* Iterator
        ProductsCollection products = new ProductsCollection();

        products.add(new Product(23, "lapte"));
        products.add(new Product(3, "mar"));
        Iterator<Product> iterator = products.createIterator();

        while(iterator.hasNext())
        {
            Product current = iterator.current();
            System.out.println(current + " ");
            iterator.next();
        }*/
       /* State
        DirectionService dir  = new DirectionService();
        TravelMode travel = new Bicycling();
        dir.setTravelMode(travel);

        dir.getEta();

        */
	/* MementoPattern
        Document doc = new Document();
        History history = new History();

        doc.setContent("ana");
        doc.setFontName("mr");
        doc.setFontSize(12);
        history.push(doc.create());

        doc.setContent("kj");
        doc.setFontName("ht");
        doc.setFontSize(1);
        //history.push(doc.create());
        doc.restore(history.pop());

        System.out.println(doc.toString());*/