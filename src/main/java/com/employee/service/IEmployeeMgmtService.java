package com.employee.service;

import java.util.List;

import com.employee.model.Employee;

public interface IEmployeeMgmtService {
    public  List<Employee>   fetchEmployeesByDesgs(String desg1,String desg2,String desg3)throws Exception;
}
