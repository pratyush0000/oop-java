package PracLab1;

public class Q2 {
        private String name;
        private int accountNumber;
        private String accountType;
        private double balance;

        public Q2(String name, int accountNumber, String accountType, double balance){
            this.name=name;
            this.accountNumber=accountNumber;
            this.accountType=accountType;
            this.balance=balance;
        }

        public void Deposit(int deposit){
            if(balance>=0){
                balance += deposit;
                System.out.println("Deposited: " + deposit);
                System.out.println("New Balance: " + balance);
                System.out.println("--------------------");
            }
        }

        public void DisplayBalance(){
            System.out.println("Account Holder: " + name);
            System.out.println("Balance: " + balance);
            System.out.println("--------------------");
        }

        public void Withdraw(int withdraw){
            if (balance>0 && withdraw<=balance){
                balance -= withdraw;
                System.out.println("Withdrawn: " + withdraw);
                System.out.println("New Balance: " + balance);
                System.out.println("--------------------");
            }

        }
        public static void main(String[] args) {
            Q2 x = new Q2("Mr. X", 610 , "Death", 10);
            x.Deposit(10);
            x.Withdraw(20);
            x.DisplayBalance();
        }
}
