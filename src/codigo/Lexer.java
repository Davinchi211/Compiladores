/* The following code was generated by JFlex 1.4.3 on 5/18/23, 10:24 AM */

package codigo;
import static codigo.Tokens.*;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 5/18/23, 10:24 AM from the specification file
 * <tt>D:/NetBeansProjects/CompiladoresP/src/codigo/Lexer.flex</tt>
 */
class Lexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\3\1\6\2\0\1\3\22\0\1\3\1\0\1\34\1\10"+
    "\1\0\1\15\2\0\1\32\1\33\1\0\1\40\1\4\1\13\1\0"+
    "\1\5\12\2\1\65\1\35\1\27\1\0\1\14\1\11\1\12\1\63"+
    "\1\1\1\41\1\42\1\17\1\66\5\1\1\20\1\72\1\16\1\1"+
    "\1\55\1\7\1\57\1\56\1\62\1\1\1\70\4\1\1\30\1\0"+
    "\1\31\1\0\1\1\1\0\1\22\1\64\1\26\1\61\1\43\1\71"+
    "\1\60\1\54\1\46\2\1\1\44\1\21\1\47\1\24\1\25\1\67"+
    "\1\45\1\23\1\51\1\50\1\53\3\1\1\52\1\36\1\0\1\37"+
    "\uff82\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\1\1\6"+
    "\1\2\1\7\1\1\3\2\1\10\1\11\1\12\1\13"+
    "\1\14\1\15\1\16\1\17\1\20\12\2\1\21\2\2"+
    "\1\4\1\22\1\23\1\24\1\25\1\26\4\2\1\26"+
    "\1\27\2\2\1\30\1\31\3\2\1\0\21\2\1\0"+
    "\2\2\1\32\2\2\1\0\16\2\1\33\1\26\1\2"+
    "\12\0\2\2\1\34\1\2\1\3\16\2\12\0\4\2"+
    "\1\35\3\2\1\36\3\2\1\37\2\2\11\0\1\40"+
    "\1\2\1\41\4\2\1\42\4\2\5\0\1\43\3\0"+
    "\1\44\1\2\1\45\5\2\1\46\2\0\1\47\6\0"+
    "\3\2\1\50\2\2\1\51\5\0\1\52\1\0\1\53"+
    "\3\2\1\54\1\2\10\0\2\2\1\55\1\56\1\0"+
    "\1\57\1\0\1\60\2\0\1\61\1\0\1\2\1\62"+
    "\1\0\1\63\5\0\1\2\4\0\1\64\1\0\1\65"+
    "\1\2\5\0\1\66\2\0\1\67\1\0\1\70\1\0"+
    "\1\71\1\72\2\0\1\73";

  private static int [] zzUnpackAction() {
    int [] result = new int[274];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\73\0\166\0\261\0\354\0\354\0\u0127\0\73"+
    "\0\u0162\0\u019d\0\u01d8\0\u0213\0\u024e\0\u0289\0\73\0\73"+
    "\0\73\0\u02c4\0\73\0\73\0\73\0\73\0\73\0\u02ff"+
    "\0\u033a\0\u0375\0\u03b0\0\u03eb\0\u0426\0\u0461\0\u049c\0\u04d7"+
    "\0\u0512\0\73\0\u054d\0\u0588\0\u05c3\0\u05fe\0\73\0\73"+
    "\0\73\0\u0639\0\u0674\0\u06af\0\u06ea\0\u0725\0\73\0\73"+
    "\0\u0760\0\u079b\0\73\0\73\0\u07d6\0\u0811\0\u084c\0\u0887"+
    "\0\u08c2\0\u08fd\0\u0938\0\u0973\0\u09ae\0\u09e9\0\u0a24\0\u0a5f"+
    "\0\u0a9a\0\u0ad5\0\u0b10\0\u0b4b\0\u0b86\0\u0bc1\0\u0bfc\0\u0c37"+
    "\0\u0c72\0\u0cad\0\u0ce8\0\u0d23\0\166\0\u0d5e\0\u0d99\0\u0dd4"+
    "\0\u0e0f\0\u0e4a\0\u0e85\0\u0ec0\0\u0efb\0\u0f36\0\u0f71\0\u0fac"+
    "\0\u0fe7\0\u1022\0\u105d\0\u1098\0\u10d3\0\u110e\0\166\0\166"+
    "\0\u1149\0\u1184\0\u11bf\0\u11fa\0\u1235\0\u1270\0\u12ab\0\u12e6"+
    "\0\u1321\0\u135c\0\u1397\0\u13d2\0\u140d\0\166\0\u1448\0\73"+
    "\0\u1483\0\u14be\0\u14f9\0\u1534\0\u156f\0\u15aa\0\u15e5\0\u1620"+
    "\0\u165b\0\u1696\0\u16d1\0\u170c\0\u1747\0\u1782\0\u17bd\0\u17f8"+
    "\0\u1833\0\u186e\0\u18a9\0\u18e4\0\u191f\0\u195a\0\u1995\0\u19d0"+
    "\0\u1a0b\0\u1a46\0\u1a81\0\u1abc\0\166\0\u1af7\0\u1b32\0\u1b6d"+
    "\0\166\0\u1ba8\0\u1be3\0\u1c1e\0\166\0\u1c59\0\u1c94\0\u1ccf"+
    "\0\u1d0a\0\u1d45\0\u1d80\0\u1dbb\0\u1df6\0\u1e31\0\u1e6c\0\u1ea7"+
    "\0\73\0\u1ee2\0\166\0\u1f1d\0\u1f58\0\u1f93\0\u1fce\0\166"+
    "\0\u2009\0\u2044\0\u207f\0\u20ba\0\u20f5\0\u2130\0\u216b\0\u21a6"+
    "\0\u21e1\0\73\0\u221c\0\u2257\0\u2292\0\166\0\u22cd\0\166"+
    "\0\u2308\0\u2343\0\u237e\0\u23b9\0\u23f4\0\166\0\u242f\0\u246a"+
    "\0\73\0\u24a5\0\u24e0\0\u251b\0\u2556\0\u2591\0\u25cc\0\u2607"+
    "\0\u2642\0\u267d\0\166\0\u26b8\0\u26f3\0\73\0\u272e\0\u2769"+
    "\0\u27a4\0\u27df\0\u281a\0\u2855\0\u2890\0\u28cb\0\u2906\0\u2941"+
    "\0\u297c\0\166\0\u29b7\0\u29f2\0\u2a2d\0\u2a68\0\u2aa3\0\u2ade"+
    "\0\u2b19\0\u2b54\0\u2b8f\0\u2bca\0\u2c05\0\166\0\166\0\u2c40"+
    "\0\73\0\u2c7b\0\u2cb6\0\u2cf1\0\u2d2c\0\u2d67\0\u2da2\0\u2ddd"+
    "\0\166\0\u2e18\0\u2e53\0\u2e8e\0\u2ec9\0\u2f04\0\u2f3f\0\u2f7a"+
    "\0\u2fb5\0\u2ff0\0\u302b\0\u3066\0\u30a1\0\73\0\u30dc\0\73"+
    "\0\u3117\0\u3152\0\u318d\0\u31c8\0\u3203\0\u323e\0\166\0\u3279"+
    "\0\u32b4\0\73\0\u32ef\0\73\0\u332a\0\73\0\73\0\u3365"+
    "\0\u33a0\0\73";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[274];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\4\2\1\12\1\13\2\3\1\14\4\3\1\15\1\16"+
    "\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26"+
    "\1\27\1\2\1\30\7\3\1\31\1\3\1\32\1\33"+
    "\1\34\1\35\1\36\1\3\1\37\1\40\1\41\1\3"+
    "\1\42\1\3\1\43\1\3\1\44\1\3\74\0\2\3"+
    "\4\0\1\3\6\0\11\3\12\0\24\3\1\0\5\3"+
    "\2\0\1\4\73\0\2\5\73\0\1\45\66\0\2\3"+
    "\4\0\1\3\1\46\1\47\1\50\1\51\1\52\1\0"+
    "\1\53\2\3\1\54\2\3\1\55\1\56\1\3\1\57"+
    "\10\0\1\60\1\61\6\3\1\62\14\3\1\0\5\3"+
    "\14\0\1\63\73\0\1\64\56\0\2\3\4\0\1\3"+
    "\6\0\11\3\12\0\2\3\1\65\21\3\1\0\5\3"+
    "\1\0\2\3\4\0\1\3\6\0\4\3\1\66\4\3"+
    "\12\0\24\3\1\0\5\3\1\0\2\3\4\0\1\3"+
    "\6\0\6\3\1\67\2\3\12\0\24\3\1\0\5\3"+
    "\13\0\1\70\60\0\2\3\4\0\1\3\6\0\11\3"+
    "\12\0\2\3\1\71\10\3\1\72\10\3\1\0\5\3"+
    "\1\0\2\3\4\0\1\3\6\0\11\3\12\0\5\3"+
    "\1\73\16\3\1\0\5\3\1\0\2\3\4\0\1\3"+
    "\6\0\6\3\1\74\2\3\12\0\24\3\1\0\5\3"+
    "\1\0\2\3\4\0\1\3\6\0\4\3\1\75\4\3"+
    "\12\0\24\3\1\0\5\3\1\0\2\3\4\0\1\3"+
    "\6\0\11\3\12\0\5\3\1\76\16\3\1\0\5\3"+
    "\1\0\2\3\4\0\1\3\6\0\11\3\12\0\5\3"+
    "\1\77\16\3\1\0\5\3\1\0\2\3\4\0\1\3"+
    "\6\0\11\3\12\0\2\3\1\100\21\3\1\0\5\3"+
    "\1\0\2\3\4\0\1\3\6\0\11\3\12\0\2\3"+
    "\1\101\21\3\1\0\5\3\1\0\2\3\4\0\1\3"+
    "\6\0\4\3\1\102\4\3\12\0\24\3\1\0\5\3"+
    "\1\0\2\3\4\0\1\3\6\0\10\3\1\103\12\0"+
    "\24\3\1\0\5\3\1\0\2\3\4\0\1\3\6\0"+
    "\11\3\12\0\7\3\1\104\14\3\1\0\5\3\1\0"+
    "\2\3\4\0\1\3\6\0\11\3\12\0\5\3\1\105"+
    "\16\3\1\0\5\3\6\45\1\0\64\45\14\0\1\57"+
    "\12\0\1\57\57\0\1\57\57\0\2\3\4\0\1\3"+
    "\6\0\1\3\1\106\7\3\12\0\24\3\1\0\5\3"+
    "\1\0\2\3\4\0\1\3\6\0\4\3\1\107\4\3"+
    "\12\0\24\3\1\0\5\3\1\0\2\3\4\0\1\3"+
    "\6\0\7\3\1\110\1\3\12\0\24\3\1\0\5\3"+
    "\1\0\2\3\4\0\1\3\6\0\11\3\12\0\5\3"+
    "\1\111\16\3\1\0\5\3\1\0\2\3\4\0\1\3"+
    "\3\0\1\112\2\0\11\3\12\0\24\3\1\0\5\3"+
    "\1\0\2\3\4\0\1\3\6\0\11\3\12\0\2\3"+
    "\1\113\2\3\1\114\16\3\1\0\5\3\1\0\2\3"+
    "\4\0\1\3\6\0\11\3\12\0\6\3\1\115\15\3"+
    "\1\0\5\3\1\0\2\3\4\0\1\3\6\0\5\3"+
    "\1\116\3\3\12\0\24\3\1\0\5\3\1\0\2\3"+
    "\4\0\1\3\6\0\7\3\1\117\1\3\12\0\24\3"+
    "\1\0\5\3\2\0\1\120\71\0\2\3\4\0\1\3"+
    "\6\0\11\3\12\0\6\3\1\121\15\3\1\0\5\3"+
    "\1\0\2\3\4\0\1\3\6\0\6\3\1\122\2\3"+
    "\12\0\24\3\1\0\5\3\1\0\2\3\4\0\1\3"+
    "\6\0\11\3\12\0\2\3\1\123\21\3\1\0\5\3"+
    "\1\0\2\3\4\0\1\3\6\0\5\3\1\124\3\3"+
    "\12\0\24\3\1\0\5\3\1\0\2\3\4\0\1\3"+
    "\6\0\5\3\1\125\3\3\12\0\24\3\1\0\5\3"+
    "\1\0\2\3\4\0\1\3\6\0\5\3\1\126\3\3"+
    "\12\0\24\3\1\0\5\3\1\0\2\3\4\0\1\3"+
    "\6\0\11\3\12\0\6\3\1\127\15\3\1\0\5\3"+
    "\1\0\2\3\4\0\1\3\6\0\5\3\1\130\3\3"+
    "\12\0\5\3\1\131\11\3\1\132\4\3\1\0\5\3"+
    "\1\0\2\3\4\0\1\3\6\0\5\3\1\133\3\3"+
    "\12\0\24\3\1\0\5\3\1\0\2\3\4\0\1\3"+
    "\6\0\7\3\1\134\1\3\12\0\24\3\1\0\5\3"+
    "\1\0\2\3\4\0\1\3\6\0\4\3\1\135\4\3"+
    "\12\0\24\3\1\0\5\3\1\0\2\3\4\0\1\3"+
    "\6\0\11\3\12\0\2\3\1\136\21\3\1\0\5\3"+
    "\1\0\2\3\4\0\1\3\6\0\11\3\12\0\6\3"+
    "\1\137\15\3\1\0\5\3\1\0\2\3\4\0\1\3"+
    "\6\0\2\3\1\140\6\3\12\0\24\3\1\0\5\3"+
    "\1\0\2\3\4\0\1\3\6\0\5\3\1\140\3\3"+
    "\12\0\24\3\1\0\5\3\1\0\2\3\4\0\1\3"+
    "\6\0\10\3\1\140\12\0\24\3\1\0\5\3\1\0"+
    "\2\3\4\0\1\3\6\0\5\3\1\141\3\3\12\0"+
    "\24\3\1\0\5\3\23\0\1\142\1\0\1\143\1\144"+
    "\12\0\1\145\1\146\12\0\1\147\1\0\1\150\6\0"+
    "\1\151\1\0\1\152\1\0\1\153\1\0\2\3\4\0"+
    "\1\3\6\0\11\3\12\0\10\3\1\154\13\3\1\0"+
    "\5\3\1\0\2\3\4\0\1\3\6\0\11\3\12\0"+
    "\2\3\1\155\21\3\1\0\5\3\1\0\2\3\4\0"+
    "\1\3\6\0\6\3\1\156\2\3\12\0\24\3\1\0"+
    "\5\3\1\0\2\3\4\0\1\3\6\0\11\3\12\0"+
    "\2\3\1\157\21\3\1\0\5\3\2\0\1\120\30\0"+
    "\1\160\40\0\2\3\4\0\1\3\6\0\11\3\12\0"+
    "\10\3\1\161\13\3\1\0\5\3\1\0\2\3\4\0"+
    "\1\3\6\0\10\3\1\162\12\0\24\3\1\0\5\3"+
    "\1\0\2\3\4\0\1\3\6\0\11\3\12\0\6\3"+
    "\1\163\15\3\1\0\5\3\1\0\2\3\4\0\1\3"+
    "\6\0\11\3\12\0\14\3\1\164\7\3\1\0\5\3"+
    "\1\0\2\3\4\0\1\3\6\0\11\3\12\0\10\3"+
    "\1\165\13\3\1\0\5\3\1\0\2\3\4\0\1\3"+
    "\6\0\11\3\12\0\10\3\1\166\13\3\1\0\5\3"+
    "\1\0\2\3\4\0\1\3\6\0\11\3\12\0\14\3"+
    "\1\167\7\3\1\0\5\3\1\0\2\3\4\0\1\3"+
    "\6\0\11\3\12\0\2\3\1\170\21\3\1\0\5\3"+
    "\1\0\2\3\4\0\1\3\6\0\11\3\12\0\6\3"+
    "\1\171\15\3\1\0\5\3\1\0\2\3\4\0\1\3"+
    "\6\0\4\3\1\172\4\3\12\0\24\3\1\0\5\3"+
    "\1\0\2\3\4\0\1\3\6\0\11\3\12\0\20\3"+
    "\1\173\3\3\1\0\5\3\1\0\2\3\4\0\1\3"+
    "\6\0\4\3\1\174\4\3\12\0\24\3\1\0\5\3"+
    "\1\0\2\3\4\0\1\3\6\0\11\3\12\0\23\3"+
    "\1\134\1\0\5\3\1\0\2\3\4\0\1\3\6\0"+
    "\11\3\12\0\1\175\23\3\1\0\5\3\1\0\2\3"+
    "\4\0\1\3\6\0\11\3\12\0\10\3\1\176\13\3"+
    "\1\0\5\3\22\0\1\177\72\0\1\200\72\0\1\201"+
    "\124\0\1\202\61\0\1\203\75\0\1\204\67\0\1\205"+
    "\51\0\1\206\72\0\1\207\116\0\1\210\25\0\2\3"+
    "\4\0\1\3\6\0\11\3\12\0\11\3\1\211\12\3"+
    "\1\0\5\3\1\0\2\3\4\0\1\3\6\0\11\3"+
    "\12\0\10\3\1\212\13\3\1\0\5\3\1\0\2\3"+
    "\4\0\1\3\6\0\11\3\12\0\4\3\1\213\17\3"+
    "\1\0\5\3\1\0\2\3\4\0\1\3\6\0\4\3"+
    "\1\214\4\3\12\0\24\3\1\0\5\3\1\0\2\3"+
    "\4\0\1\3\6\0\4\3\1\215\4\3\12\0\24\3"+
    "\1\0\5\3\1\0\2\3\4\0\1\3\6\0\11\3"+
    "\12\0\2\3\1\216\21\3\1\0\5\3\1\0\2\3"+
    "\4\0\1\3\6\0\11\3\12\0\3\3\1\217\20\3"+
    "\1\0\5\3\1\0\2\3\4\0\1\3\6\0\4\3"+
    "\1\220\4\3\12\0\24\3\1\0\5\3\1\0\2\3"+
    "\4\0\1\3\6\0\6\3\1\221\2\3\12\0\24\3"+
    "\1\0\5\3\1\0\2\3\4\0\1\3\6\0\11\3"+
    "\12\0\5\3\1\222\16\3\1\0\5\3\1\0\2\3"+
    "\4\0\1\3\6\0\11\3\12\0\4\3\1\223\17\3"+
    "\1\0\5\3\1\0\2\3\4\0\1\3\6\0\11\3"+
    "\12\0\10\3\1\224\13\3\1\0\5\3\1\0\2\3"+
    "\4\0\1\3\6\0\11\3\12\0\3\3\1\134\20\3"+
    "\1\0\5\3\1\0\2\3\4\0\1\3\6\0\11\3"+
    "\12\0\2\3\1\225\21\3\1\0\5\3\1\0\2\3"+
    "\4\0\1\3\6\0\11\3\12\0\20\3\1\212\3\3"+
    "\1\0\5\3\1\0\2\3\4\0\1\3\6\0\11\3"+
    "\12\0\13\3\1\226\10\3\1\0\5\3\1\0\2\3"+
    "\4\0\1\3\6\0\11\3\12\0\7\3\1\227\14\3"+
    "\1\0\5\3\44\0\1\230\51\0\1\231\70\0\1\232"+
    "\117\0\1\233\52\0\1\234\70\0\1\235\73\0\1\236"+
    "\131\0\1\237\53\0\1\240\51\0\1\241\47\0\2\3"+
    "\4\0\1\3\6\0\4\3\1\242\4\3\12\0\24\3"+
    "\1\0\5\3\1\0\2\3\4\0\1\3\6\0\6\3"+
    "\1\243\2\3\12\0\24\3\1\0\5\3\1\0\2\3"+
    "\4\0\1\3\6\0\4\3\1\244\4\3\12\0\24\3"+
    "\1\0\5\3\1\0\2\3\4\0\1\3\6\0\11\3"+
    "\12\0\12\3\1\245\11\3\1\0\5\3\1\0\2\3"+
    "\4\0\1\3\6\0\11\3\12\0\1\246\23\3\1\0"+
    "\5\3\1\0\2\3\4\0\1\3\6\0\4\3\1\247"+
    "\4\3\12\0\24\3\1\0\5\3\1\0\2\3\4\0"+
    "\1\250\6\0\11\3\12\0\24\3\1\0\5\3\1\0"+
    "\2\3\4\0\1\3\6\0\5\3\1\251\3\3\12\0"+
    "\24\3\1\0\5\3\1\0\2\3\4\0\1\3\6\0"+
    "\11\3\12\0\12\3\1\134\11\3\1\0\5\3\1\0"+
    "\2\3\4\0\1\3\6\0\11\3\12\0\2\3\1\252"+
    "\21\3\1\0\5\3\1\0\2\3\4\0\1\3\6\0"+
    "\11\3\12\0\5\3\1\253\16\3\1\0\5\3\1\0"+
    "\2\3\4\0\1\3\6\0\11\3\12\0\20\3\1\254"+
    "\3\3\1\0\5\3\46\0\1\255\50\0\1\256\114\0"+
    "\1\257\47\0\1\260\113\0\1\261\73\0\1\262\73\0"+
    "\1\263\71\0\1\264\73\0\1\265\25\0\2\3\4\0"+
    "\1\3\6\0\11\3\12\0\3\3\1\266\20\3\1\0"+
    "\5\3\1\0\2\3\4\0\1\3\6\0\10\3\1\267"+
    "\12\0\24\3\1\0\5\3\1\0\2\3\4\0\1\3"+
    "\6\0\6\3\1\270\2\3\12\0\24\3\1\0\5\3"+
    "\1\0\2\3\4\0\1\3\6\0\4\3\1\271\4\3"+
    "\12\0\24\3\1\0\5\3\1\0\2\3\4\0\1\3"+
    "\6\0\11\3\12\0\10\3\1\272\13\3\1\0\5\3"+
    "\1\0\2\3\4\0\1\3\6\0\11\3\12\0\10\3"+
    "\1\273\13\3\1\0\5\3\1\0\2\3\4\0\1\3"+
    "\6\0\11\3\12\0\17\3\1\274\4\3\1\0\5\3"+
    "\1\0\2\3\4\0\1\3\6\0\11\3\12\0\3\3"+
    "\1\275\20\3\1\0\5\3\1\0\2\3\4\0\1\3"+
    "\6\0\6\3\1\276\2\3\12\0\24\3\1\0\5\3"+
    "\61\0\1\277\24\0\1\300\51\0\1\301\31\0\1\302"+
    "\73\0\1\303\67\0\1\304\121\0\1\305\67\0\1\306"+
    "\46\0\1\307\51\0\2\3\4\0\1\3\6\0\11\3"+
    "\12\0\13\3\1\310\10\3\1\0\5\3\1\0\2\3"+
    "\4\0\1\3\6\0\5\3\1\311\3\3\12\0\24\3"+
    "\1\0\5\3\1\0\2\3\4\0\1\3\6\0\11\3"+
    "\12\0\5\3\1\312\16\3\1\0\5\3\1\0\2\3"+
    "\4\0\1\3\6\0\6\3\1\313\2\3\12\0\24\3"+
    "\1\0\5\3\1\0\2\3\4\0\1\3\6\0\11\3"+
    "\12\0\4\3\1\314\17\3\1\0\5\3\1\0\2\3"+
    "\4\0\1\3\6\0\11\3\12\0\2\3\1\315\21\3"+
    "\1\0\5\3\22\0\1\316\75\0\1\317\40\0\1\320"+
    "\53\0\1\321\73\0\1\322\67\0\1\323\70\0\1\324"+
    "\55\0\1\325\111\0\1\326\26\0\2\3\4\0\1\3"+
    "\6\0\4\3\1\327\4\3\12\0\24\3\1\0\5\3"+
    "\1\0\2\3\4\0\1\3\6\0\4\3\1\330\4\3"+
    "\12\0\24\3\1\0\5\3\1\0\2\3\4\0\1\3"+
    "\6\0\10\3\1\331\12\0\24\3\1\0\5\3\1\0"+
    "\2\3\4\0\1\3\6\0\6\3\1\332\2\3\12\0"+
    "\24\3\1\0\5\3\1\0\2\3\4\0\1\3\6\0"+
    "\11\3\12\0\4\3\1\333\17\3\1\0\5\3\24\0"+
    "\1\334\114\0\1\335\67\0\1\336\110\0\1\337\33\0"+
    "\1\340\63\0\1\341\101\0\1\342\63\0\1\343\60\0"+
    "\2\3\4\0\1\3\6\0\11\3\12\0\24\3\1\0"+
    "\4\3\1\344\1\0\2\3\4\0\1\3\6\0\10\3"+
    "\1\345\12\0\24\3\1\0\5\3\1\0\2\3\4\0"+
    "\1\3\6\0\4\3\1\346\4\3\12\0\24\3\1\0"+
    "\5\3\1\0\2\3\4\0\1\3\6\0\6\3\1\347"+
    "\2\3\12\0\24\3\1\0\5\3\45\0\1\350\74\0"+
    "\1\351\74\0\1\352\45\0\1\353\74\0\1\354\132\0"+
    "\1\355\51\0\1\356\113\0\1\357\5\0\2\3\4\0"+
    "\1\3\6\0\11\3\12\0\7\3\1\360\14\3\1\0"+
    "\5\3\1\0\2\3\4\0\1\3\6\0\4\3\1\361"+
    "\4\3\12\0\24\3\1\0\5\3\67\0\1\362\25\0"+
    "\1\363\63\0\1\364\125\0\1\365\72\0\1\366\37\0"+
    "\1\367\125\0\1\370\25\0\2\3\4\0\1\3\6\0"+
    "\10\3\1\371\12\0\24\3\1\0\5\3\50\0\1\372"+
    "\35\0\1\373\145\0\1\374\30\0\1\375\115\0\1\376"+
    "\111\0\1\377\53\0\1\u0100\24\0\2\3\4\0\1\3"+
    "\6\0\11\3\12\0\13\3\1\u0101\10\3\1\0\5\3"+
    "\43\0\1\u0102\115\0\1\u0103\52\0\1\u0104\73\0\1\u0105"+
    "\71\0\1\u0106\25\0\2\3\4\0\1\3\6\0\4\3"+
    "\1\u0107\4\3\12\0\24\3\1\0\5\3\13\0\1\u0108"+
    "\125\0\1\u0109\73\0\1\u010a\66\0\1\u010b\76\0\1\u010c"+
    "\50\0\1\u010d\114\0\1\u010e\46\0\1\u010f\71\0\1\u0110"+
    "\73\0\1\u0111\73\0\1\u0112\46\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[13275];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\5\1\1\11\6\1\3\11\1\1\5\11"+
    "\12\1\1\11\4\1\3\11\5\1\2\11\2\1\2\11"+
    "\3\1\1\0\21\1\1\0\5\1\1\0\21\1\12\0"+
    "\4\1\1\11\16\1\12\0\17\1\11\0\1\11\13\1"+
    "\5\0\1\11\3\0\11\1\2\0\1\11\6\0\6\1"+
    "\1\11\5\0\1\1\1\0\6\1\10\0\4\1\1\0"+
    "\1\11\1\0\1\1\2\0\1\1\1\0\2\1\1\0"+
    "\1\1\5\0\1\1\4\0\1\11\1\0\1\11\1\1"+
    "\5\0\1\1\2\0\1\11\1\0\1\11\1\0\2\11"+
    "\2\0\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[274];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
    public String lexeme;


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  Lexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 162) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Tokens yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 31: 
          { lexeme=yytext(); return desdeF;
          }
        case 60: break;
        case 2: 
          { lexeme=yytext(); return Identificador;
          }
        case 61: break;
        case 22: 
          { lexeme=yytext(); return Op_Relacional;
          }
        case 62: break;
        case 58: 
          { lexeme=yytext(); return Declaracion;
          }
        case 63: break;
        case 8: 
          { lexeme=yytext(); return tApertura;
          }
        case 64: break;
        case 15: 
          { lexeme=yytext(); return Llave_a;
          }
        case 65: break;
        case 10: 
          { lexeme=yytext(); return Corchete_c;
          }
        case 66: break;
        case 30: 
          { lexeme=yytext(); return vString;
          }
        case 67: break;
        case 52: 
          { lexeme=yytext(); return FinWhile;
          }
        case 68: break;
        case 17: 
          { lexeme=yytext(); return DosPuntos;
          }
        case 69: break;
        case 46: 
          { lexeme=yytext(); return TipoLen;
          }
        case 70: break;
        case 49: 
          { lexeme=yytext(); return Constructor;
          }
        case 71: break;
        case 35: 
          { lexeme=yytext(); return CumpleBloque;
          }
        case 72: break;
        case 41: 
          { lexeme=yytext(); return Salida;
          }
        case 73: break;
        case 6: 
          { return Linea;
          }
        case 74: break;
        case 43: 
          { lexeme=yytext(); return For;
          }
        case 75: break;
        case 56: 
          { lexeme=yytext(); return ConstructorFin;
          }
        case 76: break;
        case 3: 
          { lexeme=yytext(); return digito;
          }
        case 77: break;
        case 45: 
          { lexeme=yytext(); return TipoPisto;
          }
        case 78: break;
        case 21: 
          { lexeme=yytext(); return Division;
          }
        case 79: break;
        case 24: 
          { lexeme=yytext(); return Asignacion;
          }
        case 80: break;
        case 57: 
          { lexeme=yytext(); return ClaseFin;
          }
        case 81: break;
        case 16: 
          { lexeme=yytext(); return Llave_c;
          }
        case 82: break;
        case 51: 
          { lexeme=yytext(); return Clase;
          }
        case 83: break;
        case 29: 
          { lexeme=yytext(); return Flotante;
          }
        case 84: break;
        case 11: 
          { lexeme=yytext(); return Parentesis_a;
          }
        case 85: break;
        case 34: 
          { lexeme=yytext(); return hastaW;
          }
        case 86: break;
        case 37: 
          { lexeme=yytext(); return Decimal;
          }
        case 87: break;
        case 13: 
          { lexeme=yytext(); return Comillas;
          }
        case 88: break;
        case 44: 
          { lexeme=yytext(); return LlamaFuncion;
          }
        case 89: break;
        case 27: 
          { lexeme=yytext(); return finF;
          }
        case 90: break;
        case 32: 
          { lexeme=yytext(); return Atributo;
          }
        case 91: break;
        case 40: 
          { lexeme=yytext(); return funcion;
          }
        case 92: break;
        case 1: 
          { return error;
          }
        case 93: break;
        case 59: 
          { lexeme=yytext(); return IfElse;
          }
        case 94: break;
        case 28: 
          { lexeme=yytext(); return pasoF;
          }
        case 95: break;
        case 53: 
          { lexeme=yytext(); return forFin;
          }
        case 96: break;
        case 14: 
          { lexeme=yytext(); return PuntoComa;
          }
        case 97: break;
        case 54: 
          { lexeme=yytext(); return TipoCentavo;
          }
        case 98: break;
        case 19: 
          { lexeme=yytext(); return Resta;
          }
        case 99: break;
        case 47: 
          { lexeme=yytext(); return FinIf;
          }
        case 100: break;
        case 26: 
          { lexeme=yytext(); return Boleano;
          }
        case 101: break;
        case 55: 
          { lexeme=yytext(); return DoWhileFin;
          }
        case 102: break;
        case 7: 
          { lexeme=yytext(); return tCierre;
          }
        case 103: break;
        case 9: 
          { lexeme=yytext(); return Corchete_a;
          }
        case 104: break;
        case 12: 
          { lexeme=yytext(); return Parentesis_c;
          }
        case 105: break;
        case 50: 
          { lexeme=yytext(); return Verdadero;
          }
        case 106: break;
        case 20: 
          { lexeme=yytext(); return Multiplicacion;
          }
        case 107: break;
        case 23: 
          { lexeme=yytext(); return Concatenar;
          }
        case 108: break;
        case 38: 
          { lexeme=yytext(); return TipoEntero;
          }
        case 109: break;
        case 36: 
          { lexeme=yytext(); return Entero;
          }
        case 110: break;
        case 33: 
          { lexeme=yytext(); return Modificadores_Acceso;
          }
        case 111: break;
        case 25: 
          { lexeme=yytext(); return Porcentaje;
          }
        case 112: break;
        case 5: 
          { lexeme=yytext(); return Coma;
          }
        case 113: break;
        case 42: 
          { lexeme=yytext(); return While;
          }
        case 114: break;
        case 4: 
          { /*Ignore*/
          }
        case 115: break;
        case 39: 
          { lexeme=yytext(); return If;
          }
        case 116: break;
        case 48: 
          { lexeme=yytext(); return DoWhile;
          }
        case 117: break;
        case 18: 
          { lexeme=yytext(); return Suma;
          }
        case 118: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return null;
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
