package edu.snhu;

import java.util.Date;
import java.util.ArrayList;

public class AppointmentService {

    // Declares the various attribute for the class
    private ArrayList<Appointment> Appointments;
    private int currentAppointmentId = 0;

    public AppointmentService() {
        // Constructs and stores a new array list to house all appointment objects
        this.Appointments = new ArrayList<Appointment>();
    }

    public Appointment getAppointment(String appointmentId) {
        // Iterates through the array list
        for (int i = 0; i < Appointments.size(); i++) {
            // Declares a new var and assigns the appointment at the current index to it
            Appointment currAppointment = Appointments.get(i);
            // Checks if the currAppointment's id matches the passed in value
            if (currAppointment.getAppointmentId().equals(appointmentId)) {
                // Returns the currAppointment associated with the passed in id
                return currAppointment;
            }
        }

        // Throws an error indicating no associated appointment exists in the list
        throw new IllegalArgumentException("Appointment Not In List!");
    }

    public void addAppointment(Date date, String description) {
        // Stores the value of currentAppointmentId and then increments the attribute
        // value
        String newAppointmentId = Integer.toString(currentAppointmentId++);

        // Instantiates a new appointment object using the passed in parameters and the
        // newly created id value
        Appointment newAppointment = new Appointment(newAppointmentId, date, description);
        // Appends the new appointment object to the array list
        Appointments.add(newAppointment);
    }

    public void removeAppointment(String appointmentId) {
        // Iterates through the array list
        for (int i = 0; i < Appointments.size(); i++) {
            Appointment currAppointment = Appointments.get(i);
            // Checks if the currAppointment's id matches the passed in value
            if (currAppointment.getAppointmentId().equals(appointmentId)) {
                // Removes the current element at the specified index
                Appointments.remove(i);
                // Exits the function
                return;
            }
        }

        // Throws an error indicating no associated appointment exists in the list
        throw new IllegalArgumentException("Appointment Not In List!");
    }

    public void updateAppointmentDate(String appointmentId, Date newDate) {
        // Calls the method to access the appointment associated with the passed in id
        Appointment appointment = getAppointment(appointmentId);
        // calls the method to update the current date for the appointment
        appointment.setDate(newDate);
    }

    public void updateAppointmentDescription(String appointmentId, String description) {
        // Calls the method to access the appointment associated with the passed in id
        Appointment appointment = getAppointment(appointmentId);
        // calls the method to update the current description for the appointment
        appointment.setDescription(description);
    }

}
