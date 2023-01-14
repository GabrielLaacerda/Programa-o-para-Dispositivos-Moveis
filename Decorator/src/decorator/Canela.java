package decorator;

public class Canela implements BebidaDecorator{
    
    private Bebida b;
    private String desc = "com Canela";
    
    public Canela(Bebida b){
        this.b = b;
    }
    
    @Override
    public float custo() {
        return 0.5f + b.custo();
    }
    
    @Override
    public String getDesc(){
        return this.desc;
    }
}
