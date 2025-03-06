class ShoppingBill extends Bill implements Payable {
    private int itemsCount;
    private double discount;

    public ShoppingBill(double amount, String dueDate, String payerName, int itemsCount, double discount) {
        super(amount, dueDate, payerName);
        this.itemsCount = itemsCount;
        this.discount = discount;
    }

    @Override
    public void calculateTotal() {
        amount -= (amount * discount / 100); // Apply discount
    }

    @Override
    public void processPayment(PaymentMethod paymentMethod) {
        paymentMethod.pay(amount);
    }

    public int getItemsCount() {
        return itemsCount;
    }

    public void setItemsCount(int itemsCount) {
        this.itemsCount = itemsCount;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
    
}