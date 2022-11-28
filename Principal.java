
class Principal {
    public static void main(String[] args) {
        Carro meuCarro1 = new Carro();
        meuCarro1.modelo = String.format("%s", "Fiat Uno");
        meuCarro1.anoDeFabricacao = 2020;
        System.out.println("Modelo: " + meuCarro1.modelo);
        System.out.println("Ano: " + meuCarro1.anoDeFabricacao);

        Proprietario proprietario1 = new Proprietario();
        proprietario1.nomeProprietario = "Marcelo";
        System.out.println("Nome: " + proprietario1.nomeProprietario);
        System.out.println();

        Carro meuCarro2 = new Carro();
        meuCarro2.modelo = "Fusca";
        meuCarro2.anoDeFabricacao = 1979;
        System.out.println("Modelo: " + meuCarro2.modelo);
        System.out.println("Ano: " + meuCarro2.anoDeFabricacao);
    }
}
