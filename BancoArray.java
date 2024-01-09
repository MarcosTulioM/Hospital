
package login.controller;

import java.util.ArrayList;
import javax.swing.JOptionPane;

final BancoArray banco = new BancoArray();

//Classe que funciona como banco de dados temporário
public class BancoArray implements Paciente{

        private String cpf;
        private String telefone;
        private String nome;
        private String doenca;
        private String senha;
        
        //ArrayList criado a partir da Herança da classe Paciente
        private ArrayList<Paciente> listaPacientes;

    public BancoArray() {
        
        this.listaPacientes = new ArrayList<>();
    }
    
    //Método para Adicionar pessoas
    public void adicionar(visaoCadastro v1) {
         cpf = this.cpf;
         telefone = this.telefone;
         nome = this.nome;
         doenca = this.doenca;
         senha = this.senha;
         
         this.listaPacientes.add(p1(cpf,telefone,nome,doenca,senha));
    }
    //Método para remover pessoas
    public void remover(Paciente p1) {
        this.listaPacientes.remove(p1(cpf,telefone,nome,doenca,senha));
    }
    
    //Método de consulta. Caso não seja encontrado é disparado um JPane com a mensagem de não encontrado.
    public Paciente consultar(String cpf) {
        try {
            for (PacienteConc paciente() : listaPacientes) {
                if (paciente.getCpf().equals(cpf)) {
                    return paciente;
                }
            }
        } catch (Exception e) {
            JOptionPane.ShowMessageDialog(null,"Paciente não encontrado!");
            return null;
        }
    }
    
    //Método para verificar login. Caso não seja encontrado é disparado um JPane com a mensagem de não cadastrado
 
        public boolean verificarLogin(String cpf, String senha) {
            try{
            Paciente paciente = consultar(cpf);
            if (paciente != null && paciente.getSenha().equals(senha)) {
                return true;
            }
    }
    catch (Exception e){
    
        JOptionPane.ShowMessageDialog(null,"Paciente não cadastrado!");
        return false;
    }

}
    @Override
    public Paciente p1(String cpf, String telefone, String nome, String doenca, String senha) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
    
