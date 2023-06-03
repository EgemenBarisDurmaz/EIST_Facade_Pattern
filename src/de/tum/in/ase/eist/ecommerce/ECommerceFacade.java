package de.tum.in.ase.eist.ecommerce;

public class ECommerceFacade {
     private OrderController orderController;
     private AdvertisementController advertisementController;
     private ShippingController shippingController;


    public ECommerceFacade() {
        this.orderController = new OrderController();
        this.advertisementController = new AdvertisementController();
        this.shippingController = new ShippingController();
    }

    public ECommerceFacade(OrderController orderController, AdvertisementController advertisementController, ShippingController shippingController) {
        this.orderController = orderController;
        this.advertisementController = advertisementController;
        this.shippingController = shippingController;
    }
    public void shipOrder(Order order, String address) {
        Shipping shipping = this.shippingController.createShipping(address);
        order.setShipping(shipping);
        shippingController.shipOrder(order);
    }

    public void processOrder(Order order) {
        orderController.processOrder(order);
    }

    public void processOrder(Order order, String phoneNumber) {
        orderController.processOrder(order, phoneNumber);
    }

    public Order retrieveLatestOrder(int id) {
        return orderController.retrieveLatestOrder(id);
    }

    public void playAdvertisement(int ageRestriction) {
        advertisementController.playAdvertisement(ageRestriction);
    }
}
