package exercise;

public class Persona {
	public String name;
	public String adress;
	public String phone;
	public String email;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Persona(String name, String adress, String phone, String email) {
		super();
		this.name = name;
		this.adress = adress;
		this.phone = phone;
		if(email.endsWith("@gmail.com")) {
			this.email = email;
		}
	}
	
	public String toString() {
		return "Nama persona: " + name + ", Alamat persona: " + adress + 
				", Nomor telepon persona: " + phone + ", Alamat email persona: " + email;
	}
}