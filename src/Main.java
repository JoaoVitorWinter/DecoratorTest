public class Main {
    public static void main(String[] args) {
        BonecoInterface bonecoPadrao = new Boneco();
        BonecoInterface bonecoChapeu = new Chapeu(new Boneco());
        BonecoInterface bonecoSapato = new Sapato(new Boneco());
        BonecoInterface bonecoTudo = new Chapeu(new Sapato(new Boneco()));

        System.out.println("\n---------------\n");
        bonecoPadrao.desenhar();
        System.out.println("\n---------------\n");
        bonecoChapeu.desenhar();
        System.out.println("\n---------------\n");
        bonecoSapato.desenhar();
        System.out.println("\n---------------\n");
        bonecoTudo.desenhar();
    }
}