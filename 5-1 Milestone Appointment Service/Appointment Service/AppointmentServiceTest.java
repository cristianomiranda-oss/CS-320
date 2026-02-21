package test;

import java.util.Date;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import edu.snhu.Appointment;
import edu.snhu.AppointmentService;

class AppointmentServiceTest {

	// Tests the adding of a new appointment
	@DisplayName("Adding New Appointment")
	@Test
	void testAddAppointment() {
		AppointmentService appointmentService = new AppointmentService();
		appointmentService.addAppointment(new Date(2026 - 1900, 1, 28), "Do something important...");
		Appointment createdAppointment = appointmentService.getAppointment("0");

		Assertions.assertTrue(createdAppointment.getAppointmentId().equals("0"));
		Assertions.assertTrue(createdAppointment.getDate().equals(new Date(2026 - 1900, 1, 28)));
		Assertions.assertTrue(createdAppointment.getDescription().equals("Do something important..."));
	}

	// Tests the removing of an appointment
	@DisplayName("Removing Appointment")
	@Test
	void testRemoveAppointment() {
		AppointmentService appointmentService = new AppointmentService();
		appointmentService.addAppointment(new Date(2026 - 1900, 1, 28), "Do something important...");
		appointmentService.removeAppointment("0");

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			appointmentService.getAppointment("0");
		});
	}

	// Tests the removing of an appointment not present in the list
	@DisplayName("Removing Null Appointment")
	@Test
	void testRemoveNullAppointment() {
		AppointmentService appointmentService = new AppointmentService();

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			appointmentService.removeAppointment("0");
		});
	}

	// Tests the updating of the date attribute for an appointment within the list
	@DisplayName("Update Appointment Date")
	@Test
	void testUpdateAppointmentDate() {
		AppointmentService appointmentService = new AppointmentService();
		appointmentService.addAppointment(new Date(2026 - 1900, 1, 28), "Do something important...");
		appointmentService.updateAppointmentDate("0", new Date(2026 - 1900, 4, 28));
		
		Appointment createdAppointment = appointmentService.getAppointment("0");
		
		Assertions.assertTrue(createdAppointment.getAppointmentId().equals("0"));
		Assertions.assertTrue(createdAppointment.getDate().equals(new Date(2026 - 1900, 4, 28)));
		Assertions.assertTrue(createdAppointment.getDescription().equals("Do something important..."));
	}
	
	// Tests the updating of the description attribute for an appointment within the list
	@DisplayName("Update Appointment Description")
	@Test
	void testUpdateAppointmentDescription() {
		AppointmentService appointmentService = new AppointmentService();
		appointmentService.addAppointment(new Date(2026 - 1900, 1, 28), "Do something important...");
		appointmentService.updateAppointmentDescription("0", "Perform an important task...");

		Appointment createdAppointment = appointmentService.getAppointment("0");

		Assertions.assertTrue(createdAppointment.getAppointmentId().equals("0"));
		Assertions.assertTrue(createdAppointment.getDate().equals(new Date(2026 - 1900, 1, 28)));
		Assertions.assertTrue(createdAppointment.getDescription().equals("Perform an important task..."));
	}
}
