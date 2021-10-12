package by.alexrom.s06;

public class Main2 {

    public static void main(String[] args) {

        LongWordHandler longWordHandler = new LongWordHandler(3, 1);
        AlphabetHandler alphabetHandler = new AlphabetHandler(longWordHandler);
        LowerCaseHandler lowerCaseHandler = new LowerCaseHandler(alphabetHandler);
        System.out.println(longWordHandler.handleMessage("Павлик заебал со своей дотой и интом"));

    }

}
