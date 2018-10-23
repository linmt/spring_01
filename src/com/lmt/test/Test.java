package com.lmt.test;

import com.lmt.dao.CostDao;
import com.lmt.entity.Cost;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by 张洲徽 on 2018/10/23.
 */
public class Test {
    public static void main(String[] args){
        String conf= "dispatcher-servlet.xml";
        ApplicationContext ac=new ClassPathXmlApplicationContext(conf);
        /*
        EmpDao dao=ac.getBean("empDao",EmpDao.class);
        System.out.println(dao);
        */

//		Emp emp=new Emp();
//		emp.setName("tom");
//		emp.setSalary(2000.0);
//		emp.setAge(20);
//		dao.save(emp);

		/*
		//测试多行查询
		List<Emp> list=dao.findAll();
		for (Emp emp:list) {
			System.out.println(emp.getId()+" "+emp.getName()+" "+emp.getSalary()+" "+emp.getAge());
		}

		//测试单行查询
		Emp emp=dao.findById(1000);
		System.out.println(emp.getId()+" "+emp.getName()+" "+emp.getSalary()+" "+emp.getAge());
		*/

        CostDao costdao=ac.getBean("costDao",CostDao.class);
        List<Cost> list=costdao.findAll();
        for (Cost cost:list) {
            System.out.println(cost.getName());
        }
    }
}
