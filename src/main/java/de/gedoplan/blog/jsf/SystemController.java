package de.gedoplan.blog.jsf;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

/**
 *
 * @author GEDOPLAN, Dominik Mathmann
 */
@Named
@ApplicationScoped
public class SystemController {

    public static String transmitFlag="bv-form-transmit";

    public String getTransmitFlag() {
        return SystemController.transmitFlag;
    }


    
    
}
