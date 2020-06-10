package com.wzy.structural.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * description: CriteriaSingle <br>
 * date: 2020-06-10 10:01 <br>
 * author: wzy <br>
 * version: 1.0 <br>
 */
public class CriteriaSingle implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<>();
        for (Person person : persons) {
            if (person.getMaritalStatus().equalsIgnoreCase("SINGLE")) {
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}
