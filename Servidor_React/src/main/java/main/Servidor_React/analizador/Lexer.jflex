package main.Servidor_React.analizador;

import java_cup.runtime.Symbol;
import java.util.LinkedList;
import main.Servidor_React.excepciones.Errores;

%%

// CODIGO USUARIO
%{
    public LinkedList<Errores> listaErrores = new LinkedList<>();
%}

%init{
    yyline = 1;
    yycolumn = 1;
    listaErrores = new LinkedList<>();
%init}

%cup
%class Lexer
%public
%line
%char
%column
%full

// TOKENS
INCRE="++"
DECRE="--"
POT="^"
MAS="+"
MENOS="-"
POR="*"
DIV="/"
PAR1="("
PAR2=")"
IGUAL="="
MENOR="<"
MAYOR=">"
OR="||"
AND="&&"
DIFER="!"
FINCADENA=";"
LLAVE1="{"
LLAVE2="}"
DOSPTS=":"
COMA=","
PUNTO="."

// PALABRAS RESERVADAS
CONST="const"
RETURN="return"
BREAK="break"
NUMBER="number"
STRING="string"
CHAR="char"
BOOLEAN="boolean"
VOID="void"
VAR="var"
CONSOLE="console"
LOG="log"
FUNCTION="function"
IF="if"
ELSE="else"
FOR="for"
TRUE="true"
FALSE="false"

// PATRONES
BLANCOS=[\ \r\t\f\n]+
ENTERO=[0-9]+
DECIMAL=[0-9]+"."[0-9]+
IDENTIFICADOR=[a-zA-Z][a-zA-Z0-9_]*
CADENA=[\"]([^\"])*[\"]
CARACTER = [\']([^\'])*[\']

%%
<YYINITIAL> {POT} {return new Symbol(sym.POT, yyline, yycolumn,yytext());}
<YYINITIAL> {INCRE} {return new Symbol(sym.INCRE, yyline, yycolumn,yytext());}
<YYINITIAL> {DECRE} {return new Symbol(sym.DECRE, yyline, yycolumn,yytext());}
<YYINITIAL> {MAS} { return new Symbol(sym.MAS, yyline, yycolumn, yytext()); }
<YYINITIAL> {MENOS} { return new Symbol(sym.MENOS, yyline, yycolumn, yytext()); }
<YYINITIAL> {POR} { return new Symbol(sym.POR, yyline, yycolumn, yytext()); }
<YYINITIAL> {DIV} { return new Symbol(sym.DIV, yyline, yycolumn, yytext()); }
<YYINITIAL> {PAR1} { return new Symbol(sym.PAR1, yyline, yycolumn, yytext()); }
<YYINITIAL> {PAR2} { return new Symbol(sym.PAR2, yyline, yycolumn, yytext()); }
<YYINITIAL> {IGUAL} { return new Symbol(sym.IGUAL, yyline, yycolumn, yytext()); }
<YYINITIAL> {MENOR} { return new Symbol(sym.MENOR, yyline, yycolumn, yytext()); }
<YYINITIAL> {MAYOR} { return new Symbol(sym.MAYOR, yyline, yycolumn, yytext()); }
<YYINITIAL> {OR} { return new Symbol(sym.OR, yyline, yycolumn, yytext()); }
<YYINITIAL> {AND} { return new Symbol(sym.AND, yyline, yycolumn, yytext()); }
<YYINITIAL> {DIFER} { return new Symbol(sym.DIFER, yyline, yycolumn, yytext()); }
<YYINITIAL> {FINCADENA} { return new Symbol(sym.FINCADENA, yyline, yycolumn, yytext()); }
<YYINITIAL> {LLAVE1} { return new Symbol(sym.LLAVE1, yyline, yycolumn, yytext()); }
<YYINITIAL> {LLAVE2} { return new Symbol(sym.LLAVE2, yyline, yycolumn, yytext()); }
<YYINITIAL> {DOSPTS} { return new Symbol(sym.DOSPTS, yyline, yycolumn, yytext()); }
<YYINITIAL> {COMA} { return new Symbol(sym.COMA, yyline, yycolumn, yytext()); }
<YYINITIAL> {PUNTO} { return new Symbol(sym.PUNTO, yyline, yycolumn, yytext()); }

<YYINITIAL> {CONST} { return new Symbol(sym.CONST, yyline, yycolumn, yytext()); }
<YYINITIAL> {RETURN} { return new Symbol(sym.RETURN, yyline, yycolumn, yytext()); }
<YYINITIAL> {BREAK} { return new Symbol(sym.BREAK, yyline, yycolumn, yytext()); }
<YYINITIAL> {NUMBER} { return new Symbol(sym.NUMBER, yyline, yycolumn, yytext()); }
<YYINITIAL> {STRING} { return new Symbol(sym.STRING, yyline, yycolumn, yytext()); }
<YYINITIAL> {CHAR} { return new Symbol(sym.CHAR, yyline, yycolumn, yytext()); }
<YYINITIAL> {BOOLEAN} { return new Symbol(sym.BOOLEAN, yyline, yycolumn, yytext()); }
<YYINITIAL> {VOID} { return new Symbol(sym.VOID, yyline, yycolumn, yytext()); }
<YYINITIAL> {VAR} { return new Symbol(sym.VAR, yyline, yycolumn, yytext()); }
<YYINITIAL> {CONSOLE} { return new Symbol(sym.CONSOLE, yyline, yycolumn, yytext()); }
<YYINITIAL> {LOG} { return new Symbol(sym.LOG, yyline, yycolumn, yytext()); }
<YYINITIAL> {FUNCTION} { return new Symbol(sym.FUNCTION, yyline, yycolumn, yytext()); }
<YYINITIAL> {IF} { return new Symbol(sym.IF, yyline, yycolumn, yytext()); }
<YYINITIAL> {ELSE} { return new Symbol(sym.ELSE, yyline, yycolumn, yytext()); }
<YYINITIAL> {FOR} { return new Symbol(sym.FOR, yyline, yycolumn, yytext()); }
<YYINITIAL> {TRUE} {return new Symbol(sym.TRUE, yyline, yycolumn,yytext());}
<YYINITIAL> {FALSE} {return new Symbol(sym.FALSE, yyline, yycolumn,yytext());}

<YYINITIAL> {ENTERO} {return new Symbol(sym.ENTERO, yyline, yycolumn,yytext());}
<YYINITIAL> {DECIMAL} {return new Symbol(sym.DECIMAL, yyline, yycolumn,yytext());}
<YYINITIAL> {IDENTIFICADOR} { return new Symbol(sym.IDENTIFICADOR, yyline, yycolumn, yytext()); }
<YYINITIAL> {CADENA} { String cadena = yytext(); cadena = cadena.substring(1, cadena.length()-1);
                        return new Symbol(sym.CADENA, yyline, yycolumn,cadena); }
<YYINITIAL> {CARACTER} { String caracter = yytext(); caracter = caracter.substring(1, caracter.length()-1);
                        return new Symbol(sym.CARACTER, yyline, yycolumn, caracter);}
<YYINITIAL> {BLANCOS} {}

<YYINITIAL> . {
            System.out.println("Error lexico detectado: " + yytext() + " en linea " + yyline + " columna " + yycolumn);
            listaErrores.add(new Errores("LEXICO"," El caracter "+ yytext()+ " No pertenece al lenguaje ", yyline, yycolumn));
}