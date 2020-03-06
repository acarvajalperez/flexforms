package es.opplus.frontend;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("logo")
public class LogoView extends VerticalLayout {
	public LogoView() {
		add(new H1("Prueba"));
	}
}
