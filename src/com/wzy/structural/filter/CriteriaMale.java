package com.wzy.structural.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * description: CriteriaMale <br>
 * date: 2020-06-10 09:52 <br>
 * author: wzy <br>
 * version: 1.0 <br>
 */
public class CriteriaMale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<>();
        for (Person person : persons) {
            if (person.getGender().equalsIgnoreCase("MALE")) {
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}
