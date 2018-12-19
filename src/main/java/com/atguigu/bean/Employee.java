package com.atguigu.bean;


import lombok.*;

import javax.persistence.*;

/**
 * @author hanxn
 * @date 2018/12/19
 */
@Table(name = "tabple_emp")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer empId;//emp_id

    private String empName;//emp_name

    @Column(name="emp_salary_apple")
    private Double empSalary;//emp_salary_apple

    private Integer empAge;//emp_age

}
