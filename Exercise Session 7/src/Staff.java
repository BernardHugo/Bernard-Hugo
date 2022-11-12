
import java.time.LocalDate;

public class Staff extends Pegawai{
	public String title;
	
	public Staff(String name, String adress, String phone, String email, String office, 
			int salary, LocalDate recruitDate, String title) {
		super(name, adress, phone, email, office, salary, recruitDate);
		this.title = title;
	}

	@Override
	public String toString() {
		return "Nama staff: " + name + ", Alamat staff: " + adress + 
				", Nomor telepon staff: " + phone + ", Alamat email staff: " + email + 
				", Gaji staff: Rp " + salary + ", Kantor staff: " + office + 
				", Tanggal staff direkrut: " + recruitDate + ", Title: " + title;
	}
}
