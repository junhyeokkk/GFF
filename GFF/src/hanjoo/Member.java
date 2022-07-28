package hanjoo;
public class Member {
	
	private int  m_num;
	private int busan_num;
	private String id;
	private String password;
	private String name;
	private String phone;
	private String grade;
	private String role;
	private String current_address;
	private String created_date;
	private String modifieded_date;
	private String status;
	
	
	// 전체
	public Member(int m_num, int busan_num, String id, String password, String name, String phone, String grade,
			String role, String current_address, String created_date, String modifieded_date, String status) {
		super();
		this.m_num = m_num;
		this.busan_num = busan_num;
		this.id = id;
		this.password = password;
		this.name = name;
		this.phone = phone;
		this.grade = grade;
		this.role = role;
		this.current_address = current_address;
		this.created_date = created_date;
		this.modifieded_date = modifieded_date;
		this.status = status;
	}
	
	// 회원가입할때
	public Member(int busan_num, String id, String password, String name, String phone, String current_address) {
		super();
		this.busan_num = busan_num;
		this.id = id;
		this.password = password;
		this.name = name;
		this.phone = phone;
		this.current_address = current_address;
	}
	

	public int getM_num() {
		return m_num;
	}

	public void setM_num(int m_num) {
		this.m_num = m_num;
	}

	public int getBusan_num() {
		return busan_num;
	}

	public void setBusan_num(int busan_num) {
		this.busan_num = busan_num;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getCurrent_address() {
		return current_address;
	}

	public void setCurrent_address(String current_address) {
		this.current_address = current_address;
	}

	public String getCreated_date() {
		return created_date;
	}

	public void setCreated_date(String created_date) {
		this.created_date = created_date;
	}

	public String getModifieded_date() {
		return modifieded_date;
	}

	public void setModifieded_date(String modifieded_date) {
		this.modifieded_date = modifieded_date;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
