package org.howard.edu.lsp.oopfinal.question2;

public class ShoppingCart {
private PaymentStrategy paymentStrategy;

public void checkout(double pay) {
paymentStrategy.pay(pay);
}

public void setPaymentStrategy(PaymentStrategy newStrategy) {
this.paymentStrategy = newStrategy;
}
}
