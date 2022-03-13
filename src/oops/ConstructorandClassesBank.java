package oops;

public class ConstructorandClassesBank {
    private String accountNo;
    private String phoneNo;
    private String emailAdd;
    private double balance;
    private String name;

    public ConstructorandClassesBank(String accountNo, String phoneNo, String emailAdd, double balance, String name) {
        this.accountNo = accountNo;
        this.phoneNo = phoneNo;
        this.emailAdd = emailAdd;
        this.balance = balance;
        this.name = name;

        System.out.println("The updated fields are " + accountNo + " " + phoneNo + " " + emailAdd + " " + balance + " " + name);
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmailAdd() {
        return emailAdd;
    }

    public void setEmailAdd(String emailAdd) {
        this.emailAdd = emailAdd;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void WithDrawFunds(double withdrawBal) {
        if (this.balance < withdrawBal) {
            System.out.println("Not Enough Balance!!!");
        } else {
            this.balance -= withdrawBal;
            System.out.println("Withdrawal of " + withdrawBal + " leaves " + this.balance + " balance in account remaining");
        }
    }

    public void DepositFunds(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made, Updated Balance is " + this.balance);
    }


    static class VipAccount {
        private String name;
        private String email;
        private String creditLimit;

        public VipAccount() {
            this.creditLimit = "defaultLimit";
            this.email = "defaultEmail";
            this.name = "defaultName";
        }

        public VipAccount(String vipname, String vipEmail) {
            this(vipname, vipEmail, "1000");
        }

        public VipAccount(String name, String email, String creditLimit) {
            this.name = name;
            this.email = email;
            this.creditLimit = creditLimit;
        }

        public String getName() {
            return name;
        }

        public String getEmail() {
            return email;
        }

        public String getCreditLimit() {
            return creditLimit;
        }
    }

}
