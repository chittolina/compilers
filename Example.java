/* Example.java */
/* Generated By:JavaCC: Do not edit this line. Example.java */
/** Simple brace matcher. */
public class Example implements ExampleConstants {

  /** Main entry point. */
  public static void main(String args[]) throws ParseException {
    Example parser = new Example(System.in);
    parser.Enumerado();
  }

// Forma geral de um programa
  static final public void FormaGeral() throws ParseException {Token t;
    t = jj_consume_token(DO);
    jj_consume_token(THIS);
    jj_consume_token(ID);
    jj_consume_token(OBRACKETS);
    jj_consume_token(CBRACKETS);
    Enumerado();
    jj_consume_token(BODY);
    jj_consume_token(OBRACKETS);
    Comandos();
    jj_consume_token(CBRACKETS);
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case DESCRIPTION:{
      jj_consume_token(DESCRIPTION);
      label_1:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case ID:{
          ;
          break;
          }
        default:
          jj_la1[0] = jj_gen;
          break label_1;
        }
        jj_consume_token(ID);
      }
      break;
      }
    default:
      jj_la1[1] = jj_gen;
      ;
    }
    jj_consume_token(0);
mostrarTokens(t);
}

// Forma geral de um enumerado
// Forma geral de um enumerado
  static final public void Enumerado() throws ParseException {Token t;
    t = jj_consume_token(DECLARATION);
    jj_consume_token(TYPE);
    jj_consume_token(OBRACKETS);
    jj_consume_token(ID);
    jj_consume_token(IS);
    jj_consume_token(OCBRACKETS);
    ListaIdentificadores();
    jj_consume_token(CCBRACKETS);
    jj_consume_token(DOT);
    jj_consume_token(CBRACKETS);
mostrarTokens(t);
}

// Forma geral da declaracao de constantes e variaveis
  static final public void VariavelEConstante() throws ParseException {
    jj_consume_token(DECLARATION);
    jj_consume_token(CONSTANT);
    jj_consume_token(AND);
    jj_consume_token(VARIABLE);
    jj_consume_token(OBRACKETS);
    Constantes();
    Variaveis();
    jj_consume_token(CBRACKETS);
}

// Forma geral do comando de atribuicao
  static final public void Atribuicao() throws ParseException {
    jj_consume_token(DESIGNATE);
    jj_consume_token(THIS);
    ListaIdentificadores();
    jj_consume_token(AS);
    Expressao();
}

// Forma geral do comando de entrada de dados
  static final public void EntradaDados() throws ParseException {
    jj_consume_token(READ);
    jj_consume_token(THIS);
    jj_consume_token(OBRACKETS);
    ListaIdentificadores();
    jj_consume_token(CBRACKETS);
    jj_consume_token(DOT);
}

// Forma geral do comando de saida de dados
  static final public void SaidaDados() throws ParseException {
    jj_consume_token(WRITE);
    jj_consume_token(ALL);
    jj_consume_token(THIS);
    jj_consume_token(OBRACKETS);
    ListaIdentificadores();
    jj_consume_token(CBRACKETS);
    jj_consume_token(DOT);
}

// Forma geral do comando de selecao
  static final public void Selecao() throws ParseException {
    jj_consume_token(AVALIATE);
    jj_consume_token(THIS);
    Expressao();
    jj_consume_token(TRUE);
    jj_consume_token(RESULT);
    jj_consume_token(OBRACKETS);
    Comandos();
    jj_consume_token(CBRACKETS);
    jj_consume_token(UNTRUE);
    jj_consume_token(RESULT);
    jj_consume_token(OBRACKETS);
    Comandos();
    jj_consume_token(CBRACKETS);
    jj_consume_token(DOT);
}

// Forma geral do comando de repeticao
  static final public void Repeticao() throws ParseException {
    jj_consume_token(REPEAT);
    jj_consume_token(THIS);
    Expressao();
    jj_consume_token(OBRACKETS);
    Comandos();
    jj_consume_token(CBRACKETS);
    jj_consume_token(DOT);
}

