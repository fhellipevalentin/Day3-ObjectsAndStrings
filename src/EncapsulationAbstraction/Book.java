package EncapsulationAbstraction;

public class Book {
        private String name;
        private Author author;
        private Double price;
        private Integer qtyInStock;

        public Book(String name, Author author, Double price, Integer qtyInStock) {
            this.name = name;
            this.author = author;
            this.price = price;
            this.qtyInStock = qtyInStock;
        }

        public String getName() {
            return name;
        }

        public Author getAuthor() {
            return author;
        }

        public void setAuthor(Author author) {
            this.author = author;
        }

        public Double getPrice() {
            return price;
        }

        public void setPrice(Double price) {
            this.price = price;
        }

        public Integer getQtyInStock() {
            return qtyInStock;
        }

        public void setQtyInStock(Integer qtyInStock) {
            this.qtyInStock = qtyInStock;
        }
}
