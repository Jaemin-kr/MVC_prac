package model.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

@AllArgsConstructor
@Getter
public enum CommandController {
    FIRST("1"),
    SECOND("2"),
    THIRD("3"),
    QUIT("Q");

    private static final String INVALID_COMMAND_MSG = "올바르지 않은 커맨드입니다.";
    private final String command;

    public static CommandController from(String command){
        return Arrays.stream(values())
                .filter(commandController -> commandController.command.equals(command))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException(INVALID_COMMAND_MSG));
    }
    public boolean isNotQuit() { return this != QUIT; }



}
