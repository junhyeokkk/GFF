
public class FoodShop {
   private int s_id;
   private String s_name;
   private int sel_id;
   private int type;
   private String s_address;
   private String shop_pic;
   private String tel;
   private String intro;
   private int min_del_price;
   private int del_price;
   private int del_time;
   private double rating;
   private int dibs_cnt;
   private int rei_cnt;
   private String oper_hour;
   private String created_date;
   private String modifieded_date;
   private String status;
   
   
   public FoodShop(int s_id, String s_name, int sel_id, int type, String s_address, String shop_pic,
         String tel, String intro, int min_del_price, int del_price, int del_time, double rating, int dibs_cnt,
         int rei_cnt, String oper_hour, String created_date, String modifieded_date, String status) {
      super();
      this.s_id = s_id;
      this.s_name = s_name;
      this.sel_id = sel_id;
      this.type = type;
      this.s_address = s_address;
      this.shop_pic = shop_pic;
      this.tel = tel;
      this.intro = intro;
      this.min_del_price = min_del_price;
      this.del_price = del_price;
      this.del_time = del_time;
      this.rating = rating;
      this.dibs_cnt = dibs_cnt;
      this.rei_cnt = rei_cnt;
      this.oper_hour = oper_hour;
      this.created_date = created_date;
      this.modifieded_date = modifieded_date;
      this.status = status;
   }
   

   //pnl들어가는값
   public FoodShop(String s_name, int min_del_price, int del_price, String shop_pic, double rating) {
      super();
      this.s_name = s_name;
      this.min_del_price = min_del_price;
      this.del_price = del_price;
      this.shop_pic = shop_pic;
      this.rating = rating;
   }

   //내가게목록 pnl 들어가는값
   public FoodShop(int s_id, String s_name, String shop_pic) {
      super();
      this.s_id = s_id;
      this.s_name = s_name;
      this.shop_pic = shop_pic;
   }


   /**
    * @return the s_id
    */
   public int getS_id() {
      return s_id;
   }
   /**
    * @param s_id the s_id to set
    */
   public void setS_id(int s_id) {
      this.s_id = s_id;
   }
   /**
    * @return the s_name
    */
   public String getS_name() {
      return s_name;
   }
   /**
    * @param s_name the s_name to set
    */
   public void setS_name(String s_name) {
      this.s_name = s_name;
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
    * @return the type
    */
   public int getType() {
      return type;
   }
   /**
    * @param type the type to set
    */
   public void setType(int type) {
      this.type = type;
   }

   public String getS_address() {
      return s_address;
   }
   /**
    * @param s_address the s_address to set
    */
   public void setS_address(String s_address) {
      this.s_address = s_address;
   }
   /**
    * @return the tel
    */
   public String getTel() {
      return tel;
   }
   /**
    * @param tel the tel to set
    */
   public void setTel(String tel) {
      this.tel = tel;
   }
   /**
    * @return the intro
    */
   public String getIntro() {
      return intro;
   }
   /**
    * @param intro the intro to set
    */
   public void setIntro(String intro) {
      this.intro = intro;
   }
   /**
    * @return the min_del_price
    */
   public int getMin_del_price() {
      return min_del_price;
   }
   /**
    * @param min_del_price the min_del_price to set
    */
   public void setMin_del_price(int min_del_price) {
      this.min_del_price = min_del_price;
   }
   /**
    * @return the del_price
    */
   public int getDel_price() {
      return del_price;
   }
   /**
    * @param del_price the del_price to set
    */
   public void setDel_price(int del_price) {
      this.del_price = del_price;
   }
   /**
    * @return the del_time
    */
   public int getDel_time() {
      return del_time;
   }
   /**
    * @param del_time the del_time to set
    */
   public void setDel_time(int del_time) {
      this.del_time = del_time;
   }
   /**
    * @return the rating
    */
   public double getRating() {
      return rating;
   }
   /**
    * @param rating the rating to set
    */
   public void setRating(double rating) {
      this.rating = rating;
   }
   /**
    * @return the dibs_cnt
    */
   public int getDibs_cnt() {
      return dibs_cnt;
   }
   /**
    * @param dibs_cnt the dibs_cnt to set
    */
   public void setDibs_cnt(int dibs_cnt) {
      this.dibs_cnt = dibs_cnt;
   }
   /**
    * @return the rei_cnt
    */
   public int getRei_cnt() {
      return rei_cnt;
   }
   /**
    * @param rei_cnt the rei_cnt to set
    */
   public void setRei_cnt(int rei_cnt) {
      this.rei_cnt = rei_cnt;
   }
   /**
    * @return the oper_hour
    */
   public String getOper_hour() {
      return oper_hour;
   }
   /**
    * @param oper_hour the oper_hour to set
    */
   public void setOper_hour(String oper_hour) {
      this.oper_hour = oper_hour;
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


   /**
    * @return the shop_pic
    */
   public String getShop_pic() {
      return shop_pic;
   }


   /**
    * @param shop_pic the shop_pic to set
    */
   public void setShop_pic(String shop_pic) {
      this.shop_pic = shop_pic;
   }
   
   
   
}