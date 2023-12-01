package ar.com.telecom.fmvue.util;

import java.text.SimpleDateFormat;
import java.util.*;

public class Constante {

	public static final String GESTOR_MATERIALES_URI = "GESTOR_MATERIALES_URI";
	public static final String FIELD_MANAGER = "FieldManager";
	public static final String ESTRUCTURA_B2B = "B2B";

	// Format
	public static final String FORMAT_DATE = "dd/MM/yyyy HH:mm:ss";
	public static final String FORMAT_DATE_ONLY = "dd/MM/yyyy";
	public static final String FORMAT_DATE_SAP = "yyyyMMdd";
	public static final String FORMAT_DATE_TBX = "yyyy-MM-dd'T'HH:mm:ss";
	public static final String FORMAT_DATE_SF = "yyyy-MM-dd'T'HH:mm:ss.SSS";
	// Constantes
	public static final String OK = "OK";
	public static final String NOK = "NOK";
	public static final String CODIGO_MATERIAL_FALLIDO = "";
	public static final String CODIGO_NO_DESCARGA_MATERIAL = "NoDesc";	
	public static final String ERROR_CODIGO_ESTADO = "ERROR_ESTADO_OT";
	public static final String ERROR_CODIGO_OPERADOR = "ERROR_OPERADOR_OT";
	public static final String ERROR_CODIGO_ALMACEN = "ERROR_ALMACEN_OT";
	public static final String ERROR_CODIGO_SISTEMA = "ERROR_SISTEMA_ORIGEN";
	public static final String ERROR_CODIGO_DESCONOCIDO ="ERROR_DESCONOCIDO";
	public static final String ERROR_CODIGO_GEN_TICKET = "ERROR_GENERAR_TICKET";
	public static final String ERROR_CODIGO_GEN_TICKET_DESC = "Error al intentar insertar o actualizar el ticket ";
	public static final String ERROR_CODIGO_GEN_OPERADOR = "ERROR_GENERAR_OPERADOR";
	public static final String ERROR_CODIGO_GEN_OPERADOR_DESC = "Error al intentar generar Operador logistico ";
	public static final String ERROR_CODIGO_GEN_ESTRCTURA_LOG = "ERROR_GENERAR_ESTRUC";
	public static final String ERROR_CODIGO_GEN_ESTRCTURA_LOG_DESC = "Error al intentar generar estructura logistico ";
	public static final String NOMBRE_URL_SAP = "URL_SAP";
	public static final String NOMBRE_URL_4UP = "URL_4UP";
	public static final String NOMBRE_URL_OPEN = "URL_OPEN";
	public static final String NOMBRE_SAP_KEY = "LLAVE";
	public static final String NOMBRE_SAP_FREEZ = "FREEZ";
	public static final String NOMBRE_ENCODED_USER_PASS_SAP = "ENCODED_USER_PASS_SAP";
	public static final String NOMBRE_SAP_CAIDO = "SAP_CAIDO";
	public static final String NOMBRE_OPEN_CAIDO = "OPEN_CAIDO";
	
	public static final String ESTADO_RECIBDO_NOMBRE_CORTO = "RECI";
	public static final String ESTADO_ENPROCESO_NOMBRE_CORTO = "EPRO";
	public static final String ESTADO_PROCESADOOK_NOMBRE_CORTO = "PROK";
	public static final String ESTADO_ERROR_NOMBRE_CORTO = "ERRO";
	
	public static final String CRON_REGLA = "CRON_REGLA";
	public static final String CRON_REGLA_A = "CRON_REGLA_A";

	public static final String CRON_REGLA_A_MANUAL = "CRON_REGLA_A_MANUAL";
	public static final String CRON_REGLA_A_MANUAL_ACTIVAS = "CRON_REGLA_A_MANUAL_ACTIVAS";

	//Notifica Sistema
	public static final String NS_SAP_R3 = "SAP_R3";
	public static final String NS_SAP_S4 = "SAP_S4";
	public static final String NS_INTERNO = "NS_INTERNO";
	public static final String NS_OPEN = "NS_OPEN";

	// Nombre
	public static final String NOMBRE_CENTRO = "Centro";
	public static final String NOMBRE_ALMACEN = "Almacén";
	
