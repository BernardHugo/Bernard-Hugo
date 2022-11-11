package exercise;
import java.util.*;

public class Main{
	public static void main(String[] args) {
		Persona p = new Persona("Bernard Hugo", "Jakarta", "087754622", "bernardhugo@gmail.com");
		
		Murid m = new Murid("Bernard Hugo", "Jakarta", "087754622", "bernardhugo@gmail.com", "junior");
		
		Date date1 = new Date(2012, 03, 24);
		
		Date date2 = new Date(2013, 05, 16);
		
		Date date3 = new Date(2014, 04, 3);
		
		Pegawai pe = new Pegawai("Jonathan", "Jakarta", "08968966", "jonathan@gmail.com", "BINUS University", 
				100, date1);
		
		Dosen d = new Dosen("Abdul Mulia", "Jakarta", "08531477", "abdulmulia@gmail.com", "BINUS University", 
				80, date2, 6, "Lektor");
		
		Staff s = new Staff("Edho", "Jakarta", "08658934", "edho@gmail.com", "BINUS University", 70,
				date3, "Staff Binus University"); 
		
		// Output Persona
		System.out.println(p);
		System.out.println();
		
		// Output Murid
		System.out.println(m);
		System.out.println();
		
		// Output Pegawai
		System.out.println(pe);
		System.out.println();
		
		// Output Dosen
		System.out.println(d);
		System.out.println();
		
		// Output Staff
		System.out.println(s);
		System.out.println();
	}
}
