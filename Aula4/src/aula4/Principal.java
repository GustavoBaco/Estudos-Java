/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula4;

/**
 *
 * @author gmanc
 */
public class Principal {
    public static void main(String[] args) {
      Contato contato1 = new Contato();
      contato1.nome = "Gustavo";
      contato1.endereco = "Rua maria quiteria";
      contato1.email = "gustavo@email.com.br";
      contato1.telefone = "169991000";
     
      System.out.println("Nome: " + contato1.nome + " Endereço: " + contato1.endereco + 
            " E-mail: " + contato1.email + " Telefone: " + contato1.telefone);
      
      Contato contato2 = new Contato();
      contato2.nome = "Carlos";
      contato2.endereco = "Rua hello world";
      contato2.email = "carlos@email.com.br";
      contato2.telefone = "99898928";
      
      System.out.println("Nome: " + contato2.nome + " Endereço: " + contato2.endereco + 
            " E-mail: " + contato2.email + " Telefone: " + contato2.telefone); 
      
      Contato contato3 = new Contato();
      contato3.nome = "Gabriella";
      contato3.endereco = "Rua maria quiteria";
      contato3.email = "gabriella@email.com.br";
      contato3.telefone = "854575484";
      
      System.out.println("Nome: " + contato3.nome + " Endereço: " + contato3.endereco + 
            " E-mail: " + contato3.email + " Telefone: " + contato3.telefone);
      
      Contato contato4 = new Contato();
      contato4.nome = "Mateus";
      contato4.endereco = "Rua  quiteria";
      contato4.email = "mateus@email.com.br";
      contato4.telefone = "47452151";

    System.out.println("Nome: " + contato4.nome + " Endereço: " + contato4.endereco + 
            " E-mail: " + contato4.email + " Telefone: " + contato4.telefone);
    
    
    
    }
    
}
