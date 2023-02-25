package lk.matrix.connect4.service;

public interface BoardUI {
    void update(int col, boolean isHuman);

    void notifyWinner(Winner winner);
}
