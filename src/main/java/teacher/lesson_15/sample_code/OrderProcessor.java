package teacher.lesson_15.sample_code;

/**
 * This class contains method processOrder() and helper methods which contains logic for order processing.
 * @author Vasja Pupkin
 */

public class OrderProcessor {
    public static final String CANNOT_BE_PROCESSED_MESSAGE = "Order cannot be processed.";
    public static final String SUCCESS_ORDER_MESSAGE = "Your order is being processed.";
    public static final String FAILED_PAYMENT_MESSAGE = "Payment failed. Please retry.";

    private OrderDatabase db;
    private PaymentService paymentService;
    private NotificationService notificationService;

    public OrderProcessor(OrderDatabase db, PaymentService paymentService, NotificationService notificationService) {
        this.db = db;
        this.paymentService = paymentService;
        this.notificationService = notificationService;
    }

    /**
     * Process orders with status NEW to the business requirements mentioned in document ASSS21321
     * @param orderId ID of the order
     * @param userToken Unique userToken which identifies user in the system
     */
    public void processOrder(String orderId, String userToken) throws OrderNotFoundException {
        Order order = getOrder(orderId);
        if (order.getStatus() == OrderStatus.NEW) {
            processNewOrder(order, userToken);
        } else {
            notifyUser(order, CANNOT_BE_PROCESSED_MESSAGE);
        }
    }

    private Order getOrder(String orderId) {
        Order order = db.getOrderById(orderId);
        if (order == null) {
            throw new OrderNotFoundException(orderId);
        }
        return order;
    }

    private void processNewOrder(Order order, String userToken) {
        if (paymentService.processPayment(order.getTotalAmount(), userToken)) {
            updateOrderStatus(order);
            notifyUser(order, SUCCESS_ORDER_MESSAGE);
        } else {
           notifyUser(order, FAILED_PAYMENT_MESSAGE);
        }
    }

    private void updateOrderStatus(Order order) {
        order.setStatus(OrderStatus.PROCESSING);
        db.updateOrder(order);
    }

    private void notifyUser(Order order, String message) {
        notificationService.sendNotification(order.getUser(), message);
    }

    //examples of creating Order with 'Builder' pattern
    Order order1 = new Order("12", 12.0, "User", OrderStatus.NEW);

    Order order2 = Order.builder()
            .id("111")
            .user("User_01")
            .build();

    String order2Id = order2.getId();

    Order order3 = Order.builder().build();

    Order order4 = Order.builder()
            .totalAmount(10.0)
            .build();



    // Other methods...
}



