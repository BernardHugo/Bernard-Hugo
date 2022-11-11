package exercise;

import java.util.*;

class Pegawai extends Persona{
	String office;
	int salary;
	Date recruitDate;

	public Pegawai(String name, String adress, String phone, String email,
			String office, int salary, Date recruitDate) {
		super(name, adress, phone, email);
		this.office = office;
		this.salary = salary;
		this.recruitDate = recruitDate;
	}
	
	@Override
	public String toString() {
		return "Nama pegawai: " + name + ", Alamat pegawai: " + adress + 
				", Nomor telepon pegawai: " + phone + ", Alamat email pegawai: " + email + 
				", Kantor pegawai: " + office + ", Gaji pegawai: " + salary + 
				", Tanggal pegawai direkrut: " + recruitDate.getDate() + 
				" - " + recruitDate.getMonth() + " - " + recruitDate.getYear();
	}
}