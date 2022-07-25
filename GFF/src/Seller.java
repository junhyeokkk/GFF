
public class Seller {
	private int sel_id;
	private String f_id;
	private String sel_log_id;
	private String password;
	private String name;
	private String phone;
	private String created_date;
	private String modifieded_date;
	private String status;
	public Seller(int sel_id, String f_id, String sel_log_id, String password, String name, String phone,
			String created_date, String modifieded_date, String status) {
		super();
		this.sel_id = sel_id;
		this.f_id = f_id;
		this.sel_log_id = sel_log_id;
		this.password = password;
		this.name = name;
		this.phone = phone;
		this.created_date = created_date;
		this.modifieded_date = modifieded_date;
		this.status = status;
	}
	/**
	 * @return the sel_id
	 */
	public int getSel_id() {
		return sel_id;
	}
	/**
	 * @param sel_id the sel_id to set
	 */
	public void setSel_id(int sel_id) {
		this.sel_id = sel_id;
	}
	/**
	 * @return the f_id
	 */
	public String getF_id() {
		return f_id;
	}
	/**
	 * @param f_id the f_id to set
	 */
	public void setF_id(String f_id) {
		this.f_id = f_id;
	}
	/**
	 * @return the sel_log_id
	 */
	public String getSel_log_id() {
		return sel_log_id;
	}
	/**
	 * @param sel_log_id the sel_log_id to set
	 */
	public void setSel_log_id(String sel_log_id) {
		this.sel_log_id = sel_log_id;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * @return the created_date
	 */
	public String getCreated_date() {
		return created_date;
	}
	/**
	 * @param created_date the created_date to set
	 */
	public void setCreated_date(String created_date) {
		this.created_date = created_date;
	}
	/**
	 * @return the modifieded_date
	 */
	public String getModifieded_date() {
		return modifieded_date;
	}
	/**
	 * @param modifieded_date the modifieded_date to set
	 */
	public void setModifieded_date(String modifieded_date) {
		this.modifieded_date = modifieded_date;
	}
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	  
}
