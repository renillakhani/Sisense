package com.kfast.api;

import static com.kfast.utils.PropertyUtils.getProperty;
import static com.kfast.constants.FrameworkConstants.BASE_URL;


/**
 * This class contains all the URLs or URIs required for testing APIs.
 *
 * @author Badal Shah
 */
public class SOAPURLGenerator {

	/**
	 * Instantiates all the end point URL's.
	 */
	SOAPURLGenerator() {
	}

	/** The Constant BASE_URL. */
	public static final String BASEURL = getProperty(BASE_URL);

	// User Module
	/** The Constant POST_URL. */
	public static final String POST_URL = BASEURL + "/calculator.asmx";
	

}
