package codigo;
import java_cup.runtime.Symbol;
%%
%class LexerCup
%type java_cup.runtime.Symbol
%cup
%full
%line
%char
L=[a-zA-Z_]+
D=[0-9]+
espacio=[ ,\t,\r,\n]+
%{
    private Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yycolumn, value);
    }
    private Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn);
    }
%}
%%
(",") {return new Symbol(sym.Coma, yychar, yyline, yytext());}
{espacio} {/*Ignore*/}
("//"(.)*) {/*Ignore*/}
("Q#") {return new Symbol(sym.Suma, yychar, yyline, yytext());} 
("Q?") {return new Symbol(sym.Resta, yychar, yyline, yytext());} 
("Q@") {return new Symbol(sym.Multiplicacion, yychar, yyline, yytext());}  
("Q-") {return new Symbol(sym.Division, yychar, yyline, yytext());}
(">>") {return new Symbol(sym.Asignacion, yychar, yyline, yytext());}
("%%") {return new Symbol(sym.Porcentaje, yychar, yyline, yytext());}  
( "QNEL" | "Q>>" | "Qmas" | "Qopc" | "Q<" | "Q>" | "Q#<" | "Q#>" ) {return new Symbol(sym.Op_Relacional, yychar, yyline, yytext());}
("[") {return new Symbol(sym.Corchete_a, yychar, yyline, yytext());}
("]") {return new Symbol(sym.Corchete_c, yychar, yyline, yytext());}
("(") {return new Symbol(sym.Parentesis_a, yychar, yyline, yytext());}
(")") {return new Symbol(sym.Parentesis_c, yychar, yyline, yytext());}
("\"") {return new Symbol(sym.Comillas, yychar, yyline, yytext());}
(";") {return new Symbol(sym.PuntoComa, yychar, yyline, yytext());}
("{") {return new Symbol(sym.Llave_a, yychar, yyline, yytext());}
("}") {return new Symbol(sym.Llave_c, yychar, yyline, yytext());}
("Q+") {return new Symbol(sym.Concatenar, yychar, yyline, yytext());}  
("QC-Declaraciones") {return new Symbol(sym.Declaracion, yychar, yyline, yytext());}  
("Quetzal") {return new Symbol(sym.Entero, yychar, yyline, yytext());}  
("Centavo") {return new Symbol(sym.Decimal, yychar, yyline, yytext());}  
("Choca") {return new Symbol(sym.Flotante, yychar, yyline, yytext());}  
("Pisto") {return new Symbol(sym.vString, yychar, yyline, yytext());}  
("Len") {return new Symbol(sym.Boleano, yychar, yyline, yytext());}  
("SinPisto") {return new Symbol(sym.funcion, yychar, yyline, yytext());}
( "Regalado" | "Reservado" | "Tapado" | "Quieto" | "Acabado" ) {return new Symbol(sym.Modificadores_Acceso, yychar, yyline, yytext());}  
("QC-salida:") {return new Symbol(sym.Salida, yychar, yyline, yytext());} 
("QC-paso:") {return new Symbol(sym.If, yychar, yyline, yytext());} 
("QC-paso-Fin")  {return new Symbol(sym.FinIf, yychar, yyline, yytext());} 
("QC-paso-porque-paso")  {return new Symbol(sym.IfElse, yychar, yyline, yytext());} 
("QC-Repite")  {return new Symbol(sym.While, yychar, yyline, yytext());} 
("hastaQ")  {return new Symbol(sym.hastaW, yychar, yyline, yytext());} 
("QC-Repite-Fin")  {return new Symbol(sym.FinWhile, yychar, yyline, yytext());} 
("QC-Variar")  {return new Symbol(sym.For, yychar, yyline, yytext());} 
("desde")  {return new Symbol(sym.desdeF, yychar, yyline, yytext());}
("fin")  {return new Symbol(sym.finF, yychar, yyline, yytext());}
("paso")  {return new Symbol(sym.pasoF, yychar, yyline, yytext());}
("QC-Variar-Fin")  {return new Symbol(sym.forFin, yychar, yyline, yytext());} 
("QC-Chispudo")  {return new Symbol(sym.DoWhile, yychar, yyline, yytext());} 
("QC-Pior")  {return new Symbol(sym.CumpleBloque, yychar, yyline, yytext());} 
("QC-Chispudo-Fin")  {return new Symbol(sym.DoWhileFin, yychar, yyline, yytext());} 
("Qpistudo") {return new Symbol(sym.TipoEntero, yychar, yyline, yytext());} 
("tieneCasaca") {return new Symbol(sym.Verdadero, yychar, yyline, yytext());} 
("vosPlatica") {return new Symbol(sym.TipoPisto, yychar, yyline, yytext());} 
("coperachaMucha") {return new Symbol(sym.TipoCentavo, yychar, yyline, yytext());} 
("queChilero") {return new Symbol(sym.TipoLen, yychar, yyline, yytext());} 
("Reintegro") {return new Symbol(sym.LlamaFuncion, yychar, yyline, yytext());}
("QC-camioneta") {return new Symbol(sym.Clase, yychar, yyline, yytext());}
("QC-camioneta-Fin") {return new Symbol(sym.ClaseFin, yychar, yyline, yytext());}
("QC-Fabricar") {return new Symbol(sym.Constructor, yychar, yyline, yytext());}
("QC-Mio") {return new Symbol(sym.Atributo, yychar, yyline, yytext());}
("QC-Fabricar-Fin") {return new Symbol(sym.ConstructorFin, yychar, yyline, yytext());}
("<") {return new Symbol(sym.tApertura, yychar, yyline, yytext());}
(">") {return new Symbol(sym.tCierre, yychar, yyline, yytext());}
(":") {return new Symbol(sym.DosPuntos, yychar, yyline, yytext());}
{L}({L}|{D})* {return new Symbol(sym.Identificador, yychar, yyline, yytext());}
("(-"{D}+")")| {D}+ {return new Symbol(sym.digito, yychar, yyline, yytext());}
. {return new Symbol(sym.ERROR, yychar, yyline, yytext());}