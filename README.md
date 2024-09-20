# Payment-System
This project demonstrates the Adapter Pattern in Java, applied to a Payment System. The Adapter Pattern is a structural design pattern that allows an interface to be adapted so that it can work with classes that otherwise wouldn't be compatible.

# Key Features
Adapter Pattern: Enables the Payment System to work with different third-party payment gateways by converting their interfaces into a common interface.
PaymentGateway Interface: Defines the common operations for all payment methods.
Adapters: Translate calls from the common PaymentGateway interface to the specific third-party payment gateway implementation (e.g., PayPal).
Design Pattern Used:
Adapter Pattern - This pattern is used to convert the interface of a class into another interface that a client expects. It allows the system to work with different external or legacy APIs in a seamless manner.

# Project Structure
The code is structured into the following files:

PaymentGateway.java - Interface that defines the method makePayment().
PayPal.java - A third-party payment class with its own interface for making payments.
PayPalAdapter.java - Adapter class that translates calls to the PayPal API.
Main.java - Class that demonstrates how to use the adapter to integrate PayPal into the Payment System.

# How It Works
The PaymentGateway interface defines the common method makePayment() that all payment adapters will implement.
The PayPal class is a third-party payment service that has a different method for making payments, called sendPayment().
The PayPalAdapter class implements the PaymentGateway interface and converts calls to makePayment() into calls to sendPayment() for PayPal.
The client (Main.java) interacts with the PaymentGateway interface, which hides the complexities of the PayPal API.

# Project Requirements
Java Version: Java SE 8 or later
IDE: You can use IntelliJ IDEA, Eclipse, or any other Java-compatible IDE.
Command Line: Alternatively, you can compile and run the project using the command line.

# Future Enhancements
Adding more third-party payment gateways like Stripe or Square using their respective adapters.
Implementing error handling and retries for failed payments.
Adding support for international currencies and payment methods.
