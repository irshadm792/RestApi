package com.springboot.web.controller.dto.list;

import java.util.List;

public class EducationDetailsDto {
	
private	String standard;
private	String nameOfOrg;
private	int passedYear;
private	float avgPercentage;
private List<String> subject;
public String getStandard() {
	return standard;
}
public void setStandard(String standard) {
	this.standard = standard;
}
public String getNameOfOrg() {
	return nameOfOrg;
}
public void setNameOfOrg(String nameOfOrg) {
	this.nameOfOrg = nameOfOrg;
}
public int getPassedYear() {
	return passedYear;
}
public void setPassedYear(int passedYear) {
	this.passedYear = passedYear;
}
public float getAvgPercentage() {
	return avgPercentage;
}
public void setAvgPercentage(float avgPercentage) {
	this.avgPercentage = avgPercentage;
}
public List<String> getSubject() {
	return subject;
}
public void setSubject(List<String> subject) {
	this.subject = subject;
}
@Override
public String toString() {
	return "EducationDetailsDto [standard=" + standard + ", nameOfOrg=" + nameOfOrg + ", passedYear=" + passedYear
			+ ", avgPercentage=" + avgPercentage + ", subject=" + subject + "]";
}




}
