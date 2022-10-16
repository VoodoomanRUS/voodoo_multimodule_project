package org.example;


import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Runner {
    public static void main(String[] args) {
        Phone phone = new Phone("+7", "91222331");
        String fullNumber = PhoneUtil.getFullNumber(phone);
        log.info(fullNumber);


    }
}
