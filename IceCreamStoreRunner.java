class IceCreamStoreRunner{
   public static void main(String[] args){
	   String name=null;
	   String flavour=null;
	   int cost=500;
	   char size='l';
       boolean cone=false;
	   boolean cup=true;
	   IceCreamStore.save(name,flavour,cost,size,cone,cup);
   }
}