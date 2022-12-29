/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kmeans3d;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.awt.geom.*;
import java.io.*;
import java.lang.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.math.*;

/**
 *
 * @author tania
 */
public class KMeans3D {
  private ArrayList<Integer> indClasePert, contPuntosxC;
  private ArrayList<Double> distancias;
  public static ArrayList<Point3D> atractoresNew, atractoresOld;
  public static ArrayList<Point3D> todosAtrac;
  public int numIteraciones;
  private double[] x,y,z;
  private String tipoDis;
  private boolean ver = false;
  


  public KMeans3D(ArrayList<Point3D> patr, String tDis){
    this.x = Interfaz.x;
    this.y = Interfaz.y;
    this.z = Interfaz.z;
    this.atractoresNew = patr;
    this.tipoDis = tDis;
    this.numIteraciones = 0;
    todosAtrac = new ArrayList<Point3D>();
  }
  
  
   public int getNumIteraciones(){
      return this.numIteraciones;
  }
   
   public void agregaAtractoresNew(){
       for(Point3D p: atractoresNew){
           todosAtrac.add(p);
       }
   }

  public double distanciaEuclidiana(double x1, double x2, double y1, double y2, double z1, double z2){
    double xD, yD, zD;
    xD = Math.pow((x2-x1), 2);
    yD = Math.pow((y2-y1),2);
    zD = Math.pow((z2-z1),2);
    double dis = Math.sqrt(xD+yD+zD);
    dis = Math.round(dis*100.0)/100.0;
    return dis;
  }
  public double distanciaManhattan(double x1, double x2, double y1, double y2, double z1, double z2){
    double xD, yD, zD;
    xD = (double)Math.abs(x2 - x1);
    yD = (double)Math.abs(y2 - y1);
    zD = (double)Math.abs(z2 - z1);
    double dis = xD + yD + zD;
    return dis;
  }
  public double distanciaMinkowski(double x1, double x2, double y1, double y2, double z1, double z2){
    double xD, yD, zD;
    xD = (double) Math.pow((double) Math.abs(x2-x1), 3);
    yD = (double) Math.pow((double) Math.abs(y2-y1), 3);
    zD = (double) Math.pow((double) Math.abs(z2-z1), 3);

    double dis = Math.pow(xD+yD+zD, (double) 1/3);
    dis = Math.round(dis*100.0)/100.0;
    return dis;

  }
  public double distanciaChebyshev(double x1, double x2, double y1, double y2, double z1, double z2){
    double xD, yD, zD;
    double dis;
    xD = (double)Math.abs(x2 - x1);
    yD = (double)Math.abs(y2 - y1);
    zD = (double)Math.abs(z2 - z1);

    dis = xD;
    if(yD>dis){
      dis = yD;
      if(zD>dis){
        dis = zD;
      }
    }else if(zD>dis){
      dis = zD;
    }
    return dis;
  }
  public double redDosDecimales(double xa){
    BigDecimal bd = new BigDecimal(xa).setScale(2, RoundingMode.HALF_UP);
    xa = bd.doubleValue();
    return xa;
  }

  public void algoritmoKmeans(){
    System.out.println("KMeans3D");
    while(!ver){
      agregaAtractoresNew();
      calculaDistancias();
      calcNuevoCentroide();
      comparaCentroides();
      pintaPuntos();
      numIteraciones+=1;
    }
    System.out.println("Iteraciones Totales: "+getNumIteraciones());
    System.out.println("Atractores totales: "+todosAtrac.size());
    for(Point3D p: todosAtrac){
        System.out.println(p);
    }
    
  }

