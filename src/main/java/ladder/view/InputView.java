package ladder.view;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InputView {
    private static final Scanner SCANNER = new Scanner(System.in);

    private InputView() {
    }

    public static List<String> inputPlayerNames() {
        System.out.println(ViewMessages.INSTRUCTION_PLAYER_NAMES);
        String[] inputPlayerNames = SCANNER.nextLine().split(ViewMessages.COMMA);
        return Arrays.asList(inputPlayerNames);
    }

    public static int inputLadderHeight() {
        System.out.println(ViewMessages.INSTRUCTION_LADDER_HEIGHT);
        return Integer.parseInt(SCANNER.nextLine());
    }
}