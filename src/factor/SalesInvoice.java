package factor;

import product.Product;

import java.util.ArrayList;

public class SalesInvoice extends Factor {
    private long totalReceived;
    ArrayList<Product> productsSold;
    private String buyer;

    private enum status {
        UNDELIVERED,
        DELIVERED
    }

    SalesInvoice(String date, String buyer) {
        super(date);
        this.buyer = buyer;
    }
}
