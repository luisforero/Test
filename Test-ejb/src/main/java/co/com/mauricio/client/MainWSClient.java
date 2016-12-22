/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.mauricio.client;

import com.sun.xml.internal.ws.client.BindingProviderProperties;
import java.rmi.RemoteException;
import javax.xml.ws.BindingProvider;

/**
 *
 * @author Luis Wilmer Forero Romero<luis.forero@tecnocom.biz>
 */
public class MainWSClient {

    public static void main(String[] args) {
        try {

            FrontServiceService fss = new FrontServiceService();
            FrontService port = fss.getPort(FrontService.class);
            ((BindingProvider) port).getRequestContext().//
                    put(BindingProviderProperties.CONNECT_TIMEOUT, 2000);
            //Set timeout until the response is received         
            ((BindingProvider) port).getRequestContext().
                    put(BindingProviderProperties.REQUEST_TIMEOUT, 1900);
            System.out.println(port.sayHello("YEAAA"));
        } catch (Exception e) {
            if(e.getCause().getClass().getName().equals("java.net.SocketTimeoutException"))
            {
                System.out.println("SI SE!!: "+e.getMessage() + "\n\t" + e.getCause().toString());
            }else{
                System.out.println("No se"+e.getMessage() + "\n\t" + e.getCause().toString());
            }
        }
    }
}
