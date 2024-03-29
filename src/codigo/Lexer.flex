package codigo;
import static codigo.Tokens.*;
%%
%class Lexer
%type Tokens
L=[a-zA-Z_]+
D=[0-9]+
espacio=[ ,\t,\r]+
%{
    public String lexeme;
%}
%%

( "," )  {lexeme=yytext(); return Coma;}
{espacio} {/*Ignore*/}
( "//"(.)*) {/*Ignore*/}
( "\n" ) {return Linea;}
( "Q#" ) {lexeme=yytext(); return Suma;}
( "Q?" ) {lexeme=yytext(); return Resta;}
( "Q@" ) {lexeme=yytext(); return Multiplicacion;}
( "Q-" ) {lexeme=yytext(); return Division;}
( ">>" ) {lexeme=yytext(); return Asignacion;}
( "%%" ) {lexeme=yytext(); return Porcentaje;}
( "QNEL" | "Q>>" | "Qmas" | "Qopc" | "Q<" | "Q>" | "Q#<" | "Q#>" ) {lexeme=yytext(); return Op_Relacional;}
( "[" )  {lexeme=yytext(); return Corchete_a;}
( "]" )  {lexeme=yytext(); return Corchete_c;}
( "(" )  {lexeme=yytext(); return Parentesis_a;}
( ")" )  {lexeme=yytext(); return Parentesis_c;}
( "\"" ) {lexeme=yytext(); return Comillas;}
( ";" )  {lexeme=yytext(); return PuntoComa;}
( "{" )  {lexeme=yytext(); return Llave_a;}
( "}" )  {lexeme=yytext(); return Llave_c;}
( "Q+" ) {lexeme=yytext(); return Concatenar;}
( "QC-Declaraciones") {lexeme=yytext(); return Declaracion;}
( "Quetzal" ) {lexeme=yytext(); return Entero;}
( "Centavo" ) {lexeme=yytext(); return Decimal;}
( "Choca" ) {lexeme=yytext(); return Flotante;}
( "Pisto" ) {lexeme=yytext(); return vString;}
( "Len" ) {lexeme=yytext(); return Boleano;}
( "SinPisto" ) {lexeme=yytext(); return funcion;}
( "Regalado" | "Reservado" | "Tapado" | "Quieto" | "Acabado" ) {lexeme=yytext(); return Modificadores_Acceso;}
( "QC-salida") {lexeme=yytext(); return Salida;}
( "QC-paso:" ) {lexeme=yytext(); return If;}
( "QC-paso-Fin" ) {lexeme=yytext(); return FinIf;}
( "QC-paso-porque-paso" ) {lexeme=yytext(); return IfElse;}
( "QC-Repite" ) {lexeme=yytext(); return While;}
( "hastaQ" ) {lexeme=yytext(); return hastaW;}
( "QC-Repite-Fin" ) {lexeme=yytext(); return FinWhile;}
( "QC-Variar" ) {lexeme=yytext(); return For;}
( "desde" ) {lexeme=yytext(); return desdeF;}
( "fin" ) {lexeme=yytext(); return finF;}
( "paso" ) {lexeme=yytext(); return pasoF;}
( "QC-Variar-Fin" ) {lexeme=yytext(); return forFin;}
( "QC-Chispudo" ) {lexeme=yytext(); return DoWhile;}
( "QC-Pior" ) {lexeme=yytext(); return CumpleBloque;}
( "QC-Chispudo-Fin" ) {lexeme=yytext(); return DoWhileFin;}
( "Qpistudo" ) {lexeme=yytext(); return TipoEntero;}
( "tieneCasaca" ) {lexeme=yytext(); return Verdadero;}
( "vosPlatica" ) {lexeme=yytext(); return TipoPisto;}
( "coperachaMucha" ) {lexeme=yytext(); return TipoCentavo;}
( "queChilero" ) {lexeme=yytext(); return TipoLen;}
( "Reintegro" ) {lexeme=yytext(); return LlamaFuncion;}
( "QC-camioneta" ) {lexeme=yytext(); return Clase;}
( "QC-camioneta-Fin" ) {lexeme=yytext(); return ClaseFin;}
( "QC-Fabricar" ) {lexeme=yytext(); return Constructor;}
( "QC-Mio" ) {lexeme=yytext(); return Atributo;}
( "QC-Fabricar-Fin") {lexeme=yytext(); return ConstructorFin;}
( "<" ) {lexeme=yytext(); return tApertura;}
( ">" ) {lexeme=yytext(); return tCierre;}
( ":" ) {lexeme=yytext(); return DosPuntos;}
{L}({L}|{D})* {lexeme=yytext(); return Identificador;}
("(-"{D}+")")| {D}+ {lexeme=yytext(); return digito;}
. {return error;}