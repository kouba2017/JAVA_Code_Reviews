public enum CardType {
    // a special data type that consists of a set of pre-defined named 
    // values separated by commas. These named values are also known as elements. 
    // Since the values in the enum type are constant, 
    // you should always represent them in UPPERCASE letters.
    VISA("4"),
    MASTERCARD("5"),
    AMEX("3"),
    DISCOVER("6"),
    OTHER("");

    private final String prefix;
    
    public String getPrefix() {
        return prefix;
    }

    CardType(String prefix) {
        this.prefix = prefix;
    }

    public static CardType detectCardType(String cardNumber) {
        if (cardNumber.startsWith(VISA.getPrefix())) return VISA;
        if (cardNumber.startsWith(MASTERCARD.getPrefix())) return MASTERCARD;
        if (cardNumber.startsWith(AMEX.getPrefix())) return AMEX;
        if (cardNumber.startsWith(DISCOVER.getPrefix())) return DISCOVER;
        return OTHER;
    }
}
