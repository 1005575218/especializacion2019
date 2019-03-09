package edu.cecar.controladores;

import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

public class GestionTestExtraerDatoCVLAC extends TestWatcher {
    @Override
    protected void failed(Throwable e, Description description) {
        System.out.println("la pruenba del metodo"+ description.getMethodName()+"ha fallado");
        System.out.println("El error presentado es"+ e.getLocalizedMessage());

    }

    @Override
    protected void succeeded(Description description) {
        System.out.println("la prueba del metodo"+ description.getMethodName()+"ha sido exitosa");
    }
}
