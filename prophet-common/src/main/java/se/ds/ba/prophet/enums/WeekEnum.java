package se.ds.ba.prophet.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author SE.COLA
 */


@AllArgsConstructor
@Getter
public enum WeekEnum {

    MONDAY("星期一", DayOfWeek.MONDAY),
    TUESDAY("星期二", DayOfWeek.TUESDAY),
    WEDNESDAY("星期三", DayOfWeek.WEDNESDAY),
    THURSDAY("星期四", DayOfWeek.THURSDAY),
    FRIDAY("星期五", DayOfWeek.FRIDAY),
    SATURDAY("星期六", DayOfWeek.SATURDAY),
    SUNDAY("星期日", DayOfWeek.SUNDAY);

    public String CN_W;
    public DayOfWeek dayOfWeek;

}