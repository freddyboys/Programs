/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package debermatrices;
import java.util.Scanner;
/**
 *
 * @author johana
 * 
 */



class Superclase{
	private int tamaño;

	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}

	public int getTamaño() {
		return tamaño;
	}
	
}
//*********************************************************************************************************************************
class Subclase1 extends Superclase{
	private float[]vector = new float [200];
	private int n,i=0;
        
	public Subclase1(){
		
		Scanner x =new Scanner(System.in);
		do{
	System.out.println("Ingrese el tamaño del vector: ");
	n = x.nextInt();
	}while(n<1);
		setTamaño(n);
		/*for(i=0;i<n;i++);
		System.out.println("Ingrese los valores del vector: ");
                
                
		vector[i]=x.nextFloat();*/
                
                
                
                float[]v=new float[n];
        //int i=0;
        
        System.out.println("Introducir los valores del vector--> ");
        for(i=0 ;i< n; i++)
        {
            System.out.print("v["+i+"]=");
            v[i]=x.nextInt();
            
        }
        
                
        vector = v;                                                                                
        
        
	}
        
        
        public void MostrarV(){
            
		 System.out.println();
        for(i=0;i<n;i++)
            System.out.print("["+ vector[i]+"]"); 
	}

	public float[] getVector() {
		return vector;
	}

	public void setVector(float[] vector) {
		this.vector = vector;
	}
	
}

//*********************************************************************************************************************************
class Subclase2 extends Superclase{
	private float [][] matriz = new float[200][100];
	private float [][] matrizsuma = new float[200][100];
        private float [][] matrizresta = new float[200][100];
	 private float [][] matrizmultiplicacion = new float[200][100];
        
          public  int i,j;
	public	int fila,columna;
		
         Subclase1 s= new Subclase1();
         
	Scanner x = new Scanner(System.in);
	public Subclase2(){
		//int i,j;
		//int fila,columna;
		
		System.out.println("Ingrese el tamaño de filas de la matriz: ");
		fila= x.nextInt();
		System.out.println("Ingrese el tamaño de columnas de la matriz: ");
		columna= x.nextInt();
		for(j=0;j<fila;j++){
			//for(i=0;i<columna;i++){
                            
                            
                            
        for(i=0 ;i< columna; i++)
        {
            //float[]v=new float[fila];
            System.out.println("Introducir los valores de fila " + (j+1)+" la matriz--> ");
            System.out.print("i["+j+"]"  + "j["+i+"]="    );
            //v[i]=x.nextInt();
            matriz[j][i]=x.nextFloat();
            
        }

		}
	}
        
        
        
        
        
        public void MostrarMatriz(){
        
		 System.out.println();
        //for(i=0;i<n;i++)
         //   System.out.print("["+ vector[i]+"]"); 
        
        
        ////////////
        	for(j=0;j<fila;j++){
			//for(i=0;i<columna;i++){
                            
                            
                            
        for(i=0 ;i< columna; i++)
        {
            //float[]v=new float[fila];
            //System.out.println("Introducir los valores de fila " + (j+1)+" la matriz--> ");
            System.out.print("["  + matriz[j][i]+ "]"   );
            //v[i]=x.nextInt();
          //  matriz[j][i]=x.nextFloat();
            
        }

		}
        
        
        
        
        
        
        
        
        
	}
	
	
        public float[][] getMatriz() {
		return matriz;
	}

	public void setMatriz(float[][] matriz) {
		this.matriz = matriz;
	}
        
        
        
        
       public void Suma(){
		int i,j;
                float[]vector = new float [200];
                //float[] vector;
               
                vector=s.getVector();
                 System.out.print("Suma Matriz: ");
                for(j=0;j<fila;j++){
		//for(i=0;i<columna;i++){
			//matrizsuma[i][j]=matriz[i][j]+matriz[i][0];
                        matrizsuma[0][j]=vector[j]+matriz[0][j];
                        // System.out.println();
                      System.out.print(" ["  + matrizsuma[0][j]+ "]"   );     
		//}
                }
               
              
                
                
                
               //// 
               //Suma dos matrices        
       /*matriz suma(matriz x)
        {
          matriz resp=new matriz(fila,columna);
          for(int i=0;i<fila;i++)
	     for(int j=0;j<columna;j++)
	     {
	      matrizsuma[i][j]=matriz[i][j]+vector[i];
	     }
	   return resp;    
        } */
                
                
                
                
                
                
	} 
       
          public void Resta(){
		int i,j;
                float[]vector = new float [200];
                //float[] vector;
               
                vector=s.getVector();
                System.out.print("\nResta Matriz: ");
                for(j=0;j<fila;j++){
		//for(i=0;i<columna;i++){
			//matrizsuma[i][j]=matriz[i][j]+matriz[i][0];
                        matrizresta[0][j]=vector[j]-matriz[0][j];
                        // System.out.println();
                          System.out.print(" ["  + matrizresta[0][j]+ "]"   );
		//}
                }
                
              
                
                
                
               //// 
               //Suma dos matrices        
       /*matriz suma(matriz x)
        {
          matriz resp=new matriz(fila,columna);
          for(int i=0;i<fila;i++)
	     for(int j=0;j<columna;j++)
	     {
	      matrizsuma[i][j]=matriz[i][j]+vector[i];
	     }
	   return resp;    
        } */
                
                
                
                
                
                
	} 
       
       
       
           public void Multiplicacion(){
		int i,j;
                float[]vector = new float [200];
                //float[] vector;
               
                vector=s.getVector();
                System.out.print("\nMultiplicacion Matriz: ");
                for(i=0;i<fila;i++){
		for(j=0;j<columna;j++){
                   //int k=j+1;
                   //int l=i+1;
                   
			//matrizsuma[i][j]=matriz[i][j]+matriz[i][0];
                       matrizmultiplicacion[i][j]=vector[i]*matriz[i][j];// + vector[i]*matriz[i+1][j];
                       matrizmultiplicacion[i][j]+= matrizmultiplicacion[i][j];
                          System.out.print(" ["  + matrizmultiplicacion[i][j]+ "]"   );
		}
                }
       
       
        
}
}

/*
public void Suma(){
		int i,j;
		for(i=0;i<getTamaño();i++){
			matrizsuma[i][j]=matriz[i][j]+getVector();
		}
	}*/










public class DeberMatrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
       System.out.print("Operaciones de Vectores y Matrices: \n");
      
       //Subclase1 s= new Subclase1();
      
       //s.MostrarV();
       
       Subclase2 s2= new Subclase2();
       
       //s2.MostrarMatriz();
       
       s2.Suma();
       s2.Resta();
       s2.Multiplicacion();
        
    }
    
}
