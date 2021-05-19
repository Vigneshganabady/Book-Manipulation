import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice=0;
		List<Member>member_list=new ArrayList<Member>();
		Library lib=new Library();
		lib.setMemberList(member_list);
		boolean flag=true;
		int count=0;
		while(flag){
		System.out.println("1.Add Member\r\n" + 
				" 2.View All Members\r\n" + 
				" 3.Search Member by address\r\n" + 
				" 4.Exit\r\n"+ 
				"Enter your choice:");
		choice=sc.nextInt();
		sc.nextLine();
		switch(choice){
		case 1: Member b=new Member();
				System.out.println("Enter the id:");
				b.setMemberId(sc.nextInt());
				sc.nextLine();
				System.out.println("Enter the name:");
				b.setMemberName(sc.nextLine());
				System.out.println("Enter the address:");
				b.setAddress(sc.nextLine());
				break;
		case 2: 
				member_list=lib.viewAllMembers();
				for(Member members: member_list){
				System.out.println("Id: "+members.getMemberId());
				System.out.println("Name: "+members.getMemberName());
				System.out.println("Address: "+members.getAddress());
				}
				break;
		case 3: System.out.println("Enter the address:");
				member_list=lib.viewMembersByAddress(sc.nextLine());
				break;
		case 4: flag=false;
				break; 
		}
		}
	
	}
}