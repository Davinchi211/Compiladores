
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Thu May 18 20:58:06 CST 2023
//----------------------------------------------------

package codigo;

import java_cup.runtime.Symbol;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Thu May 18 20:58:06 CST 2023
  */
public class Sintax extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public Sintax() {super();}

  /** Constructor which sets the default scanner. */
  public Sintax(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Sintax(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\044\000\002\002\005\000\002\002\004\000\002\002" +
    "\005\000\002\003\005\000\002\004\005\000\002\004\007" +
    "\000\002\004\016\000\002\006\011\000\002\005\003\000" +
    "\002\011\007\000\002\010\004\000\002\010\004\000\002" +
    "\010\004\000\002\010\004\000\002\010\004\000\002\010" +
    "\004\000\002\010\004\000\002\010\010\000\002\007\003" +
    "\000\002\007\004\000\002\012\010\000\002\013\007\000" +
    "\002\013\007\000\002\014\004\000\002\014\004\000\002" +
    "\016\006\000\002\016\006\000\002\015\005\000\002\017" +
    "\012\000\002\020\010\000\002\020\010\000\002\021\007" +
    "\000\002\021\007\000\002\021\007\000\002\021\007\000" +
    "\002\022\005" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\046\000\004\057\004\001\002\000\004\033\047\001" +
    "\002\000\004\002\046\001\002\000\006\017\010\063\007" +
    "\001\002\000\004\022\033\001\002\000\004\062\016\001" +
    "\002\000\004\060\014\001\002\000\004\060\014\001\002" +
    "\000\004\002\uffff\001\002\000\004\002\ufff9\001\002\000" +
    "\004\002\001\001\002\000\006\017\uffef\062\016\001\002" +
    "\000\004\017\020\001\002\000\006\022\021\060\ufffd\001" +
    "\002\000\004\062\022\001\002\000\006\022\023\060\ufffc" +
    "\001\002\000\004\017\024\001\002\000\004\062\016\001" +
    "\002\000\004\060\ufffa\001\002\000\004\017\027\001\002" +
    "\000\004\022\030\001\002\000\004\062\031\001\002\000" +
    "\004\022\023\001\002\000\004\017\uffee\001\002\000\004" +
    "\017\034\001\002\000\004\062\016\001\002\000\004\017" +
    "\036\001\002\000\004\022\037\001\002\000\004\062\040" +
    "\001\002\000\004\017\041\001\002\000\004\062\016\001" +
    "\002\000\004\017\043\001\002\000\004\022\044\001\002" +
    "\000\004\062\045\001\002\000\004\060\ufffb\001\002\000" +
    "\004\002\000\001\002\000\004\061\050\001\002\000\006" +
    "\017\ufffe\063\ufffe\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\046\000\006\002\004\003\005\001\001\000\002\001" +
    "\001\000\002\001\001\000\006\004\010\006\011\001\001" +
    "\000\002\001\001\000\004\007\016\001\001\000\004\005" +
    "\014\001\001\000\004\005\012\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\007\031\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\006\024\001\001\000\004\007" +
    "\025\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\007\034\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\007\041\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Sintax$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Sintax$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Sintax$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    private Symbol s;
    
    public void syntax_error(Symbol s){
        this.s = s;
    }

    public Symbol getS(){
        return this.s;
}

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$Sintax$actions {
  private final Sintax parser;

  /** Constructor */
  CUP$Sintax$actions(Sintax parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$Sintax$do_action(
    int                        CUP$Sintax$act_num,
    java_cup.runtime.lr_parser CUP$Sintax$parser,
    java.util.Stack            CUP$Sintax$stack,
    int                        CUP$Sintax$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Sintax$result;

      /* select the action based on the action number */
      switch (CUP$Sintax$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 35: // CIERRE_WHILE ::= tApertura FinWhile tCierre 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("CIERRE_WHILE",16, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // COD_WHILE ::= Identificador Asignacion Identificador Division digito 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("COD_WHILE",15, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-4)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // COD_WHILE ::= Identificador Asignacion Identificador Multiplicacion digito 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("COD_WHILE",15, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-4)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // COD_WHILE ::= Identificador Asignacion Identificador Resta digito 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("COD_WHILE",15, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-4)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // COD_WHILE ::= Identificador Asignacion Identificador Suma digito 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("COD_WHILE",15, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-4)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // SEN_REL ::= hastaW Corchete_a Identificador Op_Relacional Identificador Corchete_c 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SEN_REL",14, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-5)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // SEN_REL ::= hastaW Corchete_a Identificador Op_Relacional digito Corchete_c 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SEN_REL",14, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-5)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // CICLO_WHILE ::= tApertura While DosPuntos SEN_REL tCierre COD_WHILE IMPRIMIR CIERRE_WHILE 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("CICLO_WHILE",13, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-7)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // CIERREIF ::= tApertura FinIf tCierre 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("CIERREIF",11, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // ELSE ::= tApertura IfElse tCierre IF 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("ELSE",12, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-3)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // ELSE ::= tApertura IfElse tCierre COD_IF 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("ELSE",12, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-3)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // COD_IF ::= IMPRIMIR ELSE 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("COD_IF",10, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // COD_IF ::= IMPRIMIR CIERREIF 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("COD_IF",10, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // SENTENCIA_RELACION ::= Corchete_a Identificador Op_Relacional digito Corchete_c 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA_RELACION",9, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-4)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // SENTENCIA_RELACION ::= Corchete_a Identificador Op_Relacional Identificador Corchete_c 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA_RELACION",9, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-4)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // IF ::= tApertura If DosPuntos SENTENCIA_RELACION tCierre COD_IF 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("IF",8, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-5)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // CADENA ::= Identificador CADENA 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("CADENA",5, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // CADENA ::= Identificador 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("CADENA",5, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // DEC_VAR ::= vString Identificador Asignacion Comillas CADENA Comillas 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DEC_VAR",6, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-5)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // DEC_VAR ::= Boleano tCierre 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DEC_VAR",6, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // DEC_VAR ::= Flotante Identificador 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DEC_VAR",6, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // DEC_VAR ::= Flotante tCierre 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DEC_VAR",6, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // DEC_VAR ::= Decimal Identificador 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DEC_VAR",6, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // DEC_VAR ::= Decimal tCierre 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DEC_VAR",6, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // DEC_VAR ::= Entero Identificador 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DEC_VAR",6, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // DEC_VAR ::= Entero tCierre 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DEC_VAR",6, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // VARIABLES ::= tApertura Declaracion DosPuntos DEC_VAR tCierre 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("VARIABLES",7, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-4)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // FIN_IMP ::= tCierre 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("FIN_IMP",3, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // VALOR2 ::= Comillas CADENA Comillas Concatenar Identificador Concatenar VALOR2 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("VALOR2",4, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-6)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // VALOR ::= digito Concatenar Comillas CADENA Comillas Concatenar Identificador Comillas CADENA Comillas Concatenar Identificador 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("VALOR",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-11)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // VALOR ::= Comillas CADENA Comillas Concatenar Identificador 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("VALOR",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-4)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // VALOR ::= Comillas CADENA Comillas 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("VALOR",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // INI_IMP ::= tApertura Salida DosPuntos 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("INI_IMP",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // IMPRIMIR ::= INI_IMP VALOR2 FIN_IMP 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("IMPRIMIR",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= IMPRIMIR EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).value;
		RESULT = start_val;
              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Sintax$parser.done_parsing();
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // IMPRIMIR ::= INI_IMP VALOR FIN_IMP 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("IMPRIMIR",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

