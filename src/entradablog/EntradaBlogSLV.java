package entradablog;

/**Clase para manejar las entradas de un blog.
 * La clase se creó el 21/3/1999 por Ana López.
 * Esta es la versión 2.3
 */

/**Modificar
 * separador es el ccarácter que separa ENTRADA DE del nombre del autor
 * @author Sergio Larrion
 */
public class EntradaBlogSLV {
	
	
	public static char separador=':';
	private int id;
	private String texto;
	private String autor;
	
	public EntradaBlogSLV(int i, String string, String string2) {
		/**
		 * TODO Auto-generated constructor stub
		 */
	}
	/**
	 * Constructor de la clase. recibe el número de entrada, el nombre del autor
	 * @param id
	 * @param autor
	 * @param texto
	 * @throws IllegalArgumentException
	 */
	public void EntradaBlog(int id,String autor,String texto)throws IllegalArgumentException{
		if(id<=0) throw new IllegalArgumentException("El id no puede ser negativo");
		this.id=id;
		this.autor=autor;
		this.texto=texto;
	}
	@Override
	public String toString(){
		String cad="";
		cad+="\nENTRADA DE"+separador+autor;
		cad+="\n "+texto;
		return cad;
	}
	
	/**
	 * Devuelve el número de la entrada
	 * @return
	 */
	public int getId(){
		return this.id;
	}
	
	/**
	 * devuelve el texto completo de la entrada
	 * @return
	 */
	public String getTexto(){
		return this.texto;
	}
	
	/**
	 * devuelve el nombre del autor de la entrada en mayúsculas
	 * @return
	 */
	public String getAutor(){
		return this.autor.toUpperCase();
	}
	
	/**
	 * devuelve el nombre del autor. Ya no se usa. Mejor ver getAutor
	 * @return
	 */
	public String devuelveAutor(){
		return this.autor;
	}
	
	/**
	 * No tiene porqué tener argumentos.
	 * @param args
	 */
	public static void main(String[] args) {
                /**
                 * Modificar.
                 */
		EntradaBlogSLV e1=new EntradaBlogSLV (-3,"ana","Últimas noticias, está disponible BixBy 2.0");
		System.out.println(e1);
	}
}