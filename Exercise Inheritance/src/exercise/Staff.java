package exercise;

import java.util.Date;

public class Staff extends Pegawai{
	public String title;
	
	public Staff(String name, String adress, String phone, String email, String office, 
			int salary, Date recruitDate, String title) {
		super(name, adress, phone, email, office, salary, recruitDate);
		this.title = title;
	}

	@Override
	public String toString() {
		return "Nama staff: " + name + ", Alamat staff: " + adress + 
				", Nomor telepon staff: " + phone + ", Alamat email staff: " + email + 
				", Tanggal staff direkrut: " + recruitDate.getDate() + " - " + 
				recruitDate.getMonth() + " - " + recruitDate.getYear() + ", Title: " + title;
	}
}