

import java.rmi.*;
import java.rmi.server.*;
 
//1�B�����~�� UnitcastRemoteObject�A�~�ন�����ݪA�Ȫ��ȫ�
//2�B������@ Remote interface
public class MyRemoteImplement extends UnicastRemoteObject implements MyRemote {
 
    //3�B���g�L�Ѽƪ� constructor�A�ëŧi�|�ߥX RemoteException �ҥ~
    public MyRemoteImplement() throws RemoteException { }   //close constructor
 
    public static void main(String[] args) {
        try {
            //4�B�V RMI registry �n�O�A��
            MyRemote service = new MyRemoteImplement();
            //���A�ȩR�W(client �|�a�W�r�d�� registry)�A�æV RMI registry �n�O
            //RMI �|�N stub ���洫���\ stub �[�J registry
            Naming.rebind("RemoteHello", service);
        } catch(Exception ex) { ex.printStackTrace(); }
    }   //close main
 
    public String sayHello() {
        return "Server says, 'Hey!'";
    }   //close sayHello
}   //close MyRemoteImplement