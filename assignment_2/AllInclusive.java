package assignment_2;

public class AllInclusive extends Vacation {
	private String brand;
	private int rating, totalCost;
	AllInclusive() {
	}
	AllInclusive(int cost, int budget, String destination,
			String brand, int rating, int totalCost) {
		setCost(cost);
		setBudget(budget);
		setDestination(destination);
		this.brand = brand;
		this.rating = rating;
		this.totalCost = totalCost;
	}
	final String getBrand() {
		return brand;
	}
	final void setBrand(String brand) {
		this.brand = brand;
	}
	final int getRating() {
		return rating;
	}
	final void setRating(int rating) {
		this.rating = rating;
	}
	final int getTotalCost() {
		return totalCost;
	}
	final void setTotalCost(int totalCost) {
		this.totalCost = totalCost;
	}
	public int keptToBudget() {
		return getBudget() - getCost();
	}
	@Override
	public String toString() {
		return "All Inclusive, Brand = " + brand + ", Rating = " + rating + ", TotalCost = " + totalCost + ", Cost = "
				+ getCost() + ", Budget = " + getBudget() + ", Destination = " + getDestination() + ", Kept to budget: " + keptToBudget();
	}
}
