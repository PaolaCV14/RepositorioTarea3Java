package com.iteso.pruebasGUI;

import java.util.Calendar;



public class Date {
	
	

	private static Calendar calendar = Calendar.getInstance();
	
	private static final int DEFAULT_YEAR = calendar.get(Calendar.YEAR);
	private static final int DEFAULT_MONTH = calendar.get(Calendar.MONTH);
	private static final int DEFAULT_DAY =calendar.get(Calendar.DAY_OF_MONTH);;
	private static final int DEFAULT_FORMAT =0;
	
	private static int MIN_YEAR = 1900;
	private static int MAX_YEAR = 3000;
	//Se declaran las varibales necesarias inicializando en valores predeterminados 
	private int day= DEFAULT_DAY, month=DEFAULT_MONTH  , year=DEFAULT_YEAR, format=0;
	private String monthName;

	
	
	//Se declaran los constructores con los argumentos que necesitan ser recibidos
	public Date() {
		this(DEFAULT_DAY, DEFAULT_MONTH, DEFAULT_YEAR, DEFAULT_FORMAT);
	}
	
	public Date(int day, int month, int year, int format) {
		this(day, month, year);
		setFormat(format);
	}

	public Date(int day, int month, int year) {
		setYear(year);
		setMonth(month);
		setDay(day);
	
	}
	
	//Se crean los getters
	public int getDay() {return day;}
	
	public int getMonth() {return month;}
	
	public int getYear() {return year;}
	
	public int getFormat() {return format;}
	
	//SE crean los setters
	public void setFormat(int format) {
		this.format = (format < 0 || format> 2) ? this.format: format;
		setMonth(month);
	}
	
	static {
		int minYear = 1900;
		int maxYear =  3000;
		 
		MIN_YEAR = minYear;
		MAX_YEAR = maxYear;
		
		
	}
	
	public void setYear(int year) {
		
		this.year = (year < MIN_YEAR || year > MAX_YEAR) ? this.year : year;
		
	}
	public void setMonth(int month) {
		this.month = (month < 1 || month > 12) ? this.month : month;
		
		//Dependiendo del formato se le asignara un valor al atributo monthName
		if(format==2) {
			switch(month) {
		case 1:
			monthName = "Enero";
			break;
		case 2:
			monthName = "Febrero";
			break;
		case 3:
			monthName = "Marzo";
			break;
		case 4:
			monthName = "Abril";
			break;
		case 5:
			monthName = "Mayo";
			break;
		case 6:
			monthName = "Junio";
			break;
		case 7:
			monthName = "Julio";
			break;
		case 8:
			monthName = "Agosto";
			break;
		case 9:
			monthName = "Septiembre";
			break;
		case 10:
			monthName = "Octubre";
			break;
		case 11:
			monthName = "Noviembre";
			break;
		default:
			monthName = "Diciembre";
			break;
		}
		}
		else {
			switch(month) {
		case 1:
			monthName = "Ene";
			break;
		case 2:
			monthName = "Feb";
			break;
		case 3:
			monthName = "Mar";
			break;
		case 4:
			monthName = "Abr";
			break;
		case 5:
			monthName = "May";
			break;
		case 6:
			monthName = "Jun";
			break;
		case 7:
			monthName = "Jul";
			break;
		case 8:
			monthName = "Ago";
			break;
		case 9:
			monthName = "Sep";
			break;
		case 10:
			monthName = "Oct";
			break;
		case 11:
			monthName = "Nov";
			break;
		default:
			monthName = "Dic";
			break;
		}
		}
	}
	
	public void setDay(int day) {
		//Dependiendo del mes se verifica el rango para el dia 
		switch(month) {
		case 4:
		case 6:
		case 9:
		case 11:
			this.day = (day < 1 || day> 30) ? this.day: day;
			break;
		case 2:
			this.day = (day < 1 || day> 28) ? this.day: day;
			break;
		default:
			this.day = (day < 1 || day> 31) ? this.day: day;
			break;
		}
		
	}
	
	//Metodo toString que dependiendo del formato se guarada el string de cierta manera
	public String toString() {
		String SDay;
		String SMonth;
		String SYear;
		if(format == 0) {
			if(day < 10) SDay = "0"+ Integer.toString(day);
			else SDay = Integer.toString(day);
			if(month < 10) SMonth = "0" + Integer.toString(month);
			else SMonth = Integer.toString(month);
			SYear = Integer.toString(year%100);
			return SDay + "/" + SMonth + "/" + SYear;
		}
		else if(format == 1) {
			SDay = Integer.toString(day);
			SMonth = monthName;
			SYear = Integer.toString(year);
			
			return SDay + "-" + SMonth + "-" + SYear;
			
		}
		else {
			SDay = Integer.toString(day);
			SMonth = monthName;
			SYear = Integer.toString(year);
			return SDay + " de " + SMonth + " de " + SYear;
		}
		
	}	
	
	//Metodo equals que compara dos objetos y regresa un true o false al comparar atributos
	public boolean equals(Object o) {
		if (o == null) return false;
		if (!(o instanceof Date)) return false;
		
		Date comp= (Date)o;
		if (day == comp.day && month == comp.month && year == comp.year) return true;
		else return false;
		}
	
	//Metodo clone que pone los atributos de un date a otro
	public Date clone() {
		return new Date(this.day, this.month, this.year, this.format);
	}
	
	//Metodo next que suma un dia y hace ajustes necesarios depndiendo del mes
	public void next() {
		day += 1;
		switch(month) {
		case 4:
		case 6:
		case 9:
		case 11:
			if(day == 31) {
				day = 1;
				month+=1;
			}
			break;
		case 2:
			if(day == 29) {
				day = 1;
				month += 1;
			}
			break;
		case 12:
			if(day == 32) {
				day = 1;
				month =1;
				year +=1;
			}
			break;
		default:
			if(day == 32) {
				day = 1;
				month +=1;}
			break;
		}
		setMonth(month);
		setYear(year);	
	}
}