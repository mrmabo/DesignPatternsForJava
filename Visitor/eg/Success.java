package Visitor.eg;

public class Success extends Action {
    @Override
    public void getManConclusion(Man concretePeron) {
        System.out.println("1 man");
    }

    @Override
    public void getWomanConclusion(Woman ConcretePerson) {
        System.out.println("2 woman");
    }
}
