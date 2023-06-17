package Builder;

public class ConcreteBuilder implements Builder{
    private Product product;

    public ConcreteBuilder() {
        product = new Product();
    }

    public void  buildName(){
        product.setName("lol");
    }

    public Product getProduct() {return product;}
}
