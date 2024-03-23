package composite;

public class DeliveryService {
    private Box box;
    public DeliveryService(Box box) {
        this.box = box;
    }

    public void setupOrder(Box... boxes) {
        this.box = new CompositeBox(boxes);
    }

    public double calculateOrderPrice() {
        return box.calculatePrice();
    }
}
