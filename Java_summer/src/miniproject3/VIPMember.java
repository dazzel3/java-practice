package miniproject3;

public class VIPMember extends Member {
	
	// To-do VIPMember는 Member에서 상속을 받습니다.
		// To-do 전담 상담원 아이디 속성을 추가합니다.
	
	private int agentId;
	
		
	public int getAgentId() {
		return agentId;
	}

	public void setAgentId(int agentId) {
		this.agentId = agentId;
	}
	
	public VIPMember() {
		
	}
		
	public VIPMember(int memberId, String memberName, int agentId) {
		this.memberId = memberId;
		this.memberName = memberName;
		this.agentId = agentId;
		// To-do 등급을 VIP로 설정해 줍니다.
		grade = "VIP";
	}

	@Override
	public String showMemberInfo() {
		// TODO Auto-generated method stub
		return super.showMemberInfo()+" 상담원 번호는 "+getAgentId()+"입니다.";
	}
	
	
}
