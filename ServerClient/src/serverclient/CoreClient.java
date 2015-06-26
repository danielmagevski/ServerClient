/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package serverclient;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 *
 * @author alunon
 */
public class CoreClient {
    
   public void enviarMensagem(String msg) throws IOException{
    
        try {
            
        String mensagem = "";
        Socket connection = new Socket ("192.168.4.117", 1234);
        
        ObjectOutputStream saida = new ObjectOutputStream(connection.getOutputStream());
        
        mensagem = "Cliente: " + msg;
        saida.writeObject(mensagem);
        saida.flush();
        
        saida.close();
        connection.close();
        } catch (IOException e ) {
            e.getMessage();            
        }         
    }    
}
    

