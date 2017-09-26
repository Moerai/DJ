package kr.ac.dy.it.shop.common.util;

import lombok.extern.slf4j.Slf4j;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by PARK on 2017-02-08.
 */
@Slf4j
public class DateUtils {

	public static final String FORMAT_DEFAULT = "yyyy.MM.dd HH:mm";
	public static final String FORMAT_YYYYMMDDHHMMSSMMM = "yyyy.MM.dd HH:mm:ss.SSS";
	public static final String FORMAT_YYYYMMDD = "yyyy-MM-dd";
	public static final String FORMAT_HH ="HH";

	public static String toDateString(Date value) {
		return toDateString(value, FORMAT_DEFAULT);
	}

	public static String toDateString(Date value, String formatText) {
		if (value != null) {
			return (new SimpleDateFormat(formatText)).format(value);
		}
		return StringUtils.Empty;
	}

	public static String getCurrentDate() {
		return getCurrentDate(FORMAT_DEFAULT);
	}

	public static String getCurrentDate(String format) {
		return toDateString(Calendar.getInstance().getTime(), format);
	}

	public static String getCurrentMillisecond() {
		return getCurrentDate(FORMAT_YYYYMMDDHHMMSSMMM);
	}


	public static Date toDate(String dateString) {

		if (StringUtils.isNotEmpty(dateString)) {
			if (dateString.length() == 10 && dateString.contains("-")) {
				try {
					Date date = (new SimpleDateFormat(FORMAT_YYYYMMDD)).parse(dateString);
					return date;
				} catch (ParseException e) {
				}
			}
		}

		return null;
	}

	public static Date now() {
		return Calendar.getInstance().getTime();
	}

	/**
	 * 자정바로전 시간인데, 이름이.. 음...
	 *
	 * @param date
	 * @return
	 */
	public static Date getDateMidnight(Date date) {

		Calendar cal = Calendar.getInstance();
		cal.setTime(date);

		Calendar cal2 = Calendar.getInstance();
		cal2.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DATE), 23, 59, 59);
		cal2.set(Calendar.MILLISECOND, 999);

		return cal2.getTime();
	}

	public static Date GET_START_DATE() {
		Calendar cal = Calendar.getInstance();
		cal.set(1, 1, 0, 0, 0, 0);
		return cal.getTime();
	}

	public static Date GET_END_DATE() {
		Calendar cal = Calendar.getInstance();
		cal.set(9999, 11, 31, 23, 59, 59);
		return cal.getTime();
	}

	/**
	 * 날짜 리턴 by 날짜문자열 + 시간 + 분
	 *
	 * @param date
	 * @param hour
	 * @param minute
	 * @return
	 */
	public static Date dateByDateAndHourAndMinute(String date, int hour, int minute) {

		int numbers[] = NumberUtils.dateNumberByString(date);

		int year = numbers[0];
		int month = numbers[1];
		int day = numbers[2];

		Calendar cal = Calendar.getInstance();
		cal.set(year, month - 1, day, hour, minute, 0);
		return cal.getTime();
	}




	/**
	 * 날짜값이 startDt가 endDt보다 크거나같은지 여부
	 */
	public static boolean dayEqualOrGreaterThan(Date startDt, Date endDt) {
		long times = endDt.getTime() - startDt.getTime();
		long days = times / (24 * 60 * 60 * 1000);
		return days <= 0;
	}

	/**
	 * 날짜값이 startDt가 endDt보다 작거나같은지 여부
	 */
	public static boolean dayEqualOrLessThan(Date startDt, Date endDt) {
		long times = endDt.getTime() - startDt.getTime();
		long days = times / (24 * 60 * 60 * 1000);
		return days >= 0;
	}

	/**
	 * 날짜값이 startDt가 endDt보다 작은지 여부
	 */
	public static boolean dayLessThan(Date startDt, Date endDt) {
		long times = endDt.getTime() - startDt.getTime();
		long days = times / (24 * 60 * 60 * 1000);
		return days > 0;
	}

	/**
	 * 날짜값이 startDt가 endDt와 같은지 여부
	 */
	public static boolean dayEqual(Date startDt, Date endDt) {
		long times = endDt.getTime() - startDt.getTime();
		long days = times / (24 * 60 * 60 * 1000);
		return days == 0;
	}

	/**
	 * 현재날짜에 year를 더하고 day를 더함.
	 */
	public static Date addYearAndDay(Date date, int year, int day) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		if (year != 0) {
			calendar.add(Calendar.YEAR, year);
		}
		calendar.add(Calendar.DATE, day);
		return calendar.getTime();
	}





}
