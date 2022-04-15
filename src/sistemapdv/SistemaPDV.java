package sistemapdv;

public class SistemaPDV {

    
    public static void main(String[] args) {
        
        
        //CRIANDO OBJETO DO TIPO CONEXÃO
        ConexaoMySQL conecta = new ConexaoMySQL();        
        conecta.ConectaBanco();
        
        
    }
    
}
