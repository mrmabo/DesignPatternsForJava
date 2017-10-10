package AbstractFactory.eg1;

public class SqlserverDepartment implements IDepartment {
    @Override
    public void list() {
        System.out.println("list for department");
    }

    @Override
    public void show() {
        System.out.println("show for department");
    }
}
