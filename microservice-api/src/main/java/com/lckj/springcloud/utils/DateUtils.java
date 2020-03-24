package com.lckj.springcloud.utils;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateFormatUtils;


/**
 * 
 * 日期公用类
 */
public class DateUtils {
    private static final Logger LOGGER = LoggerFactory.getLogger(DateUtils.class);

    /** yyyyMMdd时间格式 */
    public static final String FORMAT8 = "yyyyMMdd";

    /** yyyyMMddHHmmss时间格式 */
    public static final String FORMAT14 = "yyyyMMddHHmmss";

    /** yyyy-MM-dd HH:mm:ss时间格式 */
    public static final String FORMAT19 = "yyyy-MM-dd HH:mm:ss";

    /** yyyy-MM-dd HH:mm时间格式 */
    public static final String FORMAT16 = "yyyy-MM-dd HH:mm";

    public static final String DATE_FORMAT_YYYYMMDD = "yyyy-MM-dd";

    private DateUtils() {
    }

    public static String formatChar14(String char14) {
        if (char14 == null || char14.length() == 0) {
            return char14;
        }
        return char14.substring(0, 4) + "-" + char14.substring(4, 6) + "-" + char14.substring(6, 8) + " "
                + char14.substring(8, 10) + ":" + char14.substring(10, 12) + ":" + char14.substring(12, 14) + " ";
    }

    /**
     * 
     * 功能描述: <br>
     * 〈功能详细描述〉
     * 
     * @param time
     * @return
     */
    public static String getChar14(Timestamp time) {
        return DateFormatUtils.format(time.getTime(), "yyyyMMddHHmmss");
    }

    /**
     * 
     * 功能描述：将日期的时分秒去掉，只保留年月日 输入参数：date 日期
     * 
     * @param  : Date
     * @return date
     * @throw 日期格式转换错误
     * @see
     */
    public static Timestamp removeHHMMDDOfDate(Date date) {
        if (null != date) {
            DateFormat format = new SimpleDateFormat(DATE_FORMAT_YYYYMMDD);
            String reTime = format.format(date);
            try {
                date = format.parse(reTime);
            } catch (ParseException e) {
                return null;
            }
        } else {
            return null;
        }
        return new Timestamp(date.getTime());
    }

    /**
     * 功能描述: <br>
     * 〈功能详细描述〉
     * 
     * @param date
     * @param pattern
     * @return
     * @see [相关类/方法](可选)
     * @since [产品/模块版本](可选)
     */
    public static String format(Date date, String pattern) {
        if (date == null) {
            return null;
        } else {
            try {
                return new SimpleDateFormat(pattern).format(date);
            } catch (Exception e) {
                LOGGER.info("时间转换异常:" + date, e);
                return null;
            }
        }
    }

    /**
     * 功能描述: <br>
     * 〈功能详细描述〉
     * 
     * @param dateStr
     * @param pattern
     * @return
     * @see [相关类/方法](可选)
     * @since [产品/模块版本](可选)
     */
    public static Timestamp parse(String dateStr, String pattern) {
        if (StringUtils.isBlank(dateStr)) {
            return null;
        } else {
            try {
                return new Timestamp(new SimpleDateFormat(pattern).parse(dateStr).getTime());
            } catch (ParseException e) {
                LOGGER.error("DateUtils-parse: 日期格式转换错误");
                return null;
            }
        }
    }
    
    /**
     * 获取指定日期 向前或向后滚动特定天数后的日期
     * 
     * @param dateNow String 当前日期
     * @param rollDate String 待滚动的天数
     * @return String 指定日期 +/- 特定天数 后的日期（格式 YYYY-MM-DD）
     */
    public static String rollDate2(String dateNow, int rollDate) {
        String dateReturn = "";
        if (dateNow == null || dateNow.trim().length() < 8){
            return dateReturn;
        }

        dateNow = dateNow.trim();
        Calendar cal = Calendar.getInstance();
        int nYear = Integer.parseInt(dateNow.substring(0, 4));
        int nMonth = Integer.parseInt(dateNow.substring(5, 7));
        int nDate = Integer.parseInt(dateNow.substring(8, 10));
        cal.set(nYear, nMonth - 1, nDate);
        cal.add(Calendar.DATE, rollDate);
        String strYear = String.valueOf(cal.get(Calendar.YEAR));
        String strMonth = String.valueOf(cal.get(Calendar.MONTH) + 1);
        String strDay = String.valueOf(cal.get(Calendar.DAY_OF_MONTH));
        strMonth = (strMonth.length() == 1) ? "0" + strMonth : strMonth;
        strDay = (strDay.length() == 1) ? "0" + strDay : strDay;
        dateReturn = strYear + "-" + strMonth + "-" + strDay;
        return dateReturn;
    }
    
    public static String getChar19(Timestamp time) {
        if (time == null) {
            return null;
        }
        return DateFormatUtils.format(time.getTime(), FORMAT19);
    }
    
    public static Timestamp getTimestamp(String time,String format) {
        SimpleDateFormat df = new SimpleDateFormat(format);
        Timestamp parseTime = null;
        if (!StringUtils.isEmpty(time)) {
            try {
                parseTime = new Timestamp(df.parse(time).getTime());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return parseTime;
    }

    public static Timestamp getTimestamp(Timestamp time) {
        if (time == null) {
            return null;
        } else {
            return (Timestamp)time.clone();
        }
    }

}