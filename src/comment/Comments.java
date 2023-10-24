package comment;

public class Comments {

    private String commenter;
    private String product;
    private String description;

    public Comments(String commenter, String product, String description) {
        this.commenter = commenter;
        this.product = product;
        this.description = description;
    }

    public String getCommenter() {
        return commenter;
    }

    public void setCommenter(String commenter) {
        this.commenter = commenter;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public void setOwned(boolean owned) {
        isOwned = owned;
    }

    private enum status{
        APPROVAL_WAITING,
        ACCEPTED,
        UNACCEPTED
    }

    private boolean isOwned;
}

