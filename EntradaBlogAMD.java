public class EntradaBlogAMD {

    public static char separador=':';
    private int id;
    private String texto;
    private String autor;

    /**
     * @author Adrian Macia Duarte
     * @version 2023-02-06
     * @param id
     * @param autor
     * @param texto
     * @throws IllegalArgumentException
     */

    public EntradaBlogAMD(int id,String autor,String texto)
            throws IllegalArgumentException{
        if(id<=0) throw new IllegalArgumentException("El id no puede ser negativo");
        this.id=id;
        this.autor=autor;
        this.texto=texto;
    }

    /**
     *
     * @return cad
     */
    @Override
    public String toString(){
        String cad="";
        cad+="\nENTRADA DE"+separador+autor;
        cad+="\n "+texto;
        return cad;
    }

    /**
     *
     * @return id
     */

    public int getId(){
        return this.id;
    }

    /**
     *
     * @return texto
     */

    public String getTexto(){
        return this.texto;
    }

    /**
     *
     * @return autor
     */
    public String getAutor(){
        return this.autor.toUpperCase();
    }

    /**
     *
     * @return autor
     */
    public String devuelveAutor(){
        return this.autor;
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        EntradaBlogAMD e1=new EntradaBlogAMD (3,"ana","Últimas noticias, está disponible BixBy 2.0");
        System.out.println(e1);
    }
}

