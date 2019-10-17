package com.example.prueba.models;

public class UserModel {
	
	public UserModel() {
		super();
	}
	public UserModel(String nombre, String apellido, int telefono, String role, String password) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.role = role;
		this.password = password;
	}
	private String nombre;
	private String apellido;
	private int telefono;
	private String role;
	private String password;
	
	
	
	
	
	
	
	private int myNumber;
    private static UserModel dssd= null;

    public static UserModel getInstance() {
        if (dssd == null) {
        	dssd = new UserModel();
        }
        return dssd;
    }

   

    public void setMyNumber(int myNumber) {
        this.myNumber = myNumber;
    }

    public int getMyNumber() {
       return myNumber;
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
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
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	

}
