public class Sapato extends AcessorioDecorator {
    public Sapato(BonecoInterface boneco) {
        super(boneco);
    }

    @Override
    public void desenhar() {
        super.desenhar();
        System.out.print("""
                ‾  ‾
                """);
    }
}
