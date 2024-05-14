package org.howard.edu.lsp.oopfinal.question2;

public class PaymentStrategyDriver {

public static void main(String[] args) {
ShoppingCart myShoppingCart = new ShoppingCart();
// first using credit card
myShoppingCart.setPaymentStrategy(new CreditCardPayment("1234-5678-9012-3456"));
myShoppingCart.checkout(100.0);

// using paypal account
myShoppingCart.setPaymentStrategy(new PayPalPayment("user@example.com"));
myShoppingCart.checkout(50.0);

// using bitcoin address
myShoppingCart.setPaymentStrategy(new BitcoinPayment("1AaBbCcDdEeFfGgHh"));
myShoppingCart.checkout(75.0);
}

}