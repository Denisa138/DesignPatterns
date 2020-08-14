package com.iterator;
import java.util.ArrayList;
import java.util.List;


public class ProductsCollection {
    List<Product> products = new ArrayList<>();

    public void add(Product product) {
        products.add(product);
    }

    public List<Product> returnProducts()
    {
        return products;
    }

    public Iterator<Product> createIterator()
    {
        return new ListIterator(this);
    }

    public class ListIterator implements Iterator<Product>{
        private ProductsCollection totalProducts;
        private int index;

        ListIterator(ProductsCollection products)
        {
            totalProducts = products;
        }

        @Override
        public boolean hasNext() {
            return (index < totalProducts.returnProducts().size());
        }

        @Override
        public Product current() {
            return (totalProducts.returnProducts().get(index));
        }

        @Override
        public void next() {
          index++;
        }
    }
}
