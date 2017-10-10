package AbstractFactory.eg1;

public class AccessDepartment implements  IDepartment{
    @Override
    public void list() {
        System.out.println("list for department at access");
    }

    @Override
    public void show() {
        System.out.println("show for department at access");
    }
}
