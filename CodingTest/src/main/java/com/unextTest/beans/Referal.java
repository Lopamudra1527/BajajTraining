package com.unextTest.beans;

public class Referal {
    int referalId;
	String referalName;
    int userId;
    public Referal(int rId, String rName, int uId)
    {
    	referalId=rId;
    	referalName=rName;
    	userId=uId;
    }
	
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getReferalId() {
		return referalId;
	}

	public void setReferalId(int referalId) {
		this.referalId = referalId;
	}

    
	public String getReferalName() {
		return referalName;
	}
	
	public void setReferalName(String referalName) {
		this.referalName = referalName;
	}
	
    
    @Override
	public String toString() {
		return "Referal [id=" + referalId + ", referalName=" + referalName + ", userId=" + userId + "]";
	}
}
