import javax.swing.JOptionPane;

public class fireclass {
	public static void main(String[] args) {
		String i = JOptionPane.showInputDialog(null, "Pick A Cooking Recipe rice,beans or noodles");
		if (i.equals("rice")) {
			JOptionPane.showMessageDialog(null,
					"Step 1 Heat the broth and Italian seasoning in a 2-quart saucepan over medium-high heat to a boil.");
			JOptionPane.showMessageDialog(null,
					"Step 2 Stir the rice in the saucepan. Reduce the heat to low. Cover and cook for 20 minutes or until the rice is tender.  Stir in the spinach and cheese.  Season to taste.  Serve with additional cheese.");
		} else if (i.equals("beans")) {
			JOptionPane.showMessageDialog(null, "Step 1 Preheat oven to 350 degrees F (175 degrees C).");
			JOptionPane.showMessageDialog(null,
					"Step 2 Place the bacon in a large, deep skillet, and cook over medium-high heat, turning occasionally, until evenly browned, about 10 minutes. Drain the bacon slices on a paper towel-lined plate. Let cool, and crumble.");
			JOptionPane.showMessageDialog(null,
					"Step 3 Place the ground beef and onions into a large skillet over medium heat, and cook and stir until the meat is no longer pink, breaking the meat apart as it cooks, about 10 minutes. Drain excess grease. Transfer the beef and onion mixture into a large Dutch oven. Stir in the crumbled bacon, honey barbecue sauce, pork and beans, kidney beans, lima beans, black beans, brown sugar, cider vinegar, liquid smoke, salt, and pepper.");
			JOptionPane.showMessageDialog(null,
					"Step 4 Cover, and bake in the preheated oven until bubbling, about 1 hour.");
		} else if (i.equals("noodles")) {
			JOptionPane.showMessageDialog(null,
					"Step 1 In a large bowl, stir together the flour and salt. Add the beaten egg, milk, and butter. Knead dough until smooth, about 5 minutes. Let rest in a covered bowl for 10 minutes.");
			JOptionPane.showMessageDialog(null,
					"Step 2 On a floured surface, roll out to 1/8 or 1/4 inch thickness. Cut into desired lengths and shapes.");
			JOptionPane.showMessageDialog(null, "Step 3 Allow to air dry before cooking.");
			JOptionPane.showMessageDialog(null,
					"Step 4 To cook fresh pasta, in a large pot with boiling salted water cook until al dente.");
		} else {
			JOptionPane.showMessageDialog(null, "Don't Have What You Want");

		}
		JOptionPane.showConfirmDialog(null, "Will You come Back Anytime");
		{
			JOptionPane.showMessageDialog(null, "YAY");
		}

	}
}
