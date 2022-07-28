package hanjoo;

public class Menu {
	private int menu_id;
	private int s_id;
	private String category;
	private String menu_name;
	private int menu_price;
	private int ord_cnt;
	private String created_date;
	private String modifieded_date;
	private String status;
	
	public Menu(int menu_id, int s_id, String category, String menu_name, int menu_price, int ord_cnt,
			String created_date, String modifieded_date, String status) {
		super();
		this.menu_id = menu_id;
		this.s_id = s_id;
		this.category = category;
		this.menu_name = menu_name;
		this.menu_price = menu_price;
		this.ord_cnt = ord_cnt;
		this.created_date = created_date;
		this.modifieded_date = modifieded_date;
		this.status = status;
	}

	public int getMenu_id() {
		return menu_id;
	}

	public void setMenu_id(int menu_id) {
		this.menu_id = menu_id;
	}

	public int getS_id() {
		return s_id;
	}

	public void setS_id(int s_id) {
		this.s_id = s_id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getMenu_name() {
		return menu_name;
	}

	public void setMenu_name(String menu_name) {
		this.menu_name = menu_name;
	}

	public int getMenu_price() {
		return menu_price;
	}

	public void setMenu_price(int menu_price) {
		this.menu_price = menu_price;
	}

	public int getOrd_cnt() {
		return ord_cnt;
	}

	public void setOrd_cnt(int ord_cnt) {
		this.ord_cnt = ord_cnt;
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
