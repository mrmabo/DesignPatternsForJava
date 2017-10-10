package Template.example1;

import java.util.List;

public class implementAlphabet extends AlphabetTemplate {

    @Override
    protected String getSymmetry(List list) {
        return list.get(0).toString();
    }

    @Override
    protected void reconstruct(List list, String symmetry) {
        if (symmetry.equals("NONE")) {
            for (int i = 5; i < list.size(); i++) {
                System.out.println(list.get(i).toString());
            }
        } else if (symmetry.equals("VERTICAL")) {
            String semeCharLine = "";
            String CompleteCharLine = "";
            for (int i = 5; i < list.size(); i++) {
                semeCharLine = list.get(i).toString();
                CompleteCharLine = semeCharLine;
                for (int j = 0; j < semeCharLine.length(); j++) {
                    CompleteCharLine += semeCharLine.charAt(semeCharLine.length() - j - 1);
                }
                System.out.println(CompleteCharLine);
            }

        } else if (symmetry.equals("HORIZONTAL")) {
            String semeCharLine = "";
            String[] CompleteCharLine = new String[Integer.parseInt(list.get(2).toString())];
            for (int i = 5; i < list.size(); i++) {
                semeCharLine = list.get(i).toString();
                CompleteCharLine[i - 5] = semeCharLine;
                System.out.println(semeCharLine);
            }
            for (int k = CompleteCharLine.length - 1; k > -1; k--) {
                System.out.println(CompleteCharLine[k]);
            }
        }

    }
}
