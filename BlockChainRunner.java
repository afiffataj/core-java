class BlockChainRunner{
    public static void main(String[] args){

        BlockChain blockChain1=new BlockChain();
        BlockChain blockChain2=new BlockChain();

        System.out.println(blockChain1.blocks);
        System.out.println(blockChain1.name);
        System.out.println(blockChain1.value);
        System.out.println(blockChain1.transactions);
        System.out.println(blockChain1.network);
        System.out.println(blockChain1.fee);
        System.out.println(blockChain1.users);
        System.out.println(blockChain1.type);
        System.out.println(blockChain1.reward);
        System.out.println(blockChain1.status);

        blockChain2.fee=2.5;
        blockChain2.users=500;
        blockChain2.type="Public";
        blockChain2.reward=10.9;
        blockChain2.status="Active";
        System.out.println(blockChain2.blocks);
        System.out.println(blockChain2.name);
        System.out.println(blockChain2.value);
        System.out.println(blockChain2.transactions);
        System.out.println(blockChain2.network);
        System.out.println(blockChain2.fee);
        System.out.println(blockChain2.users);
        System.out.println(blockChain2.type);
        System.out.println(blockChain2.reward);
        System.out.println(blockChain2.status);
    }
}