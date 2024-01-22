package com.five.superprice.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "order_products")
public class OrderProducts {

        @Id
        @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;

        @ManyToOne
        @JoinColumn(name = "order_id")
        private Order order;

        @OneToOne
        @JoinColumn(name = "item_id")
        private Items item;

        @Column(name = "quantity")
        private int quantity;

        @Column(name = "price")
        private double price;

        public long getId() {
                return id;
        }

        public void setId(long id) {
                this.id = id;
        }

        public Order getOrder() {
                return order;
        }

        public void setOrder(Order order) {
                this.order = order;
        }

        public Items getItem() {
                return item;
        }

        public void setItem(Items item) {
                this.item = item;
        }

        public int getQuantity() {
                return quantity;
        }

        public void setQuantity(int quantity) {
                this.quantity = quantity;
        }

        public double getPrice() {
                return price;
        }

        public void setPrice(double price) {
                this.price = price;
        }
}
