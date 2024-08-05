public class Chapeu extends AcessorioDecorator {
    public Chapeu(BonecoInterface boneco) {
        super(boneco);
    }

    @Override
    public void desenhar() {
        System.out.print("""
                .-.
                |_|
                """);
        super.desenhar();
    }
}