	// Nombre Corto
	public static final String NOMBRE_CORTO_TIPO_MATERIAL_SERIALIZABLE = "SERI";
	public static final String NOMBRE_CORTO_TIPO_MATERIAL_GENERICO = "GENE";
	public static final String NOMBRE_CORTO_REGI = "REGI";
	public static final String NOMBRE_CORTO_SUBR = "SUBR";
	public static final String NOMBRE_CORTO_CENT = "CENT";
	public static final String NOMBRE_CORTO_ALMA = "ALMA";
	public static final String NOMBRE_CORTO_BASE = "BASE";
	public static final Integer NIVEL_CORTO_REGI = 0;
	public static final Integer NIVEL_CORTO_SUBR = 1;
	public static final Integer NIVEL_CORTO_CENT = 2;
	public static final Integer NIVEL_CORTO_BASE = 2;
	public static final Integer NIVEL_CORTO_ALMA = 3;

	public static final Long OT_RF_INICIAL = 99L;


	
	//ESTRUCTURA FICTICIA PARA FAN
	public static final String CODIGO_REGI_SUBREG_FAN = "FAN";
	public static final String NOMBRE_REGI_SUBREG_FAN = "FAN";
	
	public static final String ENTRY_SYSTEM_FAN = "FAN";
	
	//Tipos De Busqueda Material
	public static final String TB_NOMBRE_CORTO_TIPO_MATERIAL_SERIALIZABLE = "SERI";
	public static final String TB_NOMBRE_CORTO_TIPO_MATERIAL_GENERICO = "GENE";	
	public static final String TB_NOMBRE_CORTO_TIPO_MATERIAL_TODOS = "ALL";
	public static final String TB_NOMBRE_CORTO_TIPO_MATERIAL_INTERNO = "INTE";	
	public static final String TB_NOMBRE_CORTO_TIPO_MATERIAL_NINGUNO = "NONE";
	
	
	// Mensajes
	public static final String UNKNOWN_ERROR_MESSAGE_OT = "No se ha podido completar la acción, OT no identificada; consulte con el Administrador.";
	public static final String UNKNOWN_ERROR_MESSAGE_USER = "No se ha podido completar la acción, usuario no identificada; consulte con el Administrador.";
	public static final String UNKNOWN_ERROR_MESSAGE = "No se ha podido completar la acción, consulte con el Administrador.";
	public static final String UNKNOWN_ERROR_MESSAGE_OPERADOR = "No se ha podido completar la acción, Operador inexistente; consulte con el Administrador.";
	public static final String UNKNOWN_ERROR_MESSAGE_MAT_DESC = "No se ha podido completar la acción, el Material Descarg que desea descargar no pudo ser identificado; consulte con el Administrador.";
	public static final String UNKNOWN_ERROR_MESSAGE_IDEM_MATERIAL = "No puedo generar un nuevo material igual al anterior, seleccione reprocesar";
	public static final String UNKNOWN_ERROR_MESSAGE_FUE_PROCESADOR = "El material solicitado fue procesado con aterioridad";
	public static final String ERROR_DESC_ESTADO = "El estado de la OT no existe.";
	public static final String ERROR_DESC_OPERADOR = "El operador de la OT no existe o esta inactivo.";
	public static final String ERROR_DESC_OPERADOR_NI = "El operador de la OT no fue informado.";
	public static final String ERROR_DESC_ALMACEN = "El almacen de la OT no existe.";	
	public static final String ERROR_DESC_SISTEMA = "El Sistema Origen de la OT no fue informado.";
	public static final String ERROR_ACTA_NO_VALIDADA = "Una o mas actividades del acta no estan validadas";
	
	public static final String ERROR_ORDEN_DESAC = "La orden no posee actividades activas.";

	
	//Estados Nombre cortos;
	public static final String ESTADO_NOMBRE_CORTO_CERRADO="CER";    
	public static final String ESTADO_NOMBRE_CORTO_SIN_ENVIAR="SEN";
	public static final String ESTADO_NOMBRE_CORTO_NO_ENVIAR="NEN";  
	public static final String ESTADO_NOMBRE_CORTO_FALLA="FAL";      
	public static final String ESTADO_NOMBRE_CORTO_FINALIZADO="FIN";
	public static final String ESTADO_NOMBRE_CORTO_FALLA_ENVIO="FEN";
	public static final String ESTADO_NOMBRE_CORTO_REEMPLAZADO="RPZ";
	public static final String ESTADO_NOMBRE_CORTO_REPROCESADO="RPC";
	public static final String ESTADO_NOMBRE_CORTO_MATERIAL_DIF="MDI"; 
	
