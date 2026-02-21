package edu.snhu;

import java.util.Date;

public class Appointment {

    // Declares the various attributes for the class
    private String appointmentId;
    private Date date;
    private String description;

    public Appointment(String id, Date date, String description) {
        // Checks if the passed in id parameter is null or greater than 10 characters
        if (id == null || id.length() > 10) {
            // Throws an error that indicates to the id value is invalid
            throw new IllegalArgumentException("Invalid Appointment Id");
        }
        // Checks if the passed in date parameter is null or before the current date
        if (date == null || date.before(new Date())) {
            // Throws an error that indicates to the date value is invalid
            throw new IllegalArgumentException("Invalid Appointment Date");
        }
        // Checks if the passed in description parameter is null or greater than 50
        // characters
        if (description == null || description.length() > 50) {
            // Throws an error that indicates to the description value is invalid
            throw new IllegalArgumentException("Invalid Appointment Description");
        }

        // Assigns the various attributes with their appropriate values
        this.appointmentId = id;
        this.date = date;
        this.description = description;
    }

    public String getAppointmentId() {
        // Returns the appointmentId attribute value
        return this.appointmentId;
    }

    public Date getDate() {
        // Returns the date attribute value
        return this.date;
    }

    public void setDate(Date date) {
        // Checks if the passed in date parameter is null or before the current date
        if (date == null || date.before(new Date())) {
            // Throws an error that indicates to the date value is invalid
            throw new IllegalArgumentException("Invalid Appointment Date");
        }

        this.date = date;
    }

    public String getDescription() {
        // Returns the description attribute value
        return this.description;
    }

    public void setDescription(String description) {
        // Checks if the passed in description parameter is null or greater than 50
        // characters
        if (description == null || description.length() > 50) {
            // Throws an error that indicates to the description value is invalid
            throw new IllegalArgumentException("Invalid Appointment Description");
        }

        this.description = description;
    }
}
