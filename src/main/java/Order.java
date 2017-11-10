import java.util.Date;

public class Order {
    private User user;
    private OrderStatus status;
    private OrderType type;
    private ServiceTemplate serviceTemplate;
    private Date creationDate;
    private Date finishDate;

    public Order(User user, OrderType type, ServiceTemplate serviceTemplate) {
        this.user = user;
        this.type = type;
        this.creationDate = new Date();
    }
}