	//Alamacen ficticio
	public static final String ALMACEN_FICTICIO_CODIGO="NOSAP";
	//Notifica Sistema Nombre cortos;
	public static final String NS_NOMBRE_CORTO_FALLO_CONX="FCON";
	public static final String NS_NOMBRE_CORTO_FALLO_PROD="FPRO";
	public static final String NS_NOMBRE_CORTO_OK="TROK";
	public static final String NS_NOMBRE_CORTO_FREEZ="COOL";
	
	//Operador Logistica Cargo
	
	public static final String CARGO_NOMBRE_CORTO_SUP="SUP";
	public static final String CARGO_NOMBRE_CORTO_TEC="TEC";
	public static final String CARGO_NOMBRE_CORTO_OPE_SUCURSAL="OSU";
	
	//Tipos descarga
	public static final String  TIP_DESCARGA_SIN_DESC="Sin Descarga";
	
	// Validaciones - Operadores Logisticos
	public static final String VAL_OP_OBLIGATORIO="Obligatorio";
	public static final String VAL_OP_DISABLE="Disable";
	public static final String VAL_OP_REGI="REGI";
	public static final String VAL_OP_SUBR="SUBR";
	public static final String VAL_OP_CENT="CENT";
	public static final String VAL_OP_BASE="BASE";
	public static final String VAL_OP_ALMA="ALMA";


	// Datos ToolBox
	public static final String  TBX_URI = "TBX_URI";
	public static final String  TBX_USER_ID = "TBX_USERID";
	
	//Datos de errores, en ABM de operadores Log.
	public static final String ERROR_UPDATE_MAX_SUPERADO 		= "La cantidad de estructuras seleccionada es mayor a la esperada para el cargo actual";
	public static final String ERROR_UPDATE_ESTRUCTURA_INVALIDA = "La estructura seleccionada no corresponde para el cargo actual";
	public static final String ERROR_UPDATE_LEGAJO 				= "Error al cargar legajo LDAP";
	public static final String ERROR_UPDATE_LEGAJO_NOLDAP 		= "Error al cargar legajo NoLDAP";
	public static final String ERROR_UPDATE_LEGAJO_APELLIDO 	= "El campo es obligatorio apellido";
	public static final String ERROR_UPDATE_LEGAJO_NOMBRE 		= "El campo es obligatorio nombre";
	public static final String ERROR_UPDATE_SUPERIOR 			= "El campo superior es obligatorio para el cargo actual";
	public static final String ERROR_UPDATE_TIPO_RED 			= "El campo Tipo Red no corresponde para el cargo actual";
	public static final String ERROR_UPDATE_TIPO_CARGO 			= "La acción no está permitida para el cargo actual";
	public static final String ERROR_UPDATE_NO_VALIDO_LDAP 		= "La acción no está permitida para un usuario con legajo no LDAP";
	public static final String ERROR_UPDATE_CAMBIO_CARGO_FAIL 	= "La acción no está permitida el usuario ya tiene este cargo asignado";
	public static final String ERROR_UPDATE_USUARIO_CORRUPTO    = "El usuario ingresado tiene datos dañados, por favor contactese con el Administrador";
	public static final String OK_UPDATE_ESTRUCTURA 			= "Grabación exitosa";
	public static final String ABM_PANTALLA_ALTA				= "Alta";
	public static final String ABM_PANTALLA_EDICION_G1			= "editResetGroup1";
	public static final String ABM_PANTALLA_EDICION_G2			= "editResetGroup2";



	//SI/NO
	public static final Character N_Char = 'N';
	public static final Character S_Char = 'S';
	
	public static final String N_STR = "N";
	public static final String S_STR = "S";

	//OPEN-ESTADOS
	public static final String OPEN_ESTADO_OT ="FAN,LMA";
	
	//
	
	//Sistemas OT
	public static final String SISTEMA_ORIGEN_SEGAT ="SEGAT";
	public static final String SISTEMA_ORIGEN_WFX   ="WFX";
    public static final String PG_REGLAS_B_EN_CURSO = "JOB_GCC_REGLAS_B_EN_CURSO";
	public static final String MOTIVO_TRASPASO_NC = "TRAC";


