package de.tum.in.ase.eist.ecommerce;

public class ECommerceFacade {
     OrderController orderController;
     AdvertisementController advertisementController;
     ShippingController shippingController;
     Order order;
     String address;

    public ECommerceFacade() {
    }

    public ECommerceFacade(OrderController orderController, AdvertisementController advertisementController, ShippingController shippingController) {
        this.orderController = orderController;
        this.advertisementController = advertisementController;
        this.shippingController = shippingController;
    }
    public void shipOrder(Order order, String address) {
        this.order.setShipping(order.getShipping());
        this.shippingController.shipOrder(order);
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
