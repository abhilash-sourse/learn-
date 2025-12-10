class overload {

    void deposit(int amount) {
        System.out.println("Deposited cash: ₹" + amount);
    }

    
    void deposit(int amount, String chequeNumber) {
        System.out.println("Deposited cheque: ₹" + amount + " | Cheque No: " + chequeNumber);
    }

 
    void deposit(double amount, String upiId, String reference) {
        System.out.println("Online transfer: ₹" + amount + " | UPI: " + upiId + " | Ref: " + reference);
    }

    public static void main(String[] args) {
        overload b = new overload();

        b.deposit(2000);                                 
        b.deposit(5000, "CHQ1234");                      
        b.deposit(1200.50, "abhi@upi", "REF987654");      
    }
}
