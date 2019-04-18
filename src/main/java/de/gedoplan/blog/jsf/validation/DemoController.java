package de.gedoplan.blog.jsf.validation;

import java.io.Serializable;
import java.util.Set;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.validation.ConstraintViolation;
import javax.validation.Validator;

/**
 *
 * @author GEDOPLAN, Dominik Mathmann
 */
@ViewScoped
@Named("demoController")
public class DemoController implements Serializable {

    private DemoModel model;

    public String submit() {


        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Submittet", model.toString()));
        return null;
    }

    public String transmit() {

        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Transmittet", model.toString()));
        return null;
    }

    @PostConstruct
    private void init() {
        this.model = new DemoModel();
    }

    public DemoModel getModel() {
        return model;
    }

    public void setModel(DemoModel model) {
        this.model = model;
    }

}
