package com.infytel.friend.family.infitelfriendfamily.dto;



public class FriendFamilyDTO {

	private long phoneNo;
	private long friendAndFamily;

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public long getFriendAndFamily() {
		return friendAndFamily;
	}

	public void setFriendAndFamily(long friendAndFamily) {
		this.friendAndFamily = friendAndFamily;
	}

	public FriendFamilyDTO(long phoneNo, long friendAndFamily) {
		this();
		this.phoneNo = phoneNo;
		this.friendAndFamily = friendAndFamily;
	}

	public FriendFamilyDTO() {
		super();
	}


	@Override
	public String toString() {
		return "FriendFamilyDTO [phoneNo=" + phoneNo + ", friendAndFamily=" + friendAndFamily + "]";
	}

}
