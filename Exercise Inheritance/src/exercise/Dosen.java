package exercise;

import java.util.*;

class Dosen extends Pegawai{
	int officeHours;
	String academic;
	
	public Dosen(String name, String adress, String phone, String email,
			String office, int salary, Date recruitDate, int officeHours, String academic) {
		super(name, adress, phone, email, office, salary, recruitDate);
		this.officeHours = officeHours;
		this.academic = academic;
	}

	@Override
	public String toString() {
		return "Nama dosen: " + name + ", Alamat dosen: " + adress + 
				", Nomor telepon dosen: " + phone + ", Alamat email dosen: " + email + 
				", Tanggal dosen direkrut: " + recruitDate.getDate() + " - " + recruitDate.getMonth() + 
				" - " + recruitDate.getYear() + ", Jam kantor dosen: " + officeHours + 
				", Jabatan akademik dosen: " + academic;
	}
}
