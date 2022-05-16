package com.palak.designpatterns.behavioural.visitor.demo2;

public class Book implements Visitable{

    String bookName;
    double price;

    public Book(String bookName, double price) {
        this.bookName = bookName;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", price='" + price + '\'' +
                '}';
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
