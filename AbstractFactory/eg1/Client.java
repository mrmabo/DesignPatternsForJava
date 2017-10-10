package AbstractFactory.eg1;

public class Client {
    public static void main(String[] args) {
        IFactory sqlserverFactory = new SqlserverFactory();

        IUser user = sqlserverFactory.createUser();
        user.Insert();
        user.GetUser();

        IDepartment iDepartment = sqlserverFactory.createDepartment();
        iDepartment.list();
        iDepartment.show();

        IFactory accessFactory = new AccessFactory();

        IUser useraccess = accessFactory.createUser();
        useraccess.GetUser();
        useraccess.Insert();

        IDepartment iDepartment1 = accessFactory.createDepartment();
        iDepartment1.list();;
        iDepartment1.show();
    }
}
