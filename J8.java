class BankAccount{
 private double balance;
 private double minbalance;
 BankAccount(double amount){
  this.balance=amount;}
public void depositAmt(double amt,String income){
  balance=balance+amt;
  System.out.println(balance);}
public void withdrawAmt(double amt,String expense){
  if(balance-amt<0){
   System.out.println("Insufficient balance");}
  else{
    balance=balance-amt;
    System.out.println(balance);}}
public void penalty(){
  if(balance<500){
   double penalty=100.00;
   balance=balance-penalty;}}
public void interest(){
  double time=1.00/12.00;
  double rate=5.00/100.00;
  double interest=balance*time*rate;
  balance=balance+interest;}
public void getBalance(){
System.out.println("balance is:"+balance);}}


public class J8{
   public static void main(String[] args){
     BankAccount acc1=new BankAccount(500);
     acc1.getBalance();
     acc1.depositAmt(12000,"salary");
     acc1.withdrawAmt(5000,"House rent");
     acc1.withdrawAmt(2000,"Grocery");
     acc1.withdrawAmt(1000,"milk");
     acc1.withdrawAmt(4100,"Gift");
     acc1.penalty();
     acc1.interest();
     acc1.getBalance();}}