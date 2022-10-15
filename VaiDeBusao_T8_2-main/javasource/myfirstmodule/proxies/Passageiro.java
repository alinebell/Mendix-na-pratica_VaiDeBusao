// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package myfirstmodule.proxies;

public class Passageiro
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject passageiroMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MyFirstModule.Passageiro";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Nome("Nome"),
		Celular("Celular");

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

	public Passageiro(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "MyFirstModule.Passageiro"));
	}

	protected Passageiro(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject passageiroMendixObject)
	{
		if (passageiroMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("MyFirstModule.Passageiro", passageiroMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a MyFirstModule.Passageiro");

		this.passageiroMendixObject = passageiroMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Passageiro.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static myfirstmodule.proxies.Passageiro initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return myfirstmodule.proxies.Passageiro.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static myfirstmodule.proxies.Passageiro initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new myfirstmodule.proxies.Passageiro(context, mendixObject);
	}

	public static myfirstmodule.proxies.Passageiro load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return myfirstmodule.proxies.Passageiro.initialize(context, mendixObject);
	}

	public static java.util.List<myfirstmodule.proxies.Passageiro> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<myfirstmodule.proxies.Passageiro> result = new java.util.ArrayList<myfirstmodule.proxies.Passageiro>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//MyFirstModule.Passageiro" + xpathConstraint))
			result.add(myfirstmodule.proxies.Passageiro.initialize(context, obj));
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
	 * @return value of Nome
	 */
	public final java.lang.String getNome()
	{
		return getNome(getContext());
	}

	/**
	 * @param context
	 * @return value of Nome
	 */
	public final java.lang.String getNome(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Nome.toString());
	}

	/**
	 * Set value of Nome
	 * @param nome
	 */
	public final void setNome(java.lang.String nome)
	{
		setNome(getContext(), nome);
	}

	/**
	 * Set value of Nome
	 * @param context
	 * @param nome
	 */
	public final void setNome(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String nome)
	{
		getMendixObject().setValue(context, MemberNames.Nome.toString(), nome);
	}

	/**
	 * @return value of Celular
	 */
	public final java.lang.String getCelular()
	{
		return getCelular(getContext());
	}

	/**
	 * @param context
	 * @return value of Celular
	 */
	public final java.lang.String getCelular(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Celular.toString());
	}

	/**
	 * Set value of Celular
	 * @param celular
	 */
	public final void setCelular(java.lang.String celular)
	{
		setCelular(getContext(), celular);
	}

	/**
	 * Set value of Celular
	 * @param context
	 * @param celular
	 */
	public final void setCelular(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String celular)
	{
		getMendixObject().setValue(context, MemberNames.Celular.toString(), celular);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return passageiroMendixObject;
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
			final myfirstmodule.proxies.Passageiro that = (myfirstmodule.proxies.Passageiro) obj;
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
		return "MyFirstModule.Passageiro";
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
