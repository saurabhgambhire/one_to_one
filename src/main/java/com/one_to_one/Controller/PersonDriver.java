package com.one_to_one.Controller;

import com.one_to_one.dao.PersonDao;
import com.one_to_one.dto.*;

public class PersonDriver {
	public static void main(String[] args) {
		// To save the data
		AdharCard adharCard = new AdharCard();
		adharCard.setId(1);
		adharCard.setAddress("Pune");
		adharCard.setName("saurabh");
		Person person = new Person();
		person.setId(1);
		person.setMobile(9359691331l);
		person.setName("saurabhFromPune");
		person.setAdharCard(adharCard);
		
		PersonDao personDao = new PersonDao();
//		personDao.savePerson(person);

		// To delete the data

//		personDao.deletePersonById(1);

		// Update the Data
//		Person person1 = new Person();
//		personDao.UpdatePerson(1, person);
		
		personDao.fetchData(1);

	}
}
