package org.example;

import lombok.*;

@AllArgsConstructor
@RequiredArgsConstructor
@Getter
public class Phone {
    @NonNull
    String prefix;
    @NonNull
    String number;

    String bonusCode;

}
