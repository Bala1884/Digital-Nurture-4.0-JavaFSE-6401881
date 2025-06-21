public class MobileApp implements Observer {
    public void update(String stock) {
        System.out.println("Mobile App - New stock update: " + stock);
    }
}