package AbstractFactory.eg1;

public class AccessUser implements IUser {
    @Override
    public void Insert() {
        System.out.println("insert User into Access");
    }

    @Override
    public void GetUser() {
        System.out.println("get User from Access");
    }
}
