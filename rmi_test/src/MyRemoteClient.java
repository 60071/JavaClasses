import java.rmi.*;
 
public class MyRemoteClient {
    public static void main(String[] args) {
    new MyRemoteClient().go();
    }	//close main
 
    public void go() {
        try {
            //(1)�Τ�ݬd�� RMI registry
            //(2)RMI registry �Ǧ^ stub object
            MyRemote service = (MyRemote)Naming.lookup("rmi://127.0.0.1/RemoteHello");
            //(3)client �N�����ίu���A�Ȥ@�ˡA�I�s stub object �W�� method
            String s = service.sayHello();
            System.out.println(s);
        } catch(Exception ex) { ex.printStackTrace(); }
    }   //close go
}   //close MyRemoteClient