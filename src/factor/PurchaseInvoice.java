package factor;

import product.Product;

import java.util.ArrayList;

public class PurchaseInvoice extends Factor {
    private static int last_ID = 0;
    private final int ID;
    private long price;
    ArrayList<Product> products;
    private String sellerName;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    private enum status {
        OPENED,
        CLOSED,
        CANCELED
    }

    PurchaseInvoice(String buyer,String date) {
        super(date);
        this.sellerName = buyer;
        this.ID = ++last_ID;
        this.date = date;
    }
}
