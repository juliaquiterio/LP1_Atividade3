package DAO;

import DTO.ImpressoraDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class ImpressoraDAO {
    //variaveis 
    Connection conn;  
    PreparedStatement pstm;

    public void cadastrarImpresora(ImpressoraDTO objimpressoradto) {
        String sql = "insert into impressora (numero_serie,material,peso,tamanho) values (?,?,?,?)";

        //classe de conexao
        conn = new ConexaoDAO().conectaBD();

        try {
            //preparando meu sql para receber dos '?'
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objimpressoradto.getNumeroserie());
            pstm.setString(2, objimpressoradto.getMaterial());
            pstm.setInt(3, objimpressoradto.getPeso());
            pstm.setInt(4,objimpressoradto.getTamanho());
            
            pstm.execute();
            pstm.close(); 
             
            
            //caso não funcione o try ele executa o catch
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "ImpressoraDAO" + erro);

        }
    }

}