  public void calculaDistancias(){
    distancias = new ArrayList<Double>();
    indClasePert = new ArrayList<Integer>();
    distancias = new ArrayList<Double>();
    indClasePert = new ArrayList<Integer>();
    double d;
    switch (tipoDis) {
      case "Euclidiana":
        for(int i = 0; i<x.length; i++){
          for(int j = 0; j<atractoresNew.size(); j++){
            d = distanciaEuclidiana(x[i], atractoresNew.get(j).getX(), y[i], atractoresNew.get(j).getY(), z[i], atractoresNew.get(j).getZ());
            distancias.add(d);
          }
          comparaDist();
          distancias.clear();
        }
      break;
      case "Manhattan":
        System.out.println("Manhattan");
        for(int i = 0; i<x.length; i++){
          for(int j = 0; j<atractoresNew.size(); j++){
            d = distanciaManhattan(x[i], atractoresNew.get(j).getX(), y[i], atractoresNew.get(j).getY(), z[i], atractoresNew.get(j).getZ());
            distancias.add(d);
          }
          comparaDist();
          distancias.clear();
        }

      break;
      case "Minkowski":
        System.out.println("Minkowski");
        for(int i = 0; i<x.length; i++){
          for(int j = 0; j<atractoresNew.size(); j++){
            d = distanciaMinkowski(x[i], atractoresNew.get(j).getX(), y[i], atractoresNew.get(j).getY(), z[i], atractoresNew.get(j).getZ());
            distancias.add(d);
          }
          comparaDist();
          distancias.clear();
        }
      break;
      case "Chebyshev":
        System.out.println("Chebyshev");
        for(int i = 0; i<x.length; i++){
          for(int j = 0; j<atractoresNew.size(); j++){
            d = distanciaChebyshev(x[i], atractoresNew.get(j).getX(), y[i], atractoresNew.get(j).getY(), z[i], atractoresNew.get(j).getZ());
            distancias.add(d);
          }
          comparaDist();
          distancias.clear();
        }

      break;
    }
  }

  public void comparaDist(){
    int indice = 0;
    double aux = distancias.get(0);
    double aux2;
    for(int i=1; i<distancias.size(); i++){
      aux2 = distancias.get(i);
      if(aux2<aux){
        aux = aux2;
        indice = i;
      }
    }
    indClasePert.add(indice);
  }

  public void calcNuevoCentroide(){
    atractoresOld = new ArrayList<Point3D>();
    atractoresOld.addAll(atractoresNew);
    atractoresNew = new ArrayList<Point3D>();
    contPuntosxC = new ArrayList<Integer>();
    int aux;
    double sumaX = 0.0;
    double sumaY = 0.0;
    double sumaZ = 0.0;
    double nuevX;
    double nuevY;
    double nuevZ;
    double cont = 0.0;
    for(int i = 0; i<atractoresOld.size(); i++){
      aux = i;
      for(int j = 0; j<x.length; j++){
        if(indClasePert.get(j)==aux){
          sumaX += x[j];
          sumaY += y[j];
          sumaZ += z[j];
          cont += 1.0;
        }
      }
      //contPuntosxC.add(cont);
      if(cont>0){
        nuevX = redDosDecimales(sumaX/cont);
        nuevY = redDosDecimales(sumaY/cont);
        nuevZ = redDosDecimales(sumaZ/cont);
        System.out.println(nuevX+","+nuevY+","+nuevZ);
        Point3D p = new Point3D(nuevX,nuevY,nuevZ);
        atractoresNew.add(p);
      }else{
        atractoresNew.add(atractoresOld.get(i));
      }
    sumaX = 0.0;
    sumaY = 0.0;
    sumaZ = 0.0;
    cont = 0.0;
    }
  }


  public void comparaCentroides(){
    int cont = 0;
    double x1,y1,x2,y2, z1, z2;
    boolean aux = true;

    while(aux && cont<atractoresNew.size()){
      x1 = atractoresOld.get(cont).getX();
      x2 = atractoresNew.get(cont).getX();
      y1 = atractoresOld.get(cont).getY();
      y2 = atractoresNew.get(cont).getY();
      z1 = atractoresOld.get(cont).getZ();
      z2 = atractoresOld.get(cont).getZ();
      if(x1==x2 && y1==y2 && z1==z2){
        aux = true;
      }else{
        aux = false;
      }
      cont+=1;
    }
    ver = aux;
    System.out.println("Verifique: "+ ver);
  }

