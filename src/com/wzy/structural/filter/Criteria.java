package com.wzy.structural.filter;

import java.util.List;

/**
 * description: Criteria 标准接口<br>
 * date: 2020-06-10 09:44 <br>
 * author: wzy <br>
 * version: 1.0 <br>
 */
public interface Criteria {
    /**
     * 筛选方法
     * @param persons 人类集合
     * @return 筛选后的集合
     */
    List<Person> meetCriteria(List<Person> persons);
}
