package com.kyrs.Table;
import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "my_cart")
public class CartItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @Column(name = "quantity")
    private int quantity;

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public Product getProduct() {
        return product;
    }



    public static int getTotal(List<CartItem> cartItems) {
        int total = 0;
        for (CartItem item : cartItems) {
            String priceStr = item.getProduct().getPrice();
            int priceInt = Integer.parseInt(priceStr);
            total += item.getQuantity() * priceInt;
        }
        return total;
    }
}
