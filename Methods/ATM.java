 class ATM{
	 public static void main(String[] args){
		 
		 System.out.println("insert ATM card");
		 ATM.isATMCardInsertedorNot();
		 
		 System.out.println("ATM reads the card");
		 ATM.ifATMReadsTheCardOrNot();
		 
		 System.out.println("Select language");
		 ATM.didPersonSelectsLanguage();
		 
		 System.out.println("Enter pin");
		 ATM.personEnteredPinOrNot();
		 
		 System.out.println("Select transaction");
		 ATM.didPersonSelectTransitionMood();
		 
         System.out.println("Enter Amount");
		 ATM.didPersonEnteredAmount();
		 
		 System.out.println("ATM verify the transaction");
		 ATM.doesATMVerifyTheTransaction();
		 
		 System.out.println("Cash is dispensed");
		 ATM.didCashGotDispensed();
		 
		 System.out.println("Take ur Card");
		 ATM.didPersonTakeCard();
		 
		 System.out.println("Take receipt");
		 ATM.didPersonTakeReceipt();
		 
		 System.out.println("Transaction completed");
		 ATM.isTransactionCompleted();
	 }
	 
	 static void isATMCardInsertedorNot(){
		 System.out.println("Yes ATM card is inserted");
	 }
	 static void ifATMReadsTheCardOrNot(){
		 System.out.println("Yes ATM reads the card");
	 }
	 static void didPersonSelectsLanguage(){
		 System.out.println("Yes person selected english language");
	 }
	 static void personEnteredPinOrNot(){
		 System.out.println("Yes person entered the pin");
	 }
	 static void didPersonSelectTransitionMood(){
		 System.out.println("Yes person selected transaction mood in cash");
	 }
	 static void didPersonEnteredAmount(){
		 System.out.println("Yes person entered 5000 ammount");
	 }
	 static void doesATMVerifyTheTransaction(){
		 System.out.println("Yes ATM machine verified the transaction ammount");
	 }
     static void didCashGotDispensed(){
		 System.out.println("Yes person cash got dispensed");
	 }	 
	 static void didPersonTakeCard(){
		 System.out.println("Yes person took card");
	 }
     static void didPersonTakeReceipt(){
		 System.out.println("Yes person took ammount receipt");
	 }	 
	 static void isTransactionCompleted(){
		 System.out.println("Yes the process of ATM transaction got completed");
	 }
 }