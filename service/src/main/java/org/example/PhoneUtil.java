package org.example;

import lombok.experimental.UtilityClass;

@UtilityClass
public class PhoneUtil {
    public String getFullNumber(Phone phone) {
        return phone.getPrefix() + phone.getNumber();
    }

    public String getPhoneWithCode(Phone phone) {
        if (phone.getBonusCode() != null) {
            String code = "#" + phone.getBonusCode();
            return phone.getPrefix() + phone.getNumber() + code;
        } else {
            return getFullNumber(phone);
        }
    }

}
