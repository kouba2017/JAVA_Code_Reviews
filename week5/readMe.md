# Bill Payment System Challenge

## 🚀 Challenge Overview
Your task is to build a **Bill Payment System** using **Object-Oriented Programming (OOP) principles in Java**. The system should allow users to create different types of bills and process payments using different payment methods.

## 🎯 Learning Objectives
By completing this challenge, you will:
- Understand **inheritance** by creating a parent `Bill` class and extending it with subclasses.
- Implement **abstraction** using abstract classes.
- Apply **interfaces** to enforce common behaviors in different payment methods.
- Use **enums** to handle predefined constant values efficiently.
- Enhance your **problem-solving and software design skills**.

---
## 📝 Requirements

### **1️⃣ Bill and its Variants**
The system should have a `Bill` class that represents a general bill. This class should store essential details such as the amount due, the payer's name, and the due date. Since different types of bills may have different calculations, this class should define an abstract method for computing the total amount.

Among the specific types of bills, there is a `ShoppingBill` that involves items purchased and may include a discount. There is also a `HousingBill`, which accounts for expenses such as rent. These specialized bills should inherit from `Bill` and implement their own logic to calculate the total amount due.

### **2️⃣ Payment Behavior**
Not all bills can be paid in the same way, so the system should include a `Payable` interface. Any bill that supports direct payment should implement this interface, ensuring it has a method for processing payments.

A `PaymentMethod` interface should also be included to define how payments are handled. This interface should enforce that any payment mechanism—such as credit card payments—must specify how a payment is made and provide details about the payment method.

### **3️⃣ Credit Card Payments and Card Types**
To facilitate payments, a `CreditCardPayment` class should implement `PaymentMethod`. This class should handle transactions using a credit card number and determine whether the card type (e.g., Visa, MasterCard) is supported.

To help with this, a `CardType` enum should be included. This enum should define different types of credit cards and provide a way to detect a card's type based on its number.

### **4️⃣ Implement a `Main` Class for Testing**
The program should include a `Main` class where different bills are created and their total amounts are calculated. The `ShoppingBill` should demonstrate direct payment handling, while `HousingBill` should showcase different ways to structure bill calculations. Finally, different credit cards should be tested to ensure the system correctly detects and processes payments.

---
## ✅ Expected Output Example
```plaintext
Bill for: Alice Smith | Amount: $450.0 | Due: 2025-03-15
Paid $450.0 using VISA card ending in 1111
Bill for: John Doe | Amount: $1300.0 | Due: 2025-03-10
Paid $1300.0 using MASTERCARD card ending in 1111
Payment failed: Unsupported card type.
```


