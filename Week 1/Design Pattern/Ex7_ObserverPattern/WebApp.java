public class WebApp implements Observer {
    public void update(String stock) {
        System.out.println("Web App - New stock update: " + stock);
    }
}