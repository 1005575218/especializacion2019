package edu.cecar.controladores;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;
import java.util.ArrayList;

public class ExtraerDatoCVLAC {
    private ExtraerDatoCVLAC() {
    }

    public static Investigador  getDatos(String url) {
        String elemento = null;
        Investigador investigador = null;
        int pivote =0;

        try {

            //Se obtiene el documento HTML
            Document documentoHTML = Jsoup.connect(url).get();

            Element tablas = documentoHTML.select("table").get(1); //Se obtiene la segunda tabla
            Elements filasTabla = tablas.select("tr"); // Se obtienen las filas de la tabla
            Elements tablaslinea = documentoHTML.select("h3");

            int filaNombre = 0;
            int filaNacionalidad = 2;
            int filaSexo = 3;

            if (filasTabla.size() > 4){
                filaNombre = 2;
                filaNacionalidad = 4;
                filaSexo = 5;

            }


            for(int i=0; i<tablaslinea.size();i++){

                if (tablaslinea.get(i).text().trim().equals("Líneas de investigación")){
                    elemento = String.valueOf(tablaslinea.get(i).text());
                    pivote = i;

               }
            }
            Element tablas2 = documentoHTML.select("table").get(pivote + 1); //Se obtiene la segunda tabla
            Elements filasTabla2 = tablas2.select("tr");
            System.out.println("   "+filasTabla2);



            //Se obtienen las columnas para cada atributo del invstigador
            String nombre = filasTabla.get(filaNombre).select("td").get(1).text();
            String nacionalidad = filasTabla.get(filaNacionalidad).select("td").get(1).text();
            String sexo = filasTabla.get(filaSexo).select("td").get(1).text();
            String tablalinea =elemento;




            //Se crea el objeto investigador
            investigador = new Investigador(nombre, nacionalidad,sexo,tablalinea,true);

        } catch (IOException e) {

            e.printStackTrace();

        }

        return investigador;

    }
}
