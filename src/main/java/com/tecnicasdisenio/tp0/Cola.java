package com.tecnicasdisenio.tp0;


public class Cola implements Queue
{

	private Elemento primerElemento;
	private Elemento ultimoElemento;

    public boolean isEmpty()
	{
		return (primerElemento==null);
	}
	public int size()
	{
		Elemento current = primerElemento;
		int cantidadDeElementos = 0;
		while(current != null)
		{
			cantidadDeElementos++;
		}
		return cantidadDeElementos;
	}
	public void add(Object item)
	{
		assert(primerElemento != null) : primerElemento = new Elemento(item);
		assert(ultimoElemento != null) : ultimoElemento = primerElemento;
		assert(ultimoElemento == primerElemento) : ultimoElemento = ultimoElemento.setNext(item);
	}
	public Object top()
	{
		assert(primerElemento != null);
		return primerElemento.getCurrentObject();
	}
	public void remove()
	{
		assert(primerElemento != null);
		primerElemento = primerElemento.getNextElement();
	}
}