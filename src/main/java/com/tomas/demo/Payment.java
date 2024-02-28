package com.tomas.demo;

public static class Payment {
    private PaymentType type;
    private double sum;
    private String currency;
    private String debtorIban;
    private String creditorIban;
    private String details;
    private String creditorBankBic;

    // Konstruktorius, getteriai ir setteriai
}

public Payment() {
    // Tuščias konstruktorius
}

public Payment(PaymentType type, double sum, String currency, String debtorIban, String creditorIban, String details, String creditorBankBic) {
    this.type = type;
    this.sum = sum;
    this.currency = currency;
    this.debtorIban = debtorIban;
    this.creditorIban = creditorIban;
    this.details = details;
    this.creditorBankBic = creditorBankBic;
}

// Getteriai ir setteriai
public PaymentType getType() {
    return type;
}

public void setType(PaymentType type) {
    this.type = type;
}

public double getSum() {
    return sum;
}

public void setSum(double sum) {
    this.sum = sum;
}

public String getCurrency() {
    return currency;
}

public void setCurrency(String currency) {
    this.currency = currency;
}

public String getDebtorIban() {
    return debtorIban;
}

public void setDebtorIban(String debtorIban) {
    this.debtorIban = debtorIban;
}

public String getCreditorIban() {
    return creditorIban;
}

public void setCreditorIban(String creditorIban) {
    this.creditorIban = creditorIban;
}

public String getDetails() {
    return details;
}

public void setDetails(String details) {
    this.details = details;
}

public String getCreditorBankBic() {
    return creditorBankBic;
}

public void setCreditorBankBic(String creditorBankBic) {
    this.creditorBankBic = creditorBankBic;
}
