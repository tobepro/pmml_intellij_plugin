// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom.enums;

/**
 * http://www.dmg.org/PMML-4_3:DATATYPE enumeration.
 */
public enum DataType implements com.intellij.util.xml.NamedEnum {
	BOOLEAN ("boolean"),
	DATE ("date"),
	DATE_DAYS_SINCE_0 ("dateDaysSince[0]"),
	DATE_DAYS_SINCE_1960 ("dateDaysSince[1960]"),
	DATE_DAYS_SINCE_1970 ("dateDaysSince[1970]"),
	DATE_DAYS_SINCE_1980 ("dateDaysSince[1980]"),
	DATE_TIME ("dateTime"),
	DATE_TIME_SECONDS_SINCE_0 ("dateTimeSecondsSince[0]"),
	DATE_TIME_SECONDS_SINCE_1960 ("dateTimeSecondsSince[1960]"),
	DATE_TIME_SECONDS_SINCE_1970 ("dateTimeSecondsSince[1970]"),
	DATE_TIME_SECONDS_SINCE_1980 ("dateTimeSecondsSince[1980]"),
	DOUBLE ("double"),
	FLOAT ("float"),
	INTEGER ("integer"),
	STRING ("string"),
	TIME ("time"),
	TIME_SECONDS ("timeSeconds");

	private final String value;
	private DataType(String value) { this.value = value; }
	public String getValue() { return value; }

}
