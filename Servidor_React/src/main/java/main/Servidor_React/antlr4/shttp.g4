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

get: GET (SITIO | PAGINA) ABRIR (MSITIO | MPAGINA) parametros;

post: POST (SITIO | PAGINA) CREAR (MSITIO | MPAGINA) parametros body?;

patch: PATCH (SITIO | PAGINA) (MODIFICAR | AGREGAR) (MSITIO | MPAGINA) parametros;

delete: DELETE (SITIO | PAGINA) ELIMINAR (MSITIO | MPAGINA) parametros;

parametros: parametro (COMA parametro)*;

parametro: IDENTIFICADOR;

body: TREPTS CONTENIDO TREPTS;

// LEXER
// SIGNOS
COMA : ',';
TREPTS : '...';
// PALABRAS RESERVADAS
GET : 'GET';
POST : 'POST';
PATCH : 'PATCH';
DELETE : 'DELETE';
SITIO : 'SITIO';
PAGINA : 'PAGINA';
MSITIO : 'sitio';
MPAGINA : 'pagina';
ABRIR: 'abrir';
CREAR : 'crear';
AGREGAR : 'agregar';
ELIMINAR : 'eliminar';
MODIFICAR : 'modificar';
// PATRONES
IDENTIFICADOR : [a-zA-Z][a-zA-Z0-9_-]*;
BLANCOS: [ \t\r\n]+ -> skip;
CONTENIDO : '<main>' .*? '</main>';
