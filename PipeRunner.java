class PipeRunner{
    public static void main(String[] args){

        Pipe pipe1=new Pipe();
        Pipe pipe2=new Pipe();

        System.out.println(pipe1.length);
        System.out.println(pipe1.material);
        System.out.println(pipe1.price);
        System.out.println(pipe1.diameter);
        System.out.println(pipe1.brand);
        System.out.println(pipe1.thickness);
        System.out.println(pipe1.quantity);
        System.out.println(pipe1.type);
        System.out.println(pipe1.weight);
        System.out.println(pipe1.color);

        pipe2.thickness=2.5;
        pipe2.quantity=4;
        pipe2.type="Round";
        pipe2.weight=500.9;
        pipe2.color="White";
        System.out.println(pipe2.length);
        System.out.println(pipe2.material);
        System.out.println(pipe2.price);
        System.out.println(pipe2.diameter);
        System.out.println(pipe2.brand);
        System.out.println(pipe2.thickness);
        System.out.println(pipe2.quantity);
        System.out.println(pipe2.type);
        System.out.println(pipe2.weight);
        System.out.println(pipe2.color);
    }
}