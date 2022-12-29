/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kmeans3d;

/**
 *
 * @author tania
 */
public class Point3D {
  public double cx, cy, cz;

  public Point3D(double x, double y, double z){
    this.cx = x;
    this.cy = y;
    this.cz = z;
  }

  public double getX(){
    return this.cx;
  }

  public double getY(){
    return this.cy;
  }

  public double getZ(){
    return this.cz;
  }
  
  public boolean comparaPunto(Point3D p3d){
      boolean esIg = false;
      if(this.getX()==p3d.getX() && this.getY()== p3d.getY()&& this.getZ()== p3d.getZ()){
          esIg = true;
      }
      return esIg;
  }
  
  public String toString(){
      String txt="";
      txt+="X: "+this.getX()+" ";
      txt+="Y: "+this.getY()+" ";
      txt+="Z: "+this.getZ()+"\n";
      return txt;
  }

}
