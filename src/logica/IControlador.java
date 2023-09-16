//mio
package logica;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public interface IControlador {

public abstract void AltaDeUsuarioTurista(String nickname, String nombre, String apellido, String correo, Date fNacimiento, String nacionalidad);
public abstract void AltaDeUsuarioProveedor(String nickname, String nombre, String apellido, String correo, Date fNacimiento, String descripcion, String link);//throws UsuarioRepetidoException;// es una prueba
public abstract Usuario ConsultaDeUsuario(String nickname); //Devuelve el usuario 
public abstract ArrayList listaUsuarios();  //devuelve una lista de todos los usuarios sin discriminar su tipo
public abstract ArrayList listaProveedores(); //devuelve una lista de todos los proveedores
public abstract ArrayList listaDepartamentos(); //devuelve una lista de todos los departamentos
public abstract ArrayList listaDeptos();//lista que contiene solo los nombres de los departamentos
public abstract ArrayList listaPaquetes();
public abstract ArrayList listaActividades();
public abstract void ModificarDatosDeUsuarioProveedor(String nickname, String nombre, String apellido, String correo, Date fecha, String descripcion, String url);
public void ModificarDatosDeUsuarioTurista(String nickname, String nombre, String apellido, String correo, Date fecha, String nacionalidad);//Nati
public abstract void AltaDeActividadTuristica(String nombre, String descripcion, int duracion, float costo, String ciudad, Date fAlta, ArrayList<SalidaTuristica> listaSalidaTuristica, ArrayList<Paquete> listaPaquete);
public abstract Actividad ConsultaActividadTuristica(String nombreActividad);
public abstract ArrayList listaActividadesTuristicas(String departamento);
public abstract ArrayList listaSalActividadTuristica(String actividad);
public abstract List consultaPaquetes();
//    public abstract void AltaDeSalidaTuristica();
 public abstract SalidaTuristica ConsultaSalidaTuristica(String nombreSalida);
//    public abstract void InscripcionDeSalidaTuristica();
 public abstract void crearPaqueteActividadTuristica(String nombreDePaquete, String descripcionDePaquete, int validezDePaquete, Date altaDePaquete, int descuentoDePaquete);
//    public abstract void AgregarActividadTuristicaAPaquete();
//    public abstract void ConsultaDePaqueteDeActividadTuristicas();

   public abstract void AltaDeDepartamento(String nombre, String descripcion, String url);
   

   public abstract List<String> llenarCmboBoxDep();
   public abstract void AltaSalidaTuristica(String nombre, int cantMax, Date fAlta, Date fSalida, String lugar, String nombreActividad);
   public abstract void guardarActividad(String nombreActividad,String descripcionActividad,int duracionActividad,float costoActividad,String nombreCuidad,Date fecha,String nombreProveedor, String nombreDepartamento);
    public ArrayList<DTUsuario> traerUsuarioMod();
    public DTTurista traerDTTurista(String nickname);
    public DTProveedor traerDTProveedor(String nickname);
public abstract void asignarActividadPaquete(String paqueteSeleccionado,String actividadSeleccionada);
public abstract List findSalidasTuristicasDepartamento(String departamentoSeleccionado);//trae lista de strings con los nombres de las actividades asociadas a un depto att:carlangas

public abstract ArrayList<DTActividad> encontraActividadDepartamento(String departamentoSeleccionado);//trae dtactividad asociados a un depto
public abstract ArrayList<Turista> listaTurista();
public abstract void AltaInscripcion(Inscripcion insc);

public abstract void cargarDatosDePrueba();
}