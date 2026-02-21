package test;

import java.util.Date;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import edu.snhu.Appointment;

class AppointmentTest {

	// Tests the instantiation of a new Appointment Object
	@DisplayName("New Appointment Test")
	@Test
	void testAppointment() {
		// ! Note: the date object needs the year offset by 1900 and the month and date
		// values start from 0
		Appointment appointmentObj = new Appointment("12345", new Date(2026 - 1900, 1, 28),
				"Do something important...");

		Assertions.assertTrue(appointmentObj.getAppointmentId().equals("12345"));
		Assertions.assertTrue(appointmentObj.getDate().equals(new Date(2026 - 1900, 1, 28)));
		Assertions.assertTrue(appointmentObj.getDescription().equals("Do something important..."));
	}

	// Tests if the length validation argument is thrown by passing in an
	// appointmentId that exceeds 10 characters
	@DisplayName("Appointment Id Length Validation")
	@Test
	void testAppointmentIdLength() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("12345678901", new Date(2026 - 1900, 1, 28), "Do something important...");
		});
	}
	
	// Tests if the date validation argument is thrown by passing in an
	// date that is before the current date
	@DisplayName("Appointment Date Range Validation")
	@Test
	void testAppointmentDateRange() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("12345", new Date(2026 - 1900, 0, 28), "Do something important...");
		});
	}
	
	// Tests if the length validation argument is thrown by passing in an
	// description that exceeds 50 characters
	@DisplayName("Appointment Description Length Validation")
	@Test
	void testAppointmentDescriptionLength() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("12345", new Date(2026 - 1900, 1, 28),
			"Do something important even more important that needs to be done soon...");
		});
	}
	
	// Tests if the null validation argument is thrown by passing in an
	// null value for the appointmentId
	@DisplayName("Appointment Id Null Validation")
	@Test
	void testNullAppointmentId() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment(null, new Date(2026 - 1900, 1, 28), "Do something important...");
		});
	}
	
	// Tests if the null validation argument is thrown by passing in an
	// null value for the date
	@DisplayName("Appointment Date Null Validation")
	@Test
	void testNullAppointmentDate() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("12345", null, "Do something important...");
		});
	}
	
	// Tests if the null validation argument is thrown by passing in an
	// null value for the description
	@DisplayName("Appointment Description Null Validation")
	@Test
	void testNullAppointmentDescription() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("12345", new Date(2026 - 1900, 1, 28), null);
		});
	}

}
