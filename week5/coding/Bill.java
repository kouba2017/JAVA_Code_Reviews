abstract class Bill {
    protected double amount;
    protected String dueDate;
    protected String payerName;

    public Bill(double amount, String dueDate, String payerName) {
        this.amount = amount;
        this.dueDate = dueDate;
        this.payerName = payerName;
    }

    public abstract void calculateTotal();

    public void getBillDetails() {
        System.out.println("Bill for: " + payerName + " | Amount: $" + amount + " | Due: " + dueDate);
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getPayerName() {
        return payerName;
    }

    public void setPayerName(String payerName) {
        this.payerName = payerName;
    }
    
}