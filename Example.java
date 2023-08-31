/* Example.java */
/* Generated By:JavaCC: Do not edit this line. Example.java */
/** Simple brace matcher. */
public class Example implements ExampleConstants {

  /** Main entry point. */
  public static void main(String args[]) throws ParseException {
    Example parser = new Example(System.in);
    parser.Expressao();
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
      jj_consume_token(OEQ);
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

//void Expressao():
//{}
//{
//    // TODO: Atualizar aqui, por enquanto so aceita numeros
//    (<NUM>)*
//}
  static final public 
void ComentarioLinha() throws ParseException {
    jj_consume_token(SLASH);
    jj_consume_token(SLASH);
    label_6:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case ID:{
        ;
        break;
        }
      default:
        jj_la1[7] = jj_gen;
        break label_6;
      }
      jj_consume_token(ID);
    }
}

  static final public void ListaIdentificadores() throws ParseException {
    jj_consume_token(ID);
    label_7:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case COMMA:{
        ;
        break;
        }
      default:
        jj_la1[8] = jj_gen;
        break label_7;
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
      jj_consume_token(OCBRACKETS);
      jj_consume_token(NUM);
      jj_consume_token(CCBRACKETS);
    }
}

//
  static final public 
void Expressao() throws ParseException {
    ExpressaoRelacional();
    label_9:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case AND:
      case OR:{
        ;
        break;
        }
      default:
        jj_la1[10] = jj_gen;
        break label_9;
      }
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case AND:{
        jj_consume_token(AND);
        break;
        }
      case OR:{
        jj_consume_token(OR);
        break;
        }
      default:
        jj_la1[11] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      ExpressaoRelacional();
    }
}

  static final public void ExpressaoRelacional() throws ParseException {
    ExpressaoAritimetica();
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case OEQ:
    case ONEQ:
    case OLT:
    case OGT:
    case OLTE:
    case OGTE:{
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case OEQ:{
        jj_consume_token(OEQ);
        break;
        }
      case ONEQ:{
        jj_consume_token(ONEQ);
        break;
        }
      case OLT:{
        jj_consume_token(OLT);
        break;
        }
      case OGT:{
        jj_consume_token(OGT);
        break;
        }
      case OLTE:{
        jj_consume_token(OLTE);
        break;
        }
      case OGTE:{
        jj_consume_token(OGTE);
        break;
        }
      default:
        jj_la1[12] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      ExpressaoAritimetica();
      break;
      }
    default:
      jj_la1[13] = jj_gen;
      ;
    }
}

  static final public void ExpressaoAritimetica() throws ParseException {
    Termos();
    label_10:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case OPLUS:
      case OMINUS:{
        ;
        break;
        }
      default:
        jj_la1[14] = jj_gen;
        break label_10;
      }
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case OPLUS:{
        jj_consume_token(OPLUS);
        break;
        }
      case OMINUS:{
        jj_consume_token(OMINUS);
        break;
        }
      default:
        jj_la1[15] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      Termos();
    }
}

  static final public void Termos() throws ParseException {
    Fator();
    label_11:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case OMULTIPLY:
      case ODIV:
      case OMOD:
      case SLASH:{
        ;
        break;
        }
      default:
        jj_la1[16] = jj_gen;
        break label_11;
      }
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case OMULTIPLY:{
        jj_consume_token(OMULTIPLY);
        break;
        }
      case SLASH:{
        jj_consume_token(SLASH);
        break;
        }
      case ODIV:{
        jj_consume_token(ODIV);
        break;
        }
      case OMOD:{
        jj_consume_token(OMOD);
        break;
        }
      default:
        jj_la1[17] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      Fator();
    }
}

  static final public void Fator() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case ID:{
      jj_consume_token(ID);
      break;
      }
    case INT:{
      jj_consume_token(INT);
      break;
      }
    case NUM:{
      jj_consume_token(NUM);
      break;
      }
    case REAL:{
      jj_consume_token(REAL);
      break;
      }
    case STRING:{
      jj_consume_token(STRING);
      break;
      }
    case LOGIC:{
      jj_consume_token(LOGIC);
      break;
      }
    case ONOT:{
      jj_consume_token(ONOT);
      Fator();
      break;
      }
    case OPARENTHESES:{
      jj_consume_token(OPARENTHESES);
      Expressao();
      jj_consume_token(CPARENTHESES);
      break;
      }
    default:
      jj_la1[18] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
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
  static final private int[] jj_la1 = new int[19];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static {
	   jj_la1_init_0();
	   jj_la1_init_1();
	}
	private static void jj_la1_init_0() {
	   jj_la1_0 = new int[] {0x0,0x400,0x860,0x860,0x0,0x0,0x0,0x0,0x0,0x0,0x60000,0x60000,0xf4000000,0xf4000000,0x300000,0x300000,0x3400000,0x3400000,0x0,};
	}
	private static void jj_la1_init_1() {
	   jj_la1_1 = new int[] {0x400000,0x0,0x0,0x0,0x400000,0x200000,0x400000,0x400000,0x40000,0x40000,0x0,0x0,0x1,0x1,0x0,0x0,0x10000,0x10000,0x7e00408,};
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
	 for (int i = 0; i < 19; i++) jj_la1[i] = -1;
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
	 for (int i = 0; i < 19; i++) jj_la1[i] = -1;
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
	 for (int i = 0; i < 19; i++) jj_la1[i] = -1;
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
	 for (int i = 0; i < 19; i++) jj_la1[i] = -1;
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
	 for (int i = 0; i < 19; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(ExampleTokenManager tm) {
	 token_source = tm;
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 19; i++) jj_la1[i] = -1;
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
	 boolean[] la1tokens = new boolean[59];
	 if (jj_kind >= 0) {
	   la1tokens[jj_kind] = true;
	   jj_kind = -1;
	 }
	 for (int i = 0; i < 19; i++) {
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
	 for (int i = 0; i < 59; i++) {
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
