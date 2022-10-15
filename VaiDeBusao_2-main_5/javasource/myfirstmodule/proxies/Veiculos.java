// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package myfirstmodule.proxies;

public class Veiculos
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject veiculosMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MyFirstModule.Veiculos";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Placa("Placa"),
		Marca("Marca"),
		Modelo("Modelo");

		private final java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public Veiculos(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected Veiculos(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject veiculosMendixObject)
	{
		if (veiculosMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, veiculosMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.veiculosMendixObject = veiculosMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Veiculos.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static myfirstmodule.proxies.Veiculos initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return myfirstmodule.proxies.Veiculos.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static myfirstmodule.proxies.Veiculos initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new myfirstmodule.proxies.Veiculos(context, mendixObject);
	}

	public static myfirstmodule.proxies.Veiculos load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return myfirstmodule.proxies.Veiculos.initialize(context, mendixObject);
	}

	public static java.util.List<myfirstmodule.proxies.Veiculos> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		return com.mendix.core.Core.createXPathQuery(String.format("//%1$s%2$s", entityName, xpathConstraint))
			.execute(context)
			.stream()
			.map(obj -> myfirstmodule.proxies.Veiculos.initialize(context, obj))
			.collect(java.util.stream.Collectors.toList());
	}

	/**
	 * Commit the changes made on this proxy object.
	 * @throws com.mendix.core.CoreException
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 * @throws com.mendix.core.CoreException
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of Placa
	 */
	public final java.lang.String getPlaca()
	{
		return getPlaca(getContext());
	}

	/**
	 * @param context
	 * @return value of Placa
	 */
	public final java.lang.String getPlaca(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Placa.toString());
	}

	/**
	 * Set value of Placa
	 * @param placa
	 */
	public final void setPlaca(java.lang.String placa)
	{
		setPlaca(getContext(), placa);
	}

	/**
	 * Set value of Placa
	 * @param context
	 * @param placa
	 */
	public final void setPlaca(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String placa)
	{
		getMendixObject().setValue(context, MemberNames.Placa.toString(), placa);
	}

	/**
	 * @return value of Marca
	 */
	public final java.lang.String getMarca()
	{
		return getMarca(getContext());
	}

	/**
	 * @param context
	 * @return value of Marca
	 */
	public final java.lang.String getMarca(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Marca.toString());
	}

	/**
	 * Set value of Marca
	 * @param marca
	 */
	public final void setMarca(java.lang.String marca)
	{
		setMarca(getContext(), marca);
	}

	/**
	 * Set value of Marca
	 * @param context
	 * @param marca
	 */
	public final void setMarca(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String marca)
	{
		getMendixObject().setValue(context, MemberNames.Marca.toString(), marca);
	}

	/**
	 * @return value of Modelo
	 */
	public final java.lang.String getModelo()
	{
		return getModelo(getContext());
	}

	/**
	 * @param context
	 * @return value of Modelo
	 */
	public final java.lang.String getModelo(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Modelo.toString());
	}

	/**
	 * Set value of Modelo
	 * @param modelo
	 */
	public final void setModelo(java.lang.String modelo)
	{
		setModelo(getContext(), modelo);
	}

	/**
	 * Set value of Modelo
	 * @param context
	 * @param modelo
	 */
	public final void setModelo(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String modelo)
	{
		getMendixObject().setValue(context, MemberNames.Modelo.toString(), modelo);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return veiculosMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this) {
			return true;
		}
		if (obj != null && getClass().equals(obj.getClass()))
		{
			final myfirstmodule.proxies.Veiculos that = (myfirstmodule.proxies.Veiculos) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return entityName;
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
