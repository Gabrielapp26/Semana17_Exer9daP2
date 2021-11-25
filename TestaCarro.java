public class TestaCarro{
    public static void main(String[] args){
        Carro carro = new Carro();

        carro.setMarca("Chevrolet");
        carro.setAno(2015);
        carro.setModelo("Onix");
        carro.setPlaca("PGM2267");

        System.out.println("Cliente Patrícia:");
        System.out.println("Marca do carro: "+carro.getMarca());
        System.out.println("Modelo: "+carro.getModelo());
        System.out.println("Ano: "+carro.getAno());
        System.out.println("Placa: "+carro.getPlaca());

    }
}