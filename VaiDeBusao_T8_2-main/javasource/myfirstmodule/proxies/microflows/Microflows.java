// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package myfirstmodule.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;

public class Microflows
{
	// These are the microflows for the MyFirstModule module
	public static void aCT_Criar_Reserva(IContext context, myfirstmodule.proxies.Viagem _viagem)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Viagem", _viagem == null ? null : _viagem.getMendixObject());
		Core.microflowCall("MyFirstModule.ACT_Criar_Reserva").withParams(params).execute(context);
	}
	public static void oCH_Calcular_Desconto(IContext context, myfirstmodule.proxies.Reserva _reserva)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Reserva", _reserva == null ? null : _reserva.getMendixObject());
		Core.microflowCall("MyFirstModule.OCH_Calcular_Desconto").withParams(params).execute(context);
	}
}