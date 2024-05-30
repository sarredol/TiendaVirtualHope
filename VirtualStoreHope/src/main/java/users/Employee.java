package users;

public class Employee extends User{

    private String cargo;
    private String estado;


    public Employee(){
        super();
    }

    public Employee(int id, String name, String lastName, String phone, String mail, String password, String cargo, String estado) {
        super(id, name, lastName, phone, mail, password);
        this.cargo = cargo;
        this.estado = estado;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public void crearUsuario() {
        super.crearUsuario();

        System.out.println("Cargo");
        System.out.println("Estado");
        System.out.println("Seleccione 1. gerente \n" +
                "2. supervisor \n" +
                "3. cagero");
        int opc = sc.nextInt();
        cargo = seleccionarTipoEmpleado(opc);
    }

    public String seleccionarTipoEmpleado(int opc){
        if ( opc == 1){
            String gerente = String.valueOf(TipoEmpleado.GERENTE);
            return gerente;
        } else if (opc == 2) {
            String supervisor = String.valueOf(TipoEmpleado.SUPERVISOR);
            return supervisor;
        }else if (opc == 3){
            String cajero = String.valueOf(TipoEmpleado.CAJERO);
            return cajero;
        }else {
            String mensaje = "Seleccione un valor valido";
            return mensaje;
        }
    }
}
