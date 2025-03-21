grammar shttp;

@header{
package main.Servidor_React.antlr4;
}

// PARSER
init: instrucciones;

instrucciones: instruccion+;

instruccion: get
           | post
           | patch
           | delete
;

get: GET (SITIO | PAGINA) ABRIR (SITIO | PAGINA) parametros;

post: POST (SITIO | PAGINA) CREAR (SITIO | PAGINA) parametros;

patch: PATCH (SITIO | PAGINA) (MODIFICAR | AGREGAR) (SITIO | PAGINA) parametros;

delete: DELETE (SITIO | PAGINA) ELIMINAR (SITIO | PAGINA) parametros;

parametros: parametro (COMA parametro)*;

parametro: IDENTIFICADOR;

// LEXER
// SIGNOS
COMA : ',';

// PALABRAS RESERVADAS
GET : 'get';
POST : 'post';
PATCH : 'patch';
DELETE : 'delete';
SITIO : 'sitio';
PAGINA : 'pagina';
ABRIR: 'abrir';
CREAR : 'crear';
AGREGAR : 'agregar';
ELIMINAR : 'eliminar';
MODIFICAR : 'modificar';

// PATRONES
IDENTIFICADOR : [a-zA-Z][a-zA-Z0-9_-]*;

BLANCOS: [ \t\r\n]+ -> skip;
