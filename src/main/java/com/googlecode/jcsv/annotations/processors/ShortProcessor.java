package com.googlecode.jcsv.annotations.processors;

import com.googlecode.jcsv.annotations.ValueProcessor;

/**
 * Processes short values.
 *
 * @author Eike Bergmann
 *
 */
public class ShortProcessor implements ValueProcessor<Short> {
	/**
	 * Converts value into a short using {@link Short#parseShort(String)}
	 *
	 * @return Short the result
	 */
	@Override
	public Short processColumn(String value) {
		return Short.parseShort(value);
	}
}
