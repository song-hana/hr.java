package com.my.java.test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.my.java.dao.LaborerDao;
import com.my.java.dao.LaborerDaoImpl;
import com.my.java.domain.Laborer;
import com.my.java.domain.NoneException;

public class LaborerDaoTest {
	public static void main(String[] args) {
		List<Laborer> laborers = new ArrayList<>();
		laborers.add(new Laborer(11, "최한석", LocalDate.now()));
		LaborerDao laborerDao = new LaborerDaoImpl(laborers);
		
		System.out.println(laborerDao.selectLaborers());
		
		laborerDao.insertLaborer("한아름", LocalDate.now());
		System.out.println(laborerDao.selectLaborers());
		
		laborerDao.updateLaborer(new Laborer(11, "소리섭", LocalDate.of(2025, 1, 1)));
		System.out.println(laborerDao.selectLaborers());
		
		try {
			laborerDao.updateLaborer(new Laborer(12, null, null));
		} catch(NoneException e) {
			e.printStackTrace();
		}
		
		try {
			laborerDao.deleteLaborer(12);
		} catch(NoneException e) {
			e.printStackTrace();
		}
	}
}
