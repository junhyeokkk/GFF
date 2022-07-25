
import java.util.ArrayList;
import java.util.List;

/**
 * 싱글턴 패턴 기반의 데이터 공유센터 제작
 * 회원정보 리스트 및 현재 로그인 한 계정의 정보를 조회 할 수 있는 기능 제공
 * 
 * memberList 
 *  -> 현재 가입된 회원의 리스트를 제공
 * myInfo
 *  -> 현재 로그인 한 계정의 정보를 담고 있음. 
 *  -> 로그인 한 계정의 정보가 없을 경우, null로 반환됨. 
 *  -> 상황에 따라 NullPointException 예외 처리가 필요할 수도 있음
 * @author adgjl
 *
 */
public class LoginCenter {
   private static LoginCenter loginCenter;
   private ArrayList<Member> memberList;   
   private ArrayList<Seller> sellerList;
   private Member myInfo;
   private Seller selInfo;
   
   /**
    * 최초 인스턴스 생성 시, ArrayList<Member> 인스턴스화 및 myInfo Null처리 
    * 초기멤버 5명 설정 
    */
   public LoginCenter () {
      memberList = new ArrayList<Member>();
      sellerList = new ArrayList<Seller>();
      myInfo = null;
      selInfo = null;
   }

   public static LoginCenter getInstance() {
      if(loginCenter == null) {
    	  loginCenter = new LoginCenter();
      }
      return loginCenter;
   }

   /**
    * 회원가입한 회원 리스트 조회
    * @return ArrayList<Member>
    */
   public ArrayList<Member> getMemberList() {
      return memberList;
   }

   public ArrayList<Seller> getSellerList() {
	      return sellerList;
	   }
   /**
    * 회원 추가
    * @param Member
    */

   public void addMemberList(Member member) {
      this.memberList.add(member);
   }
   
   public void addSellerList(Seller seller) {
	      this.sellerList.add(seller);
	   }

   /**
    * 로그인 한 계정의 계정 정보 조회
    * @return Member
    */
   public Member getMyInfo() {
      return myInfo;
   }

   public Seller getSelInfo() {
	      return selInfo;
	   }
   /**
    * 로그인 한 계정 정보 등록
    * 로그아웃 시, Null 기입 
    * @param Member
    */
   public void setMyInfo(Member myInfo) {
      this.myInfo = myInfo;
   }
   
   public void setSelInfo(Seller selInfo) {
	      this.selInfo = selInfo;
   }


   
}