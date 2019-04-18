package de.gedoplan.blog.jsf.validation;

import de.gedoplan.blog.jsf.validation.groups.OnTransmit;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.validation.groups.Default;

/**
 *
 * @author GEDOPLAN, Dominik Mathmann
 */
public class DemoModel {

    @NotNull(groups = OnTransmit.class)
    @Size(min = 4, groups = OnTransmit.class)
    private String firstname;

    @NotNull(groups = {Default.class, OnTransmit.class})
    @Size(min = 4, groups = {Default.class, OnTransmit.class})
    private String lastname;

    private boolean reciveNewsletter;

    @NotNull(groups = OnTransmit.class)
    private Integer age;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public boolean isReciveNewsletter() {
        return reciveNewsletter;
    }

    public void setReciveNewsletter(boolean reciveNewsletter) {
        this.reciveNewsletter = reciveNewsletter;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "DemoModel{" + "firstname=" + firstname + ", lastname=" + lastname + ", reciveNewsletter=" + reciveNewsletter + ", age=" + age + '}';
    }

}
