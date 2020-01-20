package assignment_2;

public abstract class Vacation {
	private int cost, budget;
	private String destination;
	abstract int keptToBudget();
	final int getCost() {
		return cost;
	}
	final void setCost(int cost) {
		this.cost = cost;
	}
	final int getBudget() {
		return budget;
	}
	final void setBudget(int budget) {
		this.budget = budget;
	}
	final String getDestination() {
		return destination;
	}
	final void setDestination(String destination) {
		this.destination = destination;
	}
	
}
