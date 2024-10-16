package cleancode.minesweeper.tobe.minesweeper.board.position;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CellPositionsTest {

    @DisplayName("제외할 포지션 목록으로 같은 위치에 있는 포지션들을 제거할 수 있다.")
    @Test
    void subtract() {
        // given
        CellPositions cellPositions = CellPositions.of(List.of(
                CellPosition.of(0, 0),
                CellPosition.of(1, 1),
                CellPosition.of(2, 2)
        ));

        List<CellPosition> positionListToSubtract = List.of(
                CellPosition.of(0, 0),
                CellPosition.of(1, 1)
        );

        // when
        List<CellPosition> remains = cellPositions.subtract(positionListToSubtract);

        // then
        assertThat(remains).hasSize(1);
    }
}
