
public class TestDate {

	public static void main(String[] args) {
		
		DateObject d1 = new DateObject();
		d1.setDay("January",12,1982);
		
		d1.bump();
		
		DateObject d2 = new DateObject();
		d2.setDay("January",12,1982);
		
		System.out.println(d1.printRep());
		System.out.println(d2.printRep());
		
		DateObject d3 = new DateObject();
		d3.setDay("January",13,1982);

		System.out.println("testing sameDate");
		System.out.println(d1.sameDate(d2) == true);
		System.out.println(d2.sameDate(d1) == true);
		System.out.println(d3.sameDate(d1) == false);

		System.out.println("Testing before and after");
		System.out.println(d1.after(d3));
		System.out.println(d3.after(d1));
		System.out.println(d1.after(d1));

		System.out.println("Testing getters");
		System.out.println(d1.getDay());
		System.out.println(d1.getMonth());
		System.out.println(d1.getYear());

		System.out.println("Testing isLeap");
		
		d1.setDay("January",1,1900,"Gregorian");
		System.out.println(d1.isLeap());
		
		d1.setDay("January",1,1900,"Julian");
		System.out.println(d1.isLeap());
		
		d1.setDay("January",1,2000,"Gregorian");
		System.out.println(d1.isLeap());
		
		d1.setDay("January",1,2000,"Julian");
		System.out.println(d1.isLeap());
		
		d1.setDay("January",1,1904,"Gregorian");
		System.out.println(d1.isLeap());
		
		d1.setDay("January",1,1904,"Julian");
		System.out.println(d1.isLeap());
		
		d1.setDay("January",1,1903,"Gregorian");
		System.out.println(d1.isLeap());
		
		d1.setDay("January",1,1903,"Julian");
		System.out.println(d1.isLeap());
		
		System.out.println("testing isLstDayInYear");
		
		System.out.println(d1.isLastDayInYear());
		d1.setDay("December",31,1903,"Julian");
		System.out.println(d1.isLastDayInYear());

		System.out.println("testing days in month");
		
		d1.setDay("January",31,1903,"Julian");
		System.out.println(d1.daysInMonth());
		
		d1.setDay("February",1,1903,"Julian");
		System.out.println(d1.daysInMonth());
		
		d1.setDay("February",31,1904,"Julian");
		System.out.println(d1.daysInMonth());
		
		d1.setDay("March",20,1903,"Julian");
		System.out.println(d1.daysInMonth());
		
		d1.setDay("April",20,1903,"Julian");
		System.out.println(d1.daysInMonth());
		
		d1.setDay("May",20,1903,"Julian");
		System.out.println(d1.daysInMonth());
		
		d1.setDay("June",20,1903,"Julian");
		System.out.println(d1.daysInMonth());
		
		d1.setDay("July",20,1903,"Julian");
		System.out.println(d1.daysInMonth());
		
		d1.setDay("August",20,1903,"Julian");
		System.out.println(d1.daysInMonth());
		
		d1.setDay("September",20,1903,"Julian");
		System.out.println(d1.daysInMonth());
		
		d1.setDay("October",20,1903,"Julian");
		System.out.println(d1.daysInMonth());
		
		d1.setDay("November",20,1903,"Julian");
		System.out.println(d1.daysInMonth());
		
		d1.setDay("December",20,1903,"Julian");
		System.out.println(d1.daysInMonth());
		
		
		
		System.out.println("Testing makeTomorrow");
		
		d1.setDay("December",20,1903);
		System.out.println(d1.printRep());
		d1.makeTomorrow();
		System.out.println(d1.printRep());
		
		System.out.println();
		
		d1.setDay("November",30,1903);
		System.out.println(d1.printRep());
		d1.makeTomorrow();
		System.out.println(d1.printRep());
		
		System.out.println();

		d1.setDay("December",31,1903);
		System.out.println(d1.printRep());
		d1.makeTomorrow();
		System.out.println(d1.printRep());
		
		
		System.out.println("Testing makeTomorrow(3)");
		
		d1.setDay("December",20,1903);
		System.out.println(d1.printRep());
		d1.makeTomorrow(3);
		System.out.println(d1.printRep());
		
		System.out.println();
		
		d1.setDay("November",30,1903);
		System.out.println(d1.printRep());
		d1.makeTomorrow(3);
		System.out.println(d1.printRep());
		
		System.out.println();

		d1.setDay("December",31,1903);
		System.out.println(d1.printRep());
		d1.makeTomorrow(3);
		System.out.println(d1.printRep());
		
		System.out.println("Testing generateCopy");
		
		d1.setDay("December",31,1903);
		DateObject d4 = d1.generateCopy();
		System.out.println(d1.printRep());
		System.out.println(d4.printRep());
		System.out.println(d1 == d4);	
		
		System.out.println("Testing generateTomorrow");
		
		d1.setDay("December",31,1903);
		d4 = d1.generateTomorrow();
		System.out.println(d1.printRep());
		System.out.println(d4.printRep());
		System.out.println(d1 == d4);	
		
	}

}
