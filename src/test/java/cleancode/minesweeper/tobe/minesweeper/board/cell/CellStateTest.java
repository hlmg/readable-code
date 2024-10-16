package cleancode.minesweeper.tobe.minesweeper.board.cell;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CellStateTest {

    @DisplayName("셀의 초기 상태는 닫혀있지 않고, 깃발이 꽂혀있지 않은 상태여야 한다.")
    @Test
    void initialize() {
        // when
        CellState cellState = CellState.initialize();

        // then
        assertThat(cellState.isOpened()).isFalse();
        assertThat(cellState.isFlagged()).isFalse();
    }

    @DisplayName("셀에 깃발을 꽂을 수 있다.")
    @Test
    void flag() {
        // given
        CellState cellState = CellState.initialize();

        // when
        cellState.flag();

        // then
        assertThat(cellState.isFlagged()).isTrue();
    }

    @DisplayName("셀을 오픈할 수 있다.")
    @Test
    void open() {
        // given
        CellState cellState = CellState.initialize();

        // when
        cellState.open();

        // then
        assertThat(cellState.isOpened()).isTrue();
    }
}
