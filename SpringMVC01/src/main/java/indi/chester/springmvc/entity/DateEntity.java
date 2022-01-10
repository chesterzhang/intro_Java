package indi.chester.springmvc.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class DateEntity {
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
