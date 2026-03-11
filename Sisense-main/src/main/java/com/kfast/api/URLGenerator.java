package com.kfast.api;

import static com.kfast.utils.PropertyUtils.getProperty;
import static com.kfast.constants.FrameworkConstants.BASE_URL;

/**
 * This class contains all the URLs or URIs required for testing APIs.
 *
 * @author Badal Shah
 */
public class URLGenerator {

	/**
	 * Instantiates all the end point URL's.
	 */
	URLGenerator() {
	}

	/** The Constant BASE_URL. */
	public static final String BASEURL = getProperty(BASE_URL);

	// User Module
	/** The Constant POST_URL. */
	public static final String POST_URL = BASEURL + "/user";

	/** The Constant GET_URL. */
	public static final String GET_URL = BASEURL + "/user/{username}";

	/** The Constant UPDATE_URL. */
	public static final String UPDATE_URL = BASEURL + "/user/{username}";

	/** The Constant DELETE_URL. */
	public static final String DELETE_URL = BASEURL + "/user/{username}";
	
	public static final String LIST_USER_URL = "https://reqres.in/api/users";
}
