package referential.app;

import referential.controller.Controller;
import referential.model.Model;
import referential.view.View;

public class App {

	public static void main(String[] arg) {
		final Model model = new Model();
		final View view = new View(model);
		final Controller controller = new Controller(model, view);

		view.getFilterPanel().getJButtonSearch().addActionListener(controller);
	}
}
