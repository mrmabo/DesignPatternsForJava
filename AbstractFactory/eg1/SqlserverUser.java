package AbstractFactory.eg1;

public class SqlserverUser implements IUser {
    @Override
    public void Insert() {
        System.out.println("insert User into SQL Server");
    }

    @Override
    public void GetUser() {
        System.out.println("get User from SQL Server");
    }
}
