package cl.generation.f20221027;

public class DatosClientes {

	// atributos
	private String nombre;
	private String apellido;
	private Integer edad;
	private String correo;
	private Integer telefono;

	// constructor vacio
	public DatosClientes() {
		super();
	}

	// constructor datos
	public DatosClientes(String nombre, String apellido, Integer edad, String correo, Integer telefono) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.correo = correo;
		this.telefono = telefono;
	}

	//

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public Integer getTelefono() {
		return telefono;
	}

	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}
	// metodo del objeto

	@Override
	public String toString() {
		return "DatosClientes [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", correo=" + correo
				+ ", telefono=" + telefono + "]";
	}

}