	public static Map<String, String> NombreCortoCargo;
	static {
		NombreCortoCargo = new HashMap<>();
		NombreCortoCargo.put("Técnico", "TEC");
		NombreCortoCargo.put("Supervisor", "SUP");
		NombreCortoCargo.put("Contratista", "CON");
		NombreCortoCargo.put("Operador Logístico", "OPL");
		NombreCortoCargo.put("Operador Logístico Regional", "OPR");
		NombreCortoCargo.put("Coordinador", "COO");
		NombreCortoCargo.put("Administrador", "ADM");
		
		
	}
	
	public static final String FAN_RECUPERO_ACCION			= "RECUPERO";
	public static final String FAN_RECUPERO_MOTIVO			= "9RE00";
	public static final Integer FAN_RECUPERO_CANTIDAD 			= 1;
	public static final String FAN_RECUPERO_PAIS_ARG 			= "ARG";
	public static final String FAN_RECUPERO_PAIS_UY 			= "UY";
	public static final String FAN_RECUPERO_PAIS_PY 			= "PY";
	public static final String FAN_RECUPERO_SISTEMA             = "SFDC_CRM";
	public static final List<String> SIS_NO_SAP = Arrays.asList(new String[]{"NS_OPEN"});
	public static final String OPR_CARGO_NCORTO = "OPR";
	public static final String PANT_ALTA = "Alta";
	public static final String PANT_EDIT = "Modificación";
	
	// Generacion de Ot Cerradas
	public static final String ERROR_SAVE_OT_CERR = "Error al intentar insertar OT.";
	
	// Para los usuarios esto es el jobtype
	public static final String ERROR_SAVE_OT_CERR_TAREA = "El Jobtype recibido no existe o no se encuentra activo";
	public static final String ERROR_SAVE_OT_CERR_TAREA_CONTRATO = "Falta parametrización de Tipo de Contrato para el Jobtype";

	public static final String ERROR_SAVE_OT_CERR_EMPRESA = "Empresa de la OT no existe o no se encuentra activa";
	public static final String ERROR_SAVE_OT_CERR_REGION = "Región de la OT no existe o no se encuentra activa";
	public static final String ERROR_SAVE_OT_CERR_ACTIVIDADES = "La Actividad recibida no existe o no se encuentra activa.";
	public static final String ERROR_SAVE_OT_CERR_SISTEMA = "Sistema Origen de la OT no existe";

	public static final String ERROR_SAVE_OT_CERR_TIPO_CONTRATO = "Verificar el Tipo de Contrato";
	public static final String ERROR_SAVE_OT_CERR_ACTA = "No existe Acta para asociar la OT, verificar parámetros";
	public static final String ERROR_SAVE_OT_CERR_CLASEOT = "Verificar la Clase OT";
	public static final String ERROR_SAVE_OT_CERR_PROVINCIA = "No se obtuvo provincia";
	public static final String ERROR_SAVE_OT_CERR_PERIODO ="Verificar Fecha de cierre de la OT";
	public static final String ERROR_SAVE_OT_CERR_SOCIEDAD ="Verificar Sociedad";
	public static final String ERROR_SAVE_OT_CERR_FECHA_CREACION ="Verificar Fecha de creación de la OT";
	public static final String ERROR_SAVE_OT_CERR_PAIS ="No se obtuvo país";
	public static final String ERROR_SAVE_OT_CERR_LOCALIDAD ="Verificar ciudad";
	public static final String ERROR_SAVE_OT_CERR_AREA="No se obtuvo área";
	public static final String ERROR_SAVE_OT_CERR_SECTOR="No se obtuvo sector";
	public static final String ERROR_SAVE_OT_CERR_LATITUD="Verificar latitud";
	public static final String ERROR_SAVE_OT_CERR_LONGITUD="Verificar longitud";
	public static final String ERROR_SAVE_OT_CERR_DIRECCION="No se obtuvo direccion";

	public static final String MU_WS_URI = "MU_WS_URI";
	public static final String MU_WS_TYPE_SOC_CONTABLE = "MU_WS_TYPE_SOC_CONTABLE";
	public static final String MU_WS_TYPE_ZONA_CONCESIONADA = "MU_WS_TYPE_ZONA_CONCESIONADA";
	public static final String MU_WS_TYPE_PROYECTO = "MU_WS_TYPE_PROYECTO";
	public static final String MU_WS_ALL_TYPE = "MU_WS_ALL_SOC_CONTABLE_Y_CONCESIONADA";

