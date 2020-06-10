package com.wzy.structural.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * description: CriteriaFemale <br>
 * date: 2020-06-10 09:56 <br>
 * author: wzy <br>
 * version: 1.0 <br>
 */
public class CriteriaFemale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons = new ArrayList<>();
        for (Person person : persons) {
            if (person.getGender().equalsIgnoreCase("FEMALE")) {
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }
}
