class StatesRunner{
    public static void main(String[] args){

        String statesNames = "karnataka";
        String[] districtsList = States.namesOfStates(statesNames);

        if(statesNames =="karnataka"){

            for(String district : districtsList){
                System.out.println(district);
            }

        }else{
            System.out.println("Invalid State Name");
        }
    }
}