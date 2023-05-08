grammar GRAPHen;

WS : [ \n\t]+ -> skip;
POS_NUMBER: ('1'..'9')('0'..'9')*;
NUMBER: ('0'|POS_NUMBER);
IDENTIFIER: (LETTER|'_')(LETTER|NUMBER)*;
LETTER: ('a'..'z' | 'A'..'Z');
NODE_KW: 'Node';
EDGE_KW: 'Edge';
VAL_KW: 'Val';
COL_KW: 'Color';
NODE_SPEC: 'Nodetype';
EDGE_CPEC: 'Edgetype';
GRAPH_KW: 'Graph';
DIGHRAPH_KW: 'Digraph';
NODE_ORD: 'NodeOrderDown';
COL_G: 'Graphcolor';
GEN: 'Generate';
COLOR : '#' HEXDIGIT HEXDIGIT HEXDIGIT HEXDIGIT HEXDIGIT HEXDIGIT;
HEXDIGIT : '0'..'9' | 'A' | 'B' | 'C' | 'D' | 'E' | 'F' | 'a' | 'b' | 'c' | 'd' | 'e' | 'f';
LINE_TYPE: '--' | '.-';
NODE_SHAPE: '()'| '*' | '+' | '<>';
// Gramatyka formatu:
  start : (statement+) EOF;

  statement : node_definition
         | edge_definition
         | digraph_definition
         | graph_definition
         | graph_function_statement
         | graph_add
         | graph_substract
         | digraph_add
         | digraph_substract;



  //wierzchołki
  node_definition : 'Node ' IDENTIFIER '{' node_properties '};';
  node_inline : 'Node ' IDENTIFIER '{' node_properties '}';
  node_properties : ('Num_color ' (NUMBER|POS_NUMBER))? (', ' 'fillColor ' COLOR)? ((', ' | ',') 'borderColor ' COLOR)?
                        ((', ' | ',') 'nodeShape ' NODE_SHAPE)? ((', ' | ',') 'nodeSize ' POS_NUMBER)?
                        ((', ' | ',') 'borderWidth ' POS_NUMBER)? ((', ' | ',') 'borderLineShape ' LINE_TYPE)?;

  //krawędzie
  edge_definition : 'Edge ' IDENTIFIER '{' edge_properties '};';
  edge_inline: 'Edge ' IDENTIFIER '{' edge_properties '}';
  edge_properties : ('Num_color ' (NUMBER|POS_NUMBER))? ((', ' | ',')('lineWidth' POS_NUMBER))? ((', ' | ',') 'Color ' COLOR)? ((', ' | ',') 'lineType' LINE_TYPE);

  //grafy i digrafy
  graph_definition : 'Graph ' IDENTIFIER (('{'  edge_list  ('};' |('}.' graph_function)';') )| '=' graph_add | '=' graph_substract);
  digraph_definition : 'Digraph ' IDENTIFIER (('{'  dedge_list '}' ('.'graph_function)? ';') | '=' digraph_add | '=' digraph_substract);

  edge_list : edge_relation ((', ' | ',') edge_relation)*;
  edge_relation : ( IDENTIFIER| node_inline ) '(' ('<->' | '<-> ') (IDENTIFIER | edge_inline)')' ( IDENTIFIER| node_inline )+;

  dedge_list : dedge_relation ((', ' | ',') dedge_relation)*;
  dedge_relation : ( IDENTIFIER| node_inline ) '(' ('->' | '-> ') (IDENTIFIER | edge_inline)')' ( IDENTIFIER| node_inline )+;

  //funkcje do grafów
  graph_function: (         exportToFileFunc
                           |'NodeOrderDown({' IDENTIFIER ((', ' | ',')IDENTIFIER)* '})' //ustaw nodey w kolejnosći
                           | 'colorEdges()' //pokoloruj poprawnie krawędzie
                           | 'colorNodes()' //pokoloruj poprawnie nody
                           | 'clearEdges()') //usuń wszystkie krawędzie
                           ;

  graph_function_statement:  IDENTIFIER '.' graph_function ';';
  fileFormat: ('.png' | '.svg' | '.gren');
  exportToFileFunc: 'export(' 'format' fileFormat (', ' | ',') 'fileName' IDENTIFIER')'; //wyeksportuj do pliku

  graph_add: (IDENTIFIER | graph_definition)'+' (IDENTIFIER | graph_definition);
  digraph_add: (IDENTIFIER | digraph_definition)'+' (IDENTIFIER | digraph_definition);

  graph_substract: (IDENTIFIER | graph_definition)'-' (IDENTIFIER | graph_definition) ';';
  digraph_substract: (IDENTIFIER | digraph_definition)'-'(IDENTIFIER | digraph_definition) ';';


  //w trakcie tworzenia, może nawet docelowo się całkowicie wyjebie


/* że global atributes??
  digraph_attributes : '.' 'NodeOrderDown' '{' IDENTIFIER+ '}' ';'?
         | '.' 'Graphcolor' '{' COLOR+ '}' ';'?
         | '.' 'Generate' '{' FILENAME '}' ';'?;

  graph_attributes : '.' 'NodeOrderDown' '{' IDENTIFIER+ '}' ';'?
                | '.' 'Graphcolor' '{' COLOR+ '}' ';'?
                | '.' 'Generate' '{' FILENAME '}' ';'?;
  */