package archivos;

import java.io.*;
import javax.swing.JOptionPane;

public class MetodoArchivos {
    
    public MetodoArchivos(){
        
    }
    
    public void crearArchivo(File archivo, String ruta){
        try {
            archivo = new File(ruta);
            if(archivo.createNewFile()){  
                JOptionPane.showMessageDialog(null, "Archivo creado exitosamente");
            }
        } catch(IOException e)
        {
            JOptionPane.showMessageDialog(null, "Ocurrio un error al crear el archivo");
        }
    }
    
  public void escribir(String nameArchivo){
  File f; 
  FileWriter fw;
  PrintWriter  pr;
  BufferedWriter bw;
  
  String codigo = null, nameLibro = null, categoria =  null, editorial = null;

  try{
    f = new File(nameArchivo);
    fw = new FileWriter(f);
    bw = new BufferedWriter(fw);
    pr = new PrintWriter(bw);
    
    codigo = JOptionPane.showInputDialog("Ingresa código del libro");
    nameLibro = JOptionPane.showInputDialog("Ingresa el nombre del libro");
    categoria = JOptionPane.showInputDialog("Ingresa la categoria del libro");
    editorial = JOptionPane.showInputDialog("Ingresa la editorial del libro");
    
    codigo = codigo + "\n";
    pr.append(codigo);
    
    nameLibro = nameLibro + "\n";
    pr.append(nameLibro);
   
    categoria = categoria + "\n";
    pr.append(categoria);
    
    editorial = editorial + "\n";
    pr.append(editorial);
    
    pr.close();
    bw.close();
   
    JOptionPane.showMessageDialog(null, "Registro exitoso");  
  }catch(IOException e){
    JOptionPane.showMessageDialog(null, "Error al escribir");
  }
 }


  public boolean buscar(String nameToSearch, String codigo){
      boolean encontrado = false;
      String nameLibro = null, categoria = null, editorial = null, codigoActual = null;
      
      File f;
      FileReader fr;
      BufferedReader br;
    
      JOptionPane.showMessageDialog(null,"Buscando en el archvio ...");
        
      try{
          f = new File(nameToSearch);
          fr= new FileReader(f);
          br = new BufferedReader(fr);
          
          String linea = br.readLine();
          
          codigoActual=linea;
          
          if(codigoActual.equals (codigo)){
              linea = br.readLine();
              nameLibro=linea;
              
              linea = br.readLine();
              categoria = linea;
              
              linea = br.readLine();
              editorial = linea;
              encontrado = true;
     
          } 
          
          while(linea != null && encontrado == false){
              linea = br.readLine();
              
              codigoActual = linea;
              
             if(codigoActual.equals(codigo)){
                 linea = br.readLine();
                 nameLibro=linea;
                 
                 linea = br.readLine();
                 categoria = linea;
                 
                 linea = br.readLine();
                 editorial = linea;
                 
                 encontrado=true;   
             }
          }
          
         br.close();
         fr.close();
         
      }catch(IOException e) {
          JOptionPane.showMessageDialog(null, "Ocurrio un error");
      }
      
      return encontrado;
  }
  
  public void anexarDatos(String nameArchivo){
      File archivo;
      FileWriter escribir;
      PrintWriter linea;
      String codigo = null, nameLibro = null, categoria =  null, editorial = null;
      
      archivo = new File(nameArchivo);

      if(!archivo.exists()){
         try{
             archivo.createNewFile();
             codigo = JOptionPane.showInputDialog("Ingresa código del libro");
             nameLibro = JOptionPane.showInputDialog("Ingresa el nombre del libro");
             categoria = JOptionPane.showInputDialog("Ingresa la categoria del libro");
             editorial = JOptionPane.showInputDialog("Ingresa la editorial del libro");        
             
             escribir = new FileWriter(archivo, true);
             linea  = new PrintWriter(escribir);

             linea.println(codigo);
             linea.println(nameLibro);
             linea.println(categoria);
             linea.println(editorial);
             linea.close();
             escribir.close();
         }catch(IOException e) {
             JOptionPane.showMessageDialog(null, "Error al escribir");
         }
      }
      else{
          try{
              codigo    = JOptionPane.showInputDialog("Ingresa código del libro");
              nameLibro = JOptionPane.showInputDialog("Ingresa el nombre del libro");
              categoria = JOptionPane.showInputDialog("Ingresa la categoria del libro");
              editorial = JOptionPane.showInputDialog("Ingresa la editorial del libro");

              escribir = new FileWriter(archivo, true);
              linea  = new PrintWriter(escribir);

              linea.println(codigo);
              linea.println(nameLibro);
              linea.println(categoria);
              linea.println(editorial);

              linea.close();
              escribir.close();
          }catch(Exception e){
              JOptionPane.showMessageDialog(null, "Error al escribir");
          }
      }
  }
}
