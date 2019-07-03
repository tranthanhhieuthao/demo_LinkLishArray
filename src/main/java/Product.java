public class Product {
    private int id;
    private String productName;
    private String productLine;
    private int price;

    public Product() {
    }

    public Product(int id, String productName, String productLine, int price) {
        this.id = id;
        this.productName = productName;
        this.productLine = productLine;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductLine() {
        return productLine;
    }

    public void setProductLine(String productLine) {
        this.productLine = productLine;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString(){
        return "ID is:" +this.id
                +" "
                +"Product Line"
                +" "+ this.productLine;
    }
}
