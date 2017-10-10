package Command.example2;

public class Receiver {

    private Square square;

    public boolean createSquare(int slide) {
        if (square == null) {
            square = new Square(slide);
            System.out.println("Square is created and slide is " + slide);
            return true;
        } else {
            return false;
        }
    }

    public boolean scaleSquare(int num) {
        if (square != null) {
            int temp = square.getSlide();
            int result = temp * num;
            square.setSlide(result);
            System.out.println("Square is scaled and slide is " + result);
            return true;
        } else {
            return false;
        }
    }

    public boolean unDoScaleSquare(int num){
        if (square != null) {
            int temp = square.getSlide();
            int result = temp / num;
            square.setSlide(result);
            System.out.println("Square is scaled and slide is " + result);
            return true;
        } else {
            return false;
        }
    }

    public boolean moveSquare(int num) {
        if (square != null) {
            int temp = square.getLocal();
            int result = temp + num;
            square.setLocal(result);
            System.out.println("Square is moved and slide is " + result);
            return true;
        } else {
            return false;
        }
    }

    public boolean destorySquare() {
        if (square != null) {
            square = null;
            return true;
        } else {
            return false;
        }
    }

}
