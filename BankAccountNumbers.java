class BankAccountNumbers{
   public static void main(String[] args){
     System.out.println("running BankAccountNumbers in main method");

      long bankAccount1=9123456789L;
      long bankAccount2=9813425526L;
      long bankAccount3=5456777677L;
      long bankAccount4=6543678888L;
      long bankAccount5=6774484735L;

     long[] bankAccountNumbers={bankAccount1,bankAccount2,bankAccount3,
           bankAccount4,bankAccount5};
     int totalBankAccountDetails=bankAccountNumbers.length;
      System.out.println("totalBankAccountDetails="+totalBankAccountDetails);
 }
 }