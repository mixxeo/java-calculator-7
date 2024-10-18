package calculator;

import java.util.List;

public class StringSumCalculator {
    private static final String START_MESSAGE = "덧셈할 문자열을 입력해 주세요.";
    private static final String RESULT_MESSAGE_PREFIX = "결과 : ";
    private static InputHandler inputHandler;

    StringSumCalculator() {
        inputHandler = new InputHandler();
    }

    public void run() {
        System.out.println(START_MESSAGE);

        String inputString = inputHandler.inputString();
        List<Integer> numbers = inputHandler.extractNumbers(inputString);
        int result = sum(numbers);

        printResult(result);
    }

    private int sum(List<Integer> numbers) {
        return numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }

    private void printResult(int result) {
        System.out.println(RESULT_MESSAGE_PREFIX + result);
    }
}
