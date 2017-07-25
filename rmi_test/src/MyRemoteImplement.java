

import java.rmi.*;
import java.rmi.server.*;
 
//1、必須繼承 UnitcastRemoteObject，才能成為遠端服務的務建
//2、必須實作 Remote interface
public class MyRemoteImplement extends UnicastRemoteObject implements MyRemote {
 
    //3、撰寫無參數的 constructor，並宣告會拋出 RemoteException 例外
    public MyRemoteImplement() throws RemoteException { }   //close constructor
 
    public static void main(String[] args) {
        try {
            //4、向 RMI registry 登記服務
            MyRemote service = new MyRemoteImplement();
            //幫服務命名(client 會靠名字查詢 registry)，並向 RMI registry 登記
            //RMI 會將 stub 做交換並擺 stub 加入 registry
            Naming.rebind("RemoteHello", service);
        } catch(Exception ex) { ex.printStackTrace(); }
    }   //close main
 
    public String sayHello() {
        return "Server says, 'Hey!'";
    }   //close sayHello
}   //close MyRemoteImplement