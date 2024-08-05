public abstract class AcessorioDecorator implements BonecoInterface {
    private BonecoInterface boneco;

    public AcessorioDecorator(BonecoInterface boneco) {
        this.boneco = boneco;
    }

    public void desenhar() {
        boneco.desenhar();
    }
}
