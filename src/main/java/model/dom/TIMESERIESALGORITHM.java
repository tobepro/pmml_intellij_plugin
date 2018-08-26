// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

/**
 * http://www.dmg.org/PMML-4_3:TIMESERIES-ALGORITHM enumeration.
 */
public enum TIMESERIESALGORITHM implements com.intellij.util.xml.NamedEnum {
	ARIMA ("ARIMA"),
	EXPONENTIAL_SMOOTHING ("ExponentialSmoothing"),
	SEASONAL_TREND_DECOMPOSITION ("SeasonalTrendDecomposition"),
	SPECTRAL_ANALYSIS ("SpectralAnalysis");

	private final String value;
	private TIMESERIESALGORITHM(String value) { this.value = value; }
	public String getValue() { return value; }

}
