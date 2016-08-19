/**
 * File Name: PersonTest.java<br>
 * Androshchuk, Kateryna<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Aug 18, 2016
 */
package com.ka;

import org.junit.*;

/**
 * PersonTest //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Androshchuk, Kateryna
 * @version 1.0.0
 * @since 1.0
 */
public class PersonTest {

	@Test
	public void testPersonCreation() {
		// Create person object and store inside "person" named variable
		Person person = new Person();
		// Display person cantact by call the toString method on the object
		System.out.println(person.toString());
	}
}
