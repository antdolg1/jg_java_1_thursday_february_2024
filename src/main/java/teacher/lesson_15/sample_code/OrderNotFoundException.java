package teacher.lesson_15.sample_code;

public class OrderNotFoundException extends RuntimeException {
    public OrderNotFoundException(String orderId) {
        super("Order with ID " + orderId + " not found.");
    }
}
