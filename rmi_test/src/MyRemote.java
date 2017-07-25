

import java.rmi.*;
 
//制定繼承 Remote interface 的 interface
//用以宣告此 interface 與 RMI 有關
public interface MyRemote extends Remote {
    //每個遠端呼叫都會被認為有風險，因此必須宣告會拋出例外
    public String sayHello() throws RemoteException;
}   //close MyRemote