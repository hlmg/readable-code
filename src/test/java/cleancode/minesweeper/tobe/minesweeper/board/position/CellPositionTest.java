package cleancode.minesweeper.tobe.minesweeper.board.position;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CellPositionTest {

    @DisplayName("유효한 좌표로 CellPosition을 생성할 수 있다.")
    @Test
    void create() {
        // given
        int rowIndex = 0;
        int colIndex = 0;

        // when
        CellPosition cellPosition = CellPosition.of(rowIndex, colIndex);

        // then
        assertThat(cellPosition.getRowIndex()).isEqualTo(rowIndex);
        assertThat(cellPosition.getColIndex()).isEqualTo(colIndex);
    }

    @DisplayName("좌표가 유효하지 않으면 CellPosition을 생성할 수 없다.")
    @Test
    void createByInvalidIndexes() {
        // given
        int invalidRowIndex = -1;
        int invalidColIndex = -1;

        // when & then
        assertThatThrownBy(() -> CellPosition.of(invalidRowIndex, invalidColIndex))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage("올바르지 않은 좌표입니다.");
    }

    @DisplayName("상대 좌표로 이동할 수 있는 포지션인지 확인할 수 있다.")
    @Test
    void canCalculate() {
        // given
        CellPosition cellPosition = CellPosition.of(0, 0);
        RelativePosition relativePosition = RelativePosition.of(1, 1);

        // when
        boolean canCalculate = cellPosition.canCalculatePositionBy(relativePosition);

        // then
        assertThat(canCalculate).isTrue();
    }
}
