// import java.util.Date;

// public abstract class Bank_Account {
//     private String account_name;
//     private long account_number;
//     private Date date_of_creation;
//     private double balance;

//     public Bank_Account(String account_name, long account_number, Date date_of_creation, double balance) {
//         this.account_name = account_name;
//         this.account_number = account_number;
//         this.date_of_creation = date_of_creation;
//         this.balance = balance;
//     }

//     public String getAccount_name() {
//         return account_name;
//     }

//     public long getAccount_number() {
//         return account_number;
//     }

//     public Date getDate_of_creation() {
//         return date_of_creation;
//     }

//     public double getBalance() {
//         return balance;
//     }

//     public void deposit(double amount) {
//         balance += amount;
//         System.out.println("Deposit of $" + amount + " successful.");
//     }

//     public void withdraw(double amount) {
//         if (amount > balance) {
//             System.out.println("Insufficient funds.");
//         } else {
//             balance -= amount;
//             System.out.println("Withdrawal of $" + amount + " successful.");
//         }
//     }

//     public abstract double getInterest_rate();

//     public abstract double getWithdrawal_limit();
// }

// class Saving_Account extends Bank_Account {
//     private double interest_rate;

//     public Saving_Account(String account_name, long account_number, Date date_of_creation, double balance, double interest_rate) {
//         super(account_name, account_number, date_of_creation, balance);
//         this.interest_rate = interest_rate;
//     }

//     @Override
//     public double getInterest_rate() {
//         return interest_rate;
//     }

//     @Override
//     public double getWithdrawal_limit() {
//         return 0; // Not applicable for saving account
//     }
// }

// class Current_Account extends Bank_Account {
//     private double withdrawal_limit;

//     public Current_Account(String account_name, long account_number, Date date_of_creation, double balance, double withdrawal_limit) {
//         super(account_name, account_number, date_of_creation, balance);
//         this.withdrawal_limit = withdrawal_limit;
//     }

//     @Override
//     public double getInterest_rate() {
//         return 0; // Not applicable for current account
//     }

//     @Override
//     public double getWithdrawal_limit() {
//         return withdrawal_limit;
//     }
// }

