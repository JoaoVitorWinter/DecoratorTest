public class Boneco implements BonecoInterface {
    @Override
    public void desenhar() {
        System.out.print("""
                 O
                /|\\
                / \\
                """);
    }
}