	public static final String RESP_MU_TYPE_ZONA_CONCESIONADA = "ZONA CONCESIONADA";
	public static final String RESP_MU_TYPE_PROYECTO = "ZONAS TECNICAS PRINCIPALES";
	public static final String RESP_MU_TYPE_SOCIEDAD = "SOCIEDAD CONTABLE";

	public static final String MU_NOT_FOUND_RESOURCE = "NOT FOUND RESOURCE";

	public static final String MU_WS_PATH_GEO_ADDR = "MU_WS_PATH_GEO_ADDR";
	public static final String SOC_NAME_TECO = "Telecom Argentina S.A.";
	public static final String SOC_SHORT_NAME_TECO = "TECO";
	public static final String ESTADO_OT_NCORTO_INICIAL = "INICIAL";
	public static final String PROYECTO_DIGITALIZACIÓN = "PROYECTO DIGITALIZACIÓN";
	public static final String PROYECTO_DIGITALIZACIÓN_NO = "NO";
	

	//Reglas
	public static final String REGLA_TIPO_ORIGINAL = "ORIG";
	public static final String REGLA_TIPO_MANUAL = "CAMA";
		
	public static final String REGLA_TIPO_A = "REGA";
	public static final String REGLAS_A_APLICADAS = "Reglas A Aplicadas";
	public static final String REGLAS_A_APLICADAS_NC = "RAAP";
	
	public static final String REGLAS_A_VALIDADAS = "Reglas A Validadas";
	public static final String REGLAS_A_VALIDADAS_NC = "RAVA";


	
	public static final String REGLA_TIPO_B = "REGB";
	public static final String REGLAS_B_APLICADAS = "Reglas B Aplicadas";	
	public static final String REGLAS_B_APLICADAS_NC = "RBAP";
	
	public static final String REGLAS_B_VALIDADAS = "Reglas B Validadas";
	public static final String REGLAS_B_VALIDADAS_NC = "RBVA";

	public static final String REGLA_RESET_TIPO = "RESB";
	
	@Deprecated
	public static final String REGLAS_PARA_RESET_ACTIVAR = "REGL;ORIG;REGA"; //TODO debería activar todas las que sean agrupador "ORIG" (AGREGAR AGRUPADOR 'O') y "A"
	@Deprecated
	public static final String REGLAS_PARA_RESET_DESACTIVAR = "REGB;REBE"; //TODO debería desactivar todas las que sean agrupador "B"
	
	//Se implementa reseteo por agrupador FMR-3157
	public static final String REGLAS_PARA_RESET_ACTIVAR_AGRUPADOR = "A;O"; 
	public static final String REGLAS_PARA_RESET_DESACTIVAR_AGRUPADOR = "B";
	
	public static final String REGLA_ESTADO_EJECUCION = "ENEJ";
	public static final String REGLA_ESTADO_TERMINADO = "TERM";
	public static final String REGLA_ESTADO_ERROR = "ERRO";
	public static final String REGLA_ESTADO_TIMEOUT = "TOUT";
	
	public static final String NC_ACTIVIDAD_TIPO = "ACTI";
	public static final String NC_SUBACT_TIPO = "SUBA";
	
	public static final String ELEMENTO_TIPO_ACTIVIDAD = "actividad";
	public static final String ELEMENTO_TIPO_AREA = "area";
	public static final String ELEMENTO_TIPO_BASE_INSTALADA = "baseinstalada";
	public static final String ELEMENTO_TIPO_CLASE_ORDEN_TRABAJO = "claseordentrabajo";
	public static final String ELEMENTO_TIPO_ORDEN_TRABAJO = "ordentrabajo";
	public static final String ELEMENTO_TIPO_EMPRESA = "empresa";
	public static final String ELEMENTO_TIPO_PAIS = "pais";
	public static final String ELEMENTO_TIPO_SERIALIZABLE = "serializable";
	public static final String ELEMENTO_TIPO_SOCIEDAD = "sociedad";
	public static final String ELEMENTO_TIPO_TAREA = "tarea";
	public static final String ELEMENTO_TIPO_CLIENTE = "tipocliente";

	//Estados Acta Nombre Corto
	public static final String ESTADO_CERTIFICADA = "CERT";
	public static final String ESTADO_ENCURSO = "ENCU";
	public static final String ACTA_ESTADO_CERRADA_NOMBRE_CORTO = "CERR";

	public static final String ACTA_ESTADO_CERTIFICADA_NC = "CERT";
	public static final String ACTA_ESTADO_ENCURSO_DC = "ENCU";
	public static final String ACTA_ESTADO_CERRADA_DC = "CERR";

