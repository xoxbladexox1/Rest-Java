package com.example.prueba.models;

import antlr.ByteBuffer;

public class prueba <t> {
	
	private int edad;
	private t objetoT ;
	private prioridad pri;
	
	
	
	public int getEdad() {
		return edad;
	}



	public void setEdad(int edad) {
		this.edad = edad;
	}



	public t getObjetoT() {
		return objetoT;
	}



	public void setObjetoT(t objetoT) {
		this.objetoT = objetoT;
	}


	public <g> g devolvercomog()
	{
		g objg = (g) pri;
		int a =0;
		return objg;
	}



	public  prueba()
	{
		
		devolvercomog();
	}

	
	
	
	
	
	
	
	public <T> T readObjectData(ByteBuffer buffer, Class<T> type) {
		
		T retVal = (T) pri;
		
		return retVal;

	}


}

