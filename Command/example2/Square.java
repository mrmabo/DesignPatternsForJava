package Command.example2;

public class Square {

    private int slide;
    private int local;

    private Square square;

    public Square(int slide) {
        this.slide = slide;
        this.local = 0;
    }

    public void setSlide(int slide) {
        this.slide = slide;
    }

    public int getSlide() {
        return slide;
    }

    public int getLocal() {
        return local;
    }

    public void setLocal(int local) {
        this.local = local;
    }

    @Override
    public String toString() {
        return "Square{" +
                "slide=" + slide +
                '}';
    }
}
