package br.com.etechoracio.training.view.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

import org.springframework.stereotype.Component;

@Component(value="TelConverter")
public class TelConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		String Tel = value;
		if (Tel != null && !Tel.equals("")){
			Tel = value.replaceAll("[^0-9]", "");
		}
		return Tel;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		String Tel = String.valueOf(value);
		if (Tel != null && Tel.length() == 10) {
			Tel = Tel.substring(0, 0) + "(" +
			Tel.substring(2, 4) + ")" + 
			Tel.substring(5, 8) + "-" + 
			Tel.substring(9);
			
			return Tel;
		}
		return null;
	}

}



