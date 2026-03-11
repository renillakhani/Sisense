package com.kfast.listeners;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

import com.kfast.utils.DataProviderUtils;

/**
 * Implements {@link org.testng.IAnnotationTransformer} to leverage certain
 * functionality like updating the annotations of test methods at runtime.
 * 
 * <pre>
 * Please make sure to add the listener details in the testng.xml file
 * </pre>
 */
public class AnnotationTransformer implements IAnnotationTransformer {

	/**
	 * Helps in setting the dataprovider, dataprovider class and retry analyser
	 * annotation to all the test methods at run time.
	 */
	@SuppressWarnings("rawtypes")
	@Override
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
	    Class<?>[] parameterTypes = testMethod.getParameterTypes();
	    if (parameterTypes.length > 0) {
	       
	        // Check if the method takes a single parameter of type Map<String, String>
	        if (parameterTypes.length == 1 && parameterTypes[0].equals(Map.class)) {
	            //  if you want to ensure that the Map's key and value types are String
	            Type[] actualTypeArguments = ((ParameterizedType) testMethod.getGenericParameterTypes()[0]).getActualTypeArguments();
	            if (actualTypeArguments.length == 2 &&
	                actualTypeArguments[0].equals(String.class) &&
	                actualTypeArguments[1].equals(String.class)) {
	                annotation.setDataProvider("getData");
	                annotation.setDataProviderClass(DataProviderUtils.class);
	            } else {
	                // Parameter type does not match expected type
	                System.out.println("Invalid parameter type");
	            }
	        } else {
	            // Parameter count is not one or parameter type is not Map
	            System.out.println("Invalid parameter count or type");
	        }
	    }
	    // Set the retry analyzer
	    annotation.setRetryAnalyzer(RetryFailedTests.class);
	}
}
