/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacote;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Leonardo
 */
public class ContaController {
    
    public Conta buscar(int id){
        try {
            Conexao.abreConexao();
            ResultSet rs = null;
            
            String sql = "SELECT * FROM contas WHERE id = " + id;
            rs = Conexao.stmt.executeQuery(sql);
            
            Conta objeto = new Conta();
            
            if(rs.next()){
                objeto.setId(rs.getInt("id"));
                objeto.setConta(rs.getString("conta"));
                objeto.setNome(rs.getString("nome"));
                objeto.setCheque_especial(rs.getFloat("cheque_especial"));
            }
            
            return objeto;
            
        }catch(SQLException ex){
            return null;
        }

    }

}
