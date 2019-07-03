import java.util.Stack;

public class CollectionStack {
    public static void main(String[] args) {
        Stack<Product> stack = new Stack<Product>();
        stack.push(new Product(1,"Oppo","Oppo",1236454));
        stack.push(new Product(1,"Oppo","Oppo",435345));
        stack.push(new Product(1,"Oppo","Oppo",13123));
        stack.push(new Product(1,"Oppo","Oppo",126454));
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }
}
