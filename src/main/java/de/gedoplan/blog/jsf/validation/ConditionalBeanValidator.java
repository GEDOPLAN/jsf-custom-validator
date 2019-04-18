package de.gedoplan.blog.jsf.validation;

import de.gedoplan.blog.jsf.SystemController;
import de.gedoplan.blog.jsf.validation.groups.OnTransmit;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.BeanValidator;

/**
 *
 * @author Dominik Mathmann
 */
public class ConditionalBeanValidator extends BeanValidator{

    @Override
    public void validate(FacesContext context, UIComponent component, Object value) {
        setValidationGroups(retrieveValidationGroup(context));
        super.validate(context, component, value);
    }
 
     private String retrieveValidationGroup(FacesContext context) { 
        if (context.getExternalContext().getRequestParameterValuesMap().containsKey(SystemController.transmitFlag)) {
            return OnTransmit.class.getName();
        }
        
        return null;

    }
}
