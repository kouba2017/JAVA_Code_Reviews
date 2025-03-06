public class Test {
    public static void main(String[] args) {
        // Test Housing Bill
        Bill housingBill = new HousingBill(1000, "2025-03-10", "John Doe", 300);
        housingBill.calculateTotal();
        housingBill.getBillDetails();

        // Test Shopping Bill
        ShoppingBill shoppingBill = new ShoppingBill(500, "2025-03-15", "Alice Smith", 5, 10);
        shoppingBill.calculateTotal();
        shoppingBill.getBillDetails();

        // Test Visa Payment for Shopping Bill
        PaymentMethod visaPayment = new CreditCardPayment("4111111111111111");
        shoppingBill.processPayment(visaPayment);

        // Test MasterCard Payment for Housing Bill (Note: HousingBill doesn't implement Payable)
        PaymentMethod masterCardPayment = new CreditCardPayment("5111111111111111");
        masterCardPayment.pay(housingBill.getAmount());
    }
}