// Formas gerais auxiliares
  static final public void Comandos() throws ParseException {
    label_2:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case WRITE:
      case READ:
      case DECLARATION:{
        ;
        break;
        }
      default:
        jj_la1[2] = jj_gen;
        break label_2;
      }
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case WRITE:{
        SaidaDados();
        break;
        }
      case READ:{
        EntradaDados();
        break;
        }
      case DECLARATION:{
        Enumerado();
        break;
        }
      default:
        jj_la1[3] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
}

  static final public void Constantes() throws ParseException {
    jj_consume_token(AS);
    jj_consume_token(CONSTANT);
    label_3:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case ID:{
        ;
        break;
        }
      default:
        jj_la1[4] = jj_gen;
        break label_3;
      }
      ListaIdentificadores();
      jj_consume_token(IS);
      jj_consume_token(ALL_TYPES);
      jj_consume_token(EQ);
      label_4:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case NUM:{
          ;
          break;
          }
        default:
          jj_la1[5] = jj_gen;
          break label_4;
        }
        jj_consume_token(NUM);
      }
      jj_consume_token(DOT);
    }
}

  static final public void Variaveis() throws ParseException {
    jj_consume_token(AS);
    jj_consume_token(VARIABLE);
    label_5:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case ID:{
        ;
        break;
        }
      default:
        jj_la1[6] = jj_gen;
        break label_5;
      }
      ListaIdentificadoresVariavel();
      jj_consume_token(IS);
      jj_consume_token(ALL_TYPES);
      jj_consume_token(DOT);
    }
}

  static final public void Expressao() throws ParseException {
    label_6:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case NUM:{
        ;
        break;
        }
      default:
        jj_la1[7] = jj_gen;
        break label_6;
      }
      jj_consume_token(NUM);
    }
}

  static final public void ComentarioLinha() throws ParseException {
    jj_consume_token(SLASH);
    jj_consume_token(SLASH);
    label_7:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case ID:{
        ;
        break;
        }
      default:
        jj_la1[8] = jj_gen;
        break label_7;
      }
      jj_consume_token(ID);
    }
}

  static final public void ListaIdentificadores() throws ParseException {
    jj_consume_token(ID);
    label_8:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case COMMA:{
        ;
        break;
        }
      default:
        jj_la1[9] = jj_gen;
        break label_8;
      }
      jj_consume_token(COMMA);
      jj_consume_token(ID);
    }
}

