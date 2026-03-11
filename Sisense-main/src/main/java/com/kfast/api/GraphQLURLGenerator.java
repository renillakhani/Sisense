package com.kfast.api;

import static com.kfast.utils.PropertyUtils.getProperty;
import static com.kfast.constants.FrameworkConstants.BASE_URL;
import static com.kfast.constants.FrameworkConstants.BEARER_TOKEN;


/**
 * This class contains all the URLs or URIs required for testing GraphQL APIs.
 *
 */
public class GraphQLURLGenerator {

	/**
	 * Instantiates all the end point URL's.
	 */
	GraphQLURLGenerator() {
	}

	/** The Constant BASE_URL. */
	public static final String BASEURL = getProperty(BASE_URL);
	public static final String BEARERTOKEN = getProperty(BEARER_TOKEN);

	// The Constant POST_URL.
	public static final String POST_URL = BASEURL + "/learn/graphql";
	
}
