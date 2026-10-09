class Pool{
	public static void main(String[] args){

		System.out.println("Is pool open");
		Pool.isPoolOpen();
		Pool.isPoolOpen();
		Pool.isPoolOpen();

		System.out.println("Is water clean");
		Pool.isWaterClean();
		Pool.isWaterClean();
		Pool.isWaterClean();

		System.out.println("Can children swim");
		Pool.canChildrenSwim();
		Pool.canChildrenSwim();
		Pool.canChildrenSwim();

		System.out.println("Are trainers available");
		Pool.areTrainersAvailable();
		Pool.areTrainersAvailable();
		Pool.areTrainersAvailable();

		System.out.println("Pool name");
		System.out.println(Pool.getPoolName());
		System.out.println(Pool.getPoolName());
		System.out.println(Pool.getPoolName());

		System.out.println("Pool fee");
		System.out.println(Pool.getPoolFee());
		System.out.println(Pool.getPoolFee());
		System.out.println(Pool.getPoolFee());

		System.out.println("Pool depth");
		System.out.println(Pool.getPoolDepth());
		System.out.println(Pool.getPoolDepth());
		System.out.println(Pool.getPoolDepth());

		System.out.println("Pool location");
		System.out.println(Pool.getPoolLocation());
		System.out.println(Pool.getPoolLocation());
		System.out.println(Pool.getPoolLocation());
	}

	static void isPoolOpen(){
		System.out.println("Yes, the pool is open");
	}

	static void isWaterClean(){
		System.out.println("Yes, the water is clean");
	}

	static void canChildrenSwim(){
		System.out.println("Yes, children can swim with supervision");
	}

	static void areTrainersAvailable(){
		System.out.println("Yes, trainers are available");
	}

	static String getPoolName(){
		String name = "Blue Pool";
		return name;
	}

	static int getPoolFee(){
		int fee = 100;
		return fee;
	}

	static double getPoolDepth(){
		double depth = 5.5;
		return depth;
	}

	static String getPoolLocation(){
		String location = "Bengaluru";
		return location;
	}
}
