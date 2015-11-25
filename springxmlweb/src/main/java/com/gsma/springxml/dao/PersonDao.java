/**
 * 
 */
package com.gsma.springxml.dao;

import java.util.List;

import com.gsma.springxml.model.Person;

/**
 * @author Suresh Kumar
 *
 */
public interface PersonDao {
    
    public void addPerson(Person p);
    public void updatePerson(Person p);
    public List<Person> listPersons();
    public Person getPersonById(int id);
    public void removePerson(int id);


}
