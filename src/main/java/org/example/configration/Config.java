package org.example.configration;

import org.example.users.Product;
import org.springframework.context.annotation.Bean;

public class Config {

    @Bean("product1")
    public Product getProductdata1()
    {
        return new Product("Chocolate",100);
    }
    @Bean("product2")
    public Product getProductdata2()
    {
        return new Product("Maggie",50);
    }
    @Bean("product3")
    public Product getProductdata3()
    {
        return new Product("Chips",20);
    }
    @Bean("product4")
    public Product getProductdata4()
    {
        return new Product("Cold-Drinks",90);
    }



}
