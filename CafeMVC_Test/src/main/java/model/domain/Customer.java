package model.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Customer {
    private final String name;
    private final String phoneNumber;
    private final int birth;

}
