grammar shttp;

@header{
package main.Servidor_React.antlr4;
}
    // PARSER
init: instrucciones;

instrucciones: instruccion
             | instrucciones instruccion
;

instruccion: metodo objetivo body instcl
           | xd
;

xd: POST SITIO CREAR SITIO PARAMETRO
;

metodo: GET
      | POST
      | PATCH
      | DELETE
;

objetivo: SITIO
        | PAGINA
;

instcl: accion objetivo PARAMETRO COMA PARAMETRO
;

accion: CREAR
      | AGREGAR
      | ELIMINAR
      | MODIFICAR
;

body: /*vacio*/
;

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
CREAR : 'crear';
AGREGAR : 'agregar';
ELIMINAR : 'eliminar';
MODIFICAR : 'modificar';
// PATRONES
PARAMETRO : [a-zA-Z][a-zA-Z0-9_]*;
BLANCOS: [ \t\r\n]+ -> skip;