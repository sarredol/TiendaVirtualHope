package users;

public class Costumer extends User {

    // Clases: la forma en que las clases se comunican lo determina la relacion
    // 1.herencia
    // 2.asociación (agregagación - composición)
    // 3.dependencia (instanciación)

    // las clases se envia mensajes (comunicación)

    private int codCliente;
    private String tipoCliente;

    //Constructor vacio
    public Costumer(){
        //Vamos a llamar el constructor de la clase padre que puede utilizar todos los metodos
        // Siempre que se tenga un extend se debe tener la clase super
        super();
    }

    //Constructor inicializado
    public Costumer(int id, String name, String lastName, String phone, String mail, String password, int codCliente, String tipoCliente) {
        super(id, name, lastName, phone, mail, password);
        this.codCliente = codCliente;
        this.tipoCliente = tipoCliente;
    }

    public int getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    // POO tiene 4 pilares: abstracción(atributos), herencia(padre e hijas), encapsulamiento (modificadores, private set,get)
    //Polimorfismo: sobre escritura, sobrecarga


    @Override
    public void crearUsuario() {
        super.crearUsuario();
        System.out.println("cod Cliente");
        codCliente = sc.nextInt();
        System.out.println("Tipo Cliente");
        System.out.println("Seleccione 1. Persona natural \n" +
                        "2. Persona Juridica");
        int opc = sc.nextInt();
        tipoCliente = seleccionarTipoCliente(opc);
    }

    public String seleccionarTipoCliente(int opc){
        if ( opc == 1){
            String personaNatural = String.valueOf(TipoCliente.PERSONA_NATURAL);
            return personaNatural;
        } else if (opc == 2) {
            String personaJuridica = String.valueOf(TipoCliente.PERSONA_JURIDICA);
            return personaJuridica;
        }else {
           String mensaje = "Seleccione un valor valido";
           return mensaje;
        }
    }
}


