package assignment_2;

import java.util.Arrays;

public class Piecemeal extends Vacation {
	private String[] expenses = new String[3];
	private int[] costs = new int[3];
	Piecemeal() {
	}
	Piecemeal(int cost, int budget, String destination,
			String[] expenses, int[] costs) {
		setCost(cost);
		setBudget(budget);
		setDestination(destination);
		setExpenses(expenses);
		setCosts(costs);
	}
	final String[] getExpenses() {
		return expenses;
	}
	final void setExpenses(String[] expenses) {
		for(int i = 0; i < expenses.length; i++) {
			this.expenses[i] = expenses[i];
		}
	}
	final int[] getCosts() {
		return costs;
	}
	final void setCosts(int[] costs) {
		for(int i = 0; i < costs.length; i++) {
			this.costs[i] = costs[i];
		}
	}
	public int keptToBudget() {
		return getBudget() - getCost();
	}
	@Override
	public String toString() {
		return "Piecemeal, Expenses = " + Arrays.toString(expenses) + ", Costs = " + Arrays.toString(costs) + ", Cost = "
				+ getCost() + ", Budget = " + getBudget() + ", Destination = " + getDestination() + ", Kept to budget: " + keptToBudget();
	}
}