	//Acta certificada
	public static final String ACTA_CERTI_FOTO_CANTIDAD_ACTIVIDAD = "1";

	public static String date2StringFM(Date d) {
		SimpleDateFormat sdf = new SimpleDateFormat(Constante.FORMAT_DATE);
		return sdf.format(d);
	}

	public static final String USUARIO_SISTEMA = "FieldManager";
	
	public static final String CCONTRATISTA_ACTA_DEBITO = "NODE";
	public static final String CCONTRATISTA_ACTA_CREDITO = "NOCR";
	public static final String CCONTRATISTA_MOTIVO_APLICACION_REGLAS = "APRE";
	public static final String TIPO_ACTA_NOTA_DEBITO_NOMBRE_CORTO = "NODE";
	public static final String TIPO_ACTA_NOTA_CREDITO_NOMBRE_CORTO = "NOCR";
	public static final String TIPO_ACTA_NOMBRE = "ACTA";
	public static final String MOTIVO_ACTIVIDAD_DEF_NC = "DEFA";
	public static final String MOTIVO_ACTIVIDAD_ACTA_CERT_NC = "IOAC";


	public static final String SCHEDULED_VAR_NAME = "";
	public static String SCHEDULED_VAR_VALUE = "";

	public static String CORE_POOLSIZE_NAME = "CORE_POOLSIZE" ;
	public static String MAX_POOLSIZE_NAME =  "MAX_POOLSIZE";
	public static String QUEUE_CAPACITY_NAME = "QUEUE_CAPACITY" ;
	public static int CORE_POOLSIZE_VALUE = 2 ;
	public static int MAX_POOLSIZE_VALUE =  2;
	public static int QUEUE_CAPACITY_VALUE = 500 ;



	public static final String ACTA_TIPO_NDEB_NC = "NODE";
	public static final String ACTA_TIPO_NCRE_NC = "NOCR";

	public static final String R_FLUJO_INICIAL_NC = "INICIAL";
	public static final String HORA_CORTE_JOB_REGLAS_B = "HORA_CORTE_JOB_REGLAS_B";
	public static final String RUN_DURATION_RULES_A_MANUALS = "run_duration_rules_A_manuals";
	public static final String RUN_DURATION_RULES_A = "run_duration_rules_A";
	public static final String RUN_START_TIME_MANUAL_A_RULES = "RUN_START_TIME_MANUAL_A_RULES";
	public static final String TIME_UNTIL_RUN_MANUAL_A_RULES = "TIME_UNTIL_RUN_MANUAL_A_RULES";
	public static final String PAIS_ARG = "ARG";
	public static final String PAIS_UY = "UY";
	public static final String PAIS_ARG_COMPL = "ARGENTINA";
	public static final String PAIS_UY_COMPL = "URUGUAY";
	public static final String CATEGORIA_TELEFONIA = "TELE";
    public static final String CATEGORIA_REINSTALACION = "REIN";
	public static final String PG_CRON_REPRO_A = "CRON_REPRO_A";
	public static final String A = "A";
	public static final String REFRESH_R_A = "REFRESH_R_A";
	public static final String LOTE_REGLAS_A_REPRO = "LOTE_REGLAS_A_REPRO";

//Mensajes validacion traspaso
	public static final String REVISAR_ESTADO_ACTA_ORIGEN_DESTINO = "Revisar los estados de acta origen y destino.";
	public static final String ACTA_ORIGEN_ESTA_DEBE_ESTAR_EN_CURSO = "El acta de origen esta debe estar en curso.";
	public static final String TRASPASO_MSG_NO_SE_RECIBIO_OT="No se recibieron ordenes de trabajo.";
	public static final String TRASPASO_MSG_NO_SE_ENCUENTRA_ACTA_ORIG="No se encontro acta original.";
	public static final String TRASPASO_MSG_ERROR_BUSCANDO_ACTA_DESTINO="Error al buscar acta destino.";
	public static final String TRASPASO_MSG_ACTA_DESTINO_IGUAL_ORIGINAL="El acta destino es igual a la original.";
	public static final String TRASPASO_MSG_ACTA_DESTINO_ESTADO_CERT="El acta destino se encuentra en estado Certificada.";
	public static final String TRASPASO_MSG_LLEGA_REGION_NO_PROVIN="Se debe completar la estructura logistica.";


}
