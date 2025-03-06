class HousingBill extends Bill {
    private double rent;

    public HousingBill(double amount, String dueDate, String payerName, double rent) {
        super(amount, dueDate, payerName);
        this.rent = rent;
    }

    @Override
    public void calculateTotal() {
        amount += rent; // Example logic
    }

    public double getRent() {
        return rent;
    }

    public void setRent(double rent) {
        this.rent = rent;
    }
    
}