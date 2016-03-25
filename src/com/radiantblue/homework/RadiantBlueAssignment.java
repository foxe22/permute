package com.radiantblue.homework;

/**
 * An interface for candidates for software development positions to implement.
 * Candidates should feel free to define any methods or variables within his/her
 * implementation. We ask you to please adhere to the following guidelines,
 * beyond which you can take any liberties:
 * 
 * 1) Limit yourself to one outer class (the implementation of this interface)
 * 
 * 2) Name the class <Last Name>Solution within the package
 * com.radiantblue.homework.solution
 * 
 * 3) There must be a no-arg constructor for this class which we will use to
 * instantiate a test of your solution
 * 
 * @author RadiantBlue Technologies, Inc.
 * 
 */
public interface RadiantBlueAssignment
{
	/**
	 * This method should offer a solution to the assignment that uses
	 * recursion. Note that this method does not need to itself be recursive,
	 * but feel free to define any methods needed or member variables needed.
	 * One of the methods should be recursive.
	 * 
	 * @param phoneNumber
	 *            The phone number as an array of ints, for example the number
	 *            (888) 555-2345 would be represented by the array
	 *            {8,8,8,5,5,5,2,3,4,5}
	 * @return An array of Strings such that each String in the array represents
	 *         one possible letter combination for the given phone number
	 */
	public String[] getLetterPermutationsRecursive(
			int[] phoneNumber );

	/**
	 * This method should offer a solution that’s iterative and doesn’t use
	 * recursion. Feel free to define any methods or member variables needed.
	 * 
	 * @param phoneNumber
	 *            The phone number as an array of ints, for example the number
	 *            (888) 555-2345 would be represented by the array
	 *            {8,8,8,5,5,5,2,3,4,5}
	 * @return An array of Strings such that each String in the array represents
	 *         one possible letter combination for the given phone number
	 */
	public String[] getLetterPermutationsIterative(
			int[] phoneNumber );
}
