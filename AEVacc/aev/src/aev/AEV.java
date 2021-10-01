package aev;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class AEV {
	
	
	static void getInformacio() {
		 Scanner obj = new Scanner(System.in);  
		    System.out.println("ruta directorio: ");  
		    String directorio = obj.nextLine();
		    File dir = new File(directorio);
		    System.out.println("nombre del directorio:  ");      
		    File D = new File(directorio); 
		
		
		if (dir.exists()) {
		    if (dir.isFile()) System.out.println("Es un archivo");    
		}
		else {
			if (dir.isDirectory()) System.out.println("Es una carpeta");
		}
		
		System.out.println("Directorio: "+ System.getProperty("user.dir"));
		
		long lastModified = dir.lastModified();
		String pattern = "yyyy-MM-dd hh:mm aa";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		Date lastModifiedDate = new Date( lastModified );
		System.out.println( "The file " + dir + " was last modified on " + simpleDateFormat.format( lastModifiedDate ) );
		
		System.out.println(dir.isHidden());
		
		System.out.println(dir.length());
		
		if(dir.isFile()) {
			System.out.println( "es un fichero ");
		} else {
			System.out.println( "es un directorio ");
			
			System.out.println( "elements " + dir.list());
			System.out.println( "espai lliure " + dir.getUsableSpace());
			System.out.println( "espai disponible " + dir.getFreeSpace());
			System.out.println( "espai total " + dir.getTotalSpace());
		}
	}

	static void creaCarpeta() {
		
	    Scanner obj = new Scanner(System.in);  
	    System.out.println("ruta directorio: ");  
	    String directorio = obj.nextLine();
	    File dir = new File(directorio);
	    System.out.println("nombre del directorio:  ");      
	    File D = new File(directorio);      
	    if(D.mkdir()){  
	       System.out.println("creado");  
	    }else{  
	       System.out.println("Error");  
	    }  
	}
	
	static void creaFitxer() {
		
		Scanner obj = new Scanner(System.in);  
	    System.out.println("ruta fichero: ");  
	    String fichero = obj.nextLine();
	    File fich = new File(fichero);
	    System.out.println("nombre del fichero: ");      
	    File F = new File(fichero);      
	    try {
			if(F.createNewFile()){  
			   System.out.println("creado");  
			}else{  
			   System.out.println("Error");  
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		
	}
	
	static void elimina() {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("que carpeta quieres borrar ");
		System.out.println("que fichero quieres borrar ");
		String directorio = obj.nextLine();
		String fichero = obj.nextLine();
		
		File f = new File(fichero);
		File d = new File(directorio);
		
		if (f.delete())
			 System.out.println("El fichero " + fichero + " ha sido borrado correctamente");
			else
			 System.out.println("El fichero " + fichero + " no se ha podido borrar");
		
		if (d.delete())
			 System.out.println("El fichero " + directorio + " ha sido borrado correctamente");
			else
			 System.out.println("El fichero " + directorio + " no se ha podido borrar");
		} 
	
	static void renomena() {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("que carpeta quieres renombrar ");
		System.out.println("que fichero quieres renombrar ");
		String directorio = obj.nextLine();
		String fichero = obj.nextLine();
		String directorio2 = obj.nextLine();
		String fichero2 = obj.nextLine();
		
		File f = new File(fichero);
		File d = new File(directorio);
		
		File f2 = new File(fichero2);
		File d2 = new File(directorio2);
		
		if (f.renameTo(f2))
			 System.out.println("El fichero " + f.getName() + " se ha modificado ");
			else
			 System.out.println("El fichero " + f.getName() + " no se ha modificado ");
		
		if (d.renameTo(d2))
			 System.out.println("El directorio " + d.getName() + " se ha modificado ");
			else
			 System.out.println("El directorio " + d.getName() + "no se ha modificado ");
			
	}

	
	public static void main(String[] args) {
		
		//String directori = args[0];
		//String fichero = args[1];
		
		//getInformacio();
		//creaCarpeta();
		//creaFitxer();
		//elimina();
		//renomena();
	
		Scanner sn = new Scanner(System.in);
	       boolean salir = false;
	       int opcion;
	       
	       while(!salir) {
	    	   
	    	   System.out.println("1 - informacio");
	           System.out.println("2 - crear directori");
	           System.out.println("3 - crear fitxer");
	           System.out.println("4 - borrar");
	           System.out.println("5 - renombrar");
	           System.out.println("6 - salir");
	           
	           opcion = sn.nextInt();
	           
	          switch(opcion){
	         case 1:
	             getInformacio();
	             break;
	         case 2:
	        	 creaCarpeta();
	             break;
	          case 3:
	        	  creaFitxer();
	             break;
	          case 4:
	        	  elimina();
	             break;
	          case 5:
	        	  renomena();
	              break;
	          case 6:
	        	  salir=true;
                  break;
	          default:
	             System.out.println("Solo números entre 1 y 6");
	    	   
	       }
	       }
	}
}