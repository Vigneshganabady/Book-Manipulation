import java.util.ArrayList;
import java.util.List;

public class Library{
	private List<Member> memberList = new ArrayList<Member>();
	public void addMember(Member memberObj){
		memberList.add(memberObj);
	}
	public List<Member> viewAllMembers() {
		return memberList;
		
	}
	public List<Member> viewMembersByAddress(String address){
		for(Member members: memberList){
			if(members.getAddress().equals(address)){
				System.out.println("Id: "+members.getMemberId());
				System.out.println("Name: "+members.getMemberName());
				System.out.println("Address: "+members.getAddress());
			}
		}
		return memberList;
		
	}
	public List<Member> getMemberList() {
		return memberList;
	}
	public void setMemberList(List<Member> memberList) {
		this.memberList = memberList;
	}
}