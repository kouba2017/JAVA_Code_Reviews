class CreditCardPayment implements PaymentMethod {
    private String cardNumber;
    private CardType cardType;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
        this.cardType = CardType.detectCardType(cardNumber);
    }

    @Override
    public void pay(double amount) {
        if (cardType == CardType.OTHER) {
            System.out.println("Payment failed: Unsupported card type.");
        } else {
            System.out.println("Paid $" + amount + " using " + cardType + " card ending in " + cardNumber.substring(cardNumber.length() - 4));
        }
    }

    @Override
    public String getPaymentDetails() {
        return cardType + " Card ending in " + cardNumber.substring(cardNumber.length() - 4);
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }
    
}
