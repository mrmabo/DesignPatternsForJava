package Template.example1;

import java.util.List;

public abstract class AlphabetTemplate {

    protected abstract String getSymmetry(List list);

    protected abstract void reconstruct(List list, String symmetry);

    public final void processAlphabet(List list) {
        String symmetry = getSymmetry(list);
        reconstruct(list, symmetry);
    }
}
