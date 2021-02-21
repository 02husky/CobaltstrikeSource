package org.apache.xml.res;

public class XMLErrorResources_sv extends XMLErrorResources {
   public static final int MAX_CODE = 61;
   public static final int MAX_WARNING = 0;
   public static final int MAX_OTHERS = 4;
   public static final int MAX_MESSAGES = 62;

   public Object[][] getContents() {
      return new Object[][]{{"ER0000", "{0}"}, {"ER_FUNCTION_NOT_SUPPORTED", "Funktion inte understödd:"}, {"ER_CANNOT_OVERWRITE_CAUSE", "Kan inte skriva över orsak"}, {"ER_NO_DEFAULT_IMPL", "Standardimplementering saknas i:"}, {"ER_CHUNKEDINTARRAY_NOT_SUPPORTED", "ChunkedIntArray({0}) understöds för närvarande inte"}, {"ER_OFFSET_BIGGER_THAN_SLOT", "Offset större än fack"}, {"ER_COROUTINE_NOT_AVAIL", "Sidorutin inte tillgänglig, id={0}"}, {"ER_COROUTINE_CO_EXIT", "CoroutineManager mottog co_exit()-förfrågan"}, {"ER_COJOINROUTINESET_FAILED", "co_joinCoroutineSet() misslyckades"}, {"ER_COROUTINE_PARAM", "Sidorutin fick parameterfel ({0})"}, {"ER_PARSER_DOTERMINATE_ANSWERS", "\nOVÄNTAT: Parser doTerminate-svar {0}"}, {"ER_NO_PARSE_CALL_WHILE_PARSING", "parse får inte anropas medan tolkning sker"}, {"ER_TYPED_ITERATOR_AXIS_NOT_IMPLEMENTED", "Fel: typad upprepare för axel {0} inte implementerad"}, {"ER_ITERATOR_AXIS_NOT_IMPLEMENTED", "Fel: upprepare för axel {0} inte implementerad"}, {"ER_ITERATOR_CLONE_NOT_SUPPORTED", "Uppreparklon understöds inte"}, {"ER_UNKNOWN_AXIS_TYPE", "Okänd axeltraverstyp: {0}"}, {"ER_AXIS_NOT_SUPPORTED", "Axeltravers understöds inte: {0}"}, {"ER_NO_DTMIDS_AVAIL", "Inga fler DTM-IDs är tillgängliga"}, {"ER_NOT_SUPPORTED", "Understöds inte: {0}"}, {"ER_NODE_NON_NULL", "Nod måste vara icke-null för getDTMHandleFromNode"}, {"ER_COULD_NOT_RESOLVE_NODE", "Kunde inte lösa nod till ett handtag"}, {"ER_STARTPARSE_WHILE_PARSING", "startParse får inte anropas medan tolkning sker"}, {"ER_STARTPARSE_NEEDS_SAXPARSER", "startParse behöver en SAXParser som är icke-null"}, {"ER_COULD_NOT_INIT_PARSER", "kunde inte initialisera tolk med"}, {"ER_EXCEPTION_CREATING_POOL", "undantag skapar ny instans för pool"}, {"ER_PATH_CONTAINS_INVALID_ESCAPE_SEQUENCE", "Väg innehåller ogiltig flyktsekvens"}, {"ER_SCHEME_REQUIRED", "Schema krävs!"}, {"ER_NO_SCHEME_IN_URI", "Schema saknas i URI: {0}"}, {"ER_NO_SCHEME_INURI", "Schema saknas i URI"}, {"ER_PATH_INVALID_CHAR", "Väg innehåller ogiltigt tecken: {0}"}, {"ER_SCHEME_FROM_NULL_STRING", "Kan inte sätta schema från null-sträng"}, {"ER_SCHEME_NOT_CONFORMANT", "Schemat är inte likformigt."}, {"ER_HOST_ADDRESS_NOT_WELLFORMED", "Värd är inte en välformulerad adress"}, {"ER_PORT_WHEN_HOST_NULL", "Port kan inte sättas när värd är null"}, {"ER_INVALID_PORT", "Ogiltigt portnummer"}, {"ER_FRAG_FOR_GENERIC_URI", "Fragment kan bara sättas för en allmän URI"}, {"ER_FRAG_WHEN_PATH_NULL", "Fragment kan inte sättas när väg är null"}, {"ER_FRAG_INVALID_CHAR", "Fragment innehåller ogiltigt tecken"}, {"ER_PARSER_IN_USE", "Tolk används redan"}, {"ER_CANNOT_CHANGE_WHILE_PARSING", "Kan inte ändra {0} {1} medan tolkning sker"}, {"ER_SELF_CAUSATION_NOT_PERMITTED", "Självorsakande inte tillåten"}, {"ER_NO_USERINFO_IF_NO_HOST", "Userinfo får inte anges om värden inte är angiven"}, {"ER_NO_PORT_IF_NO_HOST", "Port får inte anges om värden inte är angiven"}, {"ER_NO_QUERY_STRING_IN_PATH", "Förfrågan-sträng kan inte anges i väg och förfrågan-sträng"}, {"ER_NO_FRAGMENT_STRING_IN_PATH", "Fragment kan inte anges i både vägen och fragmentet"}, {"ER_CANNOT_INIT_URI_EMPTY_PARMS", "Kan inte initialisera URI med tomma parametrar"}, {"ER_METHOD_NOT_SUPPORTED", "Metod ännu inte understödd "}, {"ER_INCRSAXSRCFILTER_NOT_RESTARTABLE", "IncrementalSAXSource_Filter kan för närvarande inte startas om"}, {"ER_XMLRDR_NOT_BEFORE_STARTPARSE", "XMLReader inte innan startParse-begäran"}, {"ER_AXIS_TRAVERSER_NOT_SUPPORTED", "Det går inte att vända axeln: {0}"}, {"ER_ERRORHANDLER_CREATED_WITH_NULL_PRINTWRITER", "ListingErrorHandler skapad med null PrintWriter!"}, {"ER_SYSTEMID_UNKNOWN", "SystemId okänt"}, {"ER_LOCATION_UNKNOWN", "Platsen för felet är okänd"}, {"ER_PREFIX_MUST_RESOLVE", "Prefix must resolve to a namespace: {0}"}, {"ER_CREATEDOCUMENT_NOT_SUPPORTED", "createDocument() understöds inte av XPathContext!"}, {"ER_CHILD_HAS_NO_OWNER_DOCUMENT", "Attributbarn saknar ägardokument!"}, {"ER_CHILD_HAS_NO_OWNER_DOCUMENT_ELEMENT", "Attributbarn saknar ägardokumentelement!"}, {"ER_CANT_OUTPUT_TEXT_BEFORE_DOC", "Varning: kan inte skriva ut text innan dokumentelement!  Ignorerar..."}, {"ER_CANT_HAVE_MORE_THAN_ONE_ROOT", "Kan inte ha mer än en rot på en DOM!"}, {"ER_ARG_LOCALNAME_NULL", "Argument 'localName' är null"}, {"ER_ARG_LOCALNAME_INVALID", "Localname i QNAME bör vara ett giltigt NCName"}, {"ER_ARG_PREFIX_INVALID", "Prefixet i QNAME bör vara ett giltigt NCName"}, {"BAD_CODE", "Parameter till createMessage ligger utanför tillåtet intervall"}, {"FORMAT_FAILED", "Undantag utlöst vid messageFormat-anrop"}, {"line", "Rad #"}, {"column", "Kolumn #"}};
   }
}