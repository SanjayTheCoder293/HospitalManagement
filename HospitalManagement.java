package com.staticinstanceblock;

import java.util.Scanner;

public class HospitalManagement {
	    // STATIC VARIABLE: Shared by all patients
	    static String hospitalName = "City General Hospital";
	    static int totalPatients = 0;

	    // INSTANCE VARIABLES: Unique to each patient
	    String patientName;
	    String bloodGroup;

	    // STATIC BLOCK
	    static {
	        System.out.println("Initializing Hospital Database...");
	        System.out.println("Welcome to " + hospitalName);
	    }

	    // INSTANCE BLOCK
	    {
	        totalPatients++;
	        System.out.println("\n[System Notification: Admitting Patient #" + totalPatients + "]");
	    }

	    // CONSTRUCTOR
	    public HospitalManagement(String name, String blood) {
	        this.patientName = name;
	        this.bloodGroup = blood;
	    }

	    // STATIC METHOD
	    public static void medicalAdvice() {
	        System.out.println("Advice: Drink 8 glasses of water daily.");
	    }

	    // INSTANCE METHOD
	    public void patientSummary() {
	        System.out.println("Registration Complete!");
	        System.out.println("Hospital: " + hospitalName);
	        System.out.println("Patient: " + patientName + " | Blood Type: " + bloodGroup);
	    }

	    public static void main(String[] args) {
	        // Step 2: Create a Scanner object
	        Scanner sc = new Scanner(System.in);

	        // Calling Static Method
	        HospitalManagement.medicalAdvice();

	        // Taking Input for Patient 1
	        System.out.println("\n--- Registration Desk ---");
	        System.out.print("Enter Patient Name: ");
	        String name1 = sc.nextLine(); // Reads full name including spaces
	        System.out.print("Enter Blood Group: ");
	        String blood1 = sc.next();
	        sc.nextLine(); // Consume the leftover newline character

	        HospitalManagement p1 = new HospitalManagement(name1, blood1);
	        p1.patientSummary();

	        // Taking Input for Patient 2
	        System.out.println("\n--- Registration Desk ---");
	        System.out.print("Enter Patient Name: ");
	        String name2 = sc.nextLine();
	        System.out.print("Enter Blood Group: ");
	        String blood2 = sc.next();

	        HospitalManagement p2 = new HospitalManagement(name2, blood2);
	        p2.patientSummary();

	        // Step 3: Close the scanner
	        sc.close();
	    }
	}