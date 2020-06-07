package ladder.domain;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ladder {
    private static final DrawingLineStrategy drawingLineStrategy = new RandomDrawingLineStrategy();

    private final List<Line> lines;

    private Ladder(List<Line> lines) {
        this.lines = lines;
    }

    public static Ladder buildLadder(PlayersGroup playersGroup, int ladderHeight) {
        int playerCounts = playersGroup.getPlayerCounts();
        List<Line> ladder = Stream.generate(() -> Line.drawLine(playerCounts, drawingLineStrategy))
                .limit(ladderHeight)
                .collect(Collectors.toList());
        return new Ladder(ladder);
    }

    public List<List<Boolean>> getLadderBluePrint() {
        return lines.stream()
                .map(Line::getPointPositions)
                .collect(Collectors.toList());
    }

    public int getLadderHeight() {
        return lines.size();
    }
}