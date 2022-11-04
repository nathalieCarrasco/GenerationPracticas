package cl.generation.f20221103;

import java.util.ArrayList;

public class Usuario {
	private String nombre;
	private String correo;
	private String password;
	private String apellido;
	private String nick;

	private ArrayList<String> telefonos;
	//atributo de colaboracion
	private Direccion direccion;

	public Usuario() {
		super();
		//estamos inicializando un arreglo 
		this.telefonos=new ArrayList<String>();
	}

	public Usuario(String nombre, String correo, String password, String apellido, String nick,
			ArrayList<String> telefonos,Direccion direccion) {
		super();
		this.nombre = nombre;
		this.correo = correo;
		this.password = password;
		this.apellido = apellido;
		this.nick = nick;
		this.telefonos = telefonos;
		this.direccion = direccion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public ArrayList<String> getTelefonos() {
		return telefonos;
	}

	public void setTelefonos(ArrayList<String> telefonos) {
		this.telefonos = telefonos;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", correo=" + correo + ", password=" + password + ", apellido=" + apellido
				+ ", nick=" + nick + ", telefonos=" + telefonos + ", direccion=" + direccion + "]";
	}



}
