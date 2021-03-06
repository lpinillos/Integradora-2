package model;

public class EnviromentalManagementPlan {
	
	private int havePlan;
	private double compliancePercentage;
	
	public EnviromentalManagementPlan(int havePlan, double compliancePercentage){
		
		this.havePlan = havePlan;
		this.compliancePercentage = compliancePercentage;
		
	}
	
	public int getHavePlan() {
		return havePlan;
	}

	public void setHavePlan(int havePlan) {
		this.havePlan = havePlan;
	}

	public double getCompliancePercentage() {
		return compliancePercentage;
	}

	public void setCompliancePercentage(double compliancePercentage) {
		this.compliancePercentage = compliancePercentage;
	}

	@Override
	public String toString() {
		
		String msg = "";
		
		msg = "Have enviromental management plan? " + havePlan + "\n";
		
		if (havePlan==1){
			
			msg = "The compliance percentage of the management plan is: " + compliancePercentage + "\n";
			
		}
		
		return msg;
	}
}
