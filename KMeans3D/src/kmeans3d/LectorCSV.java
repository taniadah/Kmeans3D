package KNN;
import java.io.*;
import java.util.*;

public class LectorCSV{
  private String direccion;
  private BufferedReader lector;
  private String linea;
  private String partes[] = null;
  public ArrayList<String> clases, rasgos, sinRep;
  public ArrayList<Double> x, y;
  public boolean esC = true;
  public int indRX, indRY;


  public LectorCSV(String dir, int indRX, int indRY){
    this.direccion = dir;
    this.indRX = indRX;
    this.indRY = indRY;
  }

  public void leer(){
    rasgos = new ArrayList<String>();
    clases = new ArrayList<String>();
    sinRep = new ArrayList<String>();
    x = new ArrayList<Double>();
    y = new ArrayList<Double>();
    System.out.println(this.direccion);
    try {
      lector = new BufferedReader(new FileReader(this.direccion));
      while((linea = lector.readLine())!=null){
        partes = linea.split(",");
      //  imprimirLinea();
        agregar();
        esC = false;
      }

      lector.close();
      linea = null;
      partes = null;
    }catch(Exception e){
      System.out.println(e);
    }
    // cSR = clases;
    // cSR.clear();

    //
    ArrayList<String> list2 = (ArrayList<String>)clases.clone();
    Set<String> cSR = new HashSet<String>(list2);
    list2.clear();
    list2.addAll(cSR);

    // System.out.println("CLASES");
    // for(String clase: clases){
    //   System.out.println(clase);
    // }
    //
    //System.out.println("CLASES SIN REPE");
    for(String clase: cSR){
      //System.out.println(clase);
      sinRep.add(clase);
    }

    //
    // System.out.println("RASGOS");
    // for(String rasgo: rasgos){
    //   System.out.println(rasgo);
    // }
  }
  public void imprimirLinea(){
    System.out.println("imprimirLinea");

    for (int i = 0; i<partes.length; i++){
      System.out.println(partes[i] + " "+ i );
    }
  }
  public void agregar(){
    //System.out.println("Agregar");
    for (int i = 0; i<partes.length; i++){
      if(esC && i<partes.length-1){
        //System.out.println("kk"+i);
        // System.out.println(partes.length +" "+ i);
        // System.out.println(partes[i] + " "+ i );
        //
        rasgos.add(partes[i]);
      }else if (!esC && i == partes.length-1){
        clases.add(partes[i]);
        //System.out.println("partesp");
        x.add(Double.parseDouble(partes[indRX]));
        y.add(Double.parseDouble(partes[indRY]));
      }
    }
  }
}
