package vn.eztek.basicstarter.util;

import java.util.Date;

public class DateUtils {

  public static Long now() {
    return currentDate().getTime();
  }

  public static Date currentDate() {
    return new Date();
  }

}
