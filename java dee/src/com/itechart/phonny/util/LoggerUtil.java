package com.itechart.phonny.util;

import org.slf4j.Marker;
import org.slf4j.MarkerFactory;

public final class LoggerUtil {

	public static final Marker INFO_MARKER = MarkerFactory.getMarker("INFO");
	
	public static final Marker WARN_MARKER = MarkerFactory.getMarker("WARN");
	
	public static final Marker FATAL_MARKER = MarkerFactory.getMarker("FATAL");
	
	private LoggerUtil() {
	}
}
