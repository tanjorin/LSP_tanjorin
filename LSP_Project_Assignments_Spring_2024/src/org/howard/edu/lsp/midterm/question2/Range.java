package org.howard.edu.lsp.midterm.question2;

public interface Range {
    int upperBound = 0;
	int lowerBound = 0;

	/**
     * Returns true if the range contains the specified value.
     * 
     * @param value the value to check
     * @return true if the value is within the range, false otherwise
     */
    boolean contains(int value);

    /**
     * Returns true if the range overlaps with another range.
     * 
     * @param other the other range to compare with
     * @return true if there is overlap, false otherwise
     */
    boolean overlaps(Range other);

    /**
     * Returns the number of integers in the range.
     * 
     * @return the size of the range
     */
    int size();
}