// Lista de identificadores para variavel pois devem possuir a constante numerica unitaria
// Exemplo: identificador{1}
  static final public void ListaIdentificadoresVariavel() throws ParseException {
    jj_consume_token(ID);
    jj_consume_token(OCBRACKETS);
    jj_consume_token(NUM);
    jj_consume_token(CCBRACKETS);
    label_9:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case COMMA:{
        ;
        break;
        }
      default:
        jj_la1[10] = jj_gen;
        break label_9;
      }
      jj_consume_token(COMMA);
      jj_consume_token(ID);
      jj_consume_token(OCBRACKETS);
      jj_consume_token(NUM);
      jj_consume_token(CCBRACKETS);
    }
}

  static void mostrarTokens(Token t) throws ParseException {while(t.next != null) {
            System.out.println((String.format("Linhas: %d - %d", t.beginLine, t.endLine)));
            System.out.println((String.format("Colunas: %d - %d", t.beginColumn, t.endColumn)));
            System.out.println("Lexema: " + t.image);
            System.out.println("Categoria: " + t.kind);
            System.out.println("-----------");
            t = t.next;
    }
  }

  static private boolean jj_initialized_once = false;
  /** Generated Token Manager. */
  static public ExampleTokenManager token_source;
  static SimpleCharStream jj_input_stream;
  /** Current token. */
  static public Token token;
  /** Next token. */
  static public Token jj_nt;
  static private int jj_ntk;
  static private int jj_gen;
  static final private int[] jj_la1 = new int[11];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static {
	   jj_la1_init_0();
	   jj_la1_init_1();
	}
	private static void jj_la1_init_0() {
	   jj_la1_0 = new int[] {0x0,0x400,0x860,0x860,0x0,0x0,0x0,0x0,0x0,0x0,0x0,};
	}
	private static void jj_la1_init_1() {
	   jj_la1_1 = new int[] {0x40,0x0,0x0,0x0,0x40,0x20,0x40,0x20,0x40,0x4,0x4,};
	}

  /** Constructor with InputStream. */
  public Example(java.io.InputStream stream) {
	  this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public Example(java.io.InputStream stream, String encoding) {
	 if (jj_initialized_once) {
	   System.out.println("ERROR: Second call to constructor of static parser.  ");
	   System.out.println("	   You must either use ReInit() or set the JavaCC option STATIC to false");
	   System.out.println("	   during parser generation.");
	   throw new Error();
	 }
	 jj_initialized_once = true;
	 try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
	 token_source = new ExampleTokenManager(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 11; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream) {
	  ReInit(stream, null);
  }
  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream, String encoding) {
	 try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
	 token_source.ReInit(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 11; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public Example(java.io.Reader stream) {
	 if (jj_initialized_once) {
	   System.out.println("ERROR: Second call to constructor of static parser. ");
	   System.out.println("	   You must either use ReInit() or set the JavaCC option STATIC to false");
	   System.out.println("	   during parser generation.");
	   throw new Error();
	 }
	 jj_initialized_once = true;
	 jj_input_stream = new SimpleCharStream(stream, 1, 1);
	 token_source = new ExampleTokenManager(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 11; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.Reader stream) {
	if (jj_input_stream == null) {
	   jj_input_stream = new SimpleCharStream(stream, 1, 1);
	} else {
	   jj_input_stream.ReInit(stream, 1, 1);
	}
	if (token_source == null) {
 token_source = new ExampleTokenManager(jj_input_stream);
	}

	 token_source.ReInit(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 11; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public Example(ExampleTokenManager tm) {
	 if (jj_initialized_once) {
	   System.out.println("ERROR: Second call to constructor of static parser. ");
	   System.out.println("	   You must either use ReInit() or set the JavaCC option STATIC to false");
	   System.out.println("	   during parser generation.");
	   throw new Error();
	 }
	 jj_initialized_once = true;
	 token_source = tm;
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 11; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(ExampleTokenManager tm) {
	 token_source = tm;
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 11; i++) jj_la1[i] = -1;
  }

  static private Token jj_consume_token(int kind) throws ParseException {
	 Token oldToken;
	 if ((oldToken = token).next != null) token = token.next;
	 else token = token.next = token_source.getNextToken();
	 jj_ntk = -1;
	 if (token.kind == kind) {
	   jj_gen++;
	   return token;
	 }
	 token = oldToken;
	 jj_kind = kind;
	 throw generateParseException();
  }


/** Get the next Token. */
  static final public Token getNextToken() {
	 if (token.next != null) token = token.next;
	 else token = token.next = token_source.getNextToken();
	 jj_ntk = -1;
	 jj_gen++;
	 return token;
  }

/** Get the specific Token. */
  static final public Token getToken(int index) {
	 Token t = token;
	 for (int i = 0; i < index; i++) {
	   if (t.next != null) t = t.next;
	   else t = t.next = token_source.getNextToken();
	 }
	 return t;
  }

  static private int jj_ntk_f() {
	 if ((jj_nt=token.next) == null)
	   return (jj_ntk = (token.next=token_source.getNextToken()).kind);
	 else
	   return (jj_ntk = jj_nt.kind);
  }

  static private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  static private int[] jj_expentry;
  static private int jj_kind = -1;

  /** Generate ParseException. */
  static public ParseException generateParseException() {
	 jj_expentries.clear();
	 boolean[] la1tokens = new boolean[39];
	 if (jj_kind >= 0) {
	   la1tokens[jj_kind] = true;
	   jj_kind = -1;
	 }
	 for (int i = 0; i < 11; i++) {
	   if (jj_la1[i] == jj_gen) {
		 for (int j = 0; j < 32; j++) {
		   if ((jj_la1_0[i] & (1<<j)) != 0) {
			 la1tokens[j] = true;
		   }
		   if ((jj_la1_1[i] & (1<<j)) != 0) {
			 la1tokens[32+j] = true;
		   }
		 }
	   }
	 }
	 for (int i = 0; i < 39; i++) {
	   if (la1tokens[i]) {
		 jj_expentry = new int[1];
		 jj_expentry[0] = i;
		 jj_expentries.add(jj_expentry);
	   }
	 }
	 int[][] exptokseq = new int[jj_expentries.size()][];
	 for (int i = 0; i < jj_expentries.size(); i++) {
	   exptokseq[i] = jj_expentries.get(i);
	 }
	 return new ParseException(token, exptokseq, tokenImage);
  }

  static private boolean trace_enabled;

/** Trace enabled. */
  static final public boolean trace_enabled() {
	 return trace_enabled;
  }

  /** Enable tracing. */
  static final public void enable_tracing() {
  }

  /** Disable tracing. */
  static final public void disable_tracing() {
  }

}