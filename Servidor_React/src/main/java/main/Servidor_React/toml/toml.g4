grammar toml;

@header{
package main.Servidor_React.toml;
}

/* PARSER */
init: instrucciones;

instrucciones: instruccion+;

instruccion: etiquetas
           | atributos
;

etiquetas: COR1 valores COR2;

valores: valor (PUNTO valor)*;

valor: IDENTIFICADOR;

atributos: (NOMBRE | PATH) IGUAL ATRIBUTO;

/* LEXER */

// SIGNOS
PUNTO : '.';
IGUAL : '=';
COR1 : '[';
COR2 : ']';
// PALABRAS RESERVADAS
NOMBRE : 'nombre';
PATH : 'path';
// PATRONES
IDENTIFICADOR : [a-zA-Z][a-zA-Z0-9_]*;
ATRIBUTO : '"' (~["\r\n])* '"' ;
COMENTARIO : '#' ~[\r\n]* -> skip;
BLANCOS: [ \t\r\n]+ -> skip;