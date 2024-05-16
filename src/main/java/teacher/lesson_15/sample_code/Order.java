package teacher.lesson_15.sample_code;

import lombok.*;

@Data
@Builder
public class Order {
    private String id;
    private double totalAmount;
    private String user;
    private OrderStatus status;
}