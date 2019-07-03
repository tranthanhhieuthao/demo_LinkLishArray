import java.util.LinkedList;
import java.util.List;

public class LinkList {
    public static void main(String[] args) {
        List<Product> products=new LinkedList<Product>();

        products.add(new Product(1, "iphoneX", "iphone", 20000));
        products.add(new Product(2, "SamSung", "SamSung", 30000));
        System.out.println(products.toString());
    }
}
