// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

/**
 * http://www.dmg.org/PMML-4_3:TIME-ANCHOR enumeration.
 */
public enum TIMEANCHOR implements com.intellij.util.xml.NamedEnum {
	DATE_DAYS_SINCE_0 ("dateDaysSince[0]"),
	DATE_DAYS_SINCE_1960 ("dateDaysSince[1960]"),
	DATE_DAYS_SINCE_1970 ("dateDaysSince[1970]"),
	DATE_DAYS_SINCE_1980 ("dateDaysSince[1980]"),
	DATE_MONTHS_SINCE_0 ("dateMonthsSince[0]"),
	DATE_MONTHS_SINCE_1960 ("dateMonthsSince[1960]"),
	DATE_MONTHS_SINCE_1970 ("dateMonthsSince[1970]"),
	DATE_MONTHS_SINCE_1980 ("dateMonthsSince[1980]"),
	DATE_TIME_MILLISECONDS_SINCE_0 ("dateTimeMillisecondsSince[0]"),
	DATE_TIME_MILLISECONDS_SINCE_1960 ("dateTimeMillisecondsSince[1960]"),
	DATE_TIME_MILLISECONDS_SINCE_1970 ("dateTimeMillisecondsSince[1970]"),
	DATE_TIME_MILLISECONDS_SINCE_1980 ("dateTimeMillisecondsSince[1980]"),
	DATE_TIME_SECONDS_SINCE_0 ("dateTimeSecondsSince[0]"),
	DATE_TIME_SECONDS_SINCE_1960 ("dateTimeSecondsSince[1960]"),
	DATE_TIME_SECONDS_SINCE_1970 ("dateTimeSecondsSince[1970]"),
	DATE_TIME_SECONDS_SINCE_1980 ("dateTimeSecondsSince[1980]"),
	DATE_YEARS_SINCE_0 ("dateYearsSince[0]");

	private final String value;
	private TIMEANCHOR(String value) { this.value = value; }
	public String getValue() { return value; }

}