  public void pintaPuntos(){

    String texto = "ATRACTORES old"+"\tATRACTORES new\n";

   // System.out.println("ATRACTORES old 1");
    int auxI = 0;
    for(Point3D p: atractoresOld){
      Point3D p2 = atractoresNew.get(auxI);
      texto+="("+p.getX()+", "+p.getY()+", "+p.getZ()+")\t("+p2.getX()+", "+p2.getY()+" ,"+p2.getZ()+")\n";
      auxI++;
    }
    Interfaz.textArea1.setText(texto);
    //System.out.println("ATRACTORES old 2");

    //System.out.println("Pintando puntos");
    double[] auxx, auxy, auxz;
    int aux;
    ArrayList<Double> auxX, auxY, auxZ;
    auxX = new ArrayList<Double>();
    auxY = new ArrayList<Double>();
    auxZ = new ArrayList<Double>();
    Interfaz.atractores = atractoresOld;
    boolean equis = false;
    
    //if(ver){
        Interfaz.plot3DPanel1.removeAllPlots();
    
        for(int i = 0; i<atractoresOld.size(); i++){
            aux = i;
            for(int j = 0; j<x.length; j++){
                if(indClasePert.get(j)== aux){
                    auxX.add(x[j]);
                    auxY.add(y[j]);
                    auxZ.add(z[j]);
                    equis = true;
                }
            }
            if(equis){
        //System.out.println("eqyus");
                auxx = alToArr(auxX);
                auxy = alToArr(auxY);
                auxz = alToArr(auxZ);
                Interfaz.colAct = Interfaz.colores.get(i);
                Interfaz.graficarPuntosClasificados(auxx, auxy, auxz);
                Interfaz.plot3DPanel1.addScatterPlot("Datos",Interfaz.colAct,auxx, auxy, auxz);
                //Interfaz.plot3DPanel1.
            }
            auxX.clear();
            auxY.clear();
            auxZ.clear();
            equis = false;
        }
        Interfaz.graficaAtractores();
        //Interfaz.update(Interfaz.getGraphics());
       Interfaz.plot3DPanel1.update(Interfaz.plot3DPanel1.getGraphics());
   // }
    

    //Interfaz.graficaAtractores();
    try{
      Thread.sleep(1500);
      System.out.println("Esperando");
    }catch(InterruptedException e ) {
      System.out.println("Thread Interrupted");
    }


  }
  public void pintaPuntos2(int iter){
      String texto = "ATRACTORES DE ITERACION "+iter+"\n";

    //System.out.println("ATRACTORES old 1");
    

    for(Point3D p: atractoresOld){ 
      texto+="("+p.getX()+", "+p.getY()+", "+p.getZ()+")\n";
    }
    Interfaz.textArea1.setText(texto);
    //System.out.println("ATRACTORES old 2");

    //System.out.println("Pintando puntos");
    double[] auxx, auxy, auxz;
    int aux;
    ArrayList<Double> auxX, auxY, auxZ;
    auxX = new ArrayList<Double>();
    auxY = new ArrayList<Double>();
    auxZ = new ArrayList<Double>();
  
    boolean equis = false;
    Interfaz.plot3DPanel1.removeAllPlots();
    Interfaz.atractores = atractoresOld;
    for(int i = 0; i<atractoresOld.size(); i++){
      aux = i;
      for(int j = 0; j<x.length; j++){
        if(indClasePert.get(j)== aux){
          auxX.add(x[j]);
          auxY.add(y[j]);
          auxZ.add(z[j]);
          equis = true;
        }
      }
      if(equis){
        //System.out.println("eqyus");
        auxx = alToArr(auxX);
        auxy = alToArr(auxY);
        auxz = alToArr(auxZ);
        Interfaz.colAct = Interfaz.colores.get(i);
        //Interfaz.graficarPuntosClasificados(auxx, auxy, auxz);
        Interfaz.plot3DPanel1.addScatterPlot("Datos",Interfaz.colAct,auxx, auxy, auxz);

        //Interfaz.plot3DPanel1.
      }
      auxX.clear();
      auxY.clear();
      auxZ.clear();
      equis = false;
    }

    Interfaz.graficaAtractores();
  }

  public double[] alToArr(ArrayList<Double> arrL){
    double[] arr = new double[arrL.size()];

    for(int i = 0; i<arrL.size();i++){
      arr[i] = arrL.get(i);
    }
    return arr;
  }
}
