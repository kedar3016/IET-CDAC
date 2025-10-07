package com.demo.Test;

import java.sql.Date;

import com.demo.bean.*;

public class TestEmployee {
	public static void main(String[] args) {
	
		Employee e1 = new SalariedEmployee("Arti",new Date(2000,04,23),"UX","Designer",99999);
		
		System.out.println(e1);
		SalariedEmployee s1=new SalariedEmployee("Rajan",new Date(2000,04,23),"HR","Designer",88888);
    	SalariedEmployee s2=new SalariedEmployee("Revati",new Date(2000,04,23),"UX","Designer",99999);
    	System.out.println(s1);
    	System.out.println("net sal= "+s1.calculateSal());
		
	}

}
