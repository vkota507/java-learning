// Day14_EcommerceInterfaces.java

interface PaymentProcessor {
    void processPayment(double amount);
    void refundPayment(String transactionId);
}

class StripeProcessor implements PaymentProcessor {
    public void processPayment(double amount) {
        System.out.println("Processing Stripe payment of Rs." + amount);
    }
    public void refundPayment(String transactionId) {
        System.out.println("Refunding Stripe transaction: " + transactionId);
    }
}

class PaytmProcessor implements PaymentProcessor {
    public void processPayment(double amount) {
        System.out.println("Processing Paytm payment of Rs." + amount);
    }
    public void refundPayment(String transactionId) {
        System.out.println("Refunding Paytm transaction: " + transactionId);
    }
}

class RazorpayProcessor implements PaymentProcessor {
    public void processPayment(double amount) {
        System.out.println("Processing Razorpay payment of Rs." + amount);
    }
    public void refundPayment(String transactionId) {
        System.out.println("Refunding Razorpay transaction: " + transactionId);
    }
}

// --------------------------------------------------

interface NotificationSender {
    void sendEmail(String to, String message);
    void sendSMS(String to, String message);
}

class EmailService implements NotificationSender {
    public void sendEmail(String to, String message) {
        System.out.println("Sending EMAIL to "+to+": "+message);
    }
    public void sendSMS(String to, String message) {
        // Not implemented in EmailService
        System.out.println("EmailService cannot send SMS.");
    }
}

class TwilioSMSService implements NotificationSender {
    public void sendEmail(String to, String message) {
        // Not implemented in TwilioSMSService
        System.out.println("TwilioSMSService cannot send Email.");
    }
    public void sendSMS(String to, String message) {
        System.out.println("Sending SMS to "+to+": "+message);
    }
}

// --------------------------------------------------

public class Day14_EcommerceInterfaces {
    public static void main(String[] args) {

        // Using PaymentProcessor interface with Paytm implementation
        PaymentProcessor payment = new PaytmProcessor();
        payment.processPayment(1500);
        payment.refundPayment("TXN12345");

        // Switching to Stripe implementation easily
        payment = new StripeProcessor();
        payment.processPayment(2500);
        payment.refundPayment("TXN67890");

        // Switching to Razorpay implementation easily
        payment = new RazorpayProcessor();
        payment.processPayment(2500);
        payment.refundPayment("TXN67890");

        // Using NotificationSender interface with EmailService
        NotificationSender notifier = new EmailService();
        notifier.sendEmail("customer@example.com", "Your order has been shipped!");
        notifier.sendSMS("9999999999", "This won't be sent by EmailService");

        // Switching to TwilioSMSService
        notifier = new TwilioSMSService();
        notifier.sendSMS("8888888888", "Your OTP is 123456");
        notifier.sendEmail("another@example.com", "This won't be sent by TwilioSMSService");
    }
}
