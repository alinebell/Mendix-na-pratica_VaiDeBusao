// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package myfirstmodule.proxies;

public class Localidade
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject localidadeMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MyFirstModule.Localidade";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Endereco("Endereco"),
		Cidade("Cidade"),
		Estado("Estado");

		private java.lang.String metaName;

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

	public Localidade(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "MyFirstModule.Localidade"));
	}

	protected Localidade(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject localidadeMendixObject)
	{
		if (localidadeMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("MyFirstModule.Localidade", localidadeMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a MyFirstModule.Localidade");

		this.localidadeMendixObject = localidadeMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Localidade.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static myfirstmodule.proxies.Localidade initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return myfirstmodule.proxies.Localidade.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static myfirstmodule.proxies.Localidade initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new myfirstmodule.proxies.Localidade(context, mendixObject);
	}

	public static myfirstmodule.proxies.Localidade load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return myfirstmodule.proxies.Localidade.initialize(context, mendixObject);
	}

	public static java.util.List<myfirstmodule.proxies.Localidade> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<myfirstmodule.proxies.Localidade> result = new java.util.ArrayList<myfirstmodule.proxies.Localidade>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//MyFirstModule.Localidade" + xpathConstraint))
			result.add(myfirstmodule.proxies.Localidade.initialize(context, obj));
		return result;
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
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
	 * @return value of Endereco
	 */
	public final java.lang.String getEndereco()
	{
		return getEndereco(getContext());
	}

	/**
	 * @param context
	 * @return value of Endereco
	 */
	public final java.lang.String getEndereco(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Endereco.toString());
	}

	/**
	 * Set value of Endereco
	 * @param endereco
	 */
	public final void setEndereco(java.lang.String endereco)
	{
		setEndereco(getContext(), endereco);
	}

	/**
	 * Set value of Endereco
	 * @param context
	 * @param endereco
	 */
	public final void setEndereco(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String endereco)
	{
		getMendixObject().setValue(context, MemberNames.Endereco.toString(), endereco);
	}

	/**
	 * @return value of Cidade
	 */
	public final java.lang.String getCidade()
	{
		return getCidade(getContext());
	}

	/**
	 * @param context
	 * @return value of Cidade
	 */
	public final java.lang.String getCidade(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Cidade.toString());
	}

	/**
	 * Set value of Cidade
	 * @param cidade
	 */
	public final void setCidade(java.lang.String cidade)
	{
		setCidade(getContext(), cidade);
	}

	/**
	 * Set value of Cidade
	 * @param context
	 * @param cidade
	 */
	public final void setCidade(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String cidade)
	{
		getMendixObject().setValue(context, MemberNames.Cidade.toString(), cidade);
	}

	/**
	 * @return value of Estado
	 */
	public final java.lang.String getEstado()
	{
		return getEstado(getContext());
	}

	/**
	 * @param context
	 * @return value of Estado
	 */
	public final java.lang.String getEstado(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Estado.toString());
	}

	/**
	 * Set value of Estado
	 * @param estado
	 */
	public final void setEstado(java.lang.String estado)
	{
		setEstado(getContext(), estado);
	}

	/**
	 * Set value of Estado
	 * @param context
	 * @param estado
	 */
	public final void setEstado(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String estado)
	{
		getMendixObject().setValue(context, MemberNames.Estado.toString(), estado);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return localidadeMendixObject;
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
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final myfirstmodule.proxies.Localidade that = (myfirstmodule.proxies.Localidade) obj;
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
		return "MyFirstModule.Localidade";
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