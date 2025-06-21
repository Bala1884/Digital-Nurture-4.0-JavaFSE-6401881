import java.util.*;

public class StockMarket implements Stock {
    private List<Observer> observers = new ArrayList<>();
    private String stock;

    public void setStock(String stock) {
        this.stock = stock;
        notifyObservers();
    }

    public void register(Observer o) {
        observers.add(o);
    }

    public void deregister(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(stock);
        }
    }
}