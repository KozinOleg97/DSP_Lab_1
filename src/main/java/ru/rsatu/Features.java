package ru.rsatu;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Features {

    public String getCurTimeStr(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yy HH.mm");

        LocalDateTime now = LocalDateTime.now();

        return now.format(formatter);
    }
}
