import java.rmi.*;
 
public class MyRemoteClient {
    public static void main(String[] args) {
    new MyRemoteClient().go();
    }	//close main
 
    public void go() {
        try {
            //(1)用戶端查詢 RMI registry
            //(2)RMI registry 傳回 stub object
            MyRemote service = (MyRemote)Naming.lookup("rmi://127.0.0.1/RemoteHello");
            //(3)client 就像取用真正服務一樣，呼叫 stub object 上的 method
            String s = service.sayHello();
            System.out.println(s);
        } catch(Exception ex) { ex.printStackTrace(); }
    }   //close go
}   //close MyRemoteClient