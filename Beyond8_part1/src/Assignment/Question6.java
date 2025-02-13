package Assignment;

import java.util.Comparator;

public class Question6 {
    public enum OrderStatus {
        PENDING,
        PROCESSING,
        SHIPPED,
        DELIVERED,
        CANCELLED,
        REFUNDED
    }
    public static void main(String[] args) {
        OrderStatus oder = OrderStatus.PENDING;
        String msg = switch(oder){
            case PENDING->"Order is awaiting confirmation";
            case PROCESSING->"Order is being prepared";
            case SHIPPED->"Order has been dispatched";
            case DELIVERED->"Order has been successfully delivered";
            case CANCELLED->"Order has been cancelled";
            case REFUNDED->"Refund has been issed for the order.";
                default->"ordeRStatus Not FOund";
        };
        System.out.println(msg);

    };
}
