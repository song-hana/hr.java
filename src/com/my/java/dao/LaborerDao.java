package com.my.java.dao;

import java.time.LocalDate;
import java.util.List;

import com.my.java.domain.Laborer;

public interface LaborerDao {
	List<Laborer> selectLaborers();
	void insertLaborer(String laborerName, LocalDate hireDate);
	void updateLaborer(Laborer laborer);
	void deleteLaborer(int laborerId);
}
