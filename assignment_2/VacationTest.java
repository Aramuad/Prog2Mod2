package assignment_2;

public class VacationTest {

	public static void main(String[] args) {
		AllInclusive AI1 = new AllInclusive(500, 400, "Schlitterbahn", "San Antonio Is Tight", 5, 500);
		AllInclusive AI2 = new AllInclusive(250, 500, "McDonald's Hamburgers & Fry Dungeon", "McDonald's Is Tight", 1, 250);
		String[] expenses = new String[] {"Holiday Inn", "Goat Cheese", "Frontier Airlines"};
		int[] costs = new int[] {90, 7, 89};
		Piecemeal P1 = new Piecemeal(650, 400, "Bob's Smack-House", expenses, costs);
		String[] expenses1 = new String[] {"Red Roof Inn", "Haggis", "Concorde"};
		int[] costs1 = new int[] {40, 10, 3200};
		Piecemeal P2 = new Piecemeal(1180, 1200, "Shake Shack", expenses1, costs1);
		Vacation VAll = new AllInclusive(800, 1000, "Ur", "See Mesopotamia", 3, 800);
		String[] expenses2 = new String[] {"Radisson", "Fried Chicken", "United Airlines"};
		int[] costs2 = new int[] {400, 15, 850};
		Vacation VPie = new Piecemeal(700, 1100, "Gobekli Tepe", expenses2, costs2);
		System.out.println();
		System.out.println(AI1.toString());
		System.out.println(AI2.toString());
		System.out.println(P1.toString());
		System.out.println(P2.toString());
		System.out.println(VAll.toString());
		System.out.println(VPie.toString());
		System.out.println();
	}

}
