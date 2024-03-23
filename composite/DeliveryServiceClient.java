package composite;

public class DeliveryServiceClient {
    public static void main(String[] args) {
        DeliveryService deliveryService = new DeliveryService(new CompositeBox());
        
        deliveryService.setupOrder(
            new CompositeBox(
                new VideoGame("1", 100)
            ),
            new CompositeBox(
                new CompositeBox(
                    new Book("2", 200),
                    new Book("3", 300)
                ),
                new VideoGame("4", 400),
                new VideoGame("5", 500)
            )
        );

        double finalPrice = deliveryService.calculateOrderPrice();
        System.out.println("Delivery final price: " + finalPrice);

    }
}