

import java.rmi.*;
 
//��w�~�� Remote interface �� interface
//�ΥH�ŧi�� interface �P RMI ����
public interface MyRemote extends Remote {
    //�C�ӻ��ݩI�s���|�Q�{�������I�A�]�������ŧi�|�ߥX�ҥ~
    public String sayHello() throws RemoteException;
}   //close MyRemote