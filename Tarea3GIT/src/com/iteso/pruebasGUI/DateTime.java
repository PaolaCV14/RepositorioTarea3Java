package com.iteso.pruebasGUI;

import java.util.Calendar;

public class DateTime extends Date {
	private static Calendar calendar = Calendar.getInstance();
	private int hh= calendar.get(Calendar.HOUR_OF_DAY);
	
	private int mi = calendar.get(Calendar.MINUTE);
	
	private int ss = calendar.get(Calendar.SECOND);
	private static int format = 0;
	
	
	public DateTime(int hh, int mi, int ss, int day, int month, int year, int format){
		super(day, month, year, format);
		setHH(hh);
		setMI(mi);
		setSS(ss);
		
	}
	
	public DateTime(int hh, int mi, int ss, int fomat){
		this(hh, mi, ss, calendar.get(Calendar.DAY_OF_MONTH), calendar.get(Calendar.MONTH), calendar.get(Calendar.YEAR), format);
		
	}
	
	public DateTime(){
	
		
		
	}
	public DateTime(Date d){
		
	}
	
	public int getHH() {return hh;}
	public int getMI() {return mi;}
	public int getSS() {return ss;}
	
	public void setHH(int hh) {
		this.hh = (hh < 0 || hh > 23)? this.hh: hh;
		
	}
	public void setMI(int mi) {
		this.mi = (mi < 0 || mi > 59)? this.mi: mi;
	}
	public void setSS(int ss) {
		this.ss = (ss < 0 || ss > 59)? this.ss: ss;
	}
	
	public boolean isLeap() {
		return super.getYear() % 4 == 0 && (super.getYear() %100 != 0 || super.getYear() % 400 == 0);
	}
	public static boolean isLeap(int year) {
		return year % 4 == 0 && (year %100 != 0 || year % 400 == 0);
	}
	
	public DateTime nextSecond() {
		System.out.println(ss);
		ss +=1;
		System.out.println(ss);
		if(ss == 60) {
			ss = 0;
			mi += 1;
			if(mi == 60) {
				mi = 0;
				hh +=1;
				if(hh==24) {
					
					hh =0;
					super.next();}
			}
			}
		return new DateTime (this.hh, this.mi, this.ss, super.getDay(), super.getMonth(), super.getYear(), this.format);
	}
	
	public Date toDate() {
		return new Date(super.getDay(), super.getMonth(), super.getYear());
	}
	
	public String toString() {
		String Sdate = super.toString();
		String Shh ;
		String Smi ;
		String Sss ;
		Shh = (hh < 10)? "0" + Integer.toString(hh): Integer.toString(hh);
		Smi = (mi < 10)? "0" + Integer.toString(mi): Integer.toString(mi);
		Sss = (ss < 10)? "0" + Integer.toString(ss): Integer.toString(ss);
		
		
		
		return "["+ Shh + " : " + Smi + " : " + Sss+ "] " + Sdate;
	}
	
	public DateTime clone() {
		return new DateTime(this.hh, this.mi, this.ss, super.getDay(), super.getMonth(), super.getYear(), super.getFormat());
	}
	
	public boolean equals(Object o) {
		if (o == null) return false;
		if (!(o instanceof DateTime)) return false;
		
		DateTime comp= (DateTime)o;
		if (ss == comp.ss && comp.hh == comp.hh && mi == comp.mi && super.equals(o)== true ) return true;
		else return false;
		}
}