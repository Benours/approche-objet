package fr.diginamic.dates;

import java.util.Date;

public class TestDates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date today = new Date();
		System.out.println(today.getDate() + "/" + (today.getMonth() + 1) + "/" + (1900 + today.getYear()));
		
		Date past = new Date(116, 4, 19, 23, 59, 30);
		System.out.println((past.getYear() + 1900) + "/" + (past.getMonth() + 1) + "/" + past.getDate() + " " + past.getHours() + ":" + past.getMinutes() + ":" + past.getSeconds());
		
		Date jour = new Date();
		System.out.println((jour.getYear() + 1900) + "/" + (jour.getMonth() + 1) + "/" + jour.getDate() + " " + jour.getHours() + ":" + jour.getMinutes() + ":" + jour.getSeconds());
		
	}

}
