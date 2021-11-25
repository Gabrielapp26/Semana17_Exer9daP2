public class Carro extends Veiculo{
    
    private String placa;

    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    @Override
    public String getModelo() {
        // TODO Auto-generated method stub
        return "Onix";
    }
    @Override
    public void setAno(int ano) {
        // TODO Auto-generated method stub
        super.setAno(ano);
    }
    @Override
    public void setMarca(String marca) {
        // TODO Auto-generated method stub
        super.setMarca(marca);
    }
    
    
}
