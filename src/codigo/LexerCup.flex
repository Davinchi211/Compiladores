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
{L}({L}|{D})* {return new Symbol(sym.Identificador, yychar, yyline, yytext());} //agregue identificador, numero, error
("(-"{D}+")")| {D}+ {return new Symbol(sym.Numero, yychar, yyline, yytext());}
. {return new Symbol(sym.Error, yychar, yyline, yytext());}
("Q#") {return new Symbol(sym.Suma, yychar, yyline, yytext());} 
("Q?") {return new Symbol(sym.Resta, yychar, yyline, yytext());} 
("Q@") {return new Symbol(sym.Multiplicacion, yychar, yyline, yytext());}  
("Q-") {return new Symbol(sym.Division, yychar, yyline, yytext());}
(">>") {return new Symbol(sym.Asignacion, yychar, yyline, yytext());}  
("QNEL"){return new Symbol(sym. No_Igual_a, yychar, yyline, yytext());} 
("Q>>"){return new Symbol(sym. Igual_a, yychar, yyline, yytext());} 
("%%") {return new Symbol(sym.Porcentaje, yychar, yyline, yytext());}  
("Qmas"){return new Symbol(sym.Operador_Y, yychar, yyline, yytext());} 
("Qopc"){return new Symbol(sym.Operador_O, yychar, yyline, yytext());} 
("Q<"){return new Symbol(sym.Menor_que, yychar, yyline, yytext());}  
("Q>"){return new Symbol(sym.Mayor_que, yychar, yyline, yytext());}  
("Q#<"){return new Symbol(sym.Menor_que_o_igual, yychar, yyline, yytext());}  
("Q#>"){return new Symbol(sym.Mayor_que_o_igual, yychar, yyline, yytext());} 
("Q+") {return new Symbol(sym.Concatenar, yychar, yyline, yytext());}  
("QC-Declaraciones") {return new Symbol(sym.Declaracion, yychar, yyline, yytext());}  
("Quetzal") {return new Symbol(sym.Entero, yychar, yyline, yytext());}  
("Centavo") {return new Symbol(sym.Decimal, yychar, yyline, yytext());}  
("Choca") {return new Symbol(sym.Flotante, yychar, yyline, yytext());}  
("Pisto") {return new Symbol(sym.vString, yychar, yyline, yytext());}  
("Len") {return new Symbol(sym.Boleano, yychar, yyline, yytext());}  
("SinPisto") {return new Symbol(sym.funcion, yychar, yyline, yytext());}  
("Regalado") {return new Symbol(sym.Publico, yychar, yyline, yytext());}  
("Reservado") {return new Symbol(sym.Privado, yychar, yyline, yytext());} 
("Quieto") {return new Symbol(sym.Mismo_tipo, yychar, yyline, yytext());}  
("Acabado") {return new Symbol(sym.Unico, yychar, yyline, yytext());}  
("QC-salida:") {return new Symbol(sym.Salida, yychar, yyline, yytext());} 
("QC-paso:") {return new Symbol(sym.If, yychar, yyline, yytext());} 
("QC-paso-Fin")  {return new Symbol(sym.FinIf, yychar, yyline, yytext());} 
("QC-paso-porque-paso")  {return new Symbol(sym.IfElse, yychar, yyline, yytext());} 
("QC-Repite")  {return new Symbol(sym.While, yychar, yyline, yytext());} 
("QC-Repite-Fin")  {return new Symbol(sym.FinWhile, yychar, yyline, yytext());} 
("QC-Variar")  {return new Symbol(sym.For, yychar, yyline, yytext());} 
("QC-Variar-Fin")  {return new Symbol(sym.forFin, yychar, yyline, yytext());} 
("QC-Chispudo")  {return new Symbol(sym.DoWhile, yychar, yyline, yytext());} 
("QC-Chispudo-Fin")  {return new Symbol(sym.DoWhileFin, yychar, yyline, yytext());} 
("Qpistudo") {return new Symbol(sym.TipoEntero, yychar, yyline, yytext());} 
("tieneCasaca") {return new Symbol(sym.Verdadero, yychar, yyline, yytext());} 
("vosPlatica") {return new Symbol(sym.TipoPisto, yychar, yyline, yytext());} 
("coperachaMucha") {return new Symbol(sym.TipoCentavo, yychar, yyline, yytext());} 
("queChilero") {return new Symbol(sym.TipoLen, yychar, yyline, yytext());} 
("<") {return new Symbol(sym.tApertura, yychar, yyline, yytext());} 
(">"){return new Symbol(sym.tCierre, yychar, yyline, yytext());} 
(":"){return new Symbol(sym.DosPuntos, yychar, yyline, yytext());}
